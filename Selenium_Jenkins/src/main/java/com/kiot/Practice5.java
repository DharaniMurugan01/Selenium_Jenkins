package com.kiot;
import java.util.Set;
import java.time.Duration;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Practice5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.leafground.com/window.xhtml");
//		WebElement ele1=driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]"));
//		ele1.click();
//		System.out.println("parent title "+driver.getTitle());
//		Set<String> all=driver.getWindowHandles();
//		Iterator<String> iterator=all.iterator();
//		String cw=iterator.next();
//		driver.switchTo().window(cw);
//		System.out.println("Child Title is "+driver.getTitle());
		
//		WebElement ele2=driver.findElement(By.xpath(("(//button[@name='j_idt88:j_idt91'])")));
//		ele2.click();
//		Set<String> alll=driver.getWindowHandles(); 
//		System.out.println(alll.size());
//		WebElement ele3=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']"));
//		ele3.click();
//		Set<String> allll=driver.getWindowHandles();
//		System.out.println(allll.size());
//		WebElement ele5=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']"));
//		ele5.click();    
//		driver.quit();
		
		
		driver.get("https://omayo.blogspot.com/");
        String parentWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[@id='selenium143']")).click();
        driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
        //Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        Set<String> allWindows = driver.getWindowHandles();
        String[] s=new String[3];
        for (String win:allWindows) {
            
           // System.out.println("URL:"+driver.getCurrentUrl());
            if(!(parentWindow.equals(win))) {
            	driver.switchTo().window(win);
            	break;
            }
        }
        WebElement ele=driver.findElement(By.xpath("//h3"));
        System.out.println(ele.getText());
        driver.close();
        driver.switchTo().window(parentWindow);
        WebElement ele1=driver.findElement(By.xpath("//a[text()='Page One']"));
        System.out.println(ele1.getText());
        driver.quit();
	}
}
