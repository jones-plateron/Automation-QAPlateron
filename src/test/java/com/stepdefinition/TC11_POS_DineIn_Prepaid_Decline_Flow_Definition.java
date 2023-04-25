package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC11_POS_DineIn_Prepaid_Decline_Flow_Definition extends BaseClass {

	PageManager pma = new PageManager();

	public TC11_POS_DineIn_Prepaid_Decline_Flow_Definition() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
	
	@Then("User should able to select guest count Number and Click Proceed button")
	public void userShouldAbleToSelectGuestCountNumberAndClickProceedButton() throws InterruptedException {
		pma.getPOS_FlowOne_POM().getNoOfGuest5().click();
		pma.getPOS_FlowOne_POM().getProceedButton().click();
		Thread.sleep(2000);
	}
	@Then("User should Add the Pre-Defined Set of Menus")
	public void userShouldAddThePreDefinedSetOfMenus() {
		
	}
	@Then("User Should Add the Menu with Optional Modifier")
	public void userShouldAddTheMenuWithOptionalModifier() {
		
	}
	@When("User Should click Receive Payment button")
	public void userShouldClickReceivePaymentButton() {
		pma.getPOS_FlowOne_POM().getReceivePaymentBtn().click();
	}
	@Then("User Should Verify the page redirected to Payment Detail Page")
	public void userShouldVerifyThePageRedirectedToPaymentDetailPage() {
		Assert.assertTrue(pma.getPOS_FlowOne_POM().getPaymentDetailsHeader().isDisplayed());
		String header = pma.getPOS_FlowOne_POM().getPaymentDetailsHeader().getAttribute("content-desc");
		Assert.assertEquals("Payment details", header);
	}
	@Then("User Should verify the Receive Payment page Calculation")
	public void userShouldVerifyTheReceivePaymentPageCalculation() {
	}
	@Then("User Should Add the Tip")
	public void userShouldAddTheTip() {
		pma.getPOS_FlowOne_POM().getCollectCashBtnPayDetails().click();
		pma.getPOS_FlowOne_POM().get22PercentTip().click();
	}
	@Then("User Should verify the Receive Payment page Calculation after Tip")
	public void userShouldVerifyTheReceivePaymentPageCalculationAfterTip() {
	}
	@Then("User should apply Discount")
	public void userShouldApplyDiscount() {
	}
	@Then("User Should verify the Receive Payment page Calculation after Applying Discount")
	public void userShouldVerifyTheReceivePaymentPageCalculationAfterApplyingDiscount() {
	}
	@Then("User should verify the Customer Information Field")
	public void userShouldVerifyTheCustomerInformationField() {
		
	}
	@Then("User Should Select the Payment Method as Cash")
	public void userShouldSelectThePaymentMethodAsCash() {
	}
	@Then("User Should swipe the Send to Kitchen")
	public void userShouldSwipeTheSendToKitchen() {
	}
	@Then("User Should Validate the Receive Payment Page")
	public void userShouldValidateTheReceivePaymentPage() {
	}
	@Then("User Should Decline the Order")
	public void userShouldDeclineTheOrder() {
	}
	@Then("User should Verify Order gets Moved to Completed Orders Page")
	public void userShouldVerifyOrderGetsMovedToCompletedOrdersPage() {
	}
	@Then("User Should Validate the Completed Orders Page")
	public void userShouldValidateTheCompletedOrdersPage() {
	}
	@Then("User Should Add the Menu with Required Modifier")
	public void userShouldAddTheMenuWithRequiredModifier() {
	}
	@Then("User Should Add the Tip #Need to Check")
	public void userShouldAddTheTipNeedToCheck() {
	}
	@Then("User Should Add the Menu with both Optonal and Required Modifier")
	public void userShouldAddTheMenuWithBothOptonalAndRequiredModifier() {
	}
	@Then("User Should Add the Menu with Modifier Price Zero")
	public void userShouldAddTheMenuWithModifierPriceZero() {
	}
	@Then("User Should Add the Menu Price Zero with Modifier")
	public void userShouldAddTheMenuPriceZeroWithModifier() {
	}
	
	
	
}
