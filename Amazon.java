package seleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("The title of the page is: "+ driver.getTitle());
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The URL of the page is  :"+ currentUrl);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop", Keys.ENTER);
		
		
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
