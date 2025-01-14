package Enzigma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPasswordWithBlankEmailField {

public static void main(String[] args) throws InterruptedException {
		
		String expected_ErrorMessage="Please enter a  email";
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://app-staging.nokodr.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys(" ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='Proceed']")).click();
		
		String actualErrorMessage = "Please enter a email";
		 if (actualErrorMessage.equals(expected_ErrorMessage)) {
			System.out.println("password forgot");
		}
	        else {
				System.out.println("password not forgot- Enter your email");
		        Thread.sleep(1000);
		        driver.close();
		
	}
}
}

