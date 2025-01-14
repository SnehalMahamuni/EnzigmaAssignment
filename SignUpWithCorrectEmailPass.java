package Enzigma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpWithCorrectEmailPass {

	public static void main(String[] args) throws InterruptedException {
		
		
		String expected_result="https://app-staging.nokodr.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app-staging.nokodr.com/");
		Thread.sleep(2000);
		
		String actual_result = driver.getCurrentUrl();
	
		if(expected_result!=(actual_result)){
		     System.out.println("signup done successfully");
		
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("mahamunisnehal77@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='slds-checkbox_faux']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='slds-truncate'])[8]")).click();
		Thread.sleep(1000);
		
		 }
	       else {
				System.out.println("not done signup");
				Thread.sleep(1000);	
			  driver.close();
		
	}

	}
}
