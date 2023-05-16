import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assign8 {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("united");
		Thread.sleep(3000);
		
		List<WebElement> city = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
		
		for(WebElement select: city)
		{
			
			if(select.getText().equalsIgnoreCase("United States (USA)"))
			{
				select.click();
				break;
				
			}
			
		}

	}

}
