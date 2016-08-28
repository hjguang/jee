package spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import aop.ObjService;

@Component
@Aspect
public class SimpleAspect {

	private static ClassPathXmlApplicationContext context;

	@Pointcut("execution(* say*(..))")
	public void anPoint() {
		System.out.println("is running");
	}
	@Pointcut("within(aop*)")
	public void inPoint() {
		System.out.println("in running");
	}
	@Pointcut("anPoint() && inPoint()")
	public void combinPoint() {
		
	}
	
	@Before("inPoint()")
	public void before() {
		System.out.println("before");
	}
	
	@After(value="anPoint()")
	public void after() {
		System.out.println("after");
	}

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ObjService obj = (ObjService) context.getBean("objService");

		obj.say();
	}
}
