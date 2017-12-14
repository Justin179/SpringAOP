package tw.com.nec.justin_chen.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class LoggingAspect {

	// Advice (同時符合這兩個patterns，才執行)
	@Before("allGetters() && allCircleMethods()")
	public void LoggingAdvice(){
		System.out.println("LoggingAspect.LoggingAdvice() called");
	}
	
	@Before("allGetters()")
	public void secondAdvice(){
		System.out.println("second advice called");
	}
	
	
	// 以下定義pattern...
	@Pointcut("execution(public * get*())")
	public void allGetters(){}
	
	// 執行Circle下的所有方法的pattern
	//@Pointcut("execution(* * tw.com.nec.justin_chen.model.Circle*())")
	@Pointcut("within(tw.com.nec.justin_chen.model.Circle)") // 第二種寫法
	public void allCircleMethods(){}
	
	
}
