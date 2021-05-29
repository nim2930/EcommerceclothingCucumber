package stepDefinitions;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WomenShoppingPage {
 WebDriver driver;
  @Before
 public void Setup() {
	 System.out.println(".........Before ");
 }
  @After
  public void tearDown(){
	  System.out.println(".........After ");
  }

@Given("^User is in home page of application$")
public void user_is_in_home_page_of_application() throws Throwable {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\nimisha\\eclipse-workspace\\EcommerceclothingCucumber\\BrowserDrivers\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(5000);
 }

@When("^User should be click on women shopping button$")
public void user_should_be_click_on_women_shopping_button() throws Throwable {
	Thread.sleep(4000);
	System.out.println("Coming to function");
	if(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).isEnabled()) {
	   driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
	   System.out.println("clicked on Women button");
	}else 
	{ System.out.println("Womens button not enabled");}
}

@Then("^User should be navigate to Women subcategories page and click on Tops button$")
public void user_should_be_navigate_to_Women_subcategories_page_and_click_on_Tops_button() throws Throwable {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img")).click();
    System.out.println("clicked on tops button");
}
@Then("^User should be navigate to T-shirts page and click on T-shirts page$")
public void user_should_be_navigate_to_T_shirts_page_and_click_on_T_shirts_page() throws Throwable {
	Thread.sleep(3000);
	if(driver.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/h5/a")).isEnabled()) {
    driver.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/h5/a")).click();
}
}

@Then("^User should be navigate to T-shirts shopping items page and click on shopping item$")
public void user_should_be_navigate_to_T_shirts_shopping_items_page_and_click_on_shopping_item() throws Throwable {
	Thread.sleep(3000);
	if(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")).isEnabled()) {
	    driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")).click();
	}
    
}

@Then("^User enters following datails of shopping item and click on Addtocart button$")
public void user_enters_following_datails_of_shopping_item_and_click_on_Addtocart_button(DataTable arg1) throws Throwable {
	Thread.sleep(4000);
   driver.switchTo().frame(0);
   driver.findElement(By.id("quantity_wanted")).click();
   driver.findElement(By.id("quantity_wanted")).sendKeys("2");
   Select s=new Select(driver.findElement(By.xpath("//*[@id=\"group_1\"]")));
	s.selectByVisibleText("M");
	driver.findElement(By.xpath("//*[@id=\"color_14\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
   System.out.println("clicked on Add to cart button");
}
@Then("^User should be navigate to proceed to checkout page and click on Proceed to checkout button$")
public void user_should_be_navigate_to_proceed_to_checkout_page_and_click_on_Proceed_to_checkout_button() throws Throwable {
	Thread.sleep(5000);
   driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).isDisplayed();
   driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
   System.out.println("clicked on Proceed to checkout button");
}
@Then("^User should be navigate to shopping cart summary page$")
public void user_should_be_navigate_to_shopping_cart_summary_page() throws Throwable {
	System.out.println("User should be navigate to shopping cart summary page");
}


@Given("^User is in shopping cart summary page$")
public void user_is_in_shopping_cart_summary_page() throws Throwable {	 
	Thread.sleep(3000);
	System.out.println("User is in shopping cart summary page");
}

@When("^User should be click on Proceedto Checkout button$")
public void user_should_be_click_on_Proceedto_Checkout_button() throws Throwable {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).isDisplayed();
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
	 System.out.println("clicked on Proceed to checkout button");
}

@Then("^user should be navigate to authentication page$")
public void user_should_be_navigate_to_authentication_page() throws Throwable {
	System.out.println("User should be navigate to authentication page");
    
}

@Given("^User is in authentication page$")
public void user_is_in_authentication_page() throws Throwable {
	System.out.println("User is in authentication page");
    
}

@When("^User enter Email address$")
public void user_enter_Email_address() throws Throwable {
	Random randomGenerator = new Random();  
	int randomInt = randomGenerator.nextInt(10000);
	driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("nspt.dup"+randomInt+"@gmail.com");
	System.out.println("Enter Email address");
    
}

@Then("^User click on create an account button$")
public void user_click_on_create_an_account_button() throws Throwable {
    driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).isEnabled();
    driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
    System.out.println("clicked on create on account page");
}

@Given("^User is in Create an account page$")
public void user_is_in_Create_an_account_page() throws Throwable {
	 System.out.println("User is in create an account page");
}

@When("^User enters all the personal information and address$")
public void user_enters_all_the_personal_information_and_address() throws Throwable {
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).isDisplayed();
	driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).click();
	 System.out.println("clicked on Mrs button checkbox");
	 driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("women");
     driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("shopping");
     Thread.sleep(2000);
     driver.findElement(By.id("passwd")).sendKeys("Womenshopping2930");
     Select s1=new Select(driver.findElement(By.xpath("//*[@id=\"days\"]")));
		s1.selectByValue("24");
		Thread.sleep(2000);
		Select s2=new Select(driver.findElement(By.xpath("//*[@id=\"months\"]")));
		s2.selectByValue("7");
		Thread.sleep(2000);
		Select s3=new Select(driver.findElement(By.xpath("//*[@id=\"years\"]")));
		s3.selectByValue("1996");
		Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("women");
	  driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("shopping");
	  driver.findElement(By.id("company")).sendKeys("KeyBank");
	  driver.findElement(By.id("address1")).sendKeys("12345,pearl road, KeyBank");
	  driver.findElement(By.id("address2")).sendKeys("M50,123456,2");
	  driver.findElement(By.id("city")).sendKeys("Akron");
		Select s4=new Select(driver.findElement(By.id("id_state")));
		s4.selectByValue("36");
		driver.findElement(By.id("postcode")).sendKeys("44145");
		driver.findElement(By.id("phone_mobile")).sendKeys("4401234567");
		driver.findElement(By.id("alias")).sendKeys("12345, Main Road, P25");
}

@Then("^User click on Register button$")
public void user_click_on_Register_button() throws Throwable {
   driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
   System.out.println("clicked on Register button ");
}


@Given("^User is in Address page$")
public void user_is_in_Address_page() throws Throwable {

	System.out.println("User is in Address page ");
   
}
@When("^User should be click on Proceed-toCheckout button$")
public void user_should_be_click_on_Proceed_toCheckout_button() throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).isDisplayed();
	driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
	System.out.println("Clicked on Proceed to checkout button ");
}

@Then("^User should be navigate to shipping page$")
public void user_should_be_navigate_to_shipping_page() throws Throwable {
	System.out.println("User should be navigate to shipping page");   
}

@Given("^User is in shipping page$")
public void user_is_in_shipping_page() throws Throwable {
	System.out.println("User is in shipping page");      
}

@When("^User click on selected the terms of service check box$")
public void user_click_on_selected_the_terms_of_service_check_box() throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"cgv\"]")).isEnabled();
	driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click(); 
	System.out.println("Clicked on selected the terms of service check box");   
}

@Then("^User should be click on Proceedtocheckout button$")
public void user_should_be_click_on_Proceedtocheckout_button() throws Throwable {
   driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
   System.out.println("Clicked on Proceed to chcekout button");   
}

@Given("^User is in please choose your payment method$")
public void user_is_in_please_choose_your_payment_method() throws Throwable {
	 System.out.println("User is in please choose your payment method");   
   
}

@When("^User click on paybybankwire option$")
public void user_click_on_paybybankwire_option() throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a/span")).isEnabled();
	driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a/span")).click();
	System.out.println("Clicked on paybybankwire option");   
	   
}

@Then("^User navigate to order summary page$")
public void user_navigate_to_order_summary_page() throws Throwable {
	System.out.println("User navigate to order summary page");   
   
}

@Given("^User is in order summary page$")
public void user_is_in_order_summary_page() throws Throwable {
	System.out.println("User is in order summary page");   
}

@When("^User click on I confirm my order button$")
public void user_click_on_I_confirm_my_order_button() throws Throwable {
   driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).isEnabled();
   driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
   System.out.println("Clicked on I confirm my order button");   
}

@Then("^User should be navigate to order confirmation page$")
public void user_should_be_navigate_to_order_confirmation_page() throws Throwable {
	 System.out.println("User should be navigate to order confirmation page");   
}
}
