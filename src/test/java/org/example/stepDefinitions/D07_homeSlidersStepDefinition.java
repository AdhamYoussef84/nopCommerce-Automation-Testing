package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P07_HomeSliders;
import org.junit.Assert;

public class D07_homeSlidersStepDefinition {
    P07_HomeSliders register = new P07_HomeSliders();

    String nokiaDerails = "https://demo.nopcommerce.com/nokia-lumia-1020";
    String iphoneDetails = "https://demo.nopcommerce.com/iphone";

    @Given("user click on first slider with nokia image at home page")
    public void nokiaSlider() {  register.nokiaSlider().click();      }

      @Then("user navigate to nokia product details page")
    public void nokiaDetails() {
       String nokiaActual = Hooks.driver.getCurrentUrl();
       Assert.assertEquals(nokiaActual, nokiaDerails);
    }

    @Given("user click on second slider with iphone image at home page")
    public void iphoneSlider() {  register.iphoneSlider().click();      }

    @Then("user navigate to iphone product details page")
    public void iphoneDetails() {
      String iphoneActual = Hooks.driver.getCurrentUrl();
      Assert.assertEquals(iphoneActual, iphoneDetails);
    }
}
