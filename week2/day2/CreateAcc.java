package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAcc {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Test-Bala2595");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement inDd = driver.findElement(By.name("industryEnumId"));
		Select sel=new Select(inDd);
		sel.selectByValue("IND_SOFTWARE");
		WebElement owNn = driver.findElement(By.name("ownershipEnumId"));
		Select sel1=new Select(owNn);
		sel1.selectByVisibleText("S-Corporation");
		WebElement emP = driver.findElement(By.id("dataSourceId"));
		Select sel2=new Select(emP);
		sel2.selectByValue("LEAD_EMPLOYEE");
		WebElement marK=driver.findElement(By.id("marketingCampaignId"));
		Select sel3=new Select(marK);
		sel3.selectByIndex(6);
		WebElement staT=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sel4=new Select(staT);
		sel4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();

		}

}
