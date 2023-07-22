package general_utilityes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SuperClass {
	
	public static WebDriver driver;
    @BeforeSuite
	public void DBconne() throws Throwable {
		System.out.println("database is sucessfullly connected to java");
		/* Driver d=new Driver();
    	 DriverManager.registerDriver(d);
    	Connection conn = DriverManager.getConnection("urlofmysql/db name","dbusername","dbpasswprd");
    	Statement sta = conn.createStatement();
    	 String quary="select * from emp;";
    	 sta.executeQuery(quary);*/
    	 
	}
	@BeforeTest
	public void parallalexcution() {
		System.out.println("this is for parallal excution");
	}
	@BeforeClass
	public void browserlaunch() throws Throwable {
		Datafromexternalre_properties dp=new Datafromexternalre_properties();
		String URL = dp.getdatafromproperties("url");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(URL);
		
		driver.manage().window().maximize();
		Webdriver_utilities w=new Webdriver_utilities();
		w.implicitywait(driver);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
	}
	@BeforeMethod
	public void apllicationlaunch() throws Throwable {
		
		System.out.println("application launched sucessfully");
	}
	@AfterMethod
	public void applicationclosed(){
	
		
		System.out.println("applicatio closed sucessfully");
	}
	@AfterClass
	public void closethe_browser() {
		driver.quit();
	}
	@AfterTest
	public void paralallexc() {
		System.out.println("parallalexcutioon stops here");
	}
	@AfterSuite
	public void bdclosed() {
		//conn.close();
	}
}
