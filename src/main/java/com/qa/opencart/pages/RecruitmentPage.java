package com.qa.opencart.pages;

import java.awt.Desktop.Action;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;

public class RecruitmentPage {
	
	private static final Logger LOGGER = Logger.getLogger(String.valueOf(OrganizationPage.class));
	private WebDriver driver;
	private ElementUtil elementUtil;
	private Properties prop;
	private WebDriverWait wait;
	
	public RecruitmentPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
	}
	
	
	private By link = By.linkText("Recruitment");
	private By jobposition = By.linkText("Job Positions");
	private By scrollbar = By.xpath("//div[@class='slimScrollBar']");
	private By create = By.xpath("(//button[@type='button'])[5]");
	private By schoolname = By.xpath("//label[normalize-space()='School Name']//following::div/span");
	private By selectedschool = By.linkText("CHSV Chettinad Hari Shree Vidyalayam School");
	private By designation = By.xpath("//label[normalize-space()='Designation Name']//following::input");
	private By designationcode = By.xpath("//label[normalize-space()='Designation Code']//following::input");
	private By department = By.xpath("//label[normalize-space()='Department Name']//following::div/span");
	private By selecteddepartment = By.linkText("Teaching");
	private By noofvacancies = By.xpath("//label[normalize-space()='Total Number of Vacancies']//following::input");
	private By interviewstage = By.xpath("(//label[normalize-space()='Interview stages']//following::div/span)[2]");
	private By selectedstage = By.linkText("HR round interview");
	private By save = By.xpath("(//button[@type='button'])[7]");
	
	public RecruitmentPage click()
	{
		
		while (elementUtil.checkWebElementNotPresent(link)) {
			elementUtil.doActionsClickAndScroll(scrollbar);
		}
		elementUtil.doActionsClickAndScroll(scrollbar);
		elementUtil.clickWhenReady(link, 30);
		elementUtil.doActionsClickAndScroll(scrollbar);
		//elementUtil.clickWhenReady(link, 30);
		return this;
	}
	public RecruitmentPage create(String vac)
	{

		elementUtil.clickWhenReady(jobposition, 30);
		elementUtil.clickWhenReady(create, 30);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		elementUtil.clickWhenReady(schoolname, 20);
		elementUtil.clickWhenReady(selectedschool, 20);
		elementUtil.doSendKeys(designation, "English language Teacher Test");
		elementUtil.doSendKeys(designationcode, "TCRE");
		elementUtil.clickWhenReady(department, 20);
		elementUtil.clickWhenReady(selecteddepartment, 20);
		elementUtil.doSendKeys(noofvacancies, vac);
		
		elementUtil.clickWhenReady(interviewstage, 20);
		elementUtil.clickWhenReady(selectedstage, 20);
		elementUtil.clickWhenReady(save, 20);
		return this;
		
	}
	

	

}
