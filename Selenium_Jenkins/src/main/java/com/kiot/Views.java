package com.kiot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Views {

	public static void main(String[] args) throws InterruptedException {
		 
	     WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://configureselenium.blogspot.com/2020/11/selenium-tutorials.html");
		WebElement ele2=driver.findElement(By.cssSelector("#Stats1_totalCount"));
		System.out.println(ele2.getText());
		WebElement ele=driver.findElement(By.xpath("(//a[text()='SELENIUM'])[1]"));
		ele.click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Stats1_totalCount")));
		System.out.println(element.getText());
		driver.quit();
	}
}
