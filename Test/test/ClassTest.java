import com.iceyyy.nongli.NongLi;
import com.sx.pojo.*;
import org.elasticsearch.common.recycler.Recycler;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

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
    public void test(){
      Book book=new Book();
      book.speak();
        System.out.println(book);
    }
    @Test
    public void test2()throws Exception{
        Class<? extends Person> c= Person.class;
        c=Peeler.class;
        System.out.println(c.getName());
        c= Apple.class;
        System.out.println(c.getName());

    }




}
