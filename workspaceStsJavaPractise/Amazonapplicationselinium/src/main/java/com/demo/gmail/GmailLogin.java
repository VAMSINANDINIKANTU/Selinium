package com.demo.gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\selinium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/signin");

		System.out.println(driver.getTitle());

		driver.findElement(By.id("identifierId")).sendKeys("vamsinandini97@gmail.com");


		 driver.findElement(By.className("VfPpkd-RLmnJb")).click();;

		
	}

}
