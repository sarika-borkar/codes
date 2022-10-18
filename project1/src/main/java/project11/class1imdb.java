package project11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class class1imdb {

@FindBy (xpath="//table[1]/tbody/tr[6]") private WebElement iname;
	
	@FindBy (xpath="//table[1]/tbody/tr[6]/td[2]") private WebElement idate;
	
	public void imdb(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public String imdbname(){
		
		
		String rdate = iname.getText();
		
		return rdate;
		
	}
	public void imdbdate() {
		
		String d = idate.getText();
			
	}
	
}
