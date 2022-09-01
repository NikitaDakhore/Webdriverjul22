package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		//step1 .click on the login link
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		
		//step2. Enter Username
		WebElement Username = driver.findElement(By.name("user_login"));
		Username.sendKeys("abc@xyz.com");
				
		//step3. Enter Password
		WebElement Password = driver.findElement(By.id("Password"));
		Password.sendKeys("Test@123");
		
		//step4. Click Remember Me Checkbox
		WebElement Checkbox = driver.findElement(By.className("Remember Me"));
		Checkbox.click();
		
		//step5.Click pn Login button
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
		
		//step6. Validate the error message on screen
		WebElement Error = driver.findElement(By.id("Msg_box"));
		
		String ActError = Error.getText();
		String ExpError = "The email or password you have entered is invalid";
		
		if(ActError.equals(ExpError)) {
			System.out.println("TC Passed");
			
		}else {
			System.out.println("TC Failed");
		}
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("total num of links are" + Links.size());
		
		
		for(int index=0;index<Links.size();index++) {
			System.out.println(Links.get(index).getAttribute("href"));
		}
		//step7. Close the browser
		driver.close();
	}


	}


