package com.sx.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.aspectj.lang.annotation.*;

@Service
@Aspect
public class LoggerAspect {
    private static Logger logger= Logger.getLogger(LoggerAspect.class);

    public LoggerAspect(){}

//    long begin =System.currentTimeMillis();
//    long end =System.currentTimeMillis();
//    long sqltime=(int)(end-begin);
    String date =new SimpleDateFormat("yyyy-MM-dd:mm:ss").format(new Date());


    @Around("execution(* com.sx.service.impl.StudentSServiceImpl.*(..)) ")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        long begin =System.currentTimeMillis();
        logger.error("环绕开始时间："+begin);

        Object result=proceedingJoinPoint.proceed();
        long end =System.currentTimeMillis();
        long sqltime=(int)(end-begin);
        logger.error("环绕结束时间："+end);

        logger.error("系统响应时间："+sqltime);

        return result;
    }
    @Around("execution(* com.sx.service.impl.StudentSServiceImpl.delete(*)) ")
    public Object arounddelete(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        long begin =System.currentTimeMillis();
        logger.error("删除方法开始时间:"+begin);


        Object result=proceedingJoinPoint.proceed();
        long end =System.currentTimeMillis();
        long sqltime =(int)(end-begin);
        logger.error("删除方法结束时间:"+end);

        logger.error("删除方法所需时间："+sqltime);
        return result;
    }



}
