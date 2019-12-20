package com.bae.frontend.autopractice.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.bae.frontend.autopractice.pages.Index;

public class AutomationPracticeSiteTest {
	private WebDriver driver;
	private String email = "123@123t.com";
	private String password = "12345";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumPractice\\src\\main\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		
	}

	@After
	public void tearDown() throws Exception {
		this.driver.quit();
	}

	@Test
	public void ShoppingTest() throws InterruptedException {
		this.driver.get("http://automationpractice.com/index.php");
		Index indexPage = PageFactory.initElements(driver, Index.class);
		indexPage.login(this.email, this.password);
		String searchItem = "dress";
		indexPage.enterSearchItem(searchItem);
		Thread.sleep(1000L);
		assertEquals("Printed Chiffon Dress", indexPage.chiffonDressText());
		indexPage.clickDressInGreen();
		indexPage.addToCart();
		Thread.sleep(2000L);

		indexPage.continueShopping();
		indexPage.goToCart();
		indexPage.goToCheckout();
		indexPage.checkoutAndConfirm();
		Thread.sleep(5000L);
		
		
		
		


		
		
	}

}
