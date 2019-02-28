package com.sx.until;

import com.alibaba.fastjson.JSONObject;
import com.sx.reflect.A;
import com.sx.reflect.HiddenC;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.core.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Component
public class HaoMaiClient {
    public static void main(String[] args) throws Exception{
        A a= HiddenC.makeA();
        a.f();
        callHiddernMethod(a,"g");
        System.out.println(a.getClass().getName());
    }
    static void callHiddernMethod(Object a,String methodName)throws Exception{
        Method g=a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}
