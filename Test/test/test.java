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
import java.text.MessageFormat;
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
//       List<String> list=feedbackSce.getone(1);
//       System.out.println(list);


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
String var1=JSONObject.toJSONString(feedback);

JSONObject json =JSONObject.parseObject(var1);
String var2=json.getString("type1");
        System.out.println(var2);






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
 String a="1";
 if (a=="1"){
     System.out.println(1);
 }else {
     System.out.println(0);
 }

}
@Test
    public void tedt7(){
//  taskExecutor.execute(new Study());;
feedbackInfo feedbackInfo=new feedbackInfo();
feedbackInfo.setId(37);
feedbackInfo.setUcId("1993");
feedbackInfo.setTime("2018-07-20 15:30:48");
feedbackSce.sendfeedback(feedbackInfo);
}
@Test
    public void test8(){
        feedbackInfo feedbackInfo=feedbackSce.getone(12);
        SimpleDateFormat type1=new SimpleDateFormat("yyyy年M月d日");

//        Date date=feedbackInfo.getTime();
//        String var1=type1.format(date);
//    System.out.println(var1);
}
@Test
    public void  test9()throws  Exception{
        String meaasge="报名成功：尊敬的泰幸福用户，{0}活动报名成功，活动时间为{1}，期待为您带来优质的活动体验。";
        String meaasge2="报名成功：尊敬的泰幸福用户，{0}活动报名成功，期待为您带来优质的活动体验{1,number,integer}。";
//        Object[] array=new Object[]{"法律咨询","2018年8月1日"};
//        String var1=MessageFormat.format(meaasge,array);
//        System.out.println(var1);
        int a=123456789;
        String result= MessageFormat.format(meaasge,"法律咨询","2018年8月1日","hshshshshh",a);
        System.out.println(result);
        String result2=MessageFormat.format(meaasge2,"法律咨询","2018年8月1日","hshshshshh",a);
    System.out.println(result2);


//
//    String meaasge2="报名成功：尊敬的泰幸福用户，%s活动报名成功，活动时间为%tc%n，期待为您带来优质的活动体验。";
//    Date date=new Date();
//    String result2=String.format(meaasge2,"法律咨询",date);
//    System.out.println(result2);
////    String result3=String.format(meaasge2,array);
////    System.out.println(result3);
    String var1="2018-08-13 14:34:58";
    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date date=format.parse(var1);
    System.out.println(date);
    SimpleDateFormat format1=new SimpleDateFormat("yyyy年M月d日");
    System.out.println(format1.format(date));
}

@Test
    public void test10(){
   feedbackInfo feedbackInfo=new feedbackInfo();
    feedbackInfo.setType1("1");
    feedbackInfo.setType2("2");
    feedbackInfo.setType3("3");
    feedbackInfo.setType4("1");
    feedbackInfo.setId(2);
    feedbackInfo.setUrl("222222222222222");
    feedbackInfo.setComm("cccccccccccc");

    feedbackInfo feedbackInfo1=new feedbackInfo();
    feedbackInfo1.setType1("1");
    feedbackInfo1.setType2("2");
    feedbackInfo1.setType3("3");
    feedbackInfo1.setType4("1");
    feedbackInfo1.setId(2);
    feedbackInfo1.setUrl("222222222222222");
    feedbackInfo1.setComm("vvvvvvvvv");

    JSONArray jsonArray=new JSONArray();
    jsonArray.add(feedbackInfo);
    jsonArray.add(feedbackInfo1);
    System.out.println(jsonArray);
    JSONObject json =new JSONObject();
    json.put("COde","01");
    json.put("serviceList",jsonArray);
    System.out.println(json);
    System.out.println(json.toJSONString());

//    JSONObject json=new JSONObject();
//    json.put("errorMsg","失败");
//
//
//    JSONObject jsonObject=new JSONObject();
//    jsonObject.put("respCode","01");
//    jsonObject.put("respBizeMsg",json);
//    String var1= jsonObject.toJSONString();
//    System.out.println(var1);
//
//
//    JSONObject parseObject=JSONObject.parseObject(var1);
//    String var2=parseObject.getString("respBizeMsg");
//    String var3=null;
//    var3=parseObject.getString("ddd");
//    System.out.println(var3);
//    System.out.println(var2);

}
@Test
public void test11(){
     feedbackInfo feedbackInfo=new feedbackInfo();
     feedbackInfo.setId(12);
     feedbackInfo.setUcId("呵呵");
     feedbackInfo.setComm("第一个对象");
     feedbackInfo feedbackInfo1=new feedbackInfo();
     feedbackInfo1.setId(12);
     feedbackInfo1.setUcId("呵呵");
     feedbackInfo1.setComm("第二个对象");
    System.out.println(feedbackInfo.hashCode());
    System.out.println(feedbackInfo1.hashCode());
    System.out.println(feedbackInfo.equals(feedbackInfo1));
    Study study=new Study();
    study.hashCode();
}
}





