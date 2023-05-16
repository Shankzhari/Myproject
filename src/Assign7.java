import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assign7 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		List<WebElement> rows = driver.findElements(By.cssSelector(".table-display tr"));
	
		int count = rows.size();
		
		int headercolumn = driver.findElements(By.cssSelector(".table-display th")).size();
		
		System.out.println(count);
		System.out.println(headercolumn);
		
		
		System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());
	}
}

		
		
		
//		WebElement table=driver.findElement(By.id("product"));
//
//		System.out.println(table.findElements(By.tagName("tr")).size());
//
//		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
//
//		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
//
//		System.out.println(secondrow.get(0).getText());
//
//		System.out.println(secondrow.get(1).getText());
//
//		System.out.println(secondrow.get(2).getText());
//		}
//		

	


