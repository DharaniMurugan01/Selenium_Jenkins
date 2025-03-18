package com.kiot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		String month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		while((!(month.equals("May")) || (!(year.equals("2025"))))) {
			WebElement btn=driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]"));
			btn.click();
			month=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			year=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
		}
		System.out.println(month+"\n"+year);
		driver.quit();
	}
}
