package CoverFoxUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHeathPlanPage 
{
	// data members
	@FindBy(className = "next-btn")
	private WebElement next_btn;
	// constrcutor
	public CoverFoxHeathPlanPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	// methods
	public void clickOnNextButton() {
	next_btn.click();
	}

}
