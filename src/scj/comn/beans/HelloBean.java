package scj.comn.beans;

public class HelloBean {

	private String message;
	
	private String scopeVariable;

	public String getScopeVariable() {
		return scopeVariable;
	}

	public void setScopeVariable(String scopeVariable) {
		this.scopeVariable = scopeVariable;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String toString(){
		return "Message : "+getMessage();
	}
	
	public void init(){
		System.err.println("Bean Initialized");
	}
	
	public void destroy(){
		System.err.println("Bean Destroyed");
	}
}
