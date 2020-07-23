package proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test{


	public static void main(String args[]){
	
		System.setProperty("webdriver.chrome.driver", "path");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://connect-staging.bolt.com/test.html");
		
		String continuePayment = "//div[@class='_1Y_CkbmEy3GXa2KdxO0eod']";
		
		driver.findElement(By.xpath(continuePayment)).click();
		
		driver.switchTo().frame("bolt-checkout-frame");
		
		String emailBox = "id='email'";
		
		driver.findElement(By.id(emailBox)).sendKeys("abc@gmail.com");
		
		
		
		String phoneNum = "id='phone'";
		
		driver.findElement(By.id(phoneNum)).sendKeys("4444444444");
		
		
		
		String cardNum = "id='ccn'";
		
		driver.findElement(By.id(cardNum)).sendKeys("4111-1111-1111-1111");
		
		
		
		String cardExpiry = "id='exp'";
		
		driver.findElement(By.id(cardExpiry)).sendKeys("08/20");
		
		
		String cvv = "id='cvv'";
		
		driver.findElement(By.id(cvv)).sendKeys("999");
				
		String payButton = "//button[@data-tid='checkout-button']";
		
		
	}
		
		
		
	}
