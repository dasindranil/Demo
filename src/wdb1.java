import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class wdb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(By.id("u_0_l")).sendKeys("testing");
        driver.findElement(By.id("u_0_n")).sendKeys("Selenium");
        driver.findElement(By.name("reg_email__")).sendKeys("edurekadevops@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("edurekadevops@gmail.com");
        driver.findElement(By.name("websubmit")).click();
	}

	

}
