package com.stepdefinition2;

import com.Base_Class2.Base_Classes2;

import PageObjectManager2.PageObjectManager_class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin_stepdefinition extends Base_Classes2 {

	PageObjectManager_class obj = new PageObjectManager_class(driver);
	
	@Given("User open the chrome")
	public void user_open_the_chrome() {
	   browserlaunch("chrome");
	}
	@Given("User enter the url")
	public void user_enter_the_url() {
		getUrl("https://adactinhotelapp.com/");
	}

	@Given("User enter the username")
	public void user_enter_the_username() {
		elementSendKeys(obj.getLogin().getUsername(), "Anbarasananbu143");
	}

	@Given("User enter the password")
	public void user_enter_the_password() {
		elementSendKeys(obj.getLogin().getPassword(), "anbu@12345");
	}

	@When("User click the login Button")
	public void user_click_the_login_button() {
		elementClick(obj.getLogin().getLogin());
	}

	@Then("login successfull")
	public void login_successfull() {
	}
	@Given("User click the select location")
	public void user_click_the_select_location() {
		SelectDropdown(obj.getSearch().getLocation(), "index", "7");
	}
	@Given("User click the select Hotel")
	public void user_click_the_select_hotel() {
		SelectDropdown(obj.getSearch().getHotels(), "text", "Hotel Sunshine");
	}
	@Given("User select the Room type")
	public void user_select_the_room_type() {
		SelectDropdown(obj.getSearch().getRoomtype(), "text", "Super Deluxe");
	}
	@Given("User select number of rooms")
	public void user_select_number_of_rooms() {
		
		SelectDropdown(obj.getSearch().getRoomnos(), "text", "2 - Two");
	}
	@Given("User check in data")
	public void user_check_in_data() {
		elementSendKeys(obj.getSearch().getDatepickin(), "24/01/2022"); 
	}
	@Given("User check out data")
	public void user_check_out_data() {
		elementSendKeys(obj.getSearch().getDatepickout(), "26/01/2022");
	}
	@Given("User select adults per Room")
	public void user_select_adults_per_room() {
		SelectDropdown(obj.getSearch().getAdultroom(), "text", "3 - Three");
	}
	@Given("User select child per Room")
	public void user_select_child_per_room() {
		SelectDropdown(obj.getSearch().getChildroom(), "text", "4 - Four");
	}
	@Then("User enter the search Button")
	public void user_enter_the_search_button() {
		elementClick(obj.getSearch().getSubmit());
	}
	@Given("User select the hotel")
	public void user_select_the_hotel() {
		elementClick(obj.getSelecthotel().getRadiobutton());
	}
	@Then("User enter the Search Buttons")
	public void user_enter_the_search_buttons() {
		elementClick(obj.getSelecthotel().getContinuebutton());
	}
	@Given("User enter the First Name")
	public void user_enter_the_first_name() {
		elementSendKeys(obj.getBookin().getFirstname(), "S.Anbarasan");
	}
	@Given("User enter the Last Name")
	public void user_enter_the_last_name() {
		elementSendKeys(obj.getBookin().getLastname(), "raj");
	}
	@Given("User enter Address")
	public void user_enter_address() {
		elementSendKeys(obj.getBookin().getAddress(), "5816,TNHB,Ayyapakkam");
	}
	@Given("User enter the Credit Number")
	public void user_enter_the_credit_number() {
		elementSendKeys(obj.getBookin().getCc_num(), "1122334455667788");
	}
	@Given("User click the Credit Card Type")
	public void user_click_the_credit_card_type() {
		SelectDropdown(obj.getBookin().getCc_type(), "text", "Master Card");
	}
	@Given("User enter the Expiry Month")
	public void user_enter_the_expiry_month() {
		SelectDropdown(obj.getBookin().getCc_exp_month(), "text", "May");
	}
	@Given("User enter the Expiry Year")
	public void user_enter_the_expiry_year() {
		SelectDropdown(obj.getBookin().getCc_exp_year(), "text", "2015");
	}
	@Given("User enter the cvv number")
	public void user_enter_the_cvv_number() {
		elementSendKeys(obj.getBookin().getCc_cvv(), "1234");
	}
	@Then("User click the book now Button")
	public void user_click_the_book_now_button() {
		
		elementClick(obj.getBookin().getBooknow());
	}



}