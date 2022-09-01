package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
        System.setProperty("webdriver.chrome.driver","chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		
		WebElement SignUp= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		SignUp.click();
	
		WebElement FName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement LName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement Mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        WebElement Password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		
		FName.sendKeys("Fname");
		LName.sendKeys("Lname");
		Mobile.sendKeys("123456789");
		Password.sendKeys("abc@123");
		
		WebElement Day = driver.findElement(By.name("birthday_day"));
		Select ddDay = new Select(Day);
		ddDay.selectByVisibleText("15");
		

		WebElement Month = driver.findElement(By.name("birthday_month"));
		Select ddMonth = new Select(Month);
		ddMonth.selectByVisibleText("May");
		

		WebElement Year = driver.findElement(By.name("birthday_year"));
		Select ddYear = new Select(Year);
		ddYear.selectByVisibleText("1999");
		
	//	List<WebElement> Months = ddMonth.getOptions();
	//	for(WebElement elm: Months) {
	//		System.out.println(elm.getText());
   //	}
			List<WebElement> AllMonths = driver.findElements(By.xpath("//select[@name='birthday_month']/options"));
			for(WebElement elm: AllMonths) {
				System.out.println(elm.getText());
				
			String Gender = "Male";
			String Xpath = "//label[text()='" + Gender + "']/following-sibling::input";
		WebElement GenderRadioBtn = driver.findElement(By.xpath(Xpath));
		 GenderRadioBtn.click();	
			}
		}

	


	}


