import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sx.mapper.studentMapper;

import com.sx.pojo.*;
import com.sx.service.StudentSService;
import com.sx.service.feedbackSce;
import com.sx.service.impl.StudentSServiceImpl;
import com.sx.service.studentService;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test {

    @Autowired

    private studentService studentService;
    @Autowired
    private StudentSService studentSService;
    @Autowired
    private feedbackSce feedbackSce;
    @Autowired
    ThreadPoolTaskExecutor taskExecutor;
//    @Autowired
//    ThreadPoolTaskExecutor taskExecutor;//



    @Test
    public void test1() {
       List<String> list=feedbackSce.getone(1);
       System.out.println(list);


    }

  @Test
  public void test2(){
        List<feedbackInfo> feedbackInfos=new ArrayList<feedbackInfo>();
        feedbackInfo a=new feedbackInfo();
        a.setId(8);
        a.setUrl("sssssssssss");
        a.setType4("2   ");
        feedbackInfos.add(a);
        feedbackInfo b=new feedbackInfo();
        b.setId(10);
        b.setComm("sdadsad");
        b.setUrl("sdadasdasdasdas");
        b.setType4("3");
       feedbackInfos.add(b);
       feedbackSce.addlist(feedbackInfos);
  }

//    public static SimpleDateFormat getDateFormat() {
//        if (null == DateLocal.get()) {
//            DateLocal.set(new SimpleDateFormat("yyyy年MM月dd日", Locale.CHINA));
//        }
//        return DateLocal.get();
//    }


    @Test

    public void add() {
//        JSONObject json = new JSONObject();
//        JSONObject respJson=new JSONObject();
//
//        List<String> typelist = new ArrayList<String>();
//        List<String> urllist=new ArrayList<String>();
//        String typ1 = "第一个类型";
//        String typ2 = "第二个类型";
//        String type3 = "第三个类型";
//        String type4 = "第四个类型";
//
////
////        ArrayList<String> aaa=new ArrayList<String>();
////        aaa.add(typ1);
//////        aaa.add(typ2);
////        aaa.add(type3);
////        aaa.add(type4);
////        String bbb=StringUtils.join(aaa,"、");
////        System.out.println(bbb);
//
////  String mobil="768611660@qq.com";
////  String a= "shenxuan1hao@163.com";
////  String c="sdadda@13.cm";
////Boolean b=check.checkEmail(mobil);
////        System.out.println(b);
////        System.out.println(check.checkEmail(a));
////        System.out.println(check.checkEmail(c));
//
//        ;
//
//        String[] aaa=new String[4];
//        ArrayList<String> ccc=new ArrayList<String>();
//        ccc.add(typ1);
//        ccc.add(typ2);
//        ccc.add(type3);
//        ccc.add(type4);
//        String ddd=ccc.
//        String bbb= StringUtils.join(aaa,"、");
//        System.out.println(bbb);
//
//        typelist.add("第一个类型");
//        typelist.add("第二个类型");
//        typelist.add("第三个类型");
//
//
//        urllist.add("11111111111111");
//        urllist.add("22222222222222");
//        urllist.add("333333333333333");
//        urllist.add("4444444444444444444");
//
//
//        json.put("type", typelist);
//        json.put("comm", "sdfsdfsdfsdfds");
//        json.put("url", urllist);
//        json.put("id", "1");
//        String resMSg = json.toJSONString(json);
//        feedbackInfo feedbackInfo = null;
//        feedbackInfo = JSONObject.parseObject(resMSg, com.sx.pojo.feedbackInfo.class);
//        System.out.println(feedbackInfo.getType4());
//        List<String> type = feedbackInfo.getType();
//        for (String var1 : type) {
//           if(var1.equals(typ1)){
//               feedbackInfo.setType1("1");
//            }
//            if (var1.equals(typ2)){
//               feedbackInfo.setType2("1");
//            }
//            if (var1.equals(type3)){
//               feedbackInfo.setType3("1");
//            }
//            if (var1.equals(type4)){
//               feedbackInfo.setType4("1");
//            }
//     var1.equals(typ1)?feedbackInfo.setType1("1"):feedbackInfo.setType1("
//        }
//        System.out.println(type);
//        feedbackSce.sendFeedbackTyp(feedbackInfo);
//        String type=feedbackInfo.getType();
//        System.out.println(type);

//
//        System.out.println(feedbackInfo.getUrl());
//        JSONArray jsonArray=JSONArray.parseArray(feedbackInfo.getUrl());
//        System.out.println(jsonArray);
//        feedbackSce.sendfeedback(feedbackInfo);
feedbackInfo feedback=new feedbackInfo();
feedback.setType1("1");
feedback.setType2("2");
feedback.setType3("3");
feedback.setType4("1");
feedback.setId(2);
feedback.setUrl("222222222222222");
feedback.setComm("cccccccccccc");
feedbackSce.sendfeedback(feedback);




    }
    @Test
    public void get(){
//        feedbackInfo feedback=feedbackSce.getone(2);
//        SimpleDateFormat sdf =new SimpleDateFormat();
//        String a=feedback.getTime();
//        System.out.println(a);
//        DateFormat df = new SimpleDateFormat(a);
//        Calendar cal=df.getCalendar();
//        int day=cal.get(Calendar.DATE);
//        System.out.println(day);

//
//      feedbackInfo f1=feedbackSce.getone(2);
//      feedbackInfo f2=feedbackSce.getone(3);
//      feedbackInfo f3=feedbackSce.getone(4);
//      feedbackInfo f4=feedbackSce.getone(5);
//
//    Date a=f1.getTime();
//    Date b=f2.getTime();
//    check check=new check();
//    String varq= check.checkDate(a);
//        System.out.println(check.checkDate(a));
//        System.out.println(check.checkDate(b));
//        System.out.println(check.checkDate(f3.getTime()));
//        System.out.println(check.checkDate(f4.getTime()));

//        System.out.println(a);//7.1
//        System.out.println(b);
//
//
//
//        Calendar pre = Calendar.getInstance();
//        pre.setTime(a);
//        Calendar cal =Calendar.getInstance();
//        cal.setTime(b);
//
//        int f=cal.get(Calendar.MINUTE);
//        System.out.println(f);
//
//
//        int c = cal.get(Calendar.DAY_OF_YEAR)
//                - pre.get(Calendar.DAY_OF_YEAR);
//        System.out.println(c);
//
//        int d = pre.get(Calendar.DAY_OF_YEAR)
//                - cal.get(Calendar.DAY_OF_YEAR);
//        System.out.println(d);

    }


//    @Test
//    public void add2(){
//        student student=new student("撒大声地","sddsad","sdadas","dsadas");
//
//        studentService.add(student);


    @Test
public void test3() {

    String[] arr = new String[6];
    arr[0] = "一";
    arr[1] = "二";
    arr[2] = "三";
    arr[3] = "四";
    arr[4] = "五";
    arr[5] = "df";
    for (String var1:arr) {
        System.out.println(var1);
    }



}
@Test
    public void test4(){
        List<feedbackInfo> feedbackInfoList=feedbackSce.getall(1993);
        for (feedbackInfo feedbackInfo:feedbackInfoList){
            System.out.println(feedbackInfo.getName());
            System.out.println(feedbackInfo.getTime());
        }
}

@Test
    public void test5(){
        feedbackInfo feedbackInfo=new feedbackInfo();
        List<String> list=new ArrayList<String>();
        list.add("第一个");
        list.add("第二个");
        feedbackInfo.setName(list);
        feedbackInfo.setId(23);
        feedbackSce.addfeedbacktype(feedbackInfo);
        Date a=new Date();
        a.setTime(2018/2);
}
@Test
    public void test6(){
        feedbackInfo feedbackInfo=new feedbackInfo();
        List<String> list=feedbackInfo.getType();
        if (list==null){
            System.out.println("null");
        }
        if (list.isEmpty()){
            System.out.println("empty");
        }

        List<MultipartFile> files=new ArrayList<MultipartFile>();

}
@Test
    public void tedt7(){
//  taskExecutor.execute(new Study());
    SimpleDateFormat type1=new SimpleDateFormat("yy/M/dd");
    Date now=new Date();
    String var=type1.format(now);
    System.out.println(var);
}

}





