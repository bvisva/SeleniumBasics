package browser.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Positive Test Case
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		
		WebElement userId =  driver.findElement(By.id("user"));
		userId.sendKeys("Prabhu123");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.name("btnSubmit")).click();
		driver.findElement(By.linkText("New Form Wizard")).click();
		driver.findElement(By.name("submit")).click();
		
		//<input type="submit" name="submit" value="Start Wizard" class="btn">
		//<a href="https://www.mycontactform.com/panel/wiz_new.php">New Form Wizard</a>
		
	/*	URL - https://www.mycontactform.com/
		UserField
		    id = user
			xpath = //*[@id="user"]
			css = input#user.txt_log
        Password Field
			id = pass			//*[@id="pass"]
			css = input#pass.txt_log
        Login Button 
			btnSubmit */

		

	}

}
