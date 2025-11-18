package io.codeforall.bootcamp.canifetes.advices;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SummarizerAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Hello, Canifetes");
        System.out.println("Great Summarizer");
    }
}
