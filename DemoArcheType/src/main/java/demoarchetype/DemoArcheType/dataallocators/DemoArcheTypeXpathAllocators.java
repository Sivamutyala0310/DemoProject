package demoarchetype.DemoArcheType.dataallocators;

import java.io.IOException;
import java.util.Properties;


import demoarchetype.DemoArcheType.constants.ConstantFilePaths;
import demoarchetype.DemoArcheType.utils.ReadLocatorsFile;



public class DemoArcheTypeXpathAllocators 
{
	Properties properties;
	
	// define String variables
	
	
	
	
	
	
	public void getData() throws IOException {
		properties = ReadLocatorsFile.loadProperty(ConstantFilePaths.LOCATORS_FILE);
		
		
		// calling setters();
		
		


	
	
	
	
	
}
	/*
	 * public void setClickOnAboutUsXpath() { clickOnAboutUsXpath =
	 * properties.getProperty("clickOnAboutUsXpath"); }
	 */
	
	// implementation setters and getters
	
	
	public static void main(String[] args) throws IOException {
		DemoArcheTypeXpathAllocators keys = new DemoArcheTypeXpathAllocators();
		keys.getData();
	}
}
