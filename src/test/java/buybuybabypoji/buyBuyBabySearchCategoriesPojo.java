package buybuybabypoji;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class buyBuyBabySearchCategoriesPojo extends BaseClass {
	public buyBuyBabySearchCategoriesPojo() {
		 PageFactory.initElements(driver, this);
	 }
	@FindBy(xpath="//span[text()='Categories']")
	private WebElement linkCat;
	@FindBy(xpath="(//a[starts-with(text(),'Ba')])[1]")
	private WebElement txtBath;
	@FindBy(xpath="(//a[starts-with(text(),'Ba')])[2]")
	private WebElement txtBathTub;
	@FindBy(xpath="(//a[starts-with(text(),'Ba')])[4]")
	private WebElement clkBtnSafty;
	@FindBy(xpath="//button[text()='Price']")
	private WebElement txtPrice;
	@FindBy(xpath="(//span[text()='INR 0 - INR 2096 (32)'])[1]")
	private WebElement clkBtncheckboxprice;
	@FindBy(id="closeButton")
	  private WebElement clkBtnClose;
	@FindBy(xpath="//a[text()='Dreambaby® Room and Bath Duck Thermometer']")
	private WebElement clkTheProduct;

	@FindBy(className="iconWrapperDefault")
	private WebElement clkBtnQtn;
	@FindBy(xpath="//*[text()='1']")
	private WebElement clkQtn;
	@FindBy(xpath="//button[text()='Ship It']")
	private WebElement clkBtnShipIt;
	
	
       @FindBy(xpath="//a[text()='View Cart & Checkout']")
        private WebElement clkBtnViewCard;
	public WebElement getTxtCategories() {
		return linkCat;
	}


	public WebElement getTxtBath() {
		return txtBath;
	}


	public WebElement getTxtBathTub() {
		return txtBathTub;
	}


	public WebElement getClkBtnSafty() {
		return clkBtnSafty;
	}


	public WebElement getTxtPrice() {
		return txtPrice;
	}


	public WebElement getClkBtnClose() {
		return clkBtnClose;
	}


	public WebElement getClkBtncheckboxprice() {
		return clkBtncheckboxprice;
	}


	public WebElement getClkTheProduct() {
		return clkTheProduct;
	}


	public WebElement getClkBtnQtn() {
		return clkBtnQtn;
	}


	public WebElement getClkQtn() {
		return clkQtn;
	}


	public WebElement getClkBtnShipIt() {
		return clkBtnShipIt;
	}


	public WebElement getClkBtnViewCard() {
		return clkBtnViewCard;
	}


	public WebElement getClkBtnClose1() {
		// TODO Auto-generated method stub
		return clkBtnClose;
	}




	
	
	



}