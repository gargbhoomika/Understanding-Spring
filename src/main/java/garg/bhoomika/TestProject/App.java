package garg.bhoomika.TestProject;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Car obj = (Car)context.getBean("car");
        obj.drive();
    	
//    	Type t = (Type)context.getBean("type");
//    	System.out.println(t);
    }
}
