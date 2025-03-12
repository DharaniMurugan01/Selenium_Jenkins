package com.kiot;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectExample {

	public static void main(String[] args) {		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node010exp5wl5vrxw1il0jqt7lyic58908772.node0");
        WebElement ele1=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select drop=new Select(ele1);
        List<WebElement> list1=drop.getOptions();
        System.out.println("size "+list1.size());
        for(WebElement lis:list1) {
        	System.out.println("options are"+lis.getText());
        }
        Boolean mul=drop.isMultiple();
        System.out.println(mul);
        drop.selectByIndex(1);
	}
}