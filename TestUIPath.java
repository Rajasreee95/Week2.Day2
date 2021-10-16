package Assignment.Week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestUIPath {


	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://acme-test.uipath.com/login");
		Driver.manage().window().maximize();		
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		Driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		Driver.findElement(By.id("password")).sendKeys("leaf@12");
		
		Driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		Driver.getTitle();
		
		System.out.println("the Title of the Page is:" + Driver.getTitle());
		Thread.sleep(2000);
		
		Driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		
		
		Driver.close();
		
	}


}
