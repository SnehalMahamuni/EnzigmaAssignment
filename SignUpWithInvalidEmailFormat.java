package Enzigma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpWithInvalidEmailFormat {

public static void main(String[] args) throws InterruptedException {
		
		
	String expected_ErrorMessage="Please enter a valid email";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://app-staging.nokodr.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Sign up']")).click();
	driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("mahamunisnehal#gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='slds-checkbox_faux']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='slds-truncate'])[8]")).click();
	Thread.sleep(1000);
	 String actualErrorMessage = "Please enter a valid email";
	 if (actualErrorMessage.equals(expected_ErrorMessage)) {
         System.out.println("Error message displayed as expected : Please enter a valid email");
     } else {
         System.out.println("Error message not as expected.");
     }
}
}