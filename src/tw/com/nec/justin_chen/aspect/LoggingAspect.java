package tw.com.nec.justin_chen.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class LoggingAspect {

	// Advice
	@Before("allGetters()")
	public void LoggingAdvice(){
		System.out.println("LoggingAspect.LoggingAdvice() called");
	}
	
	@Before("allGetters()")
	public void secondAdvice(){
		System.out.println("second advice called");
	}
	
	@Pointcut("execution(public * get*())")
	public void allGetters(){}
	
}
