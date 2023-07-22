package electronics_Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import general_utilityes.Webdriver_utilities;

public class Cameraandacessry {
	
	Webdriver_utilities wutill=new Webdriver_utilities();
	@FindBy(xpath = "//a[text()='Cameras & Accessories']")
	private WebElement camera_and_acessories;
	@FindBy(xpath = "//a[text()='Drone']")
	private WebElement dronee;
	
	public Cameraandacessry(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getDronee() {
		return dronee;
	}
	

public WebElement getCamera_and_acessories() {
		return camera_and_acessories;
	}

public void clickondrone()
	
{
	getDronee().click();
}
public void cameraandAceess(WebDriver driver) {
	WebElement ele = getCamera_and_acessories();
	wutill.mouse_movetoelement(driver, ele);
}
public void dronee() {
	getDronee().click();;
	
}
}
