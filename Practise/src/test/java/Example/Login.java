package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harshitha.muppala\\OneDrive\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("https://ksrtc.in/oprs-web/login/show.do");
		d1.findElement(By.id("userName")).sendKeys("pvnharshitha@gmail.com");
		d1.findElement(By.id("password")).sendKeys("Harshitha@123");
		d1.findElement(By.id("submitBtn")).click();
		
		
	}

}
