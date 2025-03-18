package com.kiot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
//        List<WebElement> s=driver.findElements(By.xpath("//table/thead/tr/th"));
//        for(WebElement e:s) {
//        	System.out.println(e.getText());
//        }
//        List<WebElement> s1=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
//        for(WebElement e1:s1) {
//        	System.out.println(e1.getText());
//        }
//        List<WebElement> s2=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[3]"));
//        for(WebElement e1:s2) {
//        	System.out.println(e1.getText());
//        }
//        System.out.println(s2.size());
//        WebElement s3=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr/td[3]"));
//        System.out.println(s3.getText());
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr"));
        int rc = rows.size();
        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr[1]/td"));
        int cc = cols.size();
        System.out.println(rc + "\n" + cc);
        List<WebElement> a=driver.findElements(By.xpath("//table[@id='table1']//thead/tr/th"));
        for(WebElement e:a) {
        	System.out.printf("%10s",e.getText()," ");
        }
        System.out.println("");
        for(int i=1;i<=rc;i++) {
            for(int j=1;j<=cc;j++){
                WebElement data = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr["+i+"]/td["+j+"]"));
                System.out.printf("%10s",data.getText()," ");
            }
            System.out.println();
        }
        driver.quit();   
	}
}