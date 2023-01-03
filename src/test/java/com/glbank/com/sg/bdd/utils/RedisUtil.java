package com.glbank.com.sg.bdd.utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Set;

/**
 *
 * @author jiangdoc
 *
 */
public class RedisUtil {
    public static String cookie;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\workspace\\DBB_GL_AutoTestting-dev\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.24.7.88/");
        driver.navigate().refresh();
        driver.manage().window().maximize();
        Thread.sleep(7000);
        WebDriver.Options manage = driver.manage();
        Set<Cookie> cookies = manage.getCookies();
        for (Cookie c: cookies){
            if (c.getName().equals("CAPTCHAID")) {
                cookie = c.getValue();
                System.out.println(c.getValue());
            }
        }
        //ip地址，端口号
        Jedis jedis = cli_single("10.28.7.48", 6379);
        jedis.auth("Asdf1234");
        System.out.println("redis连接成功");
        jedis.select(80);
        String value = jedis.get(cookie);
        String value2 = value.replaceAll("\"","");
        System.out.println(value2);
        jedis.close();
        driver.close();
    }

    /**
     * 单个连接
     *
     * @param host
     * @param port
     * @return
     */
    public static Jedis cli_single(String host, int port) {
        try {
            return new Jedis(host, port);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 连接池
     *
     * @param host
     * @param port
     * @return
     */
    public static Jedis cli_pool(String host, int port) {
        JedisPoolConfig config = new JedisPoolConfig();
        // 最大连接数
        config.setMaxTotal(10);
        // 最大连接空闲数
        config.setMaxIdle(8);
        JedisPool jedisPool = new JedisPool(config, host, port);
        try{
            return jedisPool.getResource();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
