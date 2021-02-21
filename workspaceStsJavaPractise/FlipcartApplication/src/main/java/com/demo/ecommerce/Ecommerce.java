package com.demo.ecommerce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\selinium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		System.out.println(driver.getTitle());

		driver.manage().window().maximize();

		// Initialise Actions class object
		Actions actions = new Actions(driver);

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

		WebElement womenTab = driver.findElement(By.linkText("WOMEN"));

		WebElement TshirtTab = driver
				.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul//a[@title='T-shirts']"));

		actions.moveToElement(womenTab).moveToElement(TshirtTab).click().perform();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Get Product Name

		String ProductName = driver
				.findElement(By.xpath(
						"/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]"))
				.getText();

		System.out.println(ProductName);

		driver.findElement(By.id("search_query_top")).sendKeys(ProductName);

		driver.findElement(By.name("submit_search")).click();

		// Get Name of Searched Product
		String SearchResultProductname = driver
				.findElement(By.xpath(
						"/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]"))
				.getText();
		System.out.println("nandu");

		// Verify that correct Product is displaying after search
		if (ProductName.equalsIgnoreCase(SearchResultProductname)) {
			System.out.println("Results Matched;Test Case Passed");
		} else {
			System.out.println("Results NotMatched;Test Case Failed");
		}

		// Close the browser
		driver.close();
		
		System.out.println("nandu1");

	}

}
