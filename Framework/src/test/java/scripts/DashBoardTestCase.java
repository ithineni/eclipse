package scripts;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import pages.DashboardPage;
import utilities.ReadPropertiesFile;
import utilities.WebDriverHandling;

public class DashBoardTestCase extends WebDriverHandling {
	static WebDriver driver=null;
	static DashboardPage dashboardPage=null;
	static String url=null;
		
@BeforeClass
 
	public static void setUp1() {
		try {
			driver=LoginTestCase.driver;
			dashboardPage=PageFactory.initElements(driver, DashboardPage.class);
					}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
@Test
public void testCase1_DashBoard() {
	try {
	test=extent.createTest("DashBoard");
	String expectedValue= ReadPropertiesFile.readPropertiesFile(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\Test.properties", "EXPECTED_REALTIME");
	dashboardPage.clickDashBoard();
	dashboardPage.clickRealTime();
	Thread.sleep(1000);
	String actualValue= driver.findElement(By.xpath("//h4[text()='Select your configuration to start Real time testing!']")).getText().trim();
	if(expectedValue.equals(actualValue)) {
		test.log(Status.PASS, MarkupHelper.createLabel("Expected:"+" &nbsp; "+expectedValue+","+" &nbsp; "+"Actual:"+" &nbsp; "+actualValue, ExtentColor.GREEN));
			}
		else {
		test.log(Status.WARNING, MarkupHelper.createLabel("Expected:"+" &nbsp; "+expectedValue+","+" &nbsp; "+"Actual:"+" &nbsp; "+actualValue, ExtentColor.ORANGE));
	}
	extent.flush();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}

@Test
public void testCase2_screenShot() {
	try {
	test=extent.createTest("ScreenShot");
	String expectedValue= ReadPropertiesFile.readPropertiesFile(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\Test.properties", "EXPECTED_SCREENSHOT");
	dashboardPage.clickDashBoard();
	dashboardPage.clickScreenShot();
	Thread.sleep(1000);
	String actualValue= driver.findElement(By.xpath("//div[text()='Capture screenshots for multiple browsers & devices']")).getText().trim();
	if(expectedValue.equals(actualValue)) {
		test.log(Status.PASS, MarkupHelper.createLabel("Expected:"+" &nbsp; "+expectedValue+","+" &nbsp; "+"Actual:"+" &nbsp; "+actualValue, ExtentColor.GREEN));
			}
		else {
		test.log(Status.WARNING, MarkupHelper.createLabel("Expected:"+" &nbsp; "+expectedValue+","+" &nbsp; "+"Actual:"+" &nbsp; "+actualValue, ExtentColor.ORANGE));
	}
	extent.flush();
		}
	catch(Exception e) {
		e.printStackTrace();
	}
}
@Test
public void testCase3_smartTest() {
	try {
	test=extent.createTest("SmartTest");
	String expectedValue= ReadPropertiesFile.readPropertiesFile(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\Test.properties", "EXPECTED_SMARTTEST");
	dashboardPage.clickDashBoard();
	Thread.sleep(1000);
	dashboardPage.clickSmartTest();
	Thread.sleep(1000);
	String actualValue= driver.findElement(By.xpath("//h2[text()='Smart Comparison Testing']")).getText().trim();
	if(expectedValue.equals(actualValue)) {
		test.log(Status.PASS, MarkupHelper.createLabel("Expected:"+" &nbsp; "+expectedValue+","+" &nbsp; "+"Actual:"+" &nbsp; "+actualValue, ExtentColor.GREEN));
			}
		else {
		test.log(Status.WARNING, MarkupHelper.createLabel("Expected:"+" &nbsp; "+expectedValue+","+" &nbsp; "+"Actual:"+" &nbsp; "+actualValue, ExtentColor.ORANGE));
	}
	extent.flush();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
//@AfterClass
public static void dashBoardClose() {
	try {
		driver.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
