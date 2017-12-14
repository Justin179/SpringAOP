package tw.com.nec.justin_chen.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import tw.com.nec.justin_chen.model.Circle;


@Aspect
public class LoggingAspect {

	// Advice (同時符合這兩個patterns，才執行)
	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinPoint){
//		System.out.println(joinPoint.getTarget()); // tw.com.nec.justin_chen.model.Circle@3d100e15 -> 這個可以直接cast成物件
//		Circle circle = (Circle) joinPoint.getTarget();
	}
	
	@Before("args(name)")
	public void stringArgumentMethods(String name){
		System.out.println("a method that takes String arguments has been called: " + name);
	}
	
	
	// 以下定義pattern...
	
	// 執行Circle下的所有方法的pattern
	//@Pointcut("execution(* * tw.com.nec.justin_chen.model.Circle*())")
	@Pointcut("within(tw.com.nec.justin_chen.model.Circle)") // 第二種寫法
	public void allCircleMethods(){}
	
	
	@Pointcut("execution(public * get*())")
	public void allGetters(){}
}
