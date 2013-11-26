package initial;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import scj.comn.beans.HelloBean;


public class SpringTest {

	public static void main(String[] args) {
		
		final String springResourceFilePath = "./comn/resources/spring-config.xml";
		final String HELLOBEAN = "helloBean";
	
		/**Bean Initialization using Bean factory container*/
		BeanFactory factory =  new ClassPathXmlApplicationContext(springResourceFilePath);
		HelloBean helloBean = (HelloBean)factory.getBean(HELLOBEAN);
		System.err.println(helloBean.toString());
		
		/**Bean Initialization using Application context container*/
		ApplicationContext context = new ClassPathXmlApplicationContext(springResourceFilePath);		
		HelloBean bean = (HelloBean)context.getBean(HELLOBEAN);		
		System.err.println(bean.toString());
	
	}

}
