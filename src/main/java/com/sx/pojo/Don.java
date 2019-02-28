package com.sx.pojo;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Don {
    public static void main(String[] args)throws Exception{
        String url = "https://mmbiz.qpic.cn/mmbiz_jpg/o3xzCLywDeuvBz0twQYqPArK5DbbArPEvzT5Da3XCVpf6YpHaKlBP3N8sYEkP3uFwicmAyhToib8NVZiaX1dZLJkQ/640?wx_fmt=jpeg&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1";
        String path="C:\\shenxuan\\log\\sss.jpg";
        downloadPicture(url,path);
    }
    //链接url下载图片
    public static void downloadPicture(String urlList,String path)throws Exception {
        URL url = null;
        try {
            url = new URL(urlList);
            DataInputStream dataInputStream = new DataInputStream(url.openStream());

            FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
            ByteArrayOutputStream output = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int length;

            while ((length = dataInputStream.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            fileOutputStream.write(output.toByteArray());
            dataInputStream.close();
            fileOutputStream.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
