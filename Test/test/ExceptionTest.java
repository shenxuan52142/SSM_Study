import com.sx.Exception.FullConstructors;
import com.sx.Exception.MyException;
import org.junit.Test;

public class ExceptionTest {
@Test
    public void test1()throws MyException{
    try{
        FullConstructors.f();
    }catch (Exception e){
//        e.printStackTrace(System.out);
//        e.printStackTrace();
        for (StackTraceElement stackTraceElement:e.getStackTrace()){
            System.out.println(stackTraceElement.getMethodName());
        }
    }

//    try{
//        FullConstructors.g();
//    }catch (MyException e){
////        e.printStackTrace(System.out);
//        for (StackTraceElement stackTraceElement:e.getStackTrace()){
//            System.out.println(stackTraceElement.getMethodName());
//        }
//    }
}

}
