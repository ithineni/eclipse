package scripts;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import pages.LoginPage;
import utilities.ReadPropertiesFile;
import utilities.WebDriverHandling;

public class LoginTestCase extends WebDriverHandling {
	static WebDriver driver=null;
	//static Actions act=null;
	static LoginPage loginPage=null;
	
@BeforeClass
		public static void setUp() {
		try {
			driver=WebDriverHandling.getWebDriver();
			loginPage=PageFactory.initElements(driver, LoginPage.class);
					}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
@Test
public  void testCase1_Login() {
	try {
		String url=ReadPropertiesFile.readPropertiesFile(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\Test.properties", "LOGITRAIN_URL");
		driver.get(url);
		test=extent.createTest("Login");
		test.log(Status.INFO, MarkupHelper.createLabel(url, ExtentColor.BLUE));
		loginPage.setUserName("ithineni@gmail.com");
		loginPage.setPassword("Protected1");
		loginPage.clickLogin();
		test.log(Status.PASS, MarkupHelper.createLabel("Login Successful", ExtentColor.GREEN));
		
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	extent.flush();
}
//@AfterClass
//public static void loginClose() {
//	try {
//		driver.close();
//	}
//	catch(Exception e) {
//		e.printStackTrace();
//	}
//	
//}
}

