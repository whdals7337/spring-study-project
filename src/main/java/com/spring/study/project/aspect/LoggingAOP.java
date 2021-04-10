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
        log.info("begin aop");
        Object object = pjp.proceed();
        log.info("end aop");
        long end = System.currentTimeMillis();
        log.info("aop time : " + (end - begin));
        return object;
    }

    @Around("@annotation(com.spring.study.project.annotation.LogAopByAnnotation)")
    public Object logAopByAnnotation(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        log.info("begin annotation aop");
        Object object = pjp.proceed();
        log.info("end annotation aop");
        long end = System.currentTimeMillis();
        log.info("annotation aop time : " + (end - begin));
        return object;
    }
}
