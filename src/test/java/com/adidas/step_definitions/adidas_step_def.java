package com.adidas.step_definitions;

import com.adidas.pages.BasePage;
import com.adidas.utilities.BrowserUtils;
import com.adidas.utilities.ConfigReader;
import com.adidas.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;


import org.openqa.selenium.WebElement;



import java.util.ArrayList;

import java.util.List;

public class adidas_step_def {

    BasePage basePage= new BasePage();



    @Given("user id on the webpage")
    public void user_id_on_the_webpage() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("user navigates product categories-Phones, Labtops and Monitors")
    public void user_navigates_product_categories_phones_labtops_and_monitors() {

        for (WebElement each : basePage.catagories) {
            System.out.println(each.getText());
            Assert.assertTrue(each.isEnabled());

        }
    }
    @When("user navigates to Labtop-adds Sony vaio i5 to cart")
    public void user_navigates_to_labtop_adds_sony_vaio_i5_to_cart()  {
        BasePage.clicklink(Driver.getDriver(),"Laptops");
        BrowserUtils.sleep(1);
       BasePage.clicklink(Driver.getDriver(),"Sony vaio i5");
        BasePage.clicklink(Driver.getDriver(),"Add to cart");
        BrowserUtils.sleep(1);

        Alert alert = Driver.getDriver().switchTo().alert();
        BrowserUtils.sleep(1);
        alert.accept();
        Driver.getDriver().switchTo().defaultContent();


    }
    @When("user adds Dell i7 8gb to cart")
    public void user_adds_dell_i7_8gb_to_cart()  {

        BasePage.clicklink(Driver.getDriver(),"Home");

        BasePage.clicklink(Driver.getDriver(),"Laptops");
        BasePage.clicklink(Driver.getDriver(),"Dell i7 8gb");
        BasePage.clicklink(Driver.getDriver(),"Add to cart");
        BrowserUtils.sleep(1);

        Alert alert = Driver.getDriver().switchTo().alert();
        BrowserUtils.sleep(1);
        alert.accept();
        Driver.getDriver().switchTo().defaultContent();




    }
    @When("user navigates to cart- deletes Dell i7 8bg from cart")
    public void user_navigates_to_cart_deletes_dell_i7_8bg_from_cart()  {

        BasePage.clicklink(Driver.getDriver(),"Cart");
        basePage.deleteDell.click();


        BrowserUtils.sleep(2);
        Driver.getDriver().navigate().refresh();



    }
    @When("user clicks place order")
    public void user_clicks_place_order()  {
        BrowserUtils.sleep(2);

        basePage.placeOrderBtn.click();
    }
    @When("user fills out form")
    public void user_fills_out_form() {
        Faker faker = new Faker();
        BrowserUtils.sleep(3);
        basePage.name.sendKeys(faker.name().fullName());
        basePage.country.sendKeys(faker.country().name());
        basePage.city.sendKeys(faker.country().capital());
        basePage.card.sendKeys(faker.numerify("1111222233334444"));
        basePage.month.sendKeys(faker.numerify("10"));
        basePage.year.sendKeys(faker.numerify("2025"));
    }
    @When("user clicks purchase")
    public void user_clicks_purchase() {
        basePage.purchasebtn.click();

    }
    @Then("Capture and log id and amount")
    public void capture_and_log_id_and_amount() {
        for (WebElement each : basePage.idAndAccount) {
           System.out.println(each.getText());
            List<String> list= new ArrayList<>(List.of(each.getText().split(" ")));
           // System.out.println(list.get(0).toString());
            Assert.assertFalse(list.get(0).isEmpty());



        }

    }
    @Then("assert purchase amount equals expected")
    public void asser_purchase_amount_equals_expected() {

        for (WebElement each : basePage.idAndAccount) {
            System.out.println(each.getText());
            List<String> list= new ArrayList<>(List.of(each.getText().split(" ")));
            //System.out.println(list.get(1).toString());
            Assert.assertFalse(list.get(1).isEmpty());



        }


    }
    @Then("user click ok")
    public void click_ok() {
        basePage.okBTN.click();

    }
}
