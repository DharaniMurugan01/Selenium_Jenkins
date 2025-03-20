package com.kiot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cal {
 public static void main(String []args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		WebElement ele1=driver.findElement(By.xpath("//input[@class='hasDatepicker']"));
		Thread.sleep(3000);
		 sendkey(driver,ele1);
		driver.quit();
 }
 public static void sendkey(WebDriver driver,WebElement ele){
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].value='04/05/2025'",ele);
 }
 }