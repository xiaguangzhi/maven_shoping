package com.iotek.aop;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by xiaohuang on 2018/3/8.
 * ----------------The heart withered--------
 */
@Aspect
public class LoggingAspect {
    @Around(value = "execution(* com.iotek.dao.*(..))")
    public  Object  aroundLogging(){
        return  null;
    }
}
