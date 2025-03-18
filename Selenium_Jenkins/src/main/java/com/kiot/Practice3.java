package com.kiot;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://omayo.blogspot.com/");
        driver.findElement(By.xpath("//a[@id='selenium143']")).click();
        //driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
        String mw=driver.getWindowHandle();
        Set <String> all=driver.getWindowHandles();
        System.out.println(all);
        System.out.println(all.size());
        for(String unique:all) {
        	if(!(mw.equals(unique))) {
        	driver.switchTo().window(unique);
        	break;
        	}    	
        }
        WebElement ele=driver.findElement(By.xpath("//a[text()='What is Selenium?']"));
        System.out.println(ele.getText());
        driver.switchTo().window(mw);
        WebElement ele2=driver.findElement(By.xpath("//a[text()='Page One']"));
        System.out.println(ele2.getText());
        driver.quit();
	}
}