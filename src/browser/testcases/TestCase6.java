package browser.testcases;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import browser.testcases.TestCaseHelper;

public class TestCase6 {

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
				driver.findElements(By.className("forms")).get(0).click();
				driver.findElement(By.id("Submit")).click();
				TestCaseHelper.getDropdownElement(driver.findElement(By.id("eadd"))).selectByValue("balaji.visvanathan@gmail.com");
				driver.findElement(By.id("Submit")).click();
			
				
				
			

	}
	
}


	
	
	
	/*<form name="form_wizard" method="post" action="wiz_2a.php">
	<input name="accesscode" id="accesscode" type="hidden" value="dee7601c6297">
	<p>There are  several options to choose who the form submittal will go to:</p>

	<div class="forms"><input name="etypetemp" type="radio" value="1" class="radio" checked="checked"><label for="etypetemp" class="inline">Send form submittals to one predefined e-mail address. <a class="help" href="#">?<span>If you choose this option, the form submittal will be e-mailed to one predefined e-mail address of your choice. This is the only option available to Standard Users.</span></a></label></div>

	<div class="forms"><input name="etypetemp" type="radio" value="2" class="radio" disabled="disabled"><label for="etypetemp" class="inline">Send form submittals to up to 25 predefined e-mail addresses. <a class="help" href="#">?<span>If you choose this option, the form submittal will be e-mailed to up to 25 predefined e-mail addresses of your choice. This option is only available for Premium Members.</span></a></label></div>

	<div class="forms"><input name="etypetemp" type="radio" value="3" class="radio" disabled="disabled"><label for="etypetemp" class="inline">Allow the user to select one address from a predefined list to send to. <a class="help" href="#">?<span>If you choose this option, the user's of your forms will select one e-mail address for the form submittal to be sent to using either a dropdown box or series of radio buttons. This option is only available for Premium Members.</span></a></label></div>

	<div class="forms"><input name="etypetemp" type="radio" value="5" class="radio" disabled="disabled"><label for="etypetemp" class="inline">Allow the user to select multiple addresses from a predefined list to send to. <a class="help" href="#">?<span>If you choose this option, the user's of your forms will select up to 25 e-mail addresses for the form submittal to be sent to using a series of check boxes. This option is only available for Premium Members.</span></a></label></div>
	<div class="bottom">
	<input name="previous" type="button" id="previous" onclick="parent.location='wiz_1.php?back=y&amp;accesscode=dee7601c6297'" value="< Previous" class="btn">
	<input name="Submit" type="submit" id="Submit" value="Next >" class="btn">
	</div>
	</form>*/


