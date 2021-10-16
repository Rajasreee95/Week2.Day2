package Assignment.Week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		Driver.manage().window().maximize();	
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		
	
		Driver.findElement(By.name("UserFirstName")).sendKeys("Rajasree");
		Driver.findElement(By.name("UserLastName")).sendKeys("Dillibabu");
		Driver.findElement(By.name("UserEmail")).sendKeys("Rajee@gmail.com");

		WebElement jobTitle = Driver.findElement(By.name("UserTitle"));
		Select dropDown1 = new Select(jobTitle);
		dropDown1.selectByValue("IT_Manager_AP");
		
		Driver.findElement(By.name("CompanyName")).sendKeys("Accenture");
		
		WebElement companyName = Driver.findElement(By.name("CompanyEmployees"));
		Select dropDown2 = new Select(companyName);
		dropDown2.selectByValue("1 - 15 employees");
		Thread.sleep(2000);
		
		Driver.findElement(By.name("UserPhone")).sendKeys("9790741111");
		
		WebElement country = Driver.findElement(By.id("CompanyCountry-4HEN"));
		Select dropDown3 = new Select(country);
		dropDown3.selectByValue("India");
		
		
		}


}
