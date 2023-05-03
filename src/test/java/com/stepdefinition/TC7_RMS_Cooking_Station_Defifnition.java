package com.stepdefinition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BaseClass;
import com.pagemanager.PageManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC7_RMS_Cooking_Station_Defifnition extends BaseClass{
	
PageManager pma = new PageManager();
	
	public String specialChar = "!@#$%%^&*()_+";
	public String upperCase = "AUTOMATIONTEXT";
	public String lowerCase = "automationtext";
	public String numbers = "1234567890";
	public String text = "!@#$%^&*()abcdefghijABCDEFGHIJ1234567890AutomationTestRegression";
	public List<WebElement> categories;
	public List<List<String>> menus= new ArrayList<List<String>>();
	public List<String> refer=new ArrayList<String>();
	
	// !@#$%^&*()abcdefghijABCDEFGHIJ1234567890Automation
	
	
	public TC7_RMS_Cooking_Station_Defifnition() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
	
	@When("User should click Cooking Stations section and verify page redirection")
	public void userShouldClickCookingStationsSectionAndVerifyPageRedirection() throws InterruptedException {
		categories=pma.getRMS_Menus_Configuration_POM().getAllCategoriesList();
		for (int i = 0; i < categories.size(); i++) {
			categories.get(i).click();
			List<WebElement> menusList = pma.getRMS_Menus_Configuration_POM().getMenusListInsideCate();
			for (int j = 0; j < menusList.size(); j++) {
				String menuText = menusList.get(j).getText();
				refer.add(menuText);
			}
			menus.add(refer);
			refer=new ArrayList<String>();
		}
//		System.out.println(menus);
//		System.out.println(refer);
		pma.getrMS_Cooking_Station_POM().getCookingStationsSection().click();
	}
	@Then("User should click Add Cooking Station button and verify slide Popup")
	public void userShouldClickAddCookingStationButtonAndVerifySlidePopup() throws InterruptedException {
		pma.getrMS_Cooking_Station_POM().getAddCookingStationButton().click();
		Thread.sleep(2000);
		String slideHeader = pma.getrMS_Cooking_Station_POM().getAddCSSlideHeader().getText();
		//System.out.println(slideHeader);
		Assert.assertEquals("Add Station", slideHeader);
	}
	@Then("User should verify the Cooking station Name Text Bx and Error Message {string}")
	public void userShouldVerifyTheCookingStationNameTextBxAndErrorMessage(String string) throws InterruptedException {
		String slideNameBxHeader = pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBxHeader().getText();
		Assert.assertEquals("Cooking Station Name", slideNameBxHeader);
		pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().sendKeys(specialChar);
		String attributeSpecial = pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().getAttribute("value");
		Assert.assertEquals(specialChar, attributeSpecial);
		pma.getrMS_Cooking_Station_POM().getAddCSSlideSaveElement().click();
		//Page not get Redirection
		pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		
		pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().sendKeys(upperCase);
		String attributeUpper = pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().getAttribute("value");
		Assert.assertEquals(upperCase, attributeUpper);
		pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		
		pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().sendKeys(lowerCase);
		String attributeLower = pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().getAttribute("value");
		Assert.assertEquals(lowerCase, attributeLower);
		pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		
		pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().sendKeys(numbers);
		String attributeNumbers = pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().getAttribute("value");
		Assert.assertEquals(numbers, attributeNumbers);
		pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		
		pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().sendKeys(text);
		String attributeText = pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().getAttribute("value");
		Assert.assertEquals(text, attributeText);
		pma.getrMS_Cooking_Station_POM().getAddCSSlideSaveElement().click();
		//Page not get Redirection
		pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		Thread.sleep(1000);
		pma.getrMS_Cooking_Station_POM().getAddCSSlideSaveElement().click();
		String txtBxErrMsg = pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBxErrMsg().getText();
		Assert.assertEquals("Enter valid name", txtBxErrMsg);
		
	}
	@Then("User should verify the Categories and Menus in Slide Popup")
	public void userShouldVerifyTheCategoriesAndMenusInSlidePopup() {
		Assert.assertTrue(pma.getrMS_Cooking_Station_POM().getAddCSSlideCategories().isDisplayed());
		Assert.assertTrue(pma.getrMS_Cooking_Station_POM().getAddCSSlideCategories().getText().equals("Categories"));
		//Categories Count Validation
		List<WebElement> addCSSlideCategoriesList = pma.getrMS_Cooking_Station_POM().getAddCSSlideCategoriesList();
		
		
		//Need to Optimize for Categories with Zero Menus
		//Assert.assertEquals(addCSSlideCategoriesList.size(), categories.size());
		
		//Menus Count Validation
		for (int i = 0; i < addCSSlideCategoriesList.size(); i++) {
			addCSSlideCategoriesList.get(i).click();
			Assert.assertTrue(pma.getrMS_Cooking_Station_POM().getAddCSSlideMenu().isDisplayed());
			List<WebElement> addCSSlideMenuList = pma.getrMS_Cooking_Station_POM().getAddCSSlideMenuList();
			Assert.assertEquals(addCSSlideMenuList.size()-1,menus.get(i).size());
		}
	}
	@Then("User should verify the Selected Menu Items Section after adding menus")
	public void userShouldVerifyTheSelectedMenuItemsSectionAfterAddingMenus() throws InterruptedException {
		//System.out.println(pma.getrMS_Cooking_Station_POM().getAddCSSlideAddButtonStatus().getAttribute("disabled"));
		Assert.assertTrue(pma.getrMS_Cooking_Station_POM().getAddCSSlideAddButtonStatus().getAttribute("disabled").equals("true"));
		List<WebElement> addCSSlideCategoriesList = pma.getrMS_Cooking_Station_POM().getAddCSSlideCategoriesList();
		addCSSlideCategoriesList.get(0).click();
		rmsDriver.findElement(By.xpath("//ul[1]//li[1]//div[1]//div[1]//div[1]//label[1]//span[1]")).click();
		//System.out.println(pma.getrMS_Cooking_Station_POM().getAddCSSlideAddButtonStatus().getAttribute("disabled"));
		pma.getrMS_Cooking_Station_POM().getAddCSSlideAddButton().click();
		
		Assert.assertTrue(pma.getrMS_Cooking_Station_POM().getAddCSSlideSelectedMenus().isDisplayed());
		
		List<WebElement> addCSSlideSelectedMenusList = pma.getrMS_Cooking_Station_POM().getAddCSSlideSelectedMenusList();
		List<WebElement> addCSSlideMenuList = pma.getrMS_Cooking_Station_POM().getAddCSSlideMenuList();
		Assert.assertEquals(addCSSlideSelectedMenusList.size(), addCSSlideMenuList.size()-1);
	}
	@Then("User should verify Cancel and Save button in SlidePopup")
	public void userShouldVerifyCancelAndSaveButtonInSlidePopup() throws InterruptedException {
		pma.getrMS_Cooking_Station_POM().getAddCSSlideCloseElement().click();
		pma.getrMS_Cooking_Station_POM().getAddCookingStationButton().click();
		Thread.sleep(500);
		String slideHeader = pma.getrMS_Cooking_Station_POM().getAddCSSlideHeader().getText();
		Assert.assertEquals("Add Station", slideHeader);
		
		pma.getrMS_Cooking_Station_POM().getAddCSSlideSaveElement().click();
		pma.getrMS_Cooking_Station_POM().getAddCSSlideCancelElement().click();
		pma.getrMS_Cooking_Station_POM().getAddCookingStationButton().click();
		Thread.sleep(500);
		String slideHeader1 = pma.getrMS_Cooking_Station_POM().getAddCSSlideHeader().getText();
		Assert.assertEquals("Add Station", slideHeader1);
		
		pma.getrMS_Cooking_Station_POM().getAddCSSlideCloseElement().click();
	}
	@Then("User should Add New Cooking Station and Verify Edit and Delete functionality")
	public void userShouldAddNewCookingStationAndVerifyEditAndDeleteFunctionality() throws InterruptedException {
		pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().sendKeys("Station One");
		List<WebElement> addCSSlideCategoriesList = pma.getrMS_Cooking_Station_POM().getAddCSSlideCategoriesList();
		addCSSlideCategoriesList.get(0).click();
		rmsDriver.findElement(By.xpath("//ul[1]//li[1]//div[1]//div[1]//div[1]//label[1]//span[1]")).click();
		pma.getrMS_Cooking_Station_POM().getAddCSSlideAddButton().click();
		pma.getrMS_Cooking_Station_POM().getAddCSSlideSaveElement().click();
		Thread.sleep(2000);
		List<WebElement> eachCSName = pma.getrMS_Cooking_Station_POM().getEachCSName();
		boolean flag=false;Thread.sleep(200);
		for (int i = 0; i < eachCSName.size(); i++) {
			if (eachCSName.get(i).getText().equals("Station One")) {
				flag=true;
				break;
			}
		}
		Assert.assertTrue(flag); //Validation on newly created CS
		pma.getrMS_Cooking_Station_POM().getMoreIconElement().click();
		pma.getrMS_Cooking_Station_POM().getEditBtn().click();Thread.sleep(1000);
		String editStationHdr = pma.getrMS_Cooking_Station_POM().getEditCSSlideHdr().getText();
		Assert.assertEquals("Edit Station", editStationHdr);
		
		//edit_Name
		String attribute = pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().getAttribute("value");
		pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().sendKeys(" Edit");
		String editedTxt = pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().getAttribute("value");
		Assert.assertEquals(editedTxt, attribute+" Edit");
		pma.getrMS_Cooking_Station_POM().getAddCSSlideSaveElement().click();Thread.sleep(1000);
		List<WebElement> eachCSName1 = pma.getrMS_Cooking_Station_POM().getEachCSName();
		boolean flag1=false;
		for (int i = 0; i < eachCSName1.size(); i++) {
			if (eachCSName1.get(i).getText().equals(attribute+" Edit")) {
				flag1=true;
				break;
			}
		}
		Assert.assertTrue(flag1); //Validation on Edited CS
		//CS creation 
		pma.getrMS_Cooking_Station_POM().getAddCookingStationButton().click();
		pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().sendKeys("Station Two");Thread.sleep(500);
		List<WebElement> addCSSlideCategoriesList1 = pma.getrMS_Cooking_Station_POM().getAddCSSlideCategoriesList();
		addCSSlideCategoriesList1.get(0).click();
		rmsDriver.findElement(By.xpath("//ul[1]//li[1]//div[1]//div[1]//div[1]//label[1]//span[1]")).click();
		pma.getrMS_Cooking_Station_POM().getAddCSSlideAddButton().click();
		pma.getrMS_Cooking_Station_POM().getAddCSSlideSaveElement().click();
		
		
		// Delete Validation
		pma.getrMS_Cooking_Station_POM().getMoreIconElement().click();
		pma.getrMS_Cooking_Station_POM().getDeleteBtn().click();
		//Pop-up Validation
		String deleteHdr = pma.getrMS_Cooking_Station_POM().getDeleteCSPopHdr().getText();
		Assert.assertEquals("Delete Cooking Station", deleteHdr);
		
		String deleteCSPopText = pma.getrMS_Cooking_Station_POM().getDeleteCSPopText().getText();
//		System.out.println(deleteCSPopText);
		Assert.assertTrue(deleteCSPopText.contains("Would you like to delete"));
		Thread.sleep(200);
		pma.getrMS_Cooking_Station_POM().getDeleteCSPopCloseBtn().click();Thread.sleep(200);
		
		List<WebElement> eachCSName2 = pma.getrMS_Cooking_Station_POM().getEachCSName();
		for (int i = 0; i < eachCSName2.size(); i++) {
			
		pma.getrMS_Cooking_Station_POM().getMoreIconElement().click();Thread.sleep(200);
		pma.getrMS_Cooking_Station_POM().getDeleteBtn().click();Thread.sleep(200);
		pma.getrMS_Cooking_Station_POM().getDeleteCSPopCancelBtn().click();Thread.sleep(200);
		
		pma.getrMS_Cooking_Station_POM().getMoreIconElement().click();Thread.sleep(200);
		pma.getrMS_Cooking_Station_POM().getDeleteBtn().click();Thread.sleep(200);
		pma.getrMS_Cooking_Station_POM().getDeleteCSPopDeleteBtn().click();Thread.sleep(200);
		
		}
		
		
	}
	@Then("User should Add Cooking station based on the Number of Categories")
	public void userShouldAddCookingStationBasedOnTheNumberOfCategories() throws InterruptedException, IOException {
		pma.getrMS_Cooking_Station_POM().getAddCookingStationButton().click();
		Thread.sleep(200);
		List<WebElement> addCSSlideCategoriesList = pma.getrMS_Cooking_Station_POM().getAddCSSlideCategoriesList();
		Thread.sleep(200);
		pma.getrMS_Cooking_Station_POM().getAddCSSlideCancelElement().click();
		
		for (int i = 0; i < addCSSlideCategoriesList.size(); i++) {
//			Thread.sleep(3000);
//			rmsDriver.navigate().refresh();
			pma.getrMS_Cooking_Station_POM().getAddCookingStationButton().click();
			
			List<WebElement> addCSSlideCategoriesList2 = pma.getrMS_Cooking_Station_POM().getAddCSSlideCategoriesList();
			
			//Random Station Name
			String alphaNumericString1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvwxyz";
			StringBuilder sb1 = new StringBuilder(10);
			Random random1 = new Random();
			for (int j = 0; j < 10; j++) {
				int index = random1.nextInt(alphaNumericString1.length());
				char randomChar1 = alphaNumericString1.charAt(index);
				sb1.append(randomChar1);
			}
		     String randomCateName1 = sb1.toString();
		     pma.getrMS_Cooking_Station_POM().getAddCSSlideNameTxtBx().sendKeys("Station "+randomCateName1);
		     
		     //Categories Adding
		     Thread.sleep(500);
		     addCSSlideCategoriesList2.get(i).click();Thread.sleep(200);
		     rmsDriver.findElement(By.xpath("//ul[1]//li[1]//div[1]//div[1]//div[1]//label[1]//span[1]")).click();Thread.sleep(200);
		     
		     pma.getrMS_Cooking_Station_POM().getAddCSSlideAddButton().click();Thread.sleep(500);
		     
		     pma.getrMS_Cooking_Station_POM().getAddCSSlideSaveElement().click();Thread.sleep(500);
		}
		List<WebElement> eachCSName = pma.getrMS_Cooking_Station_POM().getEachCSName();
		for (int i = 0; i < eachCSName.size(); i++) {
			writeValueToCell("Menu List", i+1, 5, eachCSName.get(i).getText());
		}
		
		
		
		
		Assert.assertEquals(addCSSlideCategoriesList.size(), eachCSName.size());Thread.sleep(800);
	}
	@Then("User Should verify the Search functionality in Cooking Station")
	public void userShouldVerifyTheSearchFunctionalityInCookingStation() throws InterruptedException { Thread.sleep(300);
		List<WebElement> eachCSName = pma.getrMS_Cooking_Station_POM().getEachCSName();
		List<String> nametxt = new ArrayList<String>();
		
		for (int i = 0; i < eachCSName.size(); i++) {
			nametxt.add(eachCSName.get(i).getText());
		}
		Thread.sleep(300);
		String dummyText = pma.getrMS_Cooking_Station_POM().getCSSearchBar().getAttribute("placeholder");
		Assert.assertEquals(dummyText, "Search by station name, items");
		Thread.sleep(300);
		pma.getrMS_Cooking_Station_POM().getCSSearchBar().sendKeys("unknown");
		String attribute = pma.getrMS_Cooking_Station_POM().getCSSearchBar().getAttribute("value");
		Assert.assertEquals(attribute, "unknown");
		Thread.sleep(300);
		String noCsMsg = pma.getrMS_Cooking_Station_POM().getNoCSSearchResult().getText();
		Assert.assertEquals(noCsMsg, "No cooking station configured");
		Thread.sleep(300);
		pma.getrMS_Cooking_Station_POM().getCSSearchBar().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		
		for (int i = 0; i < nametxt.size(); i++) {
			pma.getrMS_Cooking_Station_POM().getCSSearchBar().sendKeys(nametxt.get(i));Thread.sleep(1500);
			List<WebElement> eachCSNameAfterSearch = pma.getrMS_Cooking_Station_POM().getEachCSName();
			Assert.assertEquals(1, eachCSNameAfterSearch.size());
			
			pma.getrMS_Cooking_Station_POM().getCSSearchBar().sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		}
	}
}
