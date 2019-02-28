import com.iceyyy.nongli.NongLi;
import com.sx.Generics.Americano;
import com.sx.Generics.Coffee;
import com.sx.Generics.CoffeeGenerator;
import com.sx.Generics.LinkedStack;
import com.sx.pojo.*;
import com.sx.reflect.A;
import com.sx.reflect.HiddenC;
import org.apache.commons.lang.StringUtils;
import org.elasticsearch.common.recycler.Recycler;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.*;

public class ClassTest {
    @Test
    public void test1(){
        Class c=null;
        try{
            c=Class.forName("com.sx.pojo.Person");
            System.out.println("Class name is "+c.getName());
            System.out.println("Class name "+c.getName()+"is interfence?"+"   "+c.isInterface());
            System.out.println("Class CanonicalName "+c.getCanonicalName());
            System.out.println("Class SimpleNam "+c.getSimpleName());
            System.out.println("SupperClass is  "+c.getSuperclass().getSimpleName());
        }catch (ClassNotFoundException e){

        }
    }

    @Test
    public void test()throws Exception{
        Class b= Class.forName("com.sx.pojo.Person");
        Class<? extends Person> c=b;
        Person person=c.newInstance();
       Object obj=b.newInstance();

        System.out.println(obj.toString());

    }
    @Test
    public void test2()throws Exception{
        Class<? extends Person> c= Person.class;
        Person person=c.newInstance();
        c=Peeler.class;
        System.out.println(c.getName());
        c= Apple.class;
        System.out.println(c.getName());

    }
   @Test
    public void test3() throws Exception {
       Person person = new Person();
       Peeler peeler = new Peeler("sss");
       Class<?> c = Class.forName("com.sx.pojo.Person");
       Method method=c.getMethod("drink",String.class);
       Object obj=c.newInstance();
       method.invoke(obj,"wwww");
   }
   @Test
    public void test4() throws Exception{
       LinkedStack<String> stringLinkedStack=new LinkedStack<String>();
       stringLinkedStack.push("123");
       stringLinkedStack.push("234");
       stringLinkedStack.push("345");
       String var1=null;
       for (int i = 0; i <3 ; i++) {
           if ((var1=stringLinkedStack.pop())!=null){
               System.out.println(var1);
           }
       }
   }
   @Test
    public void test5(){
//       CoffeeGenerator gen=new CoffeeGenerator();
//       for (int i = 0; i <5 ; i++) {
//           System.out.println(gen.next());
//       }
        CoffeeGenerator coffees=new CoffeeGenerator(10);
        for (Coffee coffee:coffees){
            System.out.println(coffee);
        }
    }
    @Test
    public void test6(){
//       CoffeeGenerator gen=new CoffeeGenerator();
//       for (int i = 0; i <5 ; i++) {
//           System.out.println(gen.next());
//       }
        HashSet<String> strings=new HashSet<String>();
        strings.add("123");
        strings.add("123");
        strings.add("234");
        String var1= StringUtils.join(strings.toArray(), ";");
        System.out.println(var1);
        HashSet<String> strings1=new HashSet<String>();
        Collections.addAll(strings1,"123;234".split(";"));
        System.out.println(strings1.contains("123"));
    }
    @Test
    public void test7(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date=new Date();
        System.out.println(simpleDateFormat.format(date));

    }
    @Test
    public void test8() throws Exception{
        List<String> stringList= new ArrayList<String>();
//        stringList.add("https://mmbiz.qpic.cn/mmbiz_png/dwEg6qJsiaXDMgzhHX2LHaV7eX3QHj35QRDsCtTT32uVDOyaO5DwJhrfCsAVMKfCUUpkwjGmRFWo91nEaHnqe0w/640?wx_fmt=png?x-oss-process=style/xmorient&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1");
//        stringList.add("https://mmbiz.qpic.cn/mmbiz_jpg/o3xzCLywDeuvBz0twQYqPArK5DbbArPE0FrTlPNIicqFyIvnUPzlibzYy20IzicneHeXq8kOPoWGcTibE0OWy0wiclg/640?wx_fmt=jpeg&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1");
//        stringList.add("https://mmbiz.qpic.cn/mmbiz_png/dwEg6qJsiaXDMgzhHX2LHaV7eX3QHj35Q9gGpgk5sBphkC68yiaL7ANn9I4RjDvmYEuFycsLCiaNtcwibrxOllpKgA/640?wx_fmt=png?x-oss-process=style/xmorient&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1");
//        stringList.add("https://mmbiz.qpic.cn/mmbiz_png/dwEg6qJsiaXDMgzhHX2LHaV7eX3QHj35QRDsCtTT32uVDOyaO5DwJhrfCsAVMKfCUUpkwjGmRFWo91nEaHnqe0w/640?wx_fmt=png?x-oss-process=style/xmorient&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1");
//        stringList.add("https://mmbiz.qpic.cn/mmbiz_jpg/o3xzCLywDeuvBz0twQYqPArK5DbbArPETXMfLnZkg2yaNaniayrsKs9kpxNyNF2YkaByia9W1O3J5xov921Jr5Ng/640?wx_fmt=jpeg&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1");
//        stringList.add("https://mmbiz.qpic.cn/mmbiz_png/dwEg6qJsiaXDMgzhHX2LHaV7eX3QHj35Q9gGpgk5sBphkC68yiaL7ANn9I4RjDvmYEuFycsLCiaNtcwibrxOllpKgA/640?wx_fmt=png?x-oss-process=style/xmorient&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1");
//        stringList.add("https://mmbiz.qpic.cn/mmbiz_png/dwEg6qJsiaXDMgzhHX2LHaV7eX3QHj35QRDsCtTT32uVDOyaO5DwJhrfCsAVMKfCUUpkwjGmRFWo91nEaHnqe0w/640?wx_fmt=png?x-oss-process=style/xmorient&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1");
//        stringList.add("https://mmbiz.qpic.cn/mmbiz_jpg/o3xzCLywDeuvBz0twQYqPArK5DbbArPEaaymiaZ6AgtqLfFAqFXd4Jib3ekyZWtXycdfoEdc8QZpC23rz8dH2bJw/640?wx_fmt=jpeg&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1");
//        stringList.add("https://mmbiz.qpic.cn/mmbiz_png/dwEg6qJsiaXDMgzhHX2LHaV7eX3QHj35Q9gGpgk5sBphkC68yiaL7ANn9I4RjDvmYEuFycsLCiaNtcwibrxOllpKgA/640?wx_fmt=png?x-oss-process=style/xmorient&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1");
        stringList.add("https://mmbiz.qpic.cn/mmbiz_png/l1QY8PRkx27L0aQyuoP2oZdmRlu1hCHM2LW46ibouOatbGFIfx9Gnlqhd5yp9PucMmgEdKQpgehBf1P7bEmlrmQ/640");
        for (String var1:stringList){
            Random random=new Random();

            String path="C:\\shenxuan\\log\\"+random.nextInt()+".png";;
            Don.downloadPicture(var1,path);
        }
    }

}
