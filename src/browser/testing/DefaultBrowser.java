package browser.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class DefaultBrowser {
	
	WebDriver getBrowserWebDriver() {
		return null;
	}

}

class BrowserConfigureService{
	
	public static DefaultBrowser getBrowserDriver(String browserName) {
		
	    DefaultBrowser browserDefault;  	
	
	    switch(browserName){  
	    
	    case "Chrome":
	    browserDefault = new ChromeBrowserDefault();  
	    break;  
	    
	    case "Firefox": 
	    browserDefault = new FirefoxBrowserDefault();  
	    break;  
	    
	    default: 
	    browserDefault = new ChromeBrowserDefault();		    
	    }
	    
	    return browserDefault;
}
	
}

class ChromeBrowserDefault extends DefaultBrowser {
	
	private String chromeBrowserKey = "webdriver.chrome.driver";
	private String chromeBrowserValue = "C:\\Users\\DELL\\eclipse-workspace\\BrowserDrivers\\chromedriver.exe";
	private WebDriver chromeBrowserDriver;

	ChromeBrowserDefault() {
		System.setProperty(chromeBrowserKey,chromeBrowserValue);
		chromeBrowserDriver = new ChromeDriver();
	}
	
	@Override
	public WebDriver getBrowserWebDriver() {
		// TODO Auto-generated method stub
		return chromeBrowserDriver;
	}

}

class FirefoxBrowserDefault extends DefaultBrowser {
	
	private String firefoxBrowserKey = "webdriver.gecko.driver";
	private String firefoxBrowserValue = "C:\\Users\\DELL\\eclipse-workspace\\BrowserDrivers\\geckodriver.exe";
	private WebDriver firefoxBrowserDriver;

	FirefoxBrowserDefault() {
		System.setProperty(firefoxBrowserKey,firefoxBrowserValue);
		firefoxBrowserDriver = new FirefoxDriver();
	}
	
	@Override
	public WebDriver getBrowserWebDriver() {
		// TODO Auto-generated method stub
		return firefoxBrowserDriver;
	}

}

