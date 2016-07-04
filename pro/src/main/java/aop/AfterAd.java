package aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AfterAd  implements AfterReturningAdvice {

		public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
			System.out.println("before advior is running!");
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ObjService obj = (ObjService)context.getBean("objService");
		
		obj.say();
	}

	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("after advior is running!");
	}
}
