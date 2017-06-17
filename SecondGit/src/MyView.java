

import org.services.IMyService;
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
		
		

		    System.out.println("Calling 25");
		    
		    
		    ApplicationContext ctx = new ClassPathXmlApplicationContext("myspringioc.xml");
			IMyService service = (IMyService) ctx.getBean("myservice");
			service.count();
			
		
		
		
		
	}

}
