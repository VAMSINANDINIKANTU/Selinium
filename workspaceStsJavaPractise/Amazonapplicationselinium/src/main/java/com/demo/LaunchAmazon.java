package com.demo;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\selinium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());

		WebElement Searchbox = driver.findElement(By.id("twotabsearchtextbox"));

		Searchbox.sendKeys("jbl earphones with mic");

		WebElement SearchIcon = driver.findElement(By.id("nav-search-submit-button"));

		SearchIcon.click();


		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,40000)");
		
		Thread.sleep(4000);

		driver.quit();

	}

}
