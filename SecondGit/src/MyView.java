

import org.services.IMyService;
import org.services.MyServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyView {
	public void makingTest()  {
		try{
		ApplicationContext  apctx = new ClassPathXmlApplicationContext("test-config.xml");
		}catch(Exception e){
			
		}
		}
	
	public static void main(String[] args)  {
		
		

		    System.out.println("Calling 26");
		    ApplicationContext ctx = new ClassPathXmlApplicationContext("myspringioc.xml");
		    MyServiceImpl service = (MyServiceImpl) ctx.getBean("myservice");
			service.count();
			
		
		
		
		
	}

}
