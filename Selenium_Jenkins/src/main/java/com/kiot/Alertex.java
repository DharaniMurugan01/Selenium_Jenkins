package com.kiot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertex {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
        WebElement ele1=driver.findElement(By.xpath("//input[@id='alert1']"));
        ele1.click();
        String k=driver.switchTo().alert().getText();
        System.out.println(k);
        driver.switchTo().alert().accept();
        
        WebElement ele2=driver.findElement(By.xpath("//input[@id='prompt']"));
        ele2.click();
        driver.switchTo().alert().sendKeys("Dharani");
        driver.switchTo().alert().accept();
        
        WebElement ele3=driver.findElement(By.xpath("//input[@id='confirm']"));
        ele3.click();
        String m=driver.switchTo().alert().getText();
        System.out.println(m);
        driver.switchTo().alert().accept();
      
	}

}
