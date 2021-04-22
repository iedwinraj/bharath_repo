package com.qa.opencart.pages;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

public class AdmissionEmail {
	
	private static final Logger LOGGER = Logger.getLogger(String.valueOf(OrganizationPage.class));
	private WebDriver driver;
	private ElementUtil elementUtil;
	private Properties prop;
	private WebDriverWait wait;
	private JavaScriptUtil jsutil;
	
	public AdmissionEmail(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
		jsutil=new JavaScriptUtil(driver);
	}
	
	private By admissionmenu = By.linkText("Admission");
	private By emailmenu = By.linkText("Emails");
	private By create = By.xpath("(//button[@type='button'])[5]");
	private By subject = By.xpath("//label[normalize-space()='Subject']//following::input");
	private By createdby = By.xpath("(//label[normalize-space()='Subject']//following::input)[2]");
	private By from = By.xpath("//label[normalize-space()='From']//following::input");
	private By to = By.xpath("//label[normalize-space()='To']//following::textarea");
	private By topartners = By.xpath("//label[normalize-space()='To (Partners)']//following::input");
	private By cc = By.xpath("//label[normalize-space()='Cc']//following::input");
	private By body = By.xpath("//div[@class='note-editable panel-body']");
	private By attachment = By.linkText("Attachments");
	private By sendnow = By.xpath("//span[text()='Send Now']");
	
	public AdmissionEmail createemail(String ssubject, String sby,String sfrom,String sto,String  stopartners,String  scc,String  sbody) throws InterruptedException {
		elementUtil.clickWhenReady(admissionmenu, 30);
		elementUtil.clickWhenReady(emailmenu, 30);
		elementUtil.clickWhenReady(create, 30);
		Thread.sleep(3000);
		elementUtil.doSendKeys(subject, ssubject);
		elementUtil.doSendKeys(createdby, sby);
		elementUtil.clicktext(sby);
		elementUtil.doSendKeys(from, sfrom);
		elementUtil.doSendKeys(to, sto);
		elementUtil.doSendKeys(topartners, stopartners);
		elementUtil.clicktext(stopartners);
		elementUtil.doSendKeys(cc, scc);
		elementUtil.doSendKeys(body, sbody);
		jsutil.scrollPageUp();
		elementUtil.clickWhenReady(sendnow, 30);
		return this;
	}

}
