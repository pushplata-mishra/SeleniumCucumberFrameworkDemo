package steps;

import DriverFactory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PlaceOrderPage;

public class PlaceOrderSteps {
	
	private PlaceOrderPage orderPage = new PlaceOrderPage(DriverFactory.driver());
	
	@When("user selects first product")
	public void user_selects_first_product() throws InterruptedException {
		orderPage.addOrder();
	    
	}
	@When("user adds product to cart")
	public void user_adds_product_to_cart() {
		orderPage.addProductToCart();
	}
	@When("user pays by bank wire")
	public void user_pays_by_bank_wire() {
		orderPage.addPaymentByBankWire();
	}
	@Then("order of selected product should be completed")
	public void order_of_selected_product_should_be_completed() {
	    orderPage.verifyOrderCompletion();
	}

}
