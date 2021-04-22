package com.qa.opencart.pages;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

public class AdmissionPage {
	
	private static final Logger LOGGER = Logger.getLogger(String.valueOf(OrganizationPage.class));
	private WebDriver driver;
	private ElementUtil elementUtil;
	private Properties prop;
	private WebDriverWait wait;
	private JavaScriptUtil jsutil;
	
	public AdmissionPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
		jsutil=new JavaScriptUtil(driver);
	}
	
	private By admissionmenu = By.linkText("Admission");
	private By admissionsubmenu = By.linkText("Admissions");
	private By create = By.xpath("(//button[@type='button'])[5]");
	private By name = By.xpath("(//input[@type='text'])[3]");
	private By academicyear = By.xpath("//label[normalize-space()='Academic Year']//following::div/span");
	//private By academicyear2 = By.xpath("//label[normalize-space()='Academic Year']//following::input");
	private By selectedacdemicyear = By.linkText("2020 - 2021");
	private By gradename = By.xpath("//label[normalize-space()='Grade Name']//following::div/span");
	//private By gradename2 = By.xpath("//label[normalize-space()='Grade Name']//following::input");
	private By selectedgrade = By.linkText("Grade 2");
	private By gender = By.xpath("//label[normalize-space()='Gender']//following::select");
	private By enquirysource = By.xpath("//label[normalize-space()='Enquiry Source']//following::div/span");
	private By enquirysource2 = By.xpath("//label[normalize-space()='Enquiry Source']//following::input");
	private By selectedenquirysource = By.linkText("Walk In");
	private By dob = By.xpath("//label[normalize-space()='Date of Birth']//following::input");
	private By doj = By.xpath("//label[normalize-space()='Date of Joining']//following::input");
	private By hostler = By.xpath("//label[normalize-space()='Is Hosteler']");
	private By admissiondate = By.xpath("//label[normalize-space()='Admission Date']//following::input");
	private By date = By.xpath("//label[normalize-space()='Date']//following::input");
	private By station = By.xpath("//label[normalize-space()='Station']//following::input");
	private By parentfirstname = By.xpath("//label[normalize-space()='Parent First Name']//following::input");
	private By parentlastname = By.xpath("//label[normalize-space()='Parent Last Name']//following::input");
	private By address1 = By.xpath("//label[normalize-space()='Address']//following::input");
	private By address2 = By.xpath("(//label[normalize-space()='Address']//following::input)[2]");
	private By city = By.xpath("(//label[normalize-space()='Address']//following::input)[3]");
	private By district = By.xpath("(//label[normalize-space()='Address']//following::span)[5]");
	private By selecteddistrict= By.xpath("(//label[normalize-space()='Address']//following::input)[4]");
	private By selecteddistrict2= By.linkText("Kanchipuram");
	private By selectedstate2= By.linkText("Tamil Nadu");
	private By state = By.xpath("(//label[normalize-space()='Address']//following::span)[7]");
	private By selectedstate= By.xpath("(//label[normalize-space()='Address']//following::input)[5]");
	private By country = By.xpath("(//label[normalize-space()='Address']//following::input)[7]");
	private By selectedcountry = By.linkText("India");
	private By zipcode = By.xpath("(//label[normalize-space()='Address']//following::input)[6]");
	private By mobile = By.xpath("(//label[normalize-space()='Mobile']//following::input)");
	private By email = By.xpath("(//label[normalize-space()='Email']//following::input)");
	private By relationship = By.xpath("(//label[normalize-space()='Relation to Student']//following::select)");
	
	private By contacttype = By.id("radio179_from_emp");
	private By employeecheck = By.xpath("//label[normalize-space()='Is parent of Student Of an employee With Chettinad ?']");
	private By chettinademployee = By.xpath("//label[normalize-space()='Chettinad Employee']//following::div/span");
	private By employeetable = By.xpath("(//a[text()='Search More...'])[3]");
	
	private By proceed = By.xpath("(//button[@type='button'])[22]");
	
	
	public AdmissionPage createadmission(String sname, String sdob, String sdoj, String sadmissiondate, String sdate, String sstation, String pfirstname, String plastname, String saddress1, String saddress2, String scity, String szipcode, String pmobile, String pemail)
	{
		elementUtil.clickWhenReady(admissionmenu, 30);
		elementUtil.clickWhenReady(admissionsubmenu, 30);
		elementUtil.clickWhenReady(create, 30);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementUtil.doSendKeys(name, sname);
		elementUtil.clickWhenReady(academicyear, 30);
		elementUtil.clickWhenReady(selectedacdemicyear,20);
		elementUtil.clickWhenReady(gradename, 30);
		elementUtil.clickWhenReady(selectedgrade, 30);
		elementUtil.selectValueFromDropDown(gender, "Female");
		elementUtil.clickWhenReady(enquirysource, 30);
		elementUtil.clickWhenReady(selectedenquirysource, 30);
		elementUtil.doSendKeys(dob, sdob);
		elementUtil.doSendKeys(doj, sdoj);
		elementUtil.doSendKeys(admissiondate, sadmissiondate);
		elementUtil.doSendKeys(date, sdate);
		elementUtil.doSendKeys(station, sstation);
		
		elementUtil.doSendKeys(parentfirstname,pfirstname);
		elementUtil.doSendKeys(parentlastname, plastname);
		elementUtil.doSendKeys(address1, saddress1);
		elementUtil.doSendKeys(address2, saddress2);
		elementUtil.doSendKeys(city, scity);
		elementUtil.clickWhenReady(district, 30);
		elementUtil.doSendKeys(selecteddistrict, "kanchi");
		elementUtil.clickWhenReady(selecteddistrict2, 30);
		elementUtil.doSendKeys(selectedstate, "tamil");
		elementUtil.clickWhenReady(selectedstate2, 30);
		elementUtil.doSendKeys(zipcode, szipcode);
		elementUtil.doSendKeys(country, "Ind");
		elementUtil.clickWhenReady(selectedcountry, 30);
		elementUtil.doSendKeys(mobile, pmobile);
		elementUtil.doSendKeys(email, pemail);
		elementUtil.selectValueFromDropDown(relationship, "Father");
		jsutil.scrollPageUp();
		//jsutil.scrollIntoView(proceed);
		//elementUtil.clickWhenReady(proceed, 30);
		
		return this;
	}
	
	public AdmissionPage createadmission_employee(String sname,String ayear,  String grade, String sgender, String enquirysouce, String sdob, String sdoj, String hosteler, String sadmissiondate, String sdate, String sstation, String empname, String srelationship) throws InterruptedException
	{
		
		By employeename = By.xpath("//td[@data-field='name' and contains(text(),'"+empname+"')]");
		
		elementUtil.clickWhenReady(admissionmenu, 30);
		elementUtil.clickWhenReady(admissionsubmenu, 30);
		elementUtil.clickWhenReady(create, 30);
			Thread.sleep(5000);
		
		elementUtil.doSendKeys(name, sname);
		elementUtil.clickWhenReady(academicyear, 30);
		clicktext(ayear);
		elementUtil.clickWhenReady(gradename, 30);
		clicktext(grade);
		elementUtil.selectValueFromDropDown(gender, sgender);
		elementUtil.clickWhenReady(enquirysource, 30);
		clicktext(enquirysouce);
		elementUtil.doSendKeys(dob, sdob);
		elementUtil.doSendKeys(doj, sdoj);
		if (hosteler.contains("yes")) 
			{
				elementUtil.clickWhenReady(hostler, 30);	
				System.out.println("Hostler value is yes");
			}
		elementUtil.doSendKeys(admissiondate, sadmissiondate);
		elementUtil.doSendKeys(date, sdate);
		elementUtil.doSendKeys(station, sstation);
		elementUtil.clickWhenReady(contacttype, 20);
		elementUtil.clickWhenReady(employeecheck, 20);
		elementUtil.clickWhenReady(chettinademployee, 50);
		elementUtil.clickWhenReady(employeetable, 20);
		elementUtil.clickWhenReady(employeename, 30);
		elementUtil.doDropDownSelectByVisibleText(relationship, srelationship);
		//clicktext(empname);
		
		return this;
	}
	
	public void clicktext(String text2) {
		By clicktext = By.linkText(text2);
		elementUtil.clickWhenReady(clicktext, 30);
	}

}
