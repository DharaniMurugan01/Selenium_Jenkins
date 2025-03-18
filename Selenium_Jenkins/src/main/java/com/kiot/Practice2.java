package com.kiot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions ac=new Actions(driver);
        WebElement ele1=driver.findElement(By.xpath("//div[@id='box1']"));
        WebElement ele2=driver.findElement(By.xpath("//div[@id='box101']"));
        ac.clickAndHold(ele1).moveToElement(ele2).release().build().perform();
        //ac.dragAndDrop(ele1, ele2).build().perform();
        
        String actual=ele1.getCssValue("background-color");
        String color="rgba(0, 255, 0, 1)";
        if(color.equals(actual)){
        	System.out.println("correct match");
        }
        else {
        	System.out.println("not match");
        }
        driver.quit();
        }
	
}
