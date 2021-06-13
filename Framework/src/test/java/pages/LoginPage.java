package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
@FindBy(xpath="//input[@name='email']")
private WebElement loginId;

@FindBy(xpath="//input[@name='password']")
private WebElement passWord;

@FindBy(xpath="//button[@type='submit']")
private WebElement subButton;

public void setUserName(String user) {
	try {
		loginId.sendKeys(user);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
public void setPassword(String pwd) {
	try {
		passWord.sendKeys(pwd);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
public void clickLogin() {
	try {
		subButton.click();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
