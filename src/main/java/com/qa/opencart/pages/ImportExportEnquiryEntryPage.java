package com.qa.opencart.pages;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

public class ImportExportEnquiryEntryPage {
	
	private static final Logger LOGGER = Logger.getLogger(String.valueOf(OrganizationPage.class));
	private WebDriver driver;
	private ElementUtil elementUtil;
	private Properties prop;
	private WebDriverWait wait;
	private JavaScriptUtil jutil;
		
	public ImportExportEnquiryEntryPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
		jutil= new JavaScriptUtil(this.driver);
		
	}
	private By export = By.xpath("//label[text()='Export']");
	private By importdetails = By.xpath("//label[text()='Import']");
	private By academicyear = By.xpath("//label[normalize-space()='Academic Year']//following::input");
	private By exportdata = By.xpath("//span[text()='Export Data']");
	private By filepath = By.xpath("//label[normalize-space()='File']//following::input");
	private By importdata = By.xpath("//span[text()='Import Data']");
	private By selectfile = By.name("ufile");
	
	public ImportExportEnquiryEntryPage export(String ayear) {
		
		elementUtil.clicktext("Import/Export Enquiry Entry");
		elementUtil.clickWhenReady(export, 30);
		elementUtil.doSendKeys(academicyear, ayear);
		elementUtil.clicktext(ayear);
		elementUtil.clickWhenReady(exportdata, 30);
		return this;
	}
	
	public ImportExportEnquiryEntryPage importdetails(String ayear, String sfilepath) {
		
		
		elementUtil.clicktext("Import/Export Enquiry Entry");
		elementUtil.clickWhenReady(importdetails, 30);
		elementUtil.doSendKeys(academicyear, ayear);
		elementUtil.clicktext(ayear);
		//elementUtil.clickWhenReady(filepath, 30);
		//elementUtil.doSendKeys(filepath, sfilepath);
//		elementUtil.movetoelement(selectfile);
////		jutil.clickElementByJS(elementUtil.getElement(selectfile));
		elementUtil.doSendKeys(selectfile, sfilepath);
//		elementUtil.clickWhenReady(selectfile, 30);
		elementUtil.clickWhenReady(importdata, 30);
		
		return this;
	}

}
