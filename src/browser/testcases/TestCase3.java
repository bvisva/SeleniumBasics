package browser.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase3 {

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
		driver.findElement(By.id("formname")).sendKeys("Balaji"+TestCaseHelper.getRandomAlphaNumberic(4));
		driver.findElement(By.id("referrer")).sendKeys("https://www.google.co.in/");
		TestCaseHelper.getDropdownElement(driver.findElement(By.id("format"))).selectByValue("1");
		TestCaseHelper.getDropdownElement(driver.findElement(By.id("empty"))).selectByValue("1");
		TestCaseHelper.getDropdownElement(driver.findElement(By.id("printurl"))).selectByValue("1");
		//System.out.println("program executed");
		driver.findElement(By.id("Submit")).click();	

	}
	
	//<span class="red">ERROR</span>
	//<div id="error_status"><span class="red">ERROR</span>: Please make sure to enter appropriate values into all requested fields.</div>
	 
	//<input name="formname" type="text" class="txt" id="formname" value="" maxlength="120">
	//<textarea name="referrer" class="txt" id="referrer" maxlength="30000">http://</textarea>
	/*<select name="format" class="txt" id="format">
    <option value="1" selected="selected">HTML</option>
    <option value="0">Plain Text</option>
</select>*/
	
	/*<select name="empty" class="txt" id="empty">
    <option value="1" selected="selected">Yes</option>
    <option value="0">No</option>
</select>*/
	/*<select name="printurl" class="txt" id="printurl">
    <option value="1">Yes</option>
    <option value="0" selected="selected">No</option>
</select>*/
	//<input name="Submit" type="submit" id="Submit" value="Next >" class="btn">
	
}
