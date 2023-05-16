import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Loginpage {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("sankari.069");
		driver.findElement(By.name("inputPassword")).sendKeys("pwd123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("sankari");
		driver.findElement(By.xpath("//*[@type='text'][2]")).sendKeys("sankari@rahul.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.xpath("//*[@type='text'][2]")).sendKeys("sankari.069@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("5037249563");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//button[contains(@class,'go')]")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("sivasankariqa93@gmail.com");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("Gomathi$6");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		driver.findElement(By.cssSelector("p.error")).getText();
		Assert.assertEquals(driver.findElement(By.cssSelector("p.error")).getText(), "* Incorrect username or password");
		
		driver.quit();
	
		
		
		
		// TODO Auto-generated method stub

	}

}
