package com.kiot;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Omayo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
        //WebElement ele1=driver.findElement(By.id("blogsmenu"));
		Actions ac=new Actions(driver);
        /*ac.moveToElement(ele1).perform();
		WebElement ele2=driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
		ac.moveToElement(ele2).click().build().perform();*/
        /*WebElement ele3=driver.findElement(By.xpath("//input[@class='gsc-input']"));
  		ac.contextClick(ele3).perform();*/
        /*WebElement ele4=driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
     	ac.doubleClick(ele4).perform();*/
		WebElement ele5=driver.findElement(By.xpath("//a[text()='jqueryui']"));
		ac.keyDown(Keys.CONTROL).moveToElement(ele5).click().keyUp(Keys.CONTROL).build().perform();
		//driver.quit();
	}
}
