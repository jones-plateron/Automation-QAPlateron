package com.feature.page.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.pagemanager.PageManager;

public class POS_FlowOne_POM extends BaseClass{
	PageManager pma = new PageManager();

	public POS_FlowOne_POM() {
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(posDriver1, this);
		PageFactory.initElements(mobileDriver1, this);
	}

	public WebElement getEnterPin() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Enter Your PIN']"));
		 return element;
	}
	public WebElement getClockInElement() {
        return posDriver1.findElement(By.xpath("//android.widget.ImageView[@content-desc='Clock In']"));
    }
    
    public WebElement getPinOneElement() {
        return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='1']"));
    }
    
    public WebElement getPinTwoElement() {
        return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='2']"));
    }
    public WebElement getPinThreeElement() {
        return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='3']"));
    }
    public WebElement getPinFourElement() {
        return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='4']"));
    }
    public WebElement getPinFiveElement() {
        return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='5']"));
    }
    public WebElement getPinsixElement() {
        return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='6']"));
    }
    public WebElement getPinSevenElement() {
        return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='7']"));
    }
    public WebElement getPinEightElement() {
        return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='8']")); 
    }
    public WebElement getPinNineElement() {
        return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='9']"));
    }
    public WebElement getPinZeroElement() {
        return posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='0']"));
    }
	public WebElement getSelectTableHeader() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Select Table']"));
		 return element;
	}
	public WebElement getAreaList() {
		 WebElement element = posDriver1.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.HorizontalScrollView"));
		 return element;
	}
	public WebElement getArea1() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@Index='0']"));
		 return element;
	}
	public WebElement getTable1() {
		 WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[2]"));
		 return element;
	}
	public WebElement getNoOfGuest5() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='5']"));
		 return element;
	}
	public WebElement getProceedButton() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Proceed']"));
		 return element;
	}
	
	public WebElement getMenu1() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
		 return element;
	}
	public WebElement getMenu2() {
		 WebElement element = posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='1'])[2]"));
		 return element;
	}
	public WebElement getMenu3() {
		 WebElement element = posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='2'])[2]"));
		 return element;
	}
	public WebElement getMenu4() {
		 WebElement element = posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='3'])[2]"));
		 return element;
	}
	public WebElement getActiveOrdersTab() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='7']"));
		 return element;
	}

	public WebElement getActiveOrdersPageHeader() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='Active Orders']"));
		 return element;
	}
	public WebElement getFirstOrderinAO() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
		 return element;
	}
	public WebElement getRecievePaymentBtn() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Receive Payment']"));
     }
	public WebElement getEmployeeName() {
		 WebElement element = posDriver1.findElement(By.xpath("(//android.widget.ImageView[@index='1'])[1]"));
		 return element;
	}
	public WebElement getGuestCountRightCorner() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='9']"));
		 return element;
	}
	public WebElement getOrderIdRightCorner() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='12']"));
		 return element;
	}
	public WebElement getFirstMenuRightSide() {
		 WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[13]"));
		 return element;
	}
	public WebElement getSecondMenuRightSide() {
		 WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='1'])[2]"));
		 return element;
	}
	public WebElement getThirdMenuRightSide() {
		 WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='2'])[1]"));
		 return element;
	}
	public WebElement getFourthMenuRightSide() {
		 WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[2]"));
		 return element;
	}
	public WebElement getTableNameRightside() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='7']"));
		 return element;
	}
	public WebElement getReceivePaymentBtn() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@index=17]"));
		 return element;
	}
	public WebElement getPaymentDetailsHeader() {
		 WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[5]"));
		 return element;
	}
	public WebElement getSubtotalPayDetails() {
		 WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='0'])[7]"));
		 return element;
	}
	public WebElement getSalesTaxPayDetails() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='1']"));
		 return element;
	}public WebElement getServiceFeePayDetails() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='2']"));
		 return element;
	}
	public WebElement getServiceFeeTaxPayDetails() {
		 WebElement element = posDriver1.findElement(By.xpath("(//android.view.View[@index='3'])[2]"));
		 return element;
	}
	public WebElement getGratuityPayDetails() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='4']"));
		 return element;
	}
	public WebElement getGratuityTaxPayDetails() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='5']"));
		 return element;
	}
	public WebElement getBillAmountPayDetails() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@index='8']"));
		 return element;
	}
	public WebElement getCollectCashBtnPayDetails() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.widget.Button[@content-desc='Collect Cash']"));
		 return element;
	}
	public WebElement getTipPopupBillAmt() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
		 return element;
	}
	public WebElement getTipPopupNoTip() {
		 WebElement element = posDriver1.findElement(By.xpath("//android.view.View[@content-desc='No Tip']"));
		 return element;
	}
	public WebElement get32() {
		 WebElement element = posDriver1.findElement(By.xpath(""));
		 return element;
	}
	
	public WebElement get33() {
		 WebElement element = posDriver1.findElement(By.xpath(""));
		 return element;
	}
	
	
	}

