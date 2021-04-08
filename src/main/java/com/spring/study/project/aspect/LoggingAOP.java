package com.spring.study.project.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAOP {

    @Around("execution(* com.spring.study.project.service.HelloService.*Hello(..))")
    public Object logAop(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        log.info("begin");
        Object object = pjp.proceed();
        log.info("end");
        long end = System.currentTimeMillis();
        log.info("time : " + (end - begin));
        return object;
    }

    @Around("@annotation(com.spring.study.project.annotation.LogAopByAnnotation)")
    public Object logAopByAnnotation(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        log.info("begin annotation");
        Object object = pjp.proceed();
        log.info("end annotation");
        long end = System.currentTimeMillis();
        log.info("annotation time : " + (end - begin));
        return object;
    }
}
