package project11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class class2wiki {

	
@FindBy (xpath="//table[@class='infobox vevent']/tbody/tr[14]/td") private WebElement wname;
	
	@FindBy (xpath="//table[@class='infobox vevent']/tbody/tr[12]/td/div/ul/li") private WebElement wdate;
	
public void wiki(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
    public String wikiname(){
		
		String x = wname.getText();
		return x;
		
	}

	public void wikidate() 
	{
		wdate.getText();
		
	}

}
