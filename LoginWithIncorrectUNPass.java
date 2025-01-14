package Enzigma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithIncorrectUNPass {
public static void main(String[] args) throws InterruptedException {
		
		String expected_result="Invalid Email or Password";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://app-staging.nokodr.com/");
		Thread.sleep(2000);
		
		String actual_result = "Valid Email or Password";
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("snehalmahamuni77@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345678");
		
		driver.findElement(By.id("rememberMe")).click();
		driver.findElement(By.xpath("//div[@title='Log In']")).click();
		Thread.sleep(1000);	
	
	   if(expected_result.equals(actual_result)){
		System.out.println("login done");
	  }
        else {
			System.out.println(" Invalid Email or password(Enter correct Username Password which is used to signUp)");
		    Thread.sleep(1000);
		    driver.close();
        }
		
	  }
		}

