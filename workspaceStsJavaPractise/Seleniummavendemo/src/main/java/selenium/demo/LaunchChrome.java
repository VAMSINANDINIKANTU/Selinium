package selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\selinium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
	}

}
