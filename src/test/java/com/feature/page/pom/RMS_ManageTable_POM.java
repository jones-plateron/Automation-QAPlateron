package com.feature.page.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

public class RMS_ManageTable_POM extends BaseClass {
PageManager pma = new PageManager();
	
	public RMS_ManageTable_POM() {
		PageFactory.initElements(rmsDriver, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);

}
	
	public WebElement getResHeader() {
		WebElement element = rmsDriver.findElement(By.xpath("//div[@class='onboard-header__restaurant-name ']"));
		return element;
	}
	
	public WebElement getPOSSystemSections() {
		WebElement element = rmsDriver.findElement(By.xpath("//li[8]//a[1]"));
		return element;
	}
	
	public WebElement getPOSSetupTab() {
		WebElement element = rmsDriver.findElement(By.xpath("//a[normalize-space()='POS Setup']"));
		return element;
	}
	public WebElement getPOSSetupQr() {
		WebElement element = rmsDriver.findElement(By.xpath("//figure[contains(@class,'w-20')]//*[name()='svg']"));
		return element;
	}
	public WebElement getPOSSetupQrInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[@class='empty-state__title font-bold mt-0']"));
		return element;
	}
	public WebElement getManageTableTab() {
		WebElement element = rmsDriver.findElement(By.xpath("//a[contains(text(),'Manage Table')]"));
		return element;
	}
	public WebElement getDineInTab() {
		WebElement element = rmsDriver.findElement(By.xpath("//li[normalize-space()='Dine-In']"));
		return element;
	}
	public WebElement getTakeOutTab() {
		WebElement element = rmsDriver.findElement(By.xpath("//li[normalize-space()='Take-Out']"));
		return element;
	}
	public WebElement getTakeOutAvoidqueue() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[@class='page-header__page-title d-block mb-1 text-xlarge font-xbold']"));
		return element;
	}
	public WebElement getTakeOutUnderAvoidQ() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[@class='mb-2']"));
		return element;
	}
	public WebElement getTakeOutQr() {
		WebElement element = rmsDriver.findElement(By.xpath("(//div[@class='p-1 preview-cover-box'])[2]"));
		return element;
	}
	public WebElement getTakeOutResName() {
		WebElement element = rmsDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/section[2]/div[3]/div[2]/div[1]/div[1]/div[3]/h3[1]"));
		return element;
	}
	
	public WebElement getTakeOutUnderQr() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[@class=' px-4 font-semibold lh-small']"));
		return element;
	}
	public WebElement getTakeOutPowereby() {
		WebElement element = rmsDriver.findElement(By.xpath("(//p[contains(text(),'Powered by ')])[2]"));
		return element;
	}
	
	public WebElement getTakeOutPrintButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-small d-flex align-items-center ']"));
		return element;
	}
	
	public WebElement getAddTableButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[contains(@class,'btn btn-outline-primary btn-small d-flex align-items-center')]"));
		return element;
	}
	public WebElement getAddTablePopupHeader() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis 'and contains(text(),'Add Table')]"));
		return element;
	}
	public WebElement getAreaDuringAddArea() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(@class,'form-label d-flex justify-content-between')]"));
		return element;
	}
	public WebElement getAreaDuringSelectArea() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[normalize-space()='Area']"));
		return element;
	}
	public WebElement getAddAreaButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(@class,'primarytext-color cursor-pointer') and contains(text(),'+ Add Area')]"));
		return element;
	}
	public WebElement getSelectAreaButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[contains(@class,'primarytext-color cursor-pointer') and contains(text(),'Select Area')]"));
		return element;
	}
	public WebElement getAreaSelectDropDown() {
		WebElement element = rmsDriver.findElement(By.xpath("//select[@placeholder='Select']"));
		return element;
	}
	public WebElement getAreaTextBox() {
		WebElement element = rmsDriver.findElement(By.xpath("//input[@placeholder='Enter area name']"));
		return element;
	}
	public WebElement getAreaTextBoxIndication() {
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class='invalid-feedback '])[1]"));
		return element;
	}
	
	public WebElement getTableName() {
		WebElement element = rmsDriver.findElement(By.xpath("//label[normalize-space()='Table Name']"));
		return element;
	}
	public WebElement getTableNameTextBox() {
		WebElement element = rmsDriver.findElement(By.xpath("//input[contains(@name,'tableName')]"));
		return element;
	}
	public WebElement getTableNameIndication() {
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class='invalid-feedback '])[2]"));
		return element;
	}
	public WebElement getSeatingCapacity() {
		WebElement element = rmsDriver.findElement(By.xpath("//label[normalize-space()='Seating Capacity']"));
		return element;
	}
	public WebElement getSeatingCapacityTextBox() {
		WebElement element = rmsDriver.findElement(By.xpath("//input[contains(@name,'seatingCapacity')]"));
		return element;
	}
	public WebElement getSeatingCapacityTextBoxIndication() {
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class='invalid-feedback '])[3]"));
		return element;
	}
	public WebElement getAddTableCancelButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[@class='btn  btn-outline-default btn-small d-flex align-items-center ']"));
		return element;
	}
	public WebElement getAddTableSaveButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-small d-flex align-items-center ']"));
		return element;
	}
	public WebElement getAddTableXIcon() {
		WebElement element = rmsDriver.findElement(By.xpath("//i[contains(@class,'icon-close icon-5x')]"));
		return element;
	}
	public WebElement getSearchTextBox() {
		WebElement element = rmsDriver.findElement(By.xpath("//input[@placeholder='Search by table/area']"));
		return element;
	}
	public WebElement getPrintallTabsButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//span[contains(@class,'pos-font-head')]"));
		return element;
	}
	public WebElement getSelectPrints() {
		WebElement element = rmsDriver.findElement(By.xpath("//div[contains(text(),'Select print(s) per page')]"));
		return element;
	}
	public WebElement getAreaHeader() {
		WebElement element = rmsDriver.findElement(By.xpath("//div[@class='d-flex justify-content-between']"));
		return element;
	}
	public WebElement getTotalTables() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[@class=' font-bold-medium text-medium sub-heading']"));
		return element;
	}
	public List<WebElement> getallTables() {
		List<WebElement> element = rmsDriver.findElements(By.xpath("//div[@class='table-container menu-cards card box box-sm  ']"));
		return element;
	}
	//div[@class='table-container menu-cards card box box-sm  ']
	public List<WebElement> getAreaLists() {
		List<WebElement> element = rmsDriver.findElements(By.xpath(".//*[@class='dropdown-item text-ellipsis  dragable-item  list-style-none  draggable-class-list   ']"));
		return element;
	}
	
	public WebElement getSearch() {
		WebElement element = rmsDriver.findElement(By.xpath(".//*[@Type='text']"));
		return element;
	}
	
	
	public WebElement getAreaLists1() {
		WebElement element = rmsDriver.findElement(By.xpath(".//*[@data-rbd-drag-handle-draggable-id='item-b0adca3f-a278-4a27-a70a-6a3cd7536551']"));
		return element;
	}
	
	public WebElement getAreaLists2() {
		WebElement element = rmsDriver.findElement(By.xpath("//*[@data-rbd-drag-handle-draggable-id='item-b5274298-74f0-4388-bb17-3c52571bb2f9']"));
		return element;
	}
	
	public List<WebElement> getTables() {
		List<WebElement> element = rmsDriver.findElements(By.xpath("//div[@class='table-card__table-card-item cursor-grab ']"));
		return element;
	}
	public List<WebElement> getTableThreeDots() {
		List<WebElement> element = rmsDriver.findElements(By.xpath("//button[@class='dropdown-toggle bg-white dropdown-noborder bg-white dropdown-noborder-primary']"));
		return element;
	}
	public WebElement getDeleteTable() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[@class='text-danger']"));
		return element;
	}
	//Delete Popup
	public WebElement getDeleteTablePopHeader() {
		WebElement element = rmsDriver.findElement(By.xpath("//h4[@class='modal-title text-ellipsis ']"));
		return element;
	}

	public WebElement getDeleteTablepopupXicon() {
		WebElement element = rmsDriver.findElement(By.xpath("//i[@class='icon-close icon-5x']"));
		return element;
	}
	public WebElement getDeleteTablepopupCancelbutton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[normalize-space()='Cancel']"));
		return element;
	}
	public WebElement getDeleteTablepopupDeletebutton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[normalize-space()='Delete']"));
		return element;
	}
	public WebElement getDeleteTablePopupInstruction() {
		WebElement element = rmsDriver.findElement(By.xpath("//p[@class='empty-state__help-text--large w-break']"));
		return element;
	}
	
	public List<WebElement> getInsideTableTableName() {
		List<WebElement> element = rmsDriver.findElements(By.xpath("//div[@class='primary-name']"));
		return element;
	}
	public WebElement getPreviewButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[@class='btn btn-light btn-sm mt-1 w-fit-content  d-flex align-items-center ']"));
		return element;
	}
	public WebElement getPrintScreenHeader() {
		WebElement element = rmsDriver.findElement(By.xpath("//h2[@class='qr-preview-font-heading']"));
		return element;
	}
	public WebElement getPreviewHeader() {
		WebElement element = rmsDriver.findElement(By.xpath("//h2[@class='qr-preview-font']"));
		return element;
	}
	public WebElement getInsidePreviewResName() {
		WebElement element = rmsDriver.findElement(By.xpath("//div[contains(@class,'d-flex justify-content-between p-2 pr-0 pl-0')]//h3[contains(@class,'p-1 pt-3 font-bold page-header__page-title justify-content-around')]"));
		return element;
	}
	public WebElement getInsidePreviewTableName() {
		WebElement element = rmsDriver.findElement(By.xpath("(//span[@class='font-bold td-overflow ml-1'])[2]"));
		return element;
	}
	
	public List<WebElement> getInsideTableSeatNum() {
		List<WebElement> element = rmsDriver.findElements(By.xpath("//p[@class='w-85 form-label__small-text font-bold']"));
		return element;
	}
	public List<WebElement> getInsideTableWaiterName() {
		List<WebElement> element = rmsDriver.findElements(By.xpath("//span[@class='form-label__small-text gray mb-0' and contains(text(),'Waiter Name')]"));
		return element;
	}
	
	//span[@class='form-label__small-text gray mb-0' and contains(text(),'Waiter Name')]
	public WebElement getInsidePreviewCancelButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[@class='btn  btn-outline-default btn-small d-flex align-items-center ']"));
		return element;
	}
	
	public WebElement getInsidePreviewPrintButton() {
		WebElement element = rmsDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-small d-flex align-items-center ']"));
		return element;
	}
	public WebElement getInsidePreviewUnderQr() {
		WebElement element = rmsDriver.findElement(By.xpath("(//p[contains(text(),'Scan with your phone camera to order')])[2]"));
		return element;
	}
	public WebElement getAreaEditIcon() {
		WebElement element = rmsDriver.findElement(By.xpath("//i[@class='icon-edit black icon-3x cursor-pointer']"));
		return element;
	}
	
}//28-03-2023 Finished upto dropdown