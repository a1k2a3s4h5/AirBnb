package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePage {

	public WebDriver driver;
	public int i=10;
	@FindBy(how=How.XPATH,using="//button[@data-testid='accept-btn']")
	public WebElement okCookie;
	
	@FindBy(how=How.XPATH , using="//div[@class='_1dv5cye'][2]//b")
	public WebElement cityName; 
	
	@FindBy(how=How.XPATH , using="//div[@class='_1lds9wb'][1]//tr[4]/td[4]")
	public WebElement fromDate;
	
	@FindBy(how=How.XPATH , using="//div[@class='_1lds9wb'][1]//tr[4]/td[6]")
	public WebElement toDate;
	
	@FindBy(how=How.XPATH,using="//div[@class='_1yulsurh']")
	public WebElement searchButton;
	
	@FindBy(how=How.XPATH,using="//button[@aria-label='increase value']")
	public WebElement addUsers;

	By boxOfPlacesOfUdepur = By.xpath("//div[@class='_fhph4u']//div[@itemprop='itemListElement']");
	@FindBy(how=How.XPATH,using="//button[@class='_1mzhry13']")
	public WebElement searchPlacesButton;
	
	public void setCookie() {
		okCookie.click();
	}
	
	public void setCityName(int i,WebDriver driver) {
		try {
			driver.findElement(By.xpath("//div[@class='_1dv5cye']["+i+"]//b")).click();
		}
		catch(Exception e) {
			System.out.println("Udepur is not clicked."+ i);
		}
		
	}
	public void setFromDate(WebDriver driver) {
		try {
			driver.findElement(By.xpath("//div[text()='Add dates']")).click();
			fromDate.click();
		}
		catch(Exception e)
		{
			fromDate.click();
		}
		
	}
	public void toDate() {
		toDate.click();
	}
    public void searchButton() {
    	searchButton.click();
    }
    public void setSearchPlacesButton() {
    	searchPlacesButton.click();
    }
    public void setAddUsers() {
    	List<WebElement> lst = addUsers.findElements(By.xpath("//button[@aria-label='increase value']"));
		/*
		 * for(WebElement lst1:lst) { lst1.click(); }
		 */
    	lst.get(0).click();
    	lst.get(1).click();
    	lst.get(1).click();
		/*
		 * lst.get(1).click(); lst.get(1).click(); lst.get(2).click();
		 * lst.get(2).click(); lst.get(2).click();
		 */   	
    }
    
    public void setBoxOfPlacesOfUdepur(WebDriver driver) {
    	List<WebElement> lst = driver.findElements(boxOfPlacesOfUdepur);
    	for(i=1;i<=8;i++) {
    		lst.get(i).click();
    		System.out.println("Print item of "+i+ "index");
    	}
    	
    }
}
