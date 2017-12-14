package tw.com.nec.justin_chen.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class LoggingAspect {

	// Advice
	@Before("execution(public * get*())")
	public void LoggingAdvice(){
		System.out.println("LoggingAspect.LoggingAdvice() called");
	}
	
}
