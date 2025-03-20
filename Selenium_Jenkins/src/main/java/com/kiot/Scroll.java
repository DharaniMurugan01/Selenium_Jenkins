package com.kiot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
        WebElement ele=driver.findElement(By.xpath("//input[@name='search']"));
        sendKeys(driver,ele);
        WebElement cl=driver.findElement(By.xpath("//i[@class='fa fa-search']"));
        click(driver,cl);
        JavascriptExecutor jse=(JavascriptExecutor) driver;
       // jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        jse.executeScript("window.scrollBy(0,300)");
        jse.executeScript("arguments[0].scrollIntoView(true);", cl);
        jse.executeScript("window.scrollBy(0,-300)");
        
	}
	public static void sendKeys(WebDriver driver,WebElement ele) {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='HP'",ele);
	}
	public static void click(WebDriver driver,WebElement ele){
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()",ele);
  }
}
