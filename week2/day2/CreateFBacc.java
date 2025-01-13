package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFBacc {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Bala");
		driver.findElement(By.name("lastname")).sendKeys("Murugan");
		driver.findElement(By.name("reg_email__")).sendKeys("bala007jb@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Bala@007");
		WebElement doB=driver.findElement(By.id("day"));
		Select s=new Select(doB);
		s.selectByValue("25");
		WebElement moN=driver.findElement(By.name("birthday_month"));
		Select s1=new Select(moN);
		s1.selectByValue("2");
		WebElement yeaR=driver.findElement(By.id("year"));
		Select s2=new Select(yeaR);
		s2.selectByValue("1995");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
	
		
	    		
		
		
		
	}

}
