package com.kiot;

import java.util.List;

import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bstackdemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://bstackdemo.com/");
        driver.findElement(By.xpath("//select")).click();
        List<WebElement> all=driver.findElements(By.cssSelector("select option"));
        String option="Lowest to highest";
        for(int i=0;i<all.size();i++) {
        	if(all.get(i).getText().contains(option)) {
        		all.get(i).click();
        		System.out.println("clicked");
        		break;
        	}
        }
        driver.quit();
	}

}
