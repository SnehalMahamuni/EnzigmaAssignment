package Enzigma;


import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app-staging.nokodr.com/");
		Thread.sleep(2000);
        driver.close();
	}
}
