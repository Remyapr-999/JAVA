package myPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext beanFact = new ClassPathXmlApplicationContext("/Resource/x.xml");
		HelloClass obj = (HelloClass) beanFact.getBean("spring3HelloWorldBean");
		obj.printHello();
	}

}
