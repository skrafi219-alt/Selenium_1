import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void loginApp() {
		
		WebDriver driver = new ChromeDriver();
		
		try {
			
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			
			Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"),"Login Failed");
		}finally {
			driver.quit();
		}
	}
}
