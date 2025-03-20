package com.kiot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Methoduse {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("C:\\Users\\ADMIN\\AppData\\Local\\Google\\Chrome\\User Data");
		options.addArguments("--profile-directory=Default");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement ip=driver.findElement(By.id("APjFqb"));
		sendKeys(driver,ip);
		WebElement ele=driver.findElement(By.xpath("(//input[@class=\"gNO89b\"])[2]"));
		click(driver,ele);
		}
		public static void sendKeys(WebDriver driver,WebElement ele) {
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].value='Java'",ele);
		}
		public static void click(WebDriver driver,WebElement ele){
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click()",ele);
	}

}
