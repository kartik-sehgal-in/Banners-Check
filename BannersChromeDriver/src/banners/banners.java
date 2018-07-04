package banners;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class banners {

	@Test
	public void f() {
		  
			{
				System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				String a[] = new String[7];
				String URL = null;
				driver.get("https://m.snapdeal.com/");

				int j=1;
				driver.manage().window().maximize();
				for(j=1;j<=7;j++) {
				a[j-1] = driver.findElement(By.xpath("//*[@id='top-banner']/div["+ (j+1)+ "]/a")).getAttribute("href");
				}

				for(int i=0; i<7;i++)
				{
					driver.navigate().to(a[i]);
					URL = driver.getCurrentUrl();
					System.out.println(a[i]);
					Assert.assertFalse(a[i].contains("deal-of-the-day"));
				}
		        driver.quit();
				
			}
		  
	  }

}
