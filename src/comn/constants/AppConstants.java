package comn.constants;

public enum AppConstants {
	
	HELLOBEAN("helloBean"), SPRINGXMLPATH("./comn/resources/spring-config.xml");
	
	private String value;
	
	private AppConstants(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
