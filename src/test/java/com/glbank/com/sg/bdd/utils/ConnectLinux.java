package com.glbank.com.sg.bdd.utils;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import org.apache.commons.lang3.StringUtils;
import java.io.*;
import java.util.Properties;

public class ConnectLinux {

    public static String code;
    private static final String ip = "10.24.9.192";
    private static final int port = 22;
    private static final String username = "csii";
    private static final String password = "1qaz@WSX3edc";
    private static ChannelExec exec;
    private static JSch jSch;
    private static Session session;

    private static void init(){
        try {
            jSch = jSch == null ? new JSch() : jSch;
            if(session == null || !session.isConnected()){
                session = jSch.getSession(username, ip, port);
                session.setPassword(password);
                session.setConfig(new Properties(){{
                    put("StrictHostKeyChecking", "no");
                }});
                session.connect();
            }
            if(session != null && session.isConnected()){
                exec = exec == null || exec.isClosed() ? (ChannelExec)session.openChannel("exec") : null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void execCommand(String command){
        init();
        if(exec == null || exec.isClosed()){
            throw new RuntimeException("执行失败");
        }
        exec.setCommand(command);
        exec.setInputStream(null);
        exec.setErrStream(System.err);
        try {
            exec.connect();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public synchronized static String getLastOtp(String svccd){
        execCommand("cd /home/csii/logs/server;grep 'SvcCd=" + svccd + ", otp=' common-default.log | tail -1");
        InputStream in = null;
        String otp = null;
        try {
            in = exec.getInputStream();
            String data = readInputStream(in);
            if(StringUtils.isBlank(data)){
                throw new RuntimeException("无符合条件的数据");
            }
            int start = data.lastIndexOf("otp=") + 4;
            int end = start + 6;
            otp = data.substring(start, end);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        finally {//项目运行期间注释掉
//            releaseConnect();
//        }
        return otp;
    }
    /**
     * csii
     * 1qaz@WSX3edc
     * @param args
     */
    public static void main(String[] args){
        System.out.println(getLastOtp("60120003"));
        releaseConnect();
    }

    public static void releaseConnect(){
        if(exec != null && exec.isConnected()){
            exec.disconnect();
        }
        if(session != null && session.isConnected()){
            session.disconnect();
        }
    }

    private static String readInputStream(InputStream in) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        try {
            int seconds = 100;
            while (count == 0){
                count = in.available();
                if(count == 0){
                    Thread.sleep(100);
                    seconds --;
                    continue;
                }
                seconds = 100;
                byte[] tmp=new byte[count];
                int i = in.read(tmp, 0, count);
                String line = new String(tmp, 0, i);
                sb.append(line);
                System.out.println(line);
                Thread.sleep(100);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return sb.toString();
    }
}
