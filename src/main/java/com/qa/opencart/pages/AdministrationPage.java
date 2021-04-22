package com.qa.opencart.pages;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;

public class AdministrationPage {
	private static final Logger LOGGER = Logger.getLogger(String.valueOf(AdministrationPage.class));
	private WebDriver driver;
	private ElementUtil elementUtil;
	private Properties prop;
	private WebDriverWait wait;
	
	private By organization = By.linkText("Organizations");
	private By chat = By.xpath("//button[text() = ' Chat ']");
	
	public AdministrationPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	public AdministrationPage organization()
	{
	
		//elementUtil.waitForElementToBeVisible(chat, 30);
		elementUtil.clickWhenReady(organization, 5);

		return this;
	}
}
