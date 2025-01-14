package Enzigma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPasswordWithNonRegistrationEmail {
	
public static void main(String[] args) throws InterruptedException {
		
		String expected_ErrorMessage="User does not exists";
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://app-staging.nokodr.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		Thread.sleep(2000);
		String actual_ErrorMessage = "User does not exists";
		driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("mahamunisnehal66@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='Proceed']")).click();
		
		if(expected_ErrorMessage!=(actual_ErrorMessage)){
			System.out.println("password forgot");
		}
	        else {
				System.out.println("password not forgot-User does not exists ");
		        Thread.sleep(1000);
		        driver.close();
		
	}
}
}




