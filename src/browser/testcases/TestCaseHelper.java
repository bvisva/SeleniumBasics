package browser.testcases;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCaseHelper {

	private static final String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
	private static final String numbers = "0123456789";
	private static final String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;
	private static Select dropdownElement = null;

	static String getRandomAlphaNumberic(int len) {

		StringBuilder sb = new StringBuilder();

		Random random = new Random();

		for (int i = 0; i < len; i++) {

			char randomChar = alphaNumeric.charAt(random.nextInt(alphaNumeric.length()));
			sb.append(randomChar);
		}
		return sb.toString();
	}
	
	static Select getDropdownElement(WebElement webElement) {
		
		dropdownElement = new Select(webElement);		
		return dropdownElement;			
	}
	

}
