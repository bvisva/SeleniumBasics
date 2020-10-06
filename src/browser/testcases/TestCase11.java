package browser.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Negative Test Case
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
		driver.findElements(By.className("radio")).get(2).click();
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("subjectvalue")).sendKeys("2");
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("Submit")).click();
		String test= driver.findElement(By.id("error_status")).getText();
		System.out.println(test);


	}

}
