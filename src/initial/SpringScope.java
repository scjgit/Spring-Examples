package initial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import comn.constants.AppConstants;

import scj.comn.beans.HelloBean;

public class SpringScope {

	public static void main(String[] args) {
		
		/**Bean Initialization using Application context container*/
		ApplicationContext context = new ClassPathXmlApplicationContext(AppConstants.SPRINGXMLPATH.getValue());		
		HelloBean bean = (HelloBean)context.getBean(AppConstants.HELLOBEAN.getValue());		
		System.err.println(bean.toString());
		
		bean.setScopeVariable("Prototype");
		System.err.println("Scope Variable: "+bean.getScopeVariable());
		
		HelloBean bean2 = (HelloBean)context.getBean(AppConstants.HELLOBEAN.getValue());
		System.err.println("Scope Variable: "+bean2.getScopeVariable());
	}

}
