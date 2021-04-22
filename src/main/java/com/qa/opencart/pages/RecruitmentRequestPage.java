package com.qa.opencart.pages;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;

public class RecruitmentRequestPage {
	
	private static final Logger LOGGER = Logger.getLogger(String.valueOf(OrganizationPage.class));
	private WebDriver driver;
	private ElementUtil elementUtil;
	private Properties prop;
	private WebDriverWait wait;
	
	public RecruitmentRequestPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	private By recruitmentrequestmenu = By.linkText("Recruitment Request");
	private By create = By.xpath("(//button[@type='button'])[5]");
	private By requesttype = By.xpath("//label[normalize-space()='Request Type']//following::select");
	private By jobtitle = By.xpath("//label[normalize-space()='Job Title']//following::input");
	private By jobdescription = By.xpath("//label[normalize-space()='Job Description']//following::input");
	private By role = By.xpath("//label[normalize-space()='Role']//following::input");
	private By minctc = By.xpath("//label[normalize-space()='Minimum CTC']//following::input");
	private By maxctc = By.xpath("//label[normalize-space()='Maximum CTC']//following::input");
	private By minexp = By.xpath("//label[normalize-space()='Minimum Years of Experience']//following::input");
	private By maxexp = By.xpath("//label[normalize-space()='Maximum Years of Experience']//following::input");
	private By qualification = By.xpath("//label[normalize-space()='Required Qualifications']//following::input");
	private By preferences = By.xpath("//label[normalize-space()='Preferences, if any']//following::input");
	private By questionaire = By.xpath("(//label[normalize-space()='Questionnaire,if any']//following::div/span)[2]");
	private By selectedquestionaire = By.linkText("Subjectwise Report");
	private By save = By.xpath("(//button[@type='button'])[6]");
	
	public RecruitmentRequestPage create(String jtitle,String jdescription, String jrole, String jminctc, String jmaxctc, String jminexp, String jmaxexp, String jqualification, String jpreferences)
	{
		elementUtil.clickWhenReady(recruitmentrequestmenu, 20);
		elementUtil.clickWhenReady(create, 20);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		elementUtil.doDropDownSelectByVisibleText(requesttype, "New");
		elementUtil.doSendKeys(jobtitle, jtitle);
		elementUtil.doSendKeys(jobdescription, jdescription);
		elementUtil.doSendKeys(role, jrole);
		elementUtil.doSendKeys(minctc, jminctc);
		elementUtil.doSendKeys(maxctc, jmaxctc);
		elementUtil.doSendKeys(minexp, jminexp);
		elementUtil.doSendKeys(maxexp, jmaxexp);
		elementUtil.doSendKeys(qualification, jqualification);
		elementUtil.doSendKeys(preferences, jpreferences);
		elementUtil.clickWhenReady(questionaire, 30);
		elementUtil.clickWhenReady(selectedquestionaire, 30);
		elementUtil.clickWhenReady(save, 30);
		
		return this;
	}

}
