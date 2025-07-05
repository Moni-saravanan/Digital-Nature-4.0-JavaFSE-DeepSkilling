package com.example.LibraryManagement.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
public class LoggingAspect {
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("Execution time: " + (end - start) + "ms");
        return obj;
    }
}