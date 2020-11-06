package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
public class Base {
	private static final String projetPropertyFilePath = null;
	// in this class we difine property of below classes and use them to child
	// classes
	// WeDriver
	// Logger
	// properties classes
	public static WebDriver driver;
	public static Properties properties;
	public static Logger Logger;
	private String projectPropertyFilePath = ".\\src\\test\\resources\\inputData\\projectProp.properties";
	private String log4JFilePath = ".\\src\\test\\resources\\inputData\\projectProp.properties";
	public Base() {
		try {
			BufferedReader reader;
			reader = new BufferedReader(new FileReader(projectPropertyFilePath));
			properties = new Properties();
			properties.load(reader);
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Logger = Logger.getLogger("logger_File");
		PropertyConfigurator.configure(log4JFilePath);
	}
	/**
	 * this method will return value of browser name such as Chrome, FireFox , IE,
	 * and Headless browser
	 *
	 *
	 * @return
	 */
	
	
	public static String getBrowserName() {
		String browserName = properties.getProperty("browser");
		return browserName;
		}
	/**
	 * this method will return url of application we use for this FrameWork.
	 * @return
	 */
	
	public static String getURL() {
		String url = properties.getProperty("url");
		return url;
	}
	/**
	 * this method will return implictly wait time and parse it to long data type as
	 * implictly wait method in selenium accepts Long datatype .
	 * @return
	 */
	
	public static Long getImpWait() {
		String imptWait = properties.getProperty("implicitelyWait");
		return Long.parseLong(imptWait);
		
	}
	
	public static Long getPageloadTimeOut() {
		String PageloadTimeOut = properties.getProperty("PageloadTimeOut");
		return Long.parseLong(PageloadTimeOut);
		
	}
	
	
	public static void initializeDriver() {
		driver.get(getURL());
		
	}
	/**
	 * this method will close and quit all windows after each execution.
	 */
	
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
}