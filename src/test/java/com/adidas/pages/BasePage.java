package com.adidas.pages;

import com.adidas.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {
   public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='list-group']//a")
    public List<WebElement> catagories;

   @FindBy(xpath = "(//tr[@class='success']//td/a)[1]")
   public WebElement deleteDell;
   // @FindBy(xpath = "//tbody/tr[1]/td[4]/a[1]")
   // public WebElement deleteDell;
   @FindBy(xpath = "//button[.='Place Order']")
   public WebElement placeOrderBtn;
   @FindBy(id="name")
   public WebElement name;
   @FindBy(id="country")
   public WebElement country;
   @FindBy(id="city")
   public WebElement city;
   @FindBy(id="card")
   public WebElement card;
   @FindBy(id="month")
   public WebElement month;
   @FindBy(id="year")
   public WebElement year;
   @FindBy(xpath = "//button[.='Purchase']")
   public WebElement purchasebtn;
   @FindBy(id="totalm")
   public WebElement total;
//preceding-sibling::br
   @FindBy(xpath = "//p[@class='lead text-muted ']")
   public List<WebElement> idAndAccount;

   @FindBy(xpath = "//button[.='OK']")
   public WebElement okBTN;

   @FindBy(xpath = "//label[@for='name'][1]")
   public WebElement ammount;






    public static void clicklink(WebDriver driver, String element) {
        Driver.getDriver().findElement(By.partialLinkText(element)).click();

    }



}
