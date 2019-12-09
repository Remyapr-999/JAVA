package org.face.maven.SpringMavenProject;

import Hello.HelloClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext beanFact = new ClassPathXmlApplicationContext("/x.xml");
		HelloClass obj = (HelloClass) beanFact.getBean("idd");
		obj.printHello();
    }
}
