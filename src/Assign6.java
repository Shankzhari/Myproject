import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assign6 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		String value = driver.findElement(By.xpath("//div/fieldset/label[@for='bmw']")).getText();
	
		WebElement drop = driver.findElement(By.name("dropdown-class-example"));
	
	Select dropdown = new Select(drop);
	dropdown.selectByVisibleText(value);
	driver.findElement(By.id("name")).sendKeys(value);
	
	driver.findElement(By.id("alertbtn")).click();
	String alertmsg = driver.switchTo().alert().getText();
	if(alertmsg.contains(value))
	{
		System.out.println("Alert success");
	}
	else
	{
		System.out.println("No alert found");
		
	}
		
		
		
		
	}

}
