package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver","chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("total num of rows are" + Rows.size());
		
		List<WebElement> Columns = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("total num of rows are" + Columns.size());
		
		WebElement Data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr(4)/td(1)"));
		System.out.println("the required data is " + Data.getText());
		
		for(WebElement row : Rows ) {
			List<WebElement> AllCell = row.findElements(By.tagName("//*"));
			for(WebElement Cell : AllCell) {
			System.out.println(Cell.getText()  + "\t");
			
		
		}
		System.out.println();
	}
		for(int row=1;row<Rows.size();row++) {
			for(int col=1;col<Columns.size();col++) {
				WebElement cell = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+ row +"]/*["+ col +"]"));
				System.out.println(cell.getText() + "\t");
			}
			System.out.println();
		}
		String company = "Island Trading";
		String Xpath = "//td[text()='" + company + "']/following-sibling::td[2]";
		WebElement country = driver.findElement(By.xpath(Xpath));
		System.out.println("the country is " + country.getText());
}
	}


