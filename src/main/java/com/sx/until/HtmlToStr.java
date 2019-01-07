package com.sx.until;

import com.sx.pojo.FeedbackInfo;

import javax.faces.view.facelets.FaceletException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class HtmlToStr {
    public static void main(String[] arg){
//        try{
//            InputStream is =new FileInputStream("C:\\Users\\Administrator\\IdeaProjects\\SSM_Study\\src\\main\\webapp\\index.html");
//            byte[] b=new byte[1000];
//            int i=0;
//            int index=0;
//            while((i=is.read())!=-1){
//                b[index]=(byte) i;
//                index++;
//            }
//            System.out.println(new String(b));
//            is.close();
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
        System.out.println("jdfjdk");
        FeedbackInfo feedbackInfo=null;
        String a=feedbackInfo.getUrl();
        System.out.println(a);
    }
}
