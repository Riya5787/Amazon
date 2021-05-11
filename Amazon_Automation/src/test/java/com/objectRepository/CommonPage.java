package com.objectRepository;

import org.openqa.selenium.By;
import com.accelerators.ActionEngine;

public class CommonPage extends ActionEngine{

	public static By txtSearch = By.id("twotabsearchtextbox");
	public static By btnSearch = By.id("nav-search-submit-button");
	public static By btnCART = By.id("add-to-cart-button");
	public static By Cart = By.id("submit.add-to-cart");
	public static By Account = By.id("nav-link-accountList-nav-line-1");
	public static By AmazonAc = By.id("createAccountSubmit");
	public static By Name = By.id("ap_customer_name");
	public static By Email = By.id("ap_email");
	public static By Password = By.id("ap_password");
	public static By Repassword = By.id("ap_password_check");
	public static By Create = By.id("continue");
	

	public void SearchProduct(String PRODUCTNAME)
	{
		//Code
	}
	
		
	public void AddToCart(String PRODUCTNAME)
	{
		
	}
	
	
	
}
