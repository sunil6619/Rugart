package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import resources.Base;

public class Readconfig{
	
	Properties prop;
	String configpath="S:\\Eclipse 2\\Rugartisan_New\\config.properties";
	
	public Readconfig() {
		try {
			Properties prop=new Properties();
			FileInputStream fis= new FileInputStream(configpath);
			prop.load(fis);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	

	public String getbaseurl(String key) {
		String value="";
		 value=prop.getProperty(key);
		
		if (value!=null)
			return value;
		else
			throw new RuntimeException("url not specified in config file");
	}
	
	public String getemail(String key) {
		String value=prop.getProperty(key);
		if (value!=null)
			return value;
		else
			throw new RuntimeException("email not specified in config file");
}
	public String getpassword(String key) {
		String value=prop.getProperty(key);
		if (value!=null)
			return value;
		else
			throw new RuntimeException("password not specified in config file");
	}
}
