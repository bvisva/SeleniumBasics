package browser.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*@FunctionalInterface
public interface BrowserUrl {
	
	WebDriver getBrowserUrl(String urlName); 

}*/


class BrowserUrlConfiguration{
	
	private static String chromeSystemUrlKey = "webdriver.chrome.driver";
	private static String chromeSystemUrlValue = "C:\\Users\\DELL\\eclipse-workspace\\BrowserDrivers\\chromedriver.exe";
	//private WebDriver chromeWebDriver;
	private static String firefoxSystemUrlKey = "webdriver.gecko.driver";
	private static String firefoxSystemUrlValue = "C:\\Users\\DELL\\eclipse-workspace\\BrowserDrivers\\geckodriver.exe";
	private static WebDriver returnWebDriver;	
	
	
	public static WebDriver getBrowserUrlDriver(String uri) {
		
		 switch(uri){  
		    
		    case "Chrome":
		    System.setProperty(chromeSystemUrlKey,chromeSystemUrlValue);
		    returnWebDriver = new ChromeDriver();  
		    break;  
		    
		    case "Firefox": 
		    System.setProperty(firefoxSystemUrlKey,firefoxSystemUrlValue);
			returnWebDriver = new FirefoxDriver();  
		    break;  
		    
		    default: 
		    returnWebDriver = new ChromeDriver();		    
		    }
		 
		 return returnWebDriver;
		    
		
	}
	
	}
	


