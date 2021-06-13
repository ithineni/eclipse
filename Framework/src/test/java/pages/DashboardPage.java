package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
	
@FindBy(xpath="//a[@id='shortcut__dropdown']")
private WebElement dashBoard;

@FindBy(xpath="(//a[@class='header__shortcut__dropdown__item has__spa'])[1]")
private WebElement realTime;

@FindBy(xpath="(//a[@class='header__shortcut__dropdown__item has__spa'])[2]")
private WebElement screenShot;

@FindBy(xpath="(//a[@class='header__shortcut__dropdown__item has__spa'])[4]")
private WebElement smartTest;

public void clickDashBoard() {
	try {
		dashBoard.click();
			}
	catch(Exception e) {
		e.printStackTrace();
			}
}
public void clickRealTime() {
	try {
		realTime.click();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
public void clickScreenShot() {
	try {
		screenShot.click();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
public void clickSmartTest() {
	try {
		smartTest.click();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
