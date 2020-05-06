package org.stepdefinition;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import buybuybabypoji.buyBuyBabyLoginPojo;
import buybuybabypoji.buyBuyBabySearchCategoriesPojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class buyBuyBabyStep extends BaseClass {
	
	@Given("User is on buybuyBABY website")
	public void user_is_on_buybuyBABY_website() throws InterruptedException, IOException, ATUTestRecorderException {
		launchUrl("https://www.buybuybaby.com/");
		implicitWaitMethod(1000);
		windowMax();
		Thread.sleep(15000);
		takeScreenShots("C:\\screenshots\\BuyBuyBaby.com\\1.png");
		record();

	}

	@When("User Clicks the Sign In button")
	public void user_Clicks_the_Sign_In_button() throws InterruptedException, IOException, ATUTestRecorderException {
		buyBuyBabyLoginPojo login=new buyBuyBabyLoginPojo();
		
		//WebDriverWait wait = new WebDriverWait(driver,3000);
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("accountLink")));
		
		btnClk(login.getClkBtnClose());
		btnClk(login.getClkBtnSignIn());
		btnClk(login.getClkBtnSignIn1());
		takeScreenShots("C:\\screenshots\\BuyBuyBaby.com\\2.png");
		record();
	}

	@When("User Enters the EmailId and password")
	public void user_Enters_the_EmailId_and_password() throws IOException, ATUTestRecorderException {
		buyBuyBabyLoginPojo login=new buyBuyBabyLoginPojo();
		fill(login.getTxtEmailId(),"vimalachokalingam13@gmail.com");
		fill(login.getTxtPassWord(),"Greenstechlakshmi@13");
		takeScreenShots("C:\\screenshots\\BuyBuyBaby.com\\3.png");
		record();
	}

	

	@When("User Clicks the LoginIn button")
	public void user_Clicks_the_LoginIn_button() throws InterruptedException, IOException, ATUTestRecorderException {
		buyBuyBabyLoginPojo login=new buyBuyBabyLoginPojo();
		Thread.sleep(15000);
		btnClk(login. getClkBtnLogin());
		takeScreenShots("C:\\screenshots\\BuyBuyBaby.com\\4.png");
		record();
	}






@When("User moves to Categories button")
public void user_moves_to_Categories_button() throws InterruptedException, IOException, ATUTestRecorderException {
	buyBuyBabySearchCategoriesPojo search= new buyBuyBabySearchCategoriesPojo();
	Thread.sleep(15000);
	moveToElementMethod(search.getTxtCategories());
	takeScreenShots("C:\\screenshots\\BuyBuyBaby.com\\5.png");
	record();
}

@When("User moves to Bath & Potty button")
public void user_moves_to_Bath_Potty_button() throws Throwable {
	buyBuyBabySearchCategoriesPojo search= new buyBuyBabySearchCategoriesPojo();
	Thread.sleep(14000);
	//jsClick(search.getTxtBath());
	moveToElementMethod(search.getTxtBath());
	takeScreenShots("C:\\screenshots\\BuyBuyBaby.com\\6.png");
}

@When("User move to Bath Tubs & Accessories button")
public void user_move_to_Bath_Tubs_Accessories_button() throws InterruptedException, IOException {
	buyBuyBabySearchCategoriesPojo search= new buyBuyBabySearchCategoriesPojo();
	Thread.sleep(1000);
	moveToElementMethod(search.getTxtBathTub());
	takeScreenShots("C:\\screenshots\\BuyBuyBaby.com\\7.png");

}

@When("User Clicks the Bath Safety button")
public void user_Clicks_the_Bath_Safety_button() throws Throwable  {
	buyBuyBabySearchCategoriesPojo search= new buyBuyBabySearchCategoriesPojo();
	Thread.sleep(7000);
	btnClk(search.getClkBtnSafty());
	takeScreenShots("C:\\screenshots\\BuyBuyBaby.com\\8.png");
}

@When("User move to the Price dropdown button,select the options  and click on the option selected")
public void user_move_to_the_Price_dropdown_button_select_the_options_and_click_on_the_option_selected() throws InterruptedException, IOException {
	buyBuyBabySearchCategoriesPojo search= new buyBuyBabySearchCategoriesPojo();
	Thread.sleep(2000);
	btnClk(search.getTxtPrice());
	btnClk(search.getClkBtncheckboxprice());
	Thread.sleep(15000);
	btnClk(search.getClkTheProduct());
	//btnClk(search.getClkBtnClose1());
	takeScreenShots("C:\\screenshots\\BuyBuyBaby.com\\9.png");
}

@When("User Clicks one selected product")
public void user_Clicks_one_selected_product() throws IOException {
	buyBuyBabySearchCategoriesPojo search= new buyBuyBabySearchCategoriesPojo();
	
	btnClk(search.getClkTheProduct());
	takeScreenShots("C:\\screenshots\\BuyBuyBaby.com\\10.png");
	

}

@When("user moves to qnt dropdown box")
public void user_moves_to_qnt_dropdown_box() throws IOException {
	buyBuyBabySearchCategoriesPojo search= new buyBuyBabySearchCategoriesPojo();
	btnClk(search.getClkBtnQtn());
	takeScreenShots("C:\\screenshots\\BuyBuyBaby.com\\11.png");
}

@When("user clicks the qnt")
public void user_clicks_the_qnt() throws IOException {
	buyBuyBabySearchCategoriesPojo search= new buyBuyBabySearchCategoriesPojo();
	btnClk(search.getClkQtn());
	takeScreenShots("C:\\screenshots\\BuyBuyBaby.com\\12.png");
}

@When("user clicks on the shipit button")
public void user_clicks_on_the_shipit_button() throws IOException, InterruptedException {
	buyBuyBabySearchCategoriesPojo search= new buyBuyBabySearchCategoriesPojo();
	Thread.sleep(1200);
	btnClk(search.getClkBtnShipIt());
	takeScreenShots("C:\\screenshots\\BuyBuyBaby.com\\13.png");
}

@When("user clicks on the viewcard and checkout button")
public void user_clicks_on_the_viewcard_and_checkout_button() throws IOException, InterruptedException {
	buyBuyBabySearchCategoriesPojo search= new buyBuyBabySearchCategoriesPojo();
	Thread.sleep(1200);
	btnClk(search.getClkBtnViewCard());
	takeScreenShots("C:\\screenshots\\BuyBuyBaby.com\\14.png");
	 
	
}


}
