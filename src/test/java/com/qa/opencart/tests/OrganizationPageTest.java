package com.qa.opencart.tests;

import java.sql.Driver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.pages.AdministrationPage;
import com.qa.opencart.utils.ElementUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class OrganizationPageTest extends BaseTest{
	@BeforeClass
	public void test() {
		SheetName="Organization";
		SheetNo="Sheet1";
		
	}
	@Test(invocationCount = 1  ,dataProvider="getdata"  )
	@Description("Create Organization   ...")
	@Severity(SeverityLevel.BLOCKER)
	
	public void createorganization(String sschoolname,String sorgtype,String scode,String sparentorg,String saddress1,String saddress2,String scity,String sstate,String szip,String scountry,String swebsite,String sattendence,String senvironment,String sphoneno,String smobileno,String semail,String sfax) 
	{
		
		loginPage=loginPage.selectdb();
		loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		dashboardPage.dashboard();
		administrationPage.organization();
		organizationPage.create();
		organizationPage.createdetails(sschoolname, sorgtype, scode, sparentorg, saddress1, saddress2, scity, sstate, szip, scountry, swebsite, sattendence, senvironment, sphoneno, smobileno, semail, sfax);
		organizationPage.submit();
		organizationPage.discard();
		
		
		
	}
}
