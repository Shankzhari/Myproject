import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

public class Newlogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		String name= "sivasankari Gomathinayagam";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String Password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		
		driver.findElement(By.name("inputPassword")).sendKeys(Password);

		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.xpath("//p[contains(text(),'You are successfully logged in.')]")).getText(), "You are successfully logged in.");
//		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'You are successfully logged in.')]")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class=\"login-container\"]/h2")).getText(), "Hello "+name+",");
		driver.findElement(By.cssSelector("button.logout-btn")).click();
		driver.close();
		
	}
	
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	
	{	
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		String PasswordText = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] PasswordArray = PasswordText.split("'");
		String[] PasswordArray2 = PasswordArray[1].split("'");
		String Password = PasswordArray2[0];
		
		return Password;
		
		
	}

}
