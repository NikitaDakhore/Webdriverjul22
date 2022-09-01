package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    System.setProperty("webdriver.chrome.driver","chromedriver");
			
			WebDriver driver = new ChromeDriver(); 
			
			driver.get("http://demo.guru99.com/test/upload");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
			
          WebElement FileUpload = driver.findElement(By.name("uploadfile_0"));
          FileUpload.sendKeys("/home/nikitadakhore25/Desktop/FileUploadingExample/");
          
          WebElement TnC = driver.findElement(By.id("term"));
          TnC.click();
          WebElement Submit = driver.findElement(By.id("submitButton"));
          Submit.click();
	}



	}


