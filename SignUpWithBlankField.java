package Enzigma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpWithBlankField {

public static void main(String[] args) throws InterruptedException {
		

		String expected_result="https://app-staging.nokodr.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://app-staging.nokodr.com/");
		Thread.sleep(2000);
		
		String actual_result = driver.getCurrentUrl();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("  ");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Snehal@12");
		
		driver.findElement(By.id("rememberMe")).click();
		driver.findElement(By.xpath("//div[@title='Log In']")).click();
		Thread.sleep(1000);	
	
	   if(expected_result.equals(actual_result)){
		System.out.println("login done");
	  }
        else {
			System.out.println("please enter Email");
		    Thread.sleep(1000);
		    driver.close();
        }
		
	  }
		
	
		
	}


