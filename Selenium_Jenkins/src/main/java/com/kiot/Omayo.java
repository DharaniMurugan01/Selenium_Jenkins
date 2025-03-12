package com.kiot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Omayo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement ele1=driver.findElement(By.id("blogsmenu"));
		Actions ac=new Actions(driver);
		ac.moveToElement(ele1).perform();
		WebElement ele2=driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
		ac.moveToElement(ele2).click().build().perform();
		driver.quit();
	}
}
