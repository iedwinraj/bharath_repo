package com.qa.opencart.pages;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

public class CreateEnquiryEntry {
	
	private static final Logger LOGGER = Logger.getLogger(String.valueOf(OrganizationPage.class));
	private WebDriver driver;
	private ElementUtil elementUtil;
	private Properties prop;
	private WebDriverWait wait;
	private JavaScriptUtil jsutil;
		
	public CreateEnquiryEntry(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
		jsutil = new JavaScriptUtil(driver);
	}
	
	public void clicktext(String text2) {
		By clicktext = By.linkText(text2);
		elementUtil.clickWhenReady(clicktext, 30);
	}
	
	private By academicyear = By.xpath("//label[normalize-space()='Academic Year']//following::input");
	private By selectedyear = By.linkText("2020 - 2021");
	private By childname = By.xpath("//label[normalize-space()='Name of the Child']//following::input");
	private By dob = By.xpath("//label[normalize-space()='Date of Birth']//following::input");
	private By grade = By.xpath("//label[normalize-space()='Grade Name']//following::input");
	private By selectedgrade = By.xpath("//a[text()='Grade 1']");
	private By lastschool = By.xpath("//label[normalize-space()='School Last Attended']//following::input");
	private By emailid = By.xpath("//label[normalize-space()='Email']//following::input");
	private By phoneno = By.xpath("//label[normalize-space()='Contact Number']//following::input");
	private By submit = By.xpath("(//button[@type='button'])[7]");
	private By zipcode = By.xpath("//label[normalize-space()='Postal Code']//following::input");
	private By fathername = By.xpath("//label[contains(text(),'Father')]//following::input");
	private By localno = By.xpath("//label[normalize-space()='Local Number']//following::input");
	private By mothername = By.xpath("//label[contains(text(),'Mother')]//following::input");
	private By otherdetails = By.xpath("//textarea[@name='remarks']");
	private By enquirysource = By.xpath("//label[normalize-space()='Enquiry Source']//following::input");
	private By selectedenquirysource = By.linkText("Walk In");
	private By sendmail = By.xpath("//span[text()='Send Email']");
	private By sendallemail = By.xpath("//span[text()='Send All Emails']");
	private By addfollowup = By.linkText("Add an item");
	private By statusoption = By.xpath("(//span[@class ='oe_m2o_drop_down_button'])[5]");
	private By selectedstatus = By.linkText("Call Back Requested");
	private By remarks = By.xpath("//span[@data-fieldname='remarks']//following::input");
	private By remainder = By.xpath("//span[@data-fieldname='reminder']//following::input");
	public CreateEnquiryEntry details(String ayear, String sname, String sdob, String sgrade, String contactno, String email, String szipcode, String slastschool, String sfathername, String smothername, String slocalno, String sotherdetails, String senquirysource, String sstatus, String sremarks, String sremainder) throws InterruptedException
	{
		By selectedstatus2 = By.xpath("//td[@data-field='name' and contains( text(), '"+sstatus+"')]");
		Thread.sleep(5000);
		elementUtil.waitForElementToBeVisible(academicyear, 30);
		elementUtil.doSendKeys(academicyear, ayear);
		clicktext(ayear);
		//elementUtil.clickWhenReady(selectedyear, 10);
		elementUtil.doSendKeys(childname, sname);
		elementUtil.doSendKeys(dob, sdob);
		elementUtil.doSendKeys(grade, sgrade);
		clicktext(sgrade);
		elementUtil.doSendKeys(phoneno, contactno);
		elementUtil.doSendKeys(emailid, email);
		elementUtil.doSendKeys(zipcode, szipcode);
		elementUtil.doSendKeys(lastschool, slastschool);
		elementUtil.doSendKeys(fathername, sfathername);
		elementUtil.doSendKeys(mothername, smothername);
		elementUtil.doSendKeys(localno, slocalno);
		elementUtil.doSendKeys(otherdetails,sotherdetails);
		elementUtil.doSendKeys(enquirysource, senquirysource);
		clicktext(senquirysource);
		elementUtil.clickWhenReady(addfollowup, 20);
		elementUtil.clickWhenReady(statusoption, 30);
		clicktext("Search More...");
		elementUtil.clickWhenReady(selectedstatus2, 30);
		elementUtil.doSendKeys(remarks, sremarks);
		elementUtil.doSendKeys(remainder, sremainder);		
		elementUtil.doActionsSendKeysenter(remainder);
		jsutil.scrollPageUp();
		elementUtil.clickWhenReady(submit, 30);
		/*
		 * elementUtil.waitForElementToBeVisible(sendmail, 30);
		 * Thread.sleep(3000); 
		 * 
		 * elementUtil.clickWhenReady(sendmail, 30);
		 * elementUtil.waitForElementToBeVisible(sendallemail, 30);
		 * elementUtil.clickWhenReady(sendallemail, 30);
		 */
		 
		
				
		return this;
	}
	
	
}
