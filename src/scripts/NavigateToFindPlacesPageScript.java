package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import methods.Methods;
import pages.HomePage;
import utils.SetUpBrowser;

public class NavigateToFindPlacesPageScript {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		for(int i=1; i<=8;i++){
			WebDriver driver=SetUpBrowser.openBrowser("Chrome");
			Methods.maxWindow(driver);
			Methods.implicitWait(driver);
			driver.get("https://www.airbnb.co.in/");
			HomePage obj = PageFactory.initElements(driver, HomePage.class);
			obj.setCookie();
			obj.setCityName(i,driver);
			obj.setFromDate(driver);
			obj.toDate();
			obj.searchButton();
			obj.setAddUsers();
			obj.setSearchPlacesButton();
			obj.setBoxOfPlacesOfUdepur(driver);
			obj.setCookie();
			driver.quit();
		}
		
	}

}
