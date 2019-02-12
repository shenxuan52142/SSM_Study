package com.sx.until;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class XinyunqianTest {

    public String httpClient() throws Exception{
        String responseStr = "{\"respCode\":\"99\",\"errorMsg\":\"请求超时\"}";
        HttpClient httpClient = new HttpClient();
        GetMethod getMethod = new GetMethod("https://api.xdooi.com/matters?se=023uZ3gR0J7s962WZFhR04U1gR0uZ3gH&reqData=%7B%7D");
        getMethod.setRequestHeader("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 12_1 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/16B92 MicroMessenger/7.0.0(0x17000024) NetType/WIFI Language/zh_CN");
        getMethod.setRequestHeader("Accept-Language", "zh-cn");
        getMethod.setRequestHeader("Accept-Encoding", "br, gzip, deflate");
        getMethod.setRequestHeader("Accept", "*/*");
        getMethod.setRequestHeader("Host", "api.xdooi.com");
        getMethod.setRequestHeader("Content-Type", "application/json");
        getMethod.setRequestHeader("Referer", "https://servicewechat.com/wxa3c7971b443ee3cf/13/page-frame.html");
        int methodResult = httpClient.executeMethod(getMethod);
        InputStream inputStream = getMethod.getResponseBodyAsStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
        StringBuffer sb = new StringBuffer();
        String buf = "";
        while((buf = br.readLine()) != null){
            sb.append(buf);
        }
        if(methodResult == HttpStatus.SC_OK){
            //请求成功
            responseStr = sb.toString();
//            System.out.println(responseStr);
        }else{
            System.out.println("shibai");
        }
        return responseStr;
    }

    public static void main(String[] args) {
        XinyunqianTest jt = new XinyunqianTest();
        try {
            jt.httpClient();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
