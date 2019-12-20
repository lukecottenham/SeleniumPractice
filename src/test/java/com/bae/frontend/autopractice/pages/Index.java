package com.bae.frontend.autopractice.pages;

import java.nio.file.WatchEvent;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Index {
	
	@FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]")
	private WebElement searchbar;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li[4]/div/div[2]/h5/a")
	private WebElement chiffonDress;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li[4]/div/div[2]/div[3]/ul/li[1]/a")
	private WebElement dressInGreen;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span/span")
	private WebElement continueShoppingButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a")
	private WebElement cartButton;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")
	private WebElement checkoutButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
	private WebElement signInButton;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input")
	private WebElement emailField;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input")
	private WebElement passwordField;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")
	private WebElement loginButton;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
	private WebElement proceedToCheckoutButtonSect03;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span")
	private WebElement proceedToCheckoutButtonSect04;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input")
	private WebElement termsAndConditionsAgreement;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a")
	private WebElement payByBankWireButton;
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
	private WebElement confirmOrderButton;
	
	
	public void enterSearchItem(String searchItem) {
		this.searchbar.sendKeys(searchItem);
		this.searchbar.sendKeys(Keys.ENTER);
	}
	
	public String chiffonDressText() {
		return this.chiffonDress.getText();
	}
	
	public void clickDressInGreen() {
		this.dressInGreen.click();
	}

	public void addToCart() {
		this.addToCartButton.click();
	}
	
	public void continueShopping() {
		this.continueShoppingButton.click();
	}
	
	public void goToCart() {
		this.cartButton.click();
	}
	
	public void goToCheckout() {
		this.checkoutButton.click();
	}
	
	public void login(String email, String password) {
		this.signInButton.click();
		this.emailField.sendKeys(email);
		this.passwordField.sendKeys(password);
		this.loginButton.click();
		
	}
	
	public void checkoutAndConfirm() {
		this.proceedToCheckoutButtonSect03.click();
		this.termsAndConditionsAgreement.click();
		this.proceedToCheckoutButtonSect04.click();
		this.payByBankWireButton.click();
		this.confirmOrderButton.click();
	}
}
