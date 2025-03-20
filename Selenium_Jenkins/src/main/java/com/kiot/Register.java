package com.kiot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		WebElement ele1=driver.findElement(By.xpath("//input[@name='firstname']"));
		send(driver,ele1,"Dharani");
		WebElement ele2=driver.findElement(By.xpath("//input[@name='lastname']"));
		send(driver,ele2,"M");
		WebElement ele3=driver.findElement(By.xpath("//input[@name='email']"));
		send(driver, ele3,"2k21dhaty@gmail.com");
		WebElement ele4=driver.findElement(By.xpath("//input[@id='input-telephone']"));
		send(driver,ele4,"8979706756");
		WebElement ele5=driver.findElement(By.xpath("//input[@id='input-password']"));
		send(driver, ele5, "Dharu");
		WebElement ele6=driver.findElement(By.xpath("//input[@id='input-confirm']"));
		send(driver, ele6, "Dharu");
		WebElement ele7=driver.findElement(By.xpath("//input[@name='agree']"));
		clickok(driver,ele7);
//		WebElement ele8=driver.findElement(By.xpath("//input[@value='Continue']"));
//		clickok(driver,ele8);
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/success");
		WebElement ele9=driver.findElement(By.xpath("//a[text()='Account']"));
		clickok(driver,ele9);
		WebElement ele10=driver.findElement(By.xpath("//input[@name='email']"));
		send(driver,ele10,"2k21dhaty@gmail.com");
		WebElement ele11=driver.findElement(By.xpath("//input[@name='password']"));
		send(driver, ele11, "Dharu");
		WebElement ele12=driver.findElement(By.xpath("//input[@value='Login']"));
		clickok(driver,ele12);
		driver.quit();
	}
	public static void send(WebDriver driver,WebElement ele,String k) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='"+k+"'",ele);
	}
	public static void clickok(WebDriver driver,WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
	}

}
