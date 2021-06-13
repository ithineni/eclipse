package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LtBrowserPage {

@FindBy(xpath="//a[text()='LT Browser ']")
private WebElement ltBrowser;

public void ltBroswerClick() {
	try {
		ltBrowser.click();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}

}
