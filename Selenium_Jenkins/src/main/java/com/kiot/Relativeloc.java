package com.kiot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relativeloc {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement username1 = driver.findElement(RelativeLocator.with(By.tagName("input")).above(pass));
        username1.sendKeys("Admin");
        WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement password1 = driver.findElement(RelativeLocator.with(By.tagName("input")).below(user));
        password1.sendKeys("admin123");
        String furl=driver.getCurrentUrl();
        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();           
        WebElement profileDropdown = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
        profileDropdown.click();
        WebElement logout = driver.findElement(By.xpath("(//a[@class='oxd-userdropdown-link'])[4]"));
        logout.click();
        String lurl=driver.getCurrentUrl();
        if(furl.equals(lurl)) {
        	System.out.println("Logout is verified");
        }
        driver.quit();
	}
}
