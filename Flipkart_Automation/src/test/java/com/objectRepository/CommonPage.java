package com.objectRepository;

import org.openqa.selenium.By;
import com.accelerators.ActionEngine;

public class CommonPage extends ActionEngine{

	public static By txtSearch = By.name("q");
	public static By btnSearch = By.className("L0Z3Pu");
	public static By btnCART = By.className("DJrnBo");
	public static By Cart = By.xpath("//span[contains(text(),'Cart')]");
	public static By Logo = By.xpath("//img[@alt='Flipkart']");
	public static By LogoText = By.xpath("//a[@class='_33x-Wq']");
	

	public void SearchProduct(String PRODUCTNAME)
	{
		//Code
	}
	
		
	public void AddToCart(String PRODUCTNAME)
	{
		
	}
	
	
	
}
