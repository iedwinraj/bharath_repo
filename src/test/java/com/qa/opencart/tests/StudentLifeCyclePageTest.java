package com.qa.opencart.tests;

import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class StudentLifeCyclePageTest extends BaseTest{
	@Test(invocationCount=1)
	@Description("Select administration Organization menu  ...")
	@Severity(SeverityLevel.BLOCKER)
	
	public void StudentLifeCycle()
	{
		loginPage=loginPage.selectdb();
		loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		  
		  //dashboardPage.dashboard();
		  studentlifecyclepage.studentlifecyclepageclick();
		  studentlifecyclepage.enquiryentryclick();
		  studentlifecyclepage.enquirysubmenuclick();
		  studentlifecyclepage.createenquiry(); 
		  //createenquiryentry.details();
		 		 	
	}

}
