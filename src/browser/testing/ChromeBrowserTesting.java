package browser.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ChromeBrowserTesting {

	public static void main(String[] args) {
		
		
		// Calling using normal method creating instances for interface webdriver and declaring values inline		
		/*System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\BrowserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");*/

		/*System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.get("http://www.google.com");*/
		
		
		// Calling using regular static class and methods 
		WebDriver driverUrl = BrowserUrlConfiguration.getBrowserUrlDriver("Firefox");
		driverUrl.get("http://www.google.com");
		driverUrl.manage().window().maximize();
		
		
		// Calling using lambda method reference with functional interface and abstract method
		/*BrowserSetting setBrowser = (String s) -> BrowserConfigureService.getBrowserDriver(s);
		DefaultBrowser browserDefaultDriver = setBrowser.getWebBrowserDriver("Firefox");
		WebDriver driver = browserDefaultDriver.getBrowserWebDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();*/
		
		
		// Calling using method reference with functional interface and abstract class inheritance
		/*BrowserSetting setBrowser = BrowserConfigureService::getBrowserDriver;
		DefaultBrowser browserDefaultDriver = setBrowser.getWebBrowserDriver("Firefox");
		WebDriver driver = browserDefaultDriver.getBrowserWebDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();*/
		
		// Calling using interface static method with factory pattern and classes implementing interface 
		/*ConfigureBrowser browserConfig = ConfigureBrowser.getBrowserConfiguration("Firefox");		
		WebDriver driver = browserConfig.getWebDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();*/
		
		
		
		
    
	}

}
