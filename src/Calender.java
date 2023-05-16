import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("form-field-travel_comp_date"))));
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		//April 25
		WebElement month = driver.findElement(By.cssSelector(".cur-month"));
		
		while(!month.getText().contains("April"))
		{
			driver.findElement(By.xpath("//*[@version='1.1']")).click();
			
		}
		
		List<WebElement> date= driver.findElements(By.cssSelector(".flatpickr-day"));
		int size = driver.findElements(By.cssSelector(".flatpickr-day")).size();
		
		for(int i=0; i<size; i++)
		{
			String number = date.get(i).getText();
			
			if(number.equalsIgnoreCase("25"))
			{
				
				date.get(i).click();
				break;
				
			}
			
		}
		
	}

}
