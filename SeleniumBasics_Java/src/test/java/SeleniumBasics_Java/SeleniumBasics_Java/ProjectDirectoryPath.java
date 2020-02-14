package SeleniumBasics_Java.SeleniumBasics_Java;

import java.util.Enumeration;
import java.util.Properties;

public class ProjectDirectoryPath {
	
	public static void main(String[] args) {
		
	//Project path
		System.out.println("Present Project Directory : "+ System.getProperty("user.dir")+ "\n");
		
		
		
		
		//Key Values of jre
		
		System.out.println("Present Project Directory keys in JRE\n");
		
	Properties properties = System.getProperties();
	Enumeration<Object> enumeration = properties.keys();
	for (int i = 0; i < properties.size(); i++) {
	    Object obj = enumeration.nextElement();
	    System.out.println("Key: "+obj+"\tOutPut= "+System.getProperty(obj.toString()));
	}

}}
