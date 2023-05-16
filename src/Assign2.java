import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assign2 {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("sivasankari");
		driver.findElement(By.name("email")).sendKeys("sankari.069@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("sankari");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement dropdown1 = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select gender = new Select(dropdown1);
		
		gender.selectByVisibleText("Female");
		 driver.findElement(By.id("inlineRadio1")).click();
		 driver.findElement(By.name("bday")).sendKeys("12/06/1993");
		 driver.findElement(By.xpath("//input[@value='Submit']")).click();
		 System.out.println(driver.findElement(By.cssSelector(".alert.alert-success")).getText());
		 
		}

}
