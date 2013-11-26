package initial;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import comn.constants.AppConstants;

import scj.comn.beans.HelloBean;

public class SpringBeanInitDestroy {

	public static void main(String[] args) {
	
		/**Bean Initialization using AbstractApplicationContextr*/
		AbstractApplicationContext abstractApplicationContext =  new ClassPathXmlApplicationContext(AppConstants.SPRINGXMLPATH.getValue());
		
		HelloBean bean3 = (HelloBean)abstractApplicationContext.getBean(AppConstants.HELLOBEAN.getValue());
		System.err.println(bean3.toString());
		/**Releasing the resource*/
		abstractApplicationContext.registerShutdownHook();

	}

}
