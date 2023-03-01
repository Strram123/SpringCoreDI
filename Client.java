package core.Spring.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Airtel airtel=context.getBean("airtel",Airtel.class);
		airtel.display();
	}

}
