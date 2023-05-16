import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selintro {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","/Users/sivasankarigomathinayagam/Downloads/chromedriver_mac64/chromedriver");
		//Invoking Browser
	//chrome - ChromeDriver -> methods
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		}

}
