package com.vv.udemyspring.aspect;

// Aspect class that logs the exception using @AfterThrowing

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @AfterThrowing(
            value = "execution(* com.vv.udemyspring.service.HelloService.sayHello(..))",
            throwing = "error" )
    public void logAfterThrowing( JoinPoint joinPoint, Throwable error ) {

        log.error( "logAfterThrowing() is running!" );
        log.error("After Throwing exception in method:"+joinPoint.getSignature());
        log.error( "Exception : " + error );
        log.error( "******" );

    }


}