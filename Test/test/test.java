import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.sx.pojo.*;
import com.sx.service.StudentSService;
import com.sx.service.feedbackSce;
import com.sx.service.studentService;
import com.sx.until.HttpConnectionPoolUtil;
import com.sx.until.Weather;
import org.apache.commons.collections.map.CaseInsensitiveMap;

//import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.text.*;
import java.util.*;

import static org.elasticsearch.common.xcontent.XContentFactory.jsonBuilder;

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
//    FeedbackInfoSearchService feedbackInfoSearchService;

    /** 注入客户端对象 基于原生API */
//    @Autowired
//    private Client client;

    /** 注入es服务器模板 */
//    @Autowired
//    private ElasticsearchTemplate elasticsearchTemplate;
//    @Autowired
//    ArticleRepository articleRepository;
    @Resource(name = "WeatherRestTemplate")
    private RestTemplate restTemplate;

    /**
     * 通过 ElasticsearchTemplate 创建索引和添加映射
     */
//    @Test
//    public void createIndex() {
//        elasticsearchTemplate.createIndex(FeedbackInfo.class);
//        elasticsearchTemplate.putMapping(FeedbackInfo.class);
//    }




    @Test
    public void test1() throws Exception{


    }

  @Test
  public void test2(){


  }

//    public static SimpleDateFormat getDateFormat() {
//        if (null == DateLocal.get()) {
//            DateLocal.set(new SimpleDateFormat("yyyy年MM月dd日", Locale.CHINA));
//        }
//        return DateLocal.get();
//    }


    @Test

    public void add() {
//        FeedbackInfo feedback3=new FeedbackInfo();
//        feedback3.setId(1);
//        feedback3.setUcId("小明爱吃苹果");
//        feedback3.setTime("这里是时间");
//        articleRepository.save(feedback3);
//
//        FeedbackInfo feedback4=new FeedbackInfo();
//        feedback4.setId(2);
//        feedback4.setUcId("明天买苹果");
//        feedback4.setTime("这里是时间");
//        articleRepository.save(feedback4);

//        FeedbackInfo feedback5=new FeedbackInfo();
//        feedback5.setId(6);
//        feedback5.setUcId("小明爱吃水果");
//        feedback5.setTime("这里是时间");
//        articleRepository.save(feedback5);
//
//        FeedbackInfo feedback6=new FeedbackInfo();
//        feedback6.setId(4);
//        feedback6.setUcId("明日复明日");
//        feedback6.setTime("这里是时间");
//        articleRepository.save(feedback6);
//
//        FeedbackInfo feedback7=new FeedbackInfo();
//        feedback7.setId(5);
//        feedback7.setUcId("我有一块钱");
//        feedback7.setTime("这里是时间");
//        articleRepository.save(feedback7);

//        FeedbackInfo feedback8=new FeedbackInfo();
//        feedback8.setId(6);
//        feedback8.setUcId("这有水果");
//        feedback8.setTime("这里是时间");
//        articleRepository.save(feedback8);





    }
    @Test
    public void get(){
//        MatchQueryBuilder queryBuilder = QueryBuilders.matchQuery("url", "小明送给小红一个巧克力");
//
//        Iterable<FeedbackInfo> feedbackInfos= feedbackInfoSearchService.findAll("小明送给小红一个巧克力");
//        Iterator<FeedbackInfo> iterator = feedbackInfos.iterator();
//        for (FeedbackInfo feedbackInfo:feedbackInfos){
//            String date=feedbackInfo.getUpdate_time();
////            date=date.replace("T", " UTC");
//            System.out.println(date);
//            System.out.println(feedbackInfo.getUrl());
//
//
//        }

    }


//    @Test
//    public void add2(){
//        student student=new student("撒大声地","sddsad","sdadas","dsadas");
//
//        studentService.add(student);


    @Test
public void test3() throws Exception {

            HashMap map = new HashMap();
            map.put("location", "CN101011300");
            map.put("username", "HE1712181123121573");
            long timestanp = new Date().getTime();
            map.put("t", String.valueOf(timestanp));
            String secret = "56159ac35a45403a9ce51e453e8001f2";

            String username = "HE1712181123121573";
            String var1 = URLEncoder.encode(Weather.getSignature(map, secret),"utf-8");

            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append("https://api.heweather.com/s6/weather/forecast").append("?location=CN101011300")
                    .append("&username=").append(username)
                    .append("&t=").append(String.valueOf(timestanp))
                    .append("&sign=").append(var1);
            URI uri1 = URI.create(stringBuffer1.toString());
            String respone1 = restTemplate.getForObject(uri1, String.class);
            System.out.println(respone1);
//
//            StringBuffer stringBuffer = new StringBuffer();
//            stringBuffer.append("https://free-api.heweather.com/s6/air/now").append("?location=CN101011300")
//                    .append("&key=").append(secret);
//            URI uri = URI.create(stringBuffer.toString());
//            String respone = restTemplate.getForObject(uri, String.class);
//            System.out.println(respone);



    }




@Test
    public void test4()throws Exception{
        for (int i=0;i<20;i++) {
//            Thread.sleep(2000);
            HashMap map = new HashMap();
            map.put("location", "CN101050501");
            map.put("username", "HE1812281450091928");
            long timestanp = new Date().getTime();
            map.put("t", String.valueOf(timestanp));
            String secret = "cca7927e496245a5be692292c66983b7";

            String username = "HE1812281450091928";
            String var1 = Weather.getSignature(map, secret);

            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append("location=CN101050501")
                    .append("&username=").append(username)
                    .append("&t=").append( String.valueOf(timestanp))
                    .append("&sign=").append(var1);

//    String params="sign=xxxxxxxxxxxxxxxxxxxx&username=xxxxxxxxxxxxxxxxxxx&location=北京&t=秒级时间戳";
            String params = stringBuffer1.toString();
            StringBuilder sb = new StringBuilder();
            InputStream is = null;
            BufferedReader br = null;
            PrintWriter out = null;
            try {
                //接口地址
                String url = "https://api.heweather.com/s6/weather/now";
                URL uri = new URL(url);
                HttpURLConnection connection = (HttpURLConnection) uri.openConnection();
                connection.setRequestMethod("POST");
                connection.setReadTimeout(5000);
                connection.setConnectTimeout(10000);
                connection.setRequestProperty("accept", "*/*");
                //发送参数
                connection.setDoOutput(true);
                out = new PrintWriter(connection.getOutputStream());
                out.print(params);
                out.flush();
                //接收结果
                is = connection.getInputStream();
                br = new BufferedReader(new InputStreamReader(is));
                String line;
                //缓冲逐行读取
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                }
                System.out.println(sb.toString());
            } catch (Exception ignored) {
            } finally {
                //关闭流
                try {
                    if (is != null) {
                        is.close();
                    }
                    if (br != null) {
                        br.close();
                    }
                    if (out != null) {
                        out.close();
                    }
                } catch (Exception ignored) {
                }
            }
        }
}



@Test
    public void test5(){
        FeedbackInfo FeedbackInfo =new FeedbackInfo();
        List<String> list=new ArrayList<String>();
        list.add("第一个");
        list.add("第二个");
//        FeedbackInfo.setName(list);
        FeedbackInfo.setId(23);
        feedbackSce.addfeedbacktype(FeedbackInfo);
        Date a=new Date();
        a.setTime(2018/2);
}
@Test
    public void test6(){
      FeedbackInfo a=new FeedbackInfo();
      a.setUcId("jjj");
    System.out.println(a.getUcId());


}
@Test
    public void tedt7(){
//  taskExecutor.execute(new Study());;
FeedbackInfo FeedbackInfo =new FeedbackInfo();
FeedbackInfo.setId(37);
FeedbackInfo.setUcId("1993");
FeedbackInfo.setTime("2018-07-20 15:30:48");
feedbackSce.sendfeedback(FeedbackInfo);
}
@Test
    public void test8(){
        FeedbackInfo FeedbackInfo =feedbackSce.getone(12);
        SimpleDateFormat type1=new SimpleDateFormat("yyyy年M月d日");

//        Date date=FeedbackInfo.getTime();
//        String var1=type1.format(date);
//    System.out.println(var1);
}
@Test
    public void  test9()throws  Exception{

    String var1="2018-08-13";
    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat format1=new SimpleDateFormat("d日");
    Date now=new Date(System.currentTimeMillis());
    Calendar a=Calendar.getInstance();
    a.setTime(now);
    Calendar b=Calendar.getInstance();
    b.setTime(format.parse(var1));
   int i=a.get(Calendar.DAY_OF_MONTH);
   int j=b.get(Calendar.DAY_OF_MONTH);
    System.out.println(i);
    System.out.println(j);
}

@Test
    public void test10(){
   FeedbackInfo FeedbackInfo =new FeedbackInfo();
    FeedbackInfo.setType1("1");
    FeedbackInfo.setType2("2");
    FeedbackInfo.setType3("3");
    FeedbackInfo.setType4("1");
    FeedbackInfo.setId(2);
    FeedbackInfo.setUrl("222222222222222");
    FeedbackInfo.setComm("cccccccccccc");

    FeedbackInfo feedbackInfo1=new FeedbackInfo();
    feedbackInfo1.setType1("1");
    feedbackInfo1.setType2("2");
    feedbackInfo1.setType3("3");
    feedbackInfo1.setType4("1");
    feedbackInfo1.setId(2);
    feedbackInfo1.setUrl("222222222222222");
    feedbackInfo1.setComm("vvvvvvvvv");
    Map<String,FeedbackInfo> map=new HashMap<String, FeedbackInfo>();
    map.put("A1B2-G4J4", FeedbackInfo);
    map.put("AGHJSDG-231-JHKLHJKHdjfhj",feedbackInfo1);
   Map<String,FeedbackInfo> ssmap=new CaseInsensitiveMap();
   ssmap.putAll(map);
    FeedbackInfo feedbackInfo2=new FeedbackInfo();
    feedbackInfo2=ssmap.get("a1b2-g4j4");
    System.out.println(feedbackInfo2.getUrl());


//    JSONArray array=new JSONArray();
//    array.add(FeedbackInfo);
//    array.add(feedbackInfo1);
//
//    String var1=array.toJSONString();
//
//    JSONArray array1=JSONArray.parseArray(var1);
//    JSONObject jsonObject=array1.getJSONObject(1);
//    System.out.println(jsonObject);
//    FeedbackInfo feedbackInfo2=(FeedbackInfo) array1.get(1);
//    System.out.println(feedbackInfo2.getUrl());

//    List<FeedbackInfo> feedbackInfoList=new ArrayList<com.sx.pojo.FeedbackInfo>();
//    feedbackInfoList.add(FeedbackInfo);
//    feedbackInfoList.add(feedbackInfo1);
//    JSONObject jsonObject=new JSONObject();
//    JSONObject jsonObject1=new JSONObject();
//
//    jsonObject.put("list",feedbackInfoList);
//    jsonObject.put("hghdh","dfsfs");
//    jsonObject1.put("code",342);
//    jsonObject1.put("bigMsg",jsonObject);
//    System.out.println(jsonObject1.toJSONString());

//    JSONArray jsonArray=new JSONArray();
//    jsonArray.add(FeedbackInfo);
//    jsonArray.add(feedbackInfo1);
//    System.out.println(jsonArray);
//    JSONObject json =new JSONObject();
//    json.put("COde","01");
//    json.put("serviceList",jsonArray);
//    System.out.println(json);
//    System.out.println(json.toJSONString());

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
    JSONObject parseObject=new JSONObject();

//    String var2=parseObject.getString("respBizeMsg");
//    String var3=null;
//    var3=parseObject.getString("ddd");
//    System.out.println(var3);
//    System.out.println(var2);

}
@Test
public void test11(){
  String var1="sdfjsdhkfjh.jpg.jpeg";
  int begin=var1.indexOf(".");
  int last=var1.length();
  String var2=var1.substring(begin,last);
  int begin2=var1.lastIndexOf(".");
  int last2=var1.length();
  String var3=var1.substring(begin2,last2);
    System.out.println(var2);
    System.out.println(var3);
}
@Test
    public void test12(){

        double a=6.00000;
        double b=6;
    System.out.println(a);

    BigDecimal bg=new BigDecimal(a/b*100).setScale(2, RoundingMode.HALF_UP);
    System.out.println(bg.doubleValue());

    DecimalFormat df1 = new DecimalFormat("###,###0.00");
    System.out.println(df1.format(1111111111.1111112));

}
@Test
    public void test13(){
Person person=new Peeler("ssss");
person.eat();
person.drink();

     }
@Test
    public void getFeedbackInfoMap()throws Exception{

//  Person person=new Person("1");
//  person.eat();
//  person.drink();
////  List<FeedbackInfo> feedbackInfoList=Arrays.asList(new Person("ss"),new Peeler("hshsshsh"));
//
//  Person person1=new Person("2");
//  person1.eat();
//  person1.drink();
    Class.forName("Person");

}
@Test
    public void test14(){
    feedbackVO feedbackVO=new feedbackVO();
    feedbackVO feedbackVO1=new feedbackVO();
    feedbackVO feedbackVO2=new feedbackVO();
    feedbackVO.setSex("1");
    feedbackVO1.setSex("2");
    feedbackVO2.setSex("3");

    String var1=JSONObject.toJSONString(feedbackVO, SerializerFeature.WriteMapNullValue);
    String var2=JSONObject.toJSONString(feedbackVO,SerializerFeature.WriteNullListAsEmpty);
    String var3=JSONObject.toJSONString(feedbackVO,SerializerFeature.WriteNullStringAsEmpty);


    JSONArray feedbackVOList=new JSONArray();
    feedbackVOList.add(feedbackVO);
    feedbackVOList.add(feedbackVO1);
    feedbackVOList.add(feedbackVO2);
    JSONObject jsonObject=new JSONObject();
    jsonObject.put("dddd",feedbackVOList);
    JSONObject jsonObject1=new JSONObject();
    jsonObject1.put("ddddddddd",jsonObject);

    String var4=JSONObject.toJSONString(jsonObject1,SerializerFeature.WriteNullStringAsEmpty);
    String var5=JSONObject.toJSONString(jsonObject1,SerializerFeature.WriteNullListAsEmpty);
    String var6=JSONObject.toJSONString(jsonObject1,SerializerFeature.WriteMapNullValue,SerializerFeature.WriteNullListAsEmpty,SerializerFeature.WriteNullStringAsEmpty);
    System.out.println(var1);
    System.out.println(var2);
    System.out.println(var3);
    System.out.println(var4);
    System.out.println(var5);
    System.out.println(var6);
}
@Test
    public void test15() throws Exception{
//    HaoMaiClient haoMaiClient=new HaoMaiClient();
    for (int i=0;i<30;i++) {
        HashMap map = new HashMap();
        String var1=null;
        map.put("location", "CN101050501");
        map.put("username", "HE1812281450091928");
        long timestanp = new Date().getTime();
        map.put("t", String.valueOf(timestanp));
        map.put("sign", var1);
        String secret = "cca7927e496245a5be692292c66983b7";

        String username = "HE1812281450091928";
        var1 = Weather.getSignature(map, secret);
        String url = "https://api.heweather.com/s6/weather/now";
        Map map1 = new HashMap();
        map1.put("location", "CN101050501");
        map1.put("username", username);
        map1.put("t", String.valueOf(timestanp));
        map1.put("sign", var1);

        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append("location=CN101050501")
                .append("&username=").append(username)
                .append("&t=").append(timestanp)
                .append("&sign=").append(var1);
//        String ssss = HttpConnectionPoolUtil.getHttpClient();
        url="https://api.heweather.com/s6/air/now";
        String ssss1 = HttpConnectionPoolUtil.post(url, map1);
        url="https://api.heweather.com/s6/weather/lifestyle";
        String ssss2 = HttpConnectionPoolUtil.post(url, map1);
        url="https://api.heweather.com/s6/weather/forecast";
        String ssss3 = HttpConnectionPoolUtil.post(url, map1);
//        System.out.println(ssss);
        System.out.println(ssss1);
        System.out.println(ssss2);
        System.out.println(ssss3);
    }

}

@Test
    public void SetTest(){
       List<String> stringList=new ArrayList<String>();
       Set<String> strings=new HashSet<String>();
       String string="A,B,C,D,F,F";
       Collections.addAll(stringList,string.split(","));
       Collections.addAll(strings,string.split(","));
    System.out.println(stringList.toString());
    System.out.println(strings);
}
@Test
    public void PriorityQueueTest(){
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>();

        Queue<Integer> queue=new LinkedList<Integer>();
    Random random=new Random(47);
        for (int i=0;i<10;i++){
//            System.out.println(i);
            Integer a=random.nextInt(i+10);
            System.out.println(a);
            queue.offer(a);
            priorityQueue.offer(a);
        }
    System.out.println(priorityQueue.toString());
    System.out.println(priorityQueue);
        for (int j=0;j<10;j++){
            System.out.println(priorityQueue.poll());
        }
    System.out.println(queue.toString());
    System.out.println(queue);
}

}







