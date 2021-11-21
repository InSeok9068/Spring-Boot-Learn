package com.example.demo.config.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LoggingAop {

    @Around("@annotation(customLogging)")
    public Object proceed(ProceedingJoinPoint pjp, CustomLogging customLogging) throws Throwable {
        if (customLogging.value()) {
            log.info("Custom 어노테이션 로그 확인");
        }

        return pjp.proceed();
    }
}
