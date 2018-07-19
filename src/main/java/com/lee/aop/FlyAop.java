package com.lee.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class FlyAop {
	/**
	 * 定义切入点
	 */
	@Pointcut("execution(public * com.lee.aop.Birds.*(..))")
    private void allMethod(){}  
    
    //针对指定的切入点表达式选择的切入点应用前置通知  
    @Before("allMethod()")    
    public void before(JoinPoint call) {  
        String className = call.getTarget().getClass().getName();
        String methodName = call.getSignature().getName();
        System.out.println("开始执行:"+className+"."+methodName+"()方法...");
    } 
    
    
    //访问命名切入点来应用后置通知  
    @AfterReturning("allMethod()")  
    public void afterReturn(JoinPoint call) {  
        String className = call.getTarget().getClass().getName();
        String methodName = call.getSignature().getName();
        System.out.println(className+"."+methodName+"()方法正常执行结束...");
    } 
    
    //应用最终通知  
    @After("allMethod()")  
    public void after(JoinPoint call) {  
        String className = call.getTarget().getClass().getName();
        String methodName = call.getSignature().getName();
        System.out.println(className+"."+methodName+"()最终执行步骤(finally)...");
    }  
    //应用异常抛出后通知  
    @AfterThrowing("allMethod()")  
    public void afterThrowing(JoinPoint call) {  
        String className = call.getTarget().getClass().getName();
        String methodName = call.getSignature().getName();
        System.out.println(className+"."+methodName+"()方法抛出了异常...");
    }  
    //应用周围通知  
    //@Around("allMethod()")  
    public Object doAround(ProceedingJoinPoint call) throws Throwable{  
        Object result = null;  
        this.before(call);//相当于前置通知  
        try {  
            result = call.proceed();  
            this.afterReturn(call); //相当于后置通知  
        } catch (Throwable e) {  
            this.afterThrowing(call);  //相当于异常抛出后通知  
            throw e;  
        }finally{  
            this.after(call);  //相当于最终通知  
        }  
        return result;  
    } 
	
}
