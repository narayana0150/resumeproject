package general_utilityes;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class Listenerss implements ITestListener {
	
	ExtentReports reports;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String mname = result.getMethod().getMethodName();
		reports.createTest(mname);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String mname = result.getMethod().getMethodName();
		 TakesScreenshot ddd = (TakesScreenshot)SuperClass.driver;
		File src = ddd.getScreenshotAs(OutputType.FILE);
         Date da=new Date();
         da.toString().replace(" ", ":");
		File dest = new File("./Screenshotsrepo"+mname+".png");
		try {
			Files.copy(src, dest);
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String mname = result.getMethod().getMethodName();
		test.log(Status.SKIP, mname);
	}

	@Override
	public void onStart(ITestContext context) {
		int i=0;
	ExtentSparkReporter esr=new ExtentSparkReporter("narayana.html");
	esr.config().setDocumentTitle("fliprepots("+i+")");
	esr.config().setTheme(Theme.DARK);
	esr.config().setReportName("automation");
		reports=new ExtentReports();
		reports.attachReporter(esr);
		reports.setSystemInfo("os", "windows10");
		reports.setSystemInfo("brower", "chrome");
		reports.setSystemInfo("version", "114.00");
	}

	@Override
	public void onFinish(ITestContext context) {
	reports.flush();
	}

}
