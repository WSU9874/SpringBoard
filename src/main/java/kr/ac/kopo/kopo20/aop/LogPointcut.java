package kr.ac.kopo.kopo20.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogPointcut {
	
	@Pointcut("execution(* kr.ac.kopo.ctc.kopo20.board.service.*.*PointcutBefore(..))")
	private void pointcutBeforeHandler() {}
	
	@Pointcut("execution(* kr.ac.kopo.ctc.kopo20.board.service.*.*PointcutAfter(..))")
	private void pointcutAftereHandler() {}
	
	@Pointcut("execution(* kr.ac.kopo.ctc.kopo20.board.service.*.*PointcutAfterReturning(..))")
	private void pointcutAfterReturningHandler() {}
	
	@Pointcut("execution(* kr.ac.kopo.ctc.kopo20.board.service.*.*PointcutAfterThrowing(..))")
	private void pointcutAfterThrowingHandler() {}
	
	@Pointcut("execution(* kr.ac.kopo.ctc.kopo20.board.service.*.*PointcutAfterAround(..))")
	private void pointcutAfterAroundHandler() {}
	
	@Before("pointcutBeforeHandler()")
	private void onpointcutBeforeHandler() {}
	
	@After("pointcutAfterHandler()")
	private void onpointcutAfterHandler() {}
	
	@AfterReturning(value="pointcutAfterReturningHandler()", returning="returnValue")
	private void onAfterReturningHandler(Object returnValue) {
		System.out.println("LogAspect.onAfterReturningHandler() 핸들러 호출");
		System.out.println("ReturnValue: " +returnValue);
	}
	
	@AfterThrowing(value="pointcutAfterThrowingHandler()", throwing="exception")
	private void onAfterThrowingHandler(Exception exception) {
		System.out.println("LogAspect.onAfterThrowingHandler() 핸들러 호출");
		System.out.println("Exception: " +exception.getMessage());
	}
	
	@Around("pointcutAroundHandler()")
	private void onPointcutAroundHandler(ProceedingJoinPoint pjp) {
		System.out.println("LogPointcut.onPointcutAroundHandler() 핸들러 호출, 시작점");
		try {
			pjp.proceed();
		}catch(Throwable e) {
			e.printStackTrace();
		}
		System.out.println("LogPointcut.onPointcutAroundHandler() 핸들들러 호출, 끝점");
	}

}
