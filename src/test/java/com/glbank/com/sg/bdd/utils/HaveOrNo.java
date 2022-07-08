package com.glbank.com.sg.bdd.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Header;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

public class HaveOrNo {

    private static String DATA = "{\n" +
            "    \"Head\": {\n" +
            "        \"CnsmrSeqNo\": \"PROFPTACK106\",\n" +
            "        \"CnsmrSysId\": \"404001\",\n" +
            "        \"FileFlg\": \"0\",\n" +
            "        \"GlblSeqNo\": \"PROFPTACK106\",\n" +
            "        \"SrcCnsmrSysId\": \"102001\",\n" +
            "        \"SvcCd\": \"40120006\",\n" +
            "        \"SvcScn\": \"03\",\n" +
            "        \"TxnDt\": \"20220331\",\n" +
            "        \"TxnTm\": \"082226\"\n" +
            "    },\n" +
            "    \"Body\": {\n" +
            "        \"result\": \"PASS\",\n" +
            "        \"loanApplyNo\": \"?\"\n" +
            "    }\n" +
            "}";

    /**
     * @param args
     * @throws UnsupportedEncodingException
     */
    public static void main(String[] args){
        Map<String, Object> map = updateAml("FIN2022062810424804951");
        int status = (int)map.get("status");
        if(status == 1){
            System.out.println("status success");
            String responseData = (String)map.get("data");
            System.out.println("responseData: " + responseData);
        }else {
            System.out.println("status error");
            String msg = (String)map.get("msg");
            System.out.println("msg: " + msg);
        }
    }

    private static final String AMLURI = "http://10.24.9.126/gateway-web/aml/loan";

    /**
     * @param loanApplyNo
     * @return Map status == 1 success    data responseData    msg errorMSG
     */
    public static Map<String, Object> updateAml(String loanApplyNo){
        if(StringUtils.isBlank(loanApplyNo)){
            throw new NullPointerException("not null");
        }
        String responseData = null;
        Map<String, Object> map = new HashMap<>();
       try {
           HttpPost httpPost = new HttpPost(AMLURI);
           DATA = DATA.replace("?", loanApplyNo);
           StringEntity entity = new StringEntity(DATA, "utf-8");
           entity.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
           httpPost.setEntity(entity);
           responseData = HttpUtil.sendPost(httpPost);
           map.put("status", 1);
           map.put("data", responseData);
           map.put("msg", null);
       }catch (Exception e){
           map.put("status", 0);
           map.put("data", null);
           map.put("msg", e.getMessage());
           e.printStackTrace();
       }
       return map;
    }

    public Boolean check(WebDriver driver,By seletor) {
        try {
            driver.findElement(seletor);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

}