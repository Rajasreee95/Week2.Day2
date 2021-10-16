package Assignment.Week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {


	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://en-gb.facebook.com");
		Driver.manage().window().maximize();		
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		WebElement createAccount = Driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createAccount.click();		

		Driver.findElement(By.name("firstname")).sendKeys("Rajasree");
		Driver.findElement(By.name("lastname")).sendKeys("Dillibabu");
		Driver.findElement(By.name("reg_email__")).sendKeys("9790741111");
		Driver.findElement(By.name("reg_passwd__")).sendKeys("Password");
		
		WebElement date = Driver.findElement(By.id("day"));
		Select dropDown1 = new Select(date);
		dropDown1.selectByIndex(6);
		
		
		WebElement month = Driver.findElement(By.id("month"));
		Select dropDown2 = new Select(month);
		dropDown2.selectByIndex(7);
		
		WebElement year = Driver.findElement(By.id("year"));
		Select dropDown3 = new Select(year);
		dropDown3.selectByIndex(26); 
		
		Driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		
		
		
		 		}


}
