package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Author: Martin Itope
 * Email: martyitope@gmail.com
 * Date: 04/11/2026
 */
public class WebAutoAdvancedPage {

    WebDriver driver;

    @FindBy(xpath = "//option[@value='phone']")
    WebElement selectDeviceType;

    @FindBy(xpath = "//option[@value='apple']")
    WebElement selectApple;

    @FindBy(id = "storage-128GB")
    WebElement storage;

    @FindBy(xpath = "//option[@value='blue']")
    WebElement colorBlue;

    @FindBy(id = "quantity")
    WebElement quantity;

    @FindBy(id = "address")
    WebElement address;

    @FindBy(id = "inventory-next-btn")
    WebElement nextButton;

    @FindBy(id = "shipping-option-express")
    WebElement expressOption;

    @FindBy(id = "warranty-option-1yr")
    WebElement warranty;

    @FindBy(id = "discount-code")
    WebElement dicountCode;

    @FindBy(id = "purchase-device-btn")
    WebElement confirmPurchase;

    @FindBy(id = "view-history-btn")
    WebElement viewInvoice;

    @FindBy(xpath = "//button[contains(@id,'view-invoice')]")
    WebElement viewINV;


    public void setDeviceType() {
//       Select killing me
//        Select select = new Select(selectDeviceType);
//       selectDeviceType.getAccessibleName();

        selectDeviceType.click();
    }

    public void selectBrand(){
        selectApple.click();
    }

    public void selectStorage() {
        storage.click();
    }

    public void selectColor(){
        colorBlue.click();
    }

    public void setQuantity(int qty){
        quantity.sendKeys(String.valueOf(qty));
    }

    public void typeAddress(String addr){
        address.sendKeys(addr);
    }

    public void clickNextButtont(){
        nextButton.click();
    }

    public void selectShippingMethod(){
        expressOption.click();
    }


    public void setWarranty(){
        warranty.click();
    }

    public void enterDiscountCode(String discount){
        dicountCode.sendKeys(discount);
    }

    public void clickConfirm(){
        confirmPurchase.click();
    }

    public void clickInvoice(){
        viewInvoice.click();
    }

    public void openInvoice(){
        viewINV.click();
    }



}
