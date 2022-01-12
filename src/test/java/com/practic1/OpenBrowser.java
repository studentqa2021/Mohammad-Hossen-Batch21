package com.practic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/mohammadhossen/Downloads/chromedriver-2"); //driver path
		
		WebDriver driver = new ChromeDriver();// Yes == up casting 
		driver.get("https://www.amazon.com/");
	}

}
