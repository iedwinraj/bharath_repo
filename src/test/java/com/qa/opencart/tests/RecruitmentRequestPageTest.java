package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class RecruitmentRequestPageTest extends BaseTest{
	
	@BeforeClass
	public void test() {
		SheetName="RecruitmentRequest";
		
	}
	
	@Test(invocationCount = 1  ,dataProvider="getdata"  )
	@Description("Select administration Organization menu  ...")
	@Severity(SeverityLevel.BLOCKER)
	
	public void recruitmentrequestcreate(String jobtitle, String description, String role, String minctc, String maxctc, String minexp, String maxexp, String qualification, String preferences)
	{
		loginPage=loginPage.selectdb();
		loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		recruitmentpage.click();
		recruitmentrequestpage.create(jobtitle,description,role,minctc,maxctc,minexp,maxexp,qualification,preferences);
	}

}
