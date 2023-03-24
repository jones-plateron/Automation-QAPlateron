package com.feature.page.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

public class RMS_Menus_Configuration_POM extends BaseClass{
PageManager pma = new PageManager();
	
	public RMS_Menus_Configuration_POM() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}
	
	public WebElement getHomeMenusSectionelement() {
		return rmsDriver.findElement(By.xpath("//li[3]//a[1]"));
	}
	public WebElement getTopMenuItemsSectionElement() {
		return rmsDriver.findElement(By.xpath("//a[normalize-space()='Menu Items']"));
	}
	public WebElement getModifiersButtonUnderMenuItemsSec() {
		return rmsDriver.findElement(By.xpath("//li[contains(text(),'Modifiers')]"));
	}
	public WebElement getAddModifierbutton() {
		return rmsDriver.findElement(By.xpath("//button[@class='btn btn-outline-primary btn-small btn-width large d-flex align-items-center']"));
	}
	public WebElement getAddModifierPopupHdrElement() {
		return rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis ']"));
	}
	public WebElement getAddModifierPopupTextElement() {
		return rmsDriver.findElement(By.xpath("//label[@class='page-subheader__help-title d-block mb-1']"));
	}
	public WebElement getAddModifierPopupTextBoxElement() {
		return rmsDriver.findElement(By.xpath("//input[@type='text']"));
	}
	public WebElement getAddModifierPopupCancelBtnElement() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
	}
	public WebElement getAddModifierPopupCloseBtnElement() {
		return rmsDriver.findElement(By.xpath("//i[@class='icon-close icon-5x']"));
	}
	public WebElement getAddModifierPopupSaveBtnElement() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Save']"));
	}
	public WebElement getAddModifierPopupErrorMsgElement() {
		return rmsDriver.findElement(By.xpath("//span[@class='invalid-feedback']"));
	}
	public List<WebElement> getModifierCateElements() {
		return rmsDriver.findElements(By.xpath("//div[contains(@class,'inner__sidebar w-large sidenav-subheader')]//li"));
	}
	public WebElement getEditModifierNameIconElement() {
		return rmsDriver.findElement(By.xpath("(//i[@class='icon-edit'])[1]"));
	}
	public WebElement getEditModifierPopupHdrElement() {
		return rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis ']"));
	}
	public WebElement getEditModifierPopupCancelElement() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
	}
	public WebElement getEditModifierPopupSaveElement() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Save']"));
	}
	public WebElement getEditModifierPopupCloseElement() {
		return rmsDriver.findElement(By.xpath("//i[@class='icon-close icon-5x']"));
	}
	public WebElement getEditModifierPopupTextBxElement() {
		return rmsDriver.findElement(By.xpath("//input[@class='form-control  full-width modal-textarea'][@type='text']"));
	}
	public WebElement getDeleteModifierNameIconElement() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement getDeleteModifierPopupHdrElement() {
		return rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis ']"));
	}
	public WebElement getDeleteModifierPopupCancelElement() {
		return rmsDriver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
	}
	public WebElement getDeleteModifierPopupDeleteElement() {
		return rmsDriver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
	}
	public WebElement getDeleteModifierPopupCloseElement() {
		return rmsDriver.findElement(By.xpath("//i[@class='icon-close icon-5x']"));
	}
	public WebElement getDeleteModifierPopupTextElement() {
		return rmsDriver.findElement(By.xpath("//p[@class='empty-state__help-text--large']"));
	}
	public WebElement getAddModifierItemButtonElement() {
		return rmsDriver.findElement(By.xpath("//div[@class='card card-empty']"));
	}
	public WebElement getAddModifierItemSlideHdrElement() {
		return rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis ']"));
	}
	public WebElement getAddModifierItemSlideNameTextBxElement() {
		return rmsDriver.findElement(By.xpath("//input[@placeholder='Enter modifier name']"));
	}
	public WebElement getAddModifierItemSlideNameHdrElement() {
		return rmsDriver.findElement(By.xpath("//label[normalize-space()='Modifier Name']"));
	}
	public WebElement getAddModifierItemSlidePriceTextBxElement() {
		return rmsDriver.findElement(By.xpath("//input[@name='price']"));
	}
	public WebElement getAddModifierItemSlidePriceHdrElement() {
		return rmsDriver.findElement(By.xpath("//label[normalize-space()='Price']"));
	}
	public WebElement get6() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement get8() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement get7() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement get9() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement get0() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement get01() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement get02() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement get03() {
		return rmsDriver.findElement(By.xpath(""));
	}
	public WebElement get() {
		return rmsDriver.findElement(By.xpath(""));
	}
}

//24-03-2023 19:33
