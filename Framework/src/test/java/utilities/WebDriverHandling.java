package utilities;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
public class WebDriverHandling {
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest test;
	public static int counter;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
public static WebDriver getWebDriver() {
	WebDriver driver=null;
	try {
				String brow= ReadPropertiesFile.readPropertiesFile(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\Test.properties", "BROWSER");
		if(brow.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ReadPropertiesFile.readPropertiesFile(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\Test.properties", "CHROME_DRIVER"));
			driver= new ChromeDriver();
					}
		else if(brow.equals("EDGE")){
			System.setProperty("webdriver.edge.driver", ReadPropertiesFile.readPropertiesFile(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\Test.properties", "CHROME_DRIVER"));
			driver= new EdgeDriver();
			
		}
		else {
			System.out.println("Invalid Broswer Type");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	catch(Exception e) {
		System.out.println("Exception occured in getWedDriver Method");
		e.printStackTrace();
	}
	return driver;
}
@BeforeClass
public static void resultAll() {
	if(counter==0) {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\Practice\\extentreportpractice.html");
		extent =new com.aventstack.extentreports.ExtentReports();
		extent.attachReporter(htmlReporter);
		counter++;
	}
	else {
		
	}
	
}
}
