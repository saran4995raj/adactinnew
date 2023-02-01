package com.Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base_Class2.Base_Classes2;

public class SelectHomePage extends Base_Classes2 {
	
	public SelectHomePage(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="radiobutton_0")
	private WebElement radiobutton;
	@FindBy(name="continue")
	private WebElement continuebutton;
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getContinuebutton() {
		return continuebutton;
	}
	

}
