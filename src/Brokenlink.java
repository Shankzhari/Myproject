import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.Assert;

import java.net.URL;
import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.MalformedURLException;
import org.testng.asserts.SoftAssert;

//import java.net.URLConnection;

public class Brokenlink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		  
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		SoftAssert a = new SoftAssert();
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		for(WebElement link :links)
		
		{
			
			String url = link.getAttribute("href");
			
			HttpURLConnection connect = (HttpURLConnection)new URL(url).openConnection();
			connect.setRequestMethod("HEAD");
			connect.connect();
			int code = connect.getResponseCode();
			
			a.assertTrue(code<400,"The link with url "+link.getText()+"is broken with "+code);
			
		}
		
		a.assertAll();
	}

}
