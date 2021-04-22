package com.qa.opencart.pages;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;

public class OrganizationPage {

		private static final Logger LOGGER = Logger.getLogger(String.valueOf(OrganizationPage.class));
		private WebDriver driver;
		private ElementUtil elementUtil;
		private Properties prop;
		private WebDriverWait wait;
		
		private By create = By.xpath("(//button [@type='button'])[5]");
		private By schoolname = By.xpath("//label[normalize-space()='Corporate / Society / School']//following::input");
		private By faxid = By.xpath("//label[normalize-space()='Fax ID']//following::input");
		private By parentorg = By.xpath("//label[normalize-space()='Parent Organization']//following::input");
		private By address1 = By.xpath("//label[normalize-space()='Address']//following::input");
		private By address2 = By.xpath("(//label[normalize-space()='Address']//following::input)[2]");
		private By city = By.xpath("(//label[normalize-space()='Address']//following::input)[3]");
		private By state = By.xpath("(//label[normalize-space()='Address']//following::input)[4]");
		//private By morestates = By.linkText("Search More...");
		//private By statelist = By.xpath("(//td[@title='Administrative divisions of a country. E.g. Fed. State, Departement, Canton'])[32]");
		//private By state = By.id("ui-id-94");
		private By zip = By.xpath("(//label[normalize-space()='Address']//following::input)[5]");
		private By country = By.xpath("(//label[normalize-space()='Address']//following::input)[6]");
		private By website = By.xpath("//label[normalize-space()='Website']//following::input");
		private By code = By.xpath("//label[normalize-space()='Code']//following::input");
		private By attendence = By.xpath("//label[normalize-space()='Fore & After Noon Attendance']//following::input");
		private By environment = By.xpath("//label[normalize-space()='Environment']//following::input");
		private By phoneno = By.xpath("//label[normalize-space()='Phone Number']//following::input");
		private By mobileno = By.xpath("//label[normalize-space()='Mobile Number']//following::input");
		private By email = By.xpath("//label[normalize-space()='Email Address']//following::input");
		
		private By submit = By.xpath("(//button[@type='button'])[7]");
		private By discard = By.xpath("(//button[@type='button'])[8]");
		private By confirmation = By.xpath("//button[@class='btn btn-sm oe_button btn-primary']");
	
		public OrganizationPage(WebDriver driver) {
			this.driver = driver;
			elementUtil = new ElementUtil(this.driver);
		}
		
		public OrganizationPage create()  {
			
			elementUtil.clickWhenReady(create, 10);
			
			return this;
		}
		public OrganizationPage createdetails(String sschoolname,String sorgtype,String scode,String sparentorg,String saddress1,String saddress2,String scity,String sstate,String szip,String scountry,String swebsite,String sattendence,String senvironment,String sphoneno,String smobileno,String semail,String sfax)
		{
		
			elementUtil.clickWhenReady(schoolname, 10);
			elementUtil.doSendKeys(schoolname, sschoolname);
			By orgtype = By.xpath("//label[normalize-space()='"+sorgtype+"']");
			elementUtil.clickWhenReady(orgtype, 10);
			elementUtil.doSendKeys(code, scode);
			//elementUtil.doSendKeys(parentorg, sparentorg);
			elementUtil.doSendKeys(address1, saddress1);
			elementUtil.doSendKeys(address2, saddress2);
			elementUtil.doSendKeys(city, scity);
			elementUtil.doSendKeys(state, sstate);
			elementUtil.clicktext(sstate);
			//elementUtil.clickWhenReady(statelist, 5);
			//elementUtil.clickWhenReady(state, 10);
			elementUtil.doSendKeys(zip, szip);
			elementUtil.doSendKeys(country, scountry);
			elementUtil.clicktext(scountry);
			elementUtil.doSendKeys(website, swebsite);
			if (sattendence.contains("yes")) {
				elementUtil.clickWhenReady(attendence, 30);
			}
			if (senvironment.contains("yes")) {
				elementUtil.clickWhenReady(environment, 30);
			}
			//elementUtil.clickWhenReady(attendence, 5);
			elementUtil.doSendKeys(phoneno, sphoneno);
			elementUtil.doSendKeys(mobileno, smobileno);
			elementUtil.doSendKeys(email, semail);
			elementUtil.doSendKeys(faxid, sfax);
						
			return this;
		}
		public OrganizationPage submit()
		{
			elementUtil.clickWhenReady(submit, 5);
			//System.out.println("Submit clicked");
			//driver.switchTo().alert().accept();
			return this;
		}
		public OrganizationPage discard()
		{
			elementUtil.clickWhenReady(discard, 5);
			//driver.switchTo().alert().accept();
			elementUtil.clickWhenReady(confirmation, 5);
			return this;
		}
		
}
