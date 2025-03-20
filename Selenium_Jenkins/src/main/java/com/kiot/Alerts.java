package com.kiot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.google.com/");
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("alert('welcome')");
//        driver.get("https://omayo.blogspot.com/");
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("document.getElementsByName('samename')[1].click()");
        driver.get("https://www.google.com/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("document.getElementById('APjFqb').value='java'");
//        WebElement ele1=driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
//        js.executeScript("arguments[0].click()",ele1);
          System.out.println((String)js.executeScript("return document.domain"));
          System.out.println((String)js.executeScript("return document.title"));
        
        //js.executeScript("getElementsByClassName('gNO89b')[1].click()");
        //driver.quit();
	}
}