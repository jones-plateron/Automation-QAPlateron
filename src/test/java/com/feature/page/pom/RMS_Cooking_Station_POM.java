package com.feature.page.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

public class RMS_Cooking_Station_POM extends BaseClass{

PageManager pma = new PageManager();
	
	public RMS_Cooking_Station_POM() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
	
	public WebElement getCookingStationsSection() {
		return rmsDriver.findElement(By.xpath("//a[normalize-space()='Cooking Stations']"));
	}
	public WebElement getAddCookingStationButton() {
		return rmsDriver.findElement(By.xpath("//button[@class='btn btn-outline-primary btn-small d-flex align-items-center ']"));
	}
	public WebElement getMoreIconElement() {
		return rmsDriver.findElement(By.xpath("//i[@class='icon-icon-ellipsis-v icon-3x']"));
	}
	public WebElement getEditBtn() {
		return rmsDriver.findElement(By.xpath("//p[contains(text(),'Edit')]"));
	}
	public WebElement getDeleteBtn() {
		return rmsDriver.findElement(By.xpath("//p[contains(text(),'Delete')]"));
	}
	public WebElement getAddCSSlideheader() {
		return rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis ']"));
	}
	public WebElement getAddCSSlideNameTxtBxHeader() {
		return rmsDriver.findElement(By.xpath("//label[@class='font-bold form-label']"));
	}
	public WebElement getAddCSSlideNameTxtBx() {
		return rmsDriver.findElement(By.xpath("//input[@name='name']"));
	}
	public WebElement getAddCSSlideNameTxtBxErrMsg() {
		return rmsDriver.findElement(By.xpath("//span[contains(@class,'invalid-feedback')]"));
	}
	public WebElement getAddCSSlideCategories() {
		return rmsDriver.findElement(By.xpath("//p[@class='page-subheader text-ellipsis pl-2']"));
	}
	public List<WebElement> getAddCSSlideCategoriesList() {
		return rmsDriver.findElements(By.xpath("//li[@class='list-item  cursor-pointer']"));
	}
	public WebElement getAddCSSlideActiveCategory() {
		return rmsDriver.findElement(By.xpath("//li[@class='list-item active cursor-pointer']"));
	}
	public WebElement getAddCSSlideMenu() {
		return rmsDriver.findElement(By.xpath("//p[normalize-space()='Menu']"));
	}
	public List<WebElement> getAddCSSlideMenuList() {
		return rmsDriver.findElements(By.xpath("//li[@class='list-item p-0']"));
	}
	public WebElement getAddCSSlideAddButton() {
		return rmsDriver.findElement(By.xpath("//span[contains(@class,'mr-1')]"));
	}
	public WebElement getAddCSSlideAddButtonStatus() {
		return rmsDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-small d-flex align-items-center cursor-na']"));
	}
	public WebElement getNoCSSearchResult() {
		return rmsDriver.findElement(By.xpath("//caption[@class='font-semibold']"));
	}
	
	
	
	
	
	
	public WebElement getAddCSSlideSelectedMenus() {
		return rmsDriver.findElement(By.xpath("//p[normalize-space()='Selected Menu Items']"));
	}
	public List<WebElement> getAddCSSlideSelectedMenusList() {
		return rmsDriver.findElements(By.xpath("//li[@class='list-item text-ellipsis pl-0 pr-0']"));
	}
	public WebElement getAddCSSlideCloseElement() {
		return rmsDriver.findElement(By.xpath("//i[@class='icon-close icon-5x']"));
	}
	public WebElement getAddCSSlideCancelElement() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
	}
	public WebElement getAddCSSlideSaveElement() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Save']"));
	}
	public WebElement getEditCSSlideHdr() {
		return rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis ']"));
	}
	public List<WebElement> getEachCSName() {
		return rmsDriver.findElements(By.xpath("//p[@class='page-subheader text-ellipsis pl-1']"));
	}
	public WebElement getCSSearchBar() {
		return rmsDriver.findElement(By.xpath("//input[@name='search_cooking_station']"));
	}
	public WebElement getAddCSSlideHeader() {
		return rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis ']"));
	}
	public WebElement getDeleteCSPopHdr() {
		return rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis ']"));
	}
	public WebElement getDeleteCSPopText() {
		return rmsDriver.findElement(By.xpath("//p[normalize-space()='Would you like to delete']"));
	}
	public WebElement getDeleteCSPopCancelBtn() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
	}
	public WebElement getDeleteCSPopCloseBtn() {
		return rmsDriver.findElement(By.xpath("//i[@class='icon-close icon-5x']"));
	}
	public WebElement getDeleteCSPopDeleteBtn() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Delete']"));
	}
}
