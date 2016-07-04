package aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeforeAd  implements MethodBeforeAdvice {

		public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
			System.out.println("before advior is running!");
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ObjService obj = (ObjService)context.getBean("objService");
		
		obj.say();
	}
}
