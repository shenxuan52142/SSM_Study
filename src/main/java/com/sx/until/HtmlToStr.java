package com.sx.until;

import com.sx.pojo.FeedbackInfo;
import com.sx.pojo.LunarSolarConverter;
import com.sx.pojo.Peeler;
import com.sx.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.view.facelets.FaceletException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class HtmlToStr {
    @Autowired
    
    public static void main(String[] arg) throws Exception{
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
  Class.forName("com.sx.pojo.Peeler");

     
    }
}
