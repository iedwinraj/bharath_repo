package com.qa.opencart.pages;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

public class ConsultantFeedback {
	private static final Logger LOGGER = Logger.getLogger(String.valueOf(OrganizationPage.class));
	private WebDriver driver;
	private ElementUtil elementUtil;
	private JavaScriptUtil jsutil;
	private Properties prop;
	private WebDriverWait wait;
	
	public ConsultantFeedback(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
		jsutil = new JavaScriptUtil(this.driver);
	}
	private By consultantmenu = By.linkText("Consultant Feedback");
	private By  create= By.xpath("(//button[@type='button'])[5]");
	private By  save= By.xpath("(//button[@type='button'])[7]");
	private By schoolname = By.xpath("//label[normalize-space()='School Name']//following::input");
	private By candidatename = By.xpath("//label[normalize-space()='Candidate Name']//following::input");
	private By candidateemail = By.xpath("//label[normalize-space()='Candidate Email']//following::input");
	private By interviewdate = By.xpath("//label[normalize-space()='Interview Date']//following::input");
	private By interviewtime=By.xpath("//label[normalize-space()='Interview Time']//following::input");
	private By gender = By.xpath("//label[normalize-space()='Gender']//following::select");
	private By feedback = By.xpath("//label[normalize-space()='Feedback']//following::textarea");
	private By attachment = By.xpath("//label[normalize-space()='Attach a file']//following::input");
	
	public ConsultantFeedback createfeedback(String sschoolname,String scandidatename,String scandidateemail,String sinterviewdate,String sinterviewtime,String sgender,String sfeedback,String sattachment) throws InterruptedException {
		
		elementUtil.ScrollAndClick(consultantmenu);
		elementUtil.clickWhenReady(create, 20);
		Thread.sleep(3000);
		elementUtil.doSendKeys(schoolname, sschoolname.substring(0, 2));
		elementUtil.clicktext(sschoolname);
		elementUtil.doSendKeys(candidatename, scandidatename);
		elementUtil.doSendKeys(candidateemail, scandidateemail);
		elementUtil.doSendKeys(interviewdate, sinterviewdate);
		elementUtil.doSendKeys(interviewtime, sinterviewtime);
		elementUtil.doDropDownSelectByVisibleText(gender, sgender);
		elementUtil.doSendKeys(feedback, sfeedback);
		//elementUtil.doSendKeys(attachment, sattachment);
		elementUtil.clickWhenReady(save, 30);
		
		
		return this;
	}

}
