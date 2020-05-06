package buybuybabypoji;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class buyBuyBabyLoginPojo extends BaseClass {
	public buyBuyBabyLoginPojo() {
		 PageFactory.initElements(driver, this);
	 }
	@FindBy(id="closeButton")
	  private WebElement clkBtnClose;
	 @FindBy(id="accountLink")
	  private WebElement clkBtnSignIn;
	
	@FindBy(className="babyPrimaryWrapper")
	  private WebElement clkBtnSignIn1;
	
	
	
	
	@FindBy(id="signin-email")
	  private WebElement txtEmailId;
	 
	@FindBy(id="signin-password")
	  private WebElement txtPassWord;
	 
	 @FindBy(id="signin-submit")
	  private WebElement clkBtnLogin;

	 public WebElement getClkBtnClose() {
		return clkBtnClose;
	}
	 
	public WebElement getClkBtnSignIn() {
			return clkBtnSignIn;
		}
	public WebElement getClkBtnSignIn1() {
		return clkBtnSignIn1;
	}
	 
	public WebElement getTxtEmailId() {
		return txtEmailId;
	}

	public WebElement getTxtPassWord() {
			return txtPassWord;
		}

	public WebElement getClkBtnLogin() {
			return clkBtnLogin;
		}

}
