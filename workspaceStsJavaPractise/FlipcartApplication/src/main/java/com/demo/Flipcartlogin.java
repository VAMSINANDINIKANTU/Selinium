package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Flipcartlogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\selinium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		System.out.println(driver.getTitle());

		driver.manage().window().maximize();

		Actions actions = new Actions(driver);

		Action sendEsc = actions.sendKeys(Keys.ESCAPE).build();

		sendEsc.perform();

		driver.findElement(By.name("q")).sendKeys("Dell laptops");

		driver.findElement(By.className("L0Z3Pu")).click();


		// Action Sendpagedown = actions.sendKeys(Keys.PAGE_DOWN).build();

		// Sendpagedown.perform();

		Thread.sleep(4000);

		driver.findElement(By.className("_4rR01T")).click();

		System.out.println("name");
		
		driver.findElement(By.className("_1KOMV2")).click();
		
		System.out.println("nandu");
		
		driver.findElement(By.className("_3LWZlK")).click();
		

	}

}
