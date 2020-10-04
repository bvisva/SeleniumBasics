package browser.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public interface ConfigureBrowser {

	String getSystemKey();

	String getSystemValue();

	WebDriver getWebDriver();
	
	static ConfigureBrowser getBrowserConfiguration(String browserName) {
		
		    ConfigureBrowser setBrowser;  	
		
		    switch(browserName){  
		    
		    case "Chrome":
		    setBrowser = new ChromeBrowser();  
		    break;  
		    
		    case "Firefox": 
		    setBrowser = new FirefoxBrowser();  
		    break;  
		    
		    default: 
		    setBrowser = new ChromeBrowser();		    
		    }
		    
		    return setBrowser;
	}

}

class ChromeBrowser implements ConfigureBrowser {

	private String chromeSystemKey = "webdriver.chrome.driver";
	private String chromeSystemValue = "C:\\Users\\DELL\\eclipse-workspace\\BrowserDrivers\\chromedriver.exe";
	private WebDriver chromeWebDriver;

	ChromeBrowser() {
		System.setProperty(chromeSystemKey,chromeSystemValue);
		chromeWebDriver = new ChromeDriver();
	}

	@Override
	public String getSystemKey() {
		// TODO Auto-generated method stub
		return chromeSystemKey;
	}

	@Override
	public String getSystemValue() {
		// TODO Auto-generated method stub
		return chromeSystemValue;
	}

	@Override
	public WebDriver getWebDriver() {
		// TODO Auto-generated method stub
		return chromeWebDriver;
	}
}

class FirefoxBrowser implements ConfigureBrowser {

	private String firefoxSystemKey = "webdriver.gecko.driver";
	private String firefoxSystemValue = "C:\\Users\\DELL\\eclipse-workspace\\BrowserDrivers\\geckodriver.exe";
	private WebDriver firefoxWebDriver;

	FirefoxBrowser() {
		System.setProperty(firefoxSystemKey, firefoxSystemValue);
		firefoxWebDriver = new FirefoxDriver();
	}

	@Override
	public String getSystemKey() {
		// TODO Auto-generated method stub
		return firefoxSystemKey;
	}

	@Override
	public String getSystemValue() {
		// TODO Auto-generated method stub
		return firefoxSystemValue;
	}

	@Override
	public WebDriver getWebDriver() {
		// TODO Auto-generated method stub
		return firefoxWebDriver;
	}
}
