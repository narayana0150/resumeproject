package homepage;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checking_links_of_broken {
	@Test
	public void workinglinks() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.manage().window().maximize();
		List<WebElement> alllinkss = driver.findElements(By.tagName("a"));
		System.out.println(alllinkss.size());
		for(int i=0;i<alllinkss.size();i++) {
			WebElement element = alllinkss.get(i);
			String url = element.getAttribute("href");
			URL CONNE=new URL(url);
			HttpURLConnection hconn=(HttpURLConnection)CONNE.openConnection();
			hconn.getContent();
			int responsecode = hconn.getResponseCode();
			if(responsecode>=400) {
				System.out.println(url+"--->brokenlink");
				Thread.sleep(2000);
				continue;
			}
			else {
				System.out.println(url+"--> not brokenlink");
			}
		}
	}

}
