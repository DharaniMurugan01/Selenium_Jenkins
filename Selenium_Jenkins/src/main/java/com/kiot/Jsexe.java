package com.kiot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jsexe {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://bstackdemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement op2=driver.findElement(By.xpath("//Select"));
         JavascriptExecutor js=(JavascriptExecutor)driver;
         js.executeScript("arguments[0].value='highestprice'", op2);
         System.out.println("Sucessfully selected");
       //  driver.findElement(By.xpath("//Select")).sendKeys("highestprice");
//		WebElement ele=driver.findElement(By.xpath("//select"));
//		ele.click();
//		Actions ac=new Actions(driver);
//		ac.moveToElement(ele).perform();
//		WebElement co=driver.findElement(By.xpath("//option[text()='Lowest to highest']"));
//		co.click();
        driver.quit();
	}

}
