package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import general_utilityes.Webdriver_utilities;

public class Homepage {
	
	
	@FindBy(xpath = "//span[text()='Top Offers']")
	private WebElement topoffers;
	
	@FindBy(xpath = "//span[text()='Mobiles & Tablets']")
	private WebElement Mobiles_Tablets;
	
	@FindBy(xpath = "//div[text()='Electronics']")
	private WebElement Electronicsss;
	
	@FindBy(xpath = "//span[text()='TVs & Appliances']")
	private WebElement TVs_Appliances;
	
	@FindBy(xpath = "//span[text()='Fashion']")
	private WebElement Fashion;
	
	@FindBy(xpath = "//span[text()='Beauty']")
	private WebElement Beauty;
	
	@FindBy(xpath = "//span[text()='Home & Kitchen']")
	private WebElement Home_Kitchen;
	
	@FindBy(xpath = "//span[text()='Furniture']")
	private WebElement Furniture;
	
	@FindBy(xpath = "//span[text()='Flights']")
	private WebElement Flights;
	
	@FindBy(xpath = "//span[text()='Grocery']")
	private WebElement Grocery;
	
	@FindBy(xpath = "//a[text()='Cart']")
    private WebElement cart;
	
	@FindBy(xpath = "//input[@name='q']")
	private WebElement searchbar;
	
	@FindBy(xpath = "//span[text()='Sign in']")
	private WebElement Signdropdown;
	
	@FindBy(xpath = "//span[text()='Sign Up']")
	private WebElement Sign_Up;
	
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getTopoffers() {
		return topoffers;
	}

	public WebElement getMobiles_Tablets() {
		return Mobiles_Tablets;
	}

	public WebElement getElectronicsss() {
		return Electronicsss;
	}

	public WebElement getTVs_Appliances() {
		return TVs_Appliances;
	}

	public WebElement getFashion() {
		return Fashion;
	}

	public WebElement getBeauty() {
		return Beauty;
	}

	public WebElement getHome_Kitchen() {
		return Home_Kitchen;
	}

	public WebElement getFurniture() {
		return Furniture;
	}

	public WebElement getFlights() {
		return Flights;
	}

	public WebElement getGrocery() {
		return Grocery;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getSigndropdown() {
		return Signdropdown;
	}

	public WebElement getSign_Up() {
		return Sign_Up;
	}
	
	Webdriver_utilities wutil=new Webdriver_utilities();
	public void  topoffers(WebDriver driver) {
		WebElement ele = getTopoffers();
		wutil.mouse_movetoelement(driver, ele);
	}
	public void mobile_and_tablests(WebDriver driver) {
		WebElement ele = getMobiles_Tablets();
		wutil.mouse_movetoelement(driver, ele);
	}
	public void electronicss(WebDriver driver) {
		WebElement ele = getElectronicsss();
		wutil.mouse_movetoelement(driver, ele);
	}
   public void tv_aplieness(WebDriver driver) {
	   WebElement ele = getTVs_Appliances();
	   wutil.mouse_movetoelement(driver, ele);
   }
   public void Fasionss(WebDriver driver) {
	  WebElement ele = getFashion();
	  wutil.mouse_movetoelement(driver, ele);
   }
   public void beautyy(WebDriver driver) {
	  WebElement ele = getBeauty();
	  wutil.mouse_movetoelement(driver, ele);
   }
   public void home_kitchen(WebDriver driver) {
	  WebElement ele = getHome_Kitchen();
	  wutil.mouse_movetoelement(driver, ele);
   }
   public void Fornithure(WebDriver driver) {
	   WebElement ele = getFurniture();
	   wutil.mouse_movetoelement(driver, ele);
   }
   public void Flightes(WebDriver driver) {
	   WebElement ele = getFlights();
	   wutil.mouse_movetoelement(driver, ele);
   }
   public void Groceress(WebDriver driver) {
	   WebElement ele = getGrocery();
	   wutil.mouse_movetoelement(driver, ele);
   }
   public void CART(WebDriver driver) {
	   WebElement ele = getCart();
	   wutil.mouse_movetoelement(driver, ele);
   }
   public void SEARCHBar(String name) {
	   getSearchbar().sendKeys(name);
   }
   public void clicksigndropsown(WebDriver driver) {
	   WebElement ele = getSigndropdown();
	   wutil.mouse_movetoelement(driver, ele);
   }
  public void siguplink() {
	  getSign_Up().click();
  }
}
