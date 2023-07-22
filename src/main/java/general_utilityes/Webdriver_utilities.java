package general_utilityes;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Webdriver_utilities {
	
	
	public void mouse_movetoelement(WebDriver driver,WebElement element) {
		
		Actions act=new Actions(driver);
		act.moveToElement(element);
		act.perform();
	}
	public void implicitywait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void allertt(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
    public void minimize(WebDriver driver) {
    	driver.manage().window().minimize();
    }
    public void refreshwindow(WebDriver driver) {
    driver.navigate().refresh();
    }
    public void  forwardwindow(WebDriver driver) {
		driver.navigate().forward();
	}
    public void backwardwindow(WebDriver driver) {
    	driver.navigate().back();
    }
    public void windowscrooldown(WebDriver driver,String element) {
    	JavascriptExecutor jsc=(JavascriptExecutor)driver;
    	jsc.executeScript("argumets[0].ScroolIntoview();",element);
    	
    }
    public void framess(WebDriver driver,int val) {
    	driver.switchTo().frame(val);
    }
    public void frameshiftchildtoparent(WebDriver driver) {
    	driver.switchTo().defaultContent();
    }
    public void windowshandlingg(WebDriver driver) {
    	String pids = driver.getWindowHandle();
    	Set<String> cids = driver.getWindowHandles();
    	Iterator<String> itr=cids.iterator();
    	while(itr.hasNext()) {
    		
    		String ele = itr.next();
    	    String alltitles = driver.switchTo().window(ele).getTitle();
    	    if(pids.contains(alltitles)) {
    	    	break;
    	    }
    	}
    }
}
