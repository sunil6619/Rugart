package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Readconfig {
	
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

	

	public String geturl() {
		String value=prop.getProperty("url");
		
		if (value!=null)
			return value;
		else
			throw new RuntimeException("url not specified in config file");
	}
	
	public String getemail() {
		String value=prop.getProperty("email");
		if (value!=null)
			return value;
		else
			throw new RuntimeException("email not specified in config file");
	}
	public String getpassword() {
		String value=prop.getProperty("password");
		if (value!=null)
			return value;
		else
			throw new RuntimeException("password not specified in config file");
	}
}
