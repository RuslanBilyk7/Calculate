package com.nospring2;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


/**
 @Aspect аннотация выделяет этот класс как аспект.
 @Before аннотация определяет текущую pointcut. Это выражение говорит,примени этот аспект перед тем, как ты вызовешь любой метод типа com.nospring2.Operation

 com.nospring2.Operation - это интерфейс и результат в аспекте будет всегда выводиться перед запуском метода c любой реализацией этого интерфейса.

 Аргумент у метода logMethodExecution() - это join point. В нашем случае мы вызываем toShortString(), а вообще у join point существует немного больше методов. Здесь описывать мы их не станем.

 Aspect - это java класс и мы можем определять их сколько угодно. Теперь мы можем соединять аспекты логирования, которые разделены между собой, можем гибко применять их к большому количеству кода через манипулирование pointcut выражениями. Это суть того, как АОП может оказаться полезным в повседневной работе программиста.
 */


@Aspect
public class LoggingAspect {

        @Before("execution(* com.nospring2.Operation.*(..))")
     public void logMethodExecution(JoinPoint jp) {
//        System.out.println("AOP logging -> " + jp.toShortString());
    }

    @Before("execution(* com.nospring2.Operation.*(..))")
    public void logBefore(JoinPoint joinPoint) {

        System.out.println("logBefore() is running!");
        System.out.println("hi jacked : " + joinPoint.getSignature().getName());
        System.out.println("******");
    }
}