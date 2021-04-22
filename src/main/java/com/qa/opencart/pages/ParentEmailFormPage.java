package com.qa.opencart.pages;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

public class ParentEmailFormPage {
	
	private static final Logger LOGGER = Logger.getLogger(String.valueOf(OrganizationPage.class));
	private WebDriver driver;
	private ElementUtil elementUtil;
	private Properties prop;
	private WebDriverWait wait;
	private JavaScriptUtil jsutil;
	
	public ParentEmailFormPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
		jsutil=new JavaScriptUtil(driver);
	}
	
	/*
	 * private By admissionmenu = By.linkText("Admission"); private By
	 * parentemailmenu = By.linkText("Parent Email Form");
	 */
	private By create = By.xpath("(//button[@type='button'])[5]");
	private By academicyear = By.xpath("//label[normalize-space()='Academic Year']//following::input");
	private By emailtype = By.xpath("//label[normalize-space()='Email Type']//following::select");
	private By date = By.xpath("//label[normalize-space()='Scheduled Date']//following::input");
	private By time = By.xpath("//label[normalize-space()='Scheduled Time']//following::input");
	private By sendemail = By.xpath("//span[text()='Send Email']");
	
	public ParentEmailFormPage createemail(String ayear,String semailtype,String  sdate,String stime,String senquiryid) throws InterruptedException {
		
		elementUtil.clicktext("Admission");
		elementUtil.clicktext("Parent Email Form");
		elementUtil.clickWhenReady(create, 30);
		Thread.sleep(5000);
		elementUtil.doSendKeys(academicyear, ayear);
		elementUtil.clicktext(ayear);
		elementUtil.doDropDownSelectByVisibleText(emailtype, semailtype);
		elementUtil.doSendKeys(date, sdate);
		elementUtil.doSendKeys(time, stime);
		elementUtil.clicktext("Add an item");
		By enquiryid = By.xpath("//td[@data-field='name' and contains(text(), '"+senquiryid+"')]");
		elementUtil.clickWhenReady(enquiryid, 30);
		elementUtil.clickWhenReady(sendemail, 30);
			
		return this;
	}
	

}
