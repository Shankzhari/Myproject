import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.Assert;

public class streaminselenium {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		  
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> items = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> original = items.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> newlist =  original.stream().sorted().collect(Collectors.toList());
		
//		Assert.assertTrue(original.equals(newlist));
		
		//To get the price of the element "Beans"
		List<String> price;
		do {
			
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s -> s.getText().contains("Orange"))
				.map(s-> getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		
		if(price.size()==0)
		{
			
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		
		}while(price.size()==0);
		
//		
//		rows.stream().filter(s -> s.getText().contains("Rice"))
//
//		.map(s -> getPriceVeggie(s)).collect(Collectors.toList());
	}

	
	private static String getPriceVeggie(WebElement s)
	{
		
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
		
	}
}
