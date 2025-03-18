package com.kiot;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/browser-windows");
        String parent=driver.getWindowHandle();
        System.out.println("parent is "+parent);
        driver.findElement(By.id("windowButton")).click(); 
        Set<String> child=driver.getWindowHandles();
        System.out.println(child.size());
        
        Iterator<String> it=child.iterator();
        String mw=it.next();
        String cw=it.next();
        System.out.println(mw);
        System.out.println(cw);
        driver.switchTo().window(cw);
        WebElement ele2=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
        System.out.println(ele2.getText());
        driver.switchTo().window(mw); 
        System.out.println(driver.getTitle());
        driver.quit();
	}
}
