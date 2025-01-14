package Enzigma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPasswordWithRegEmail {

	public static void main(String[] args) throws InterruptedException {
		
		String expected_result="https://app-staging.nokodr.com/";
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://app-staging.nokodr.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		Thread.sleep(2000);
		String actual_result = driver.getCurrentUrl();
		driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("mahamunisnehal77@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='Proceed']")).click();
		
		if(expected_result!=(actual_result)){
			System.out.println("password forgot - reset code sent to your email");
		}
	        else {
				System.out.println("password not forgot");
		        Thread.sleep(1000);
		        driver.close();
		
	}
}
}
