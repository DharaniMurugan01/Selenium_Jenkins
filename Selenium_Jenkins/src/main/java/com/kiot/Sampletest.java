//package com.kiot;
//import java.time.Duration;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//public class Sampletest {
//    public static void main(String[] args) {
//    	 WebDriver driver = new ChromeDriver();
//         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//         driver.get("https://www.naukri.com");
//         WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/nav/ul/li[1]/a"));
//         String text = element.getText();
//         System.out.println("Text: " + text);
//         driver.quit();
//     }
//}
package com.kiot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Sampletest {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		/*WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
        WebElement timebut=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='timerButton']")));
        timebut.click();*/
//		WebDriver driver=new ChromeDriver();
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//		driver.manage().window().maximize();
//		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
//        WebElement timebut=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='reveal']")));
//        timebut.click();
//        WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='revealed']")));
//        ele.sendKeys("I am dharani");
//        WebElement ele1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='revealed']")));
//        System.out.println(ele1.getDomProperty("value"));
//        driver.quit();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.naukri.com");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/nav/ul/li[1]/a"));
        String text = element.getText();
        System.out.println("Text: " + text);
        driver.quit();
	}
}
