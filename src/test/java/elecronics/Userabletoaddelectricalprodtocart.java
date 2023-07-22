package elecronics;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import electronics_Object_Repository.Cameraandacessry;
import general_utilityes.SuperClass;
import general_utilityes.Webdriver_utilities;
import objectrepository.Homepage;

public class Userabletoaddelectricalprodtocart extends SuperClass {
	 @Test
     public void checkcarttoelecricalproduct() throws Throwable {
		 String maintitle = driver.getWindowHandle();
		Webdriver_utilities wtill=new Webdriver_utilities();
    	Homepage Hpage=new Homepage(driver);
    Thread.sleep(3000);
    	Hpage.electronicss(driver);
		 Thread.sleep(3000);
		 Cameraandacessry ca=new Cameraandacessry(driver);
		 ca.cameraandAceess(driver);
		 ca.dronee();
        driver.findElement(By.xpath("//div[text()='NIKHLIX RVR INTERPRICE MODELl E88 Drone']")).click();//hard coding
        wtill.windowshandlingg(driver);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();//hard coding
        driver.switchTo().window(maintitle);
        driver.findElement(By.xpath("//span[text()='Cart']")).click();//hard coding
       String actual = driver.findElement(By.xpath("//a[@class='_2Kn22P gBNbID']")).getText();//hard coding
       System.out.println(actual);
       String expected="NIKHLIX RVR INTERPRICE MODELl E88 Drone";
       Assert.assertEquals(actual, expected);
       System.out.println("tastcase validated--->(pass)");
     }

}
