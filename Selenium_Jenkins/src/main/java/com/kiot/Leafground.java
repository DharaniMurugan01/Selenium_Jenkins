package com.kiot;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Leafground {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/formPage.html");
		WebElement ele1=driver.findElement(By.xpath("//select[@id='multi']"));
        Select drop=new Select(ele1);
        List<WebElement> list1=drop.getOptions();
        System.out.println(list1.size());
        for(WebElement li:list1) {
        	System.out.println(li.getText());
        }
        Boolean mul=drop.isMultiple();
        System.out.println(mul);
        drop.selectByIndex(0);
        drop.selectByValue("onion gravy");
        List<WebElement> list2=drop.getAllSelectedOptions();
        for(WebElement lis:list1) {
        	System.out.println(lis.getText());
        }
        drop.deselectByIndex(0);
        drop.deselectAll();
        driver.quit();
	}

}
