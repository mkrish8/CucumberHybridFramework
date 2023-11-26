package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
	public static Properties intializeProperties(){
		Properties prop = new Properties();
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resource\\config\\config.properties");
		//File file = new File(System.getProperty("user.dir")+"C:\\Users\\krish\\eclipse-workspace\\CGP\\src\\test\\resource\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			prop.load(fis);
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
		return prop;
	}


}
