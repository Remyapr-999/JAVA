package mainPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext beanFact = new ClassPathXmlApplicationContext("/Resource/x.xml");
		HelloClass obj = (HelloClass) beanFact.getBean("idd");
		obj.printHello();

	}

}
