package scripts;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import pages.LtBrowserPage;
import utilities.ReadPropertiesFile;
import utilities.WebDriverHandling;
public class LtBrowserTestCase extends WebDriverHandling {
	static WebDriver driver=null;
	static LtBrowserPage ltBrowserPage=null;
	@BeforeClass
	public static void setUp2() {
		try {
			driver=LoginTestCase.driver;
			ltBrowserPage=PageFactory.initElements(driver, LtBrowserPage.class);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void testCase1LtBrowserPage() {
		try {
			test=extent.createTest("LT BROWSER");
			String expectedValue=ReadPropertiesFile.readPropertiesFile(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\Test.properties", "LTBROWSER");
			ltBrowserPage.ltBroswerClick();
			String actualValue=driver.findElement(By.xpath("//h1[text()='LT Browser- Desktop App for Fast and Easy Mobile View Testing']")).getText().trim();
			if(expectedValue.equals(actualValue)) {
				test.log(Status.PASS,MarkupHelper.createLabel("Expected:"+" &nbsp; "+expectedValue+","+" &nbsp; "+"Actual:"+" &nbsp; "+actualValue, ExtentColor.GREEN));
			}
			else
			{
				test.log(Status.PASS,MarkupHelper.createLabel("Expected:"+" &nbsp; "+expectedValue+","+" &nbsp; "+"Actual:"+" &nbsp; "+actualValue, ExtentColor.RED));
			}
			extent.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@AfterClass
	public static void ltBrowserClose() {
		try {
			driver.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
