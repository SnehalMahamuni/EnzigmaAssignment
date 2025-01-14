package Enzigma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithCorrectUNPass {

	public static void main(String[] args) throws InterruptedException {
		
		String expected_result="https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");
		Thread.sleep(2000);
		
		String actual_result = driver.getCurrentUrl();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mahamunisnehal77@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Snehal@123");
		
		driver.findElement(By.id("rememberMe")).click();
		driver.findElement(By.xpath("//div[@title='Log In']")).click();
		Thread.sleep(1000);	
	
	   if(expected_result.equals(actual_result)){
		System.out.println("login done");
	  }
        else {
			System.out.println(" login not done");
		    Thread.sleep(1000);
		    driver.close();
        }
		
	  }
		}
	





