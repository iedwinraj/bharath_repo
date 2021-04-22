package com.qa.opencart.pages;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

public class RecruitmentAnnexure {
	
	private static final Logger LOGGER = Logger.getLogger(String.valueOf(OrganizationPage.class));
	private WebDriver driver;
	private ElementUtil elementUtil;
	private JavaScriptUtil jsutil;
	private Properties prop;
	private WebDriverWait wait;
	
	public RecruitmentAnnexure(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
		jsutil = new JavaScriptUtil(this.driver);
	}
	private By annexuremenu = By.linkText("Annexure Details");
	private By  create= By.xpath("(//button[@type='button'])[5]");
	private By  save= By.xpath("(//button[@type='button'])[7]");
	private By  schoolname= By.xpath("//label[normalize-space()='School Name']//following::input");
	private By  ename= By.xpath("//label[normalize-space()='Employee Details']//following::input");
	private By  add1= By.xpath("(//label[normalize-space()='Employee Details']//following::input)[2]");
	private By  add2= By.xpath("(//label[normalize-space()='Employee Details']//following::input)[3]");
	private By  city= By.xpath("(//label[normalize-space()='Employee Details']//following::input)[4]");
	private By  state= By.xpath("(//label[normalize-space()='Employee Details']//following::input)[5]");
	private By  zip= By.xpath("(//label[normalize-space()='Employee Details']//following::input)[6]");
	private By  country= By.xpath("(//label[normalize-space()='Employee Details']//following::input)[7]");
	private By  dob= By.xpath("(//label[normalize-space()='Employee Details']//following::input)[8]");
	private By  designation= By.xpath("//label[normalize-space()='Designation']//following::input");
	private By  eemail= By.xpath("//label[normalize-space()='Employee Email']//following::input");
	private By  doj= By.xpath("//label[normalize-space()='Date of Joining']//following::input");
	private By  cperson= By.xpath("//label[normalize-space()='Contact Person']//following::div/span");
	
	private By  cemail= By.xpath("//label[normalize-space()='Contact Person Email']//following::input");
	private By  type= By.xpath("//label[normalize-space()='Type']//following::select");
	private By  basic= By.xpath("//label[normalize-space()='Basic + DA']//following::input");
	private By  hra= By.xpath("//label[normalize-space()='HRA']//following::input");
	private By  cca= By.xpath("//label[normalize-space()='CCA']//following::input");
	private By  ca= By.xpath("//label[normalize-space()='Conveyance Allowance']//following::input");
	private By  ma= By.xpath("//label[normalize-space()='Medical Allowance']//following::input");
	private By  pf= By.xpath("//label[normalize-space()='Provident Fund']//following::input");
	private By  esi= By.xpath("//label[normalize-space()='ESI']//following::input");
	private By  grosssalary= By.xpath("//label[normalize-space()='Total Gross Salary (I)']//following::input");
	private By  retirebenefit= By.xpath("//label[normalize-space()='Total Retiral Benefits (II)']//following::input");
	private By  cti= By.xpath("//label[normalize-space()='Cost to the Institution (I & II)']//following::input");
	
	
	
	public RecruitmentAnnexure createannexure (String sschoolname,String sename,String sdesignation,String sadd1,String sadd2,String scity,String sstate,String szip,String scountry,String sdob,String semail,String sdoj,String scperson,String stype,String scemail,String sbasic,String shra,String scca,String sca,String sma,String spf,String sesi,String sgrosssalary,String sretirebenefit,String scti) throws InterruptedException {
		
		By selectedcperson = By.xpath("//td[@data-field='name' and contains(text(),'"+scperson+"')]");
		elementUtil.ScrollAndClick(annexuremenu);		
		elementUtil.clickWhenReady(create, 30);
		Thread.sleep(3000);
		elementUtil.doSendKeys(schoolname, sschoolname.substring(0,2));
		elementUtil.clicktext(sschoolname);
		elementUtil.doSendKeys(ename, sename);
		elementUtil.doSendKeys(designation, sdesignation.substring(0, 2));
		elementUtil.clicktext(sdesignation);
		elementUtil.doSendKeys(add1,sadd1);
		elementUtil.doSendKeys(add2, sadd2);
		elementUtil.doSendKeys(city,scity );
		elementUtil.doSendKeys(state,sstate.substring(0, 3) );
		elementUtil.clicktext(sstate);
		elementUtil.doSendKeys(zip,szip );
		elementUtil.doSendKeys(country,scountry.substring(0, 2) );
		elementUtil.clicktext(scountry);
		elementUtil.doSendKeys(dob,sdob);
		elementUtil.doSendKeys(eemail,semail);
		elementUtil.doSendKeys(doj,sdoj);
		elementUtil.clickWhenReady(cperson, 30);
		elementUtil.clicktext("Search More...");
		
		elementUtil.clickWhenReady(selectedcperson,30);
		elementUtil.doDropDownSelectByVisibleText(type, stype);
		elementUtil.doSendKeys(cemail,scemail);
		elementUtil.doSendKeys(basic,sbasic);
		elementUtil.doSendKeys(hra,shra);
		elementUtil.doSendKeys(cca,scca);
		elementUtil.doSendKeys(ca,sca);
		elementUtil.doSendKeys(ma,sma);
		elementUtil.doSendKeys(pf,spf);
		elementUtil.doSendKeys(esi,sesi);
		elementUtil.doSendKeys(grosssalary,sgrosssalary);
		elementUtil.doSendKeys(retirebenefit,sretirebenefit);
		elementUtil.doSendKeys(cti,scti);
		jsutil.scrollPageUp();
		elementUtil.clickWhenReady(save, 20);
		
		return this;
	}
	
	
}
