package com.qa.opencart.pages;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;

public class StudentLifeCyclePage {
	
	private static final Logger LOGGER = Logger.getLogger(String.valueOf(OrganizationPage.class));
	private WebDriver driver;
	private ElementUtil elementUtil;
	private Properties prop;
	private WebDriverWait wait;
	
	private By dashboardmenu = By.linkText("Student Life Cycle");
	private By lastelement = By.linkText("Leaves");
	private By dashboardtext = By.xpath("//b[text()='Your personal dashboard is empty.']");
	private By enquirymenu = By.xpath("(//a[ contains( text() , 'Enquiry Entry')])[1]");
	private By enquirysubmenu = By.xpath("(//a[ contains( text() , 'Enquiry Entry')])[2]");
	private By create = By.xpath("(//button[@ type='button'])[5]");
	private By enquiryentryfollowup = By.linkText("Enquiry Entry Follow Up");
	

	public StudentLifeCyclePage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	public StudentLifeCyclePage studentlifecyclepageclick()
	{
		elementUtil.waitFortexttopresentintheElement(dashboardtext, 30);
		//elementUtil.waitForElementToBeLocated(lastelement, 30);
		elementUtil.clickWhenReady(dashboardmenu, 10);
		return this;
	}
	
	public StudentLifeCyclePage enquiryentryclick()
	{
		elementUtil.waitForElementToBeVisible(enquirymenu, 50);
		elementUtil.clickWhenReady(enquirymenu, 30);
		return this;
	}
	public StudentLifeCyclePage enquirysubmenuclick()
	{
		elementUtil.waitForElementToBeLocated(enquirysubmenu, 50);
		elementUtil.clickWhenReady(enquirysubmenu, 30);
		return this;
	}
	public StudentLifeCyclePage createenquiry()
	{
		elementUtil.clickWhenReady(create, 10);
		return this;
	}
	public StudentLifeCyclePage enquiryentryfollowup()
	{
		elementUtil.clickWhenReady(enquiryentryfollowup, 30);
		return this;
	}
}
