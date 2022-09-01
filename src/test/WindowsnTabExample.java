package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsnTabExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","chromedriver");
			
			WebDriver driver = new ChromeDriver(); 
			
			driver.get("http://demoqa.com/browser-windows");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
			
			String parentwin = driver.getWindowHandle();
			System.out.println("before clicking tab button the win is" + parentwin);
			
			WebElement Tab = driver.findElement(By.id("tabButton"));
			Tab.click();
			
			System.out.println("after clicking tab button ");
			
			Set<String> allwins = driver.getWindowHandles();
			
			for(String win : allwins) {
				System.out.println(win);
				
				if(!win .equals(parentwin)) {
					driver.switchTo().window(win);
					
				}
			}
		   WebElement chilHeader = driver.findElement(By.id("sampleHeading"));
		   System.out.println("ChildHeader.gettext()");
		   
		   driver.switchTo().window(parentwin);
		   
		   WebElement Winbtn = driver.findElement(By.id("windowButton"));
		   Winbtn.click();
		   
		   driver.quit();

		}

	}


