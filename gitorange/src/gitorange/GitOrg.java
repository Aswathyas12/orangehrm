package orangehrm1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orang {
	@Test
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aswathy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/orangehrm/orangehrm-5.5/orangehrm-5.5/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("Aswathy@2625");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
	
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
	
		driver.findElement(By.name("firstName")).sendKeys("Aswathy");

		driver.findElement(By.name("middleName")).sendKeys("achu");
		driver.findElement(By.name("lastName")).sendKeys("AS");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		driver.quit();
	}

}
