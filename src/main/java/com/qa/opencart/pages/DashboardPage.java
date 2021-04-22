package com.qa.opencart.pages;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;

public class DashboardPage {
	private static final Logger LOGGER = Logger.getLogger(String.valueOf(DashboardPage.class));
	private WebDriver driver;
	private ElementUtil elementUtil;
	private Properties prop;
	
	private By adminmenu = By.linkText("Administration");
	private By chat = By.xpath("//b[text()='Your personal dashboard is empty.']");
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	public DashboardPage dashboard()	
	{
		elementUtil.waitFortexttopresentintheElement(chat, 30);
//		elementUtil.waitForElementToBeLocated(adminmenu, 0)
		elementUtil.clickWhenReady(adminmenu, 10);
		return this;
		
	}

}
