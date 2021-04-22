package com.qa.opencart.pages;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;

public class EnquiryEntryFollowup {
	
	private static final Logger LOGGER = Logger.getLogger(String.valueOf(OrganizationPage.class));
	private WebDriver driver;
	private ElementUtil elementUtil;
	private Properties prop;
	private WebDriverWait wait;
	
	public EnquiryEntryFollowup(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	private By create = By.xpath("(//button[@type='button'])[5]");
	private By status = By.xpath("//label[normalize-space()='Status Option']//following::input");
	private By selectedstatus = By.linkText("Phone Conversation");
	private By remarks = By.xpath("//label[normalize-space()='Remarks']//following::input");
	private By followedon = By.xpath("//label[normalize-space()='Followed On']//following::input");
	private By submit = By.xpath("//button[text()='Save']");
	
	public EnquiryEntryFollowup createenquiryfollowup()
	{
		elementUtil.clickWhenReady(create, 30);
		return this;
	}
	public EnquiryEntryFollowup enterdetails(String sstatus, String sremarks, String sfollowedon) throws InterruptedException
	
	{
		
		Thread.sleep(5000);
		
		elementUtil.waitForElementToBeVisible(status, 30);
		elementUtil.doSendKeys(status, sstatus);
		clicktext(sstatus);
		//elementUtil.clickWhenReady(selectedstatus, 30);
		elementUtil.doSendKeys(remarks, sremarks);
		elementUtil.doSendKeys(followedon, sfollowedon);
		elementUtil.clickWhenReady(submit, 10);
		return this;
	}
	
	public void clicktext(String text2) {
		By clicktext = By.linkText(text2);
		elementUtil.clickWhenReady(clicktext, 30);
	}

}
