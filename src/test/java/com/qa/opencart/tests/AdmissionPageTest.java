package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class AdmissionPageTest extends BaseTest{
	
	@BeforeClass
	public void test() {
		SheetName="AdmissionNewParent";
		SheetNo="Sheet1";
		
	}
	
	@Test(invocationCount = 1  ,dataProvider="getdata"  )
	@Description("Select administration Organization menu  ...")
	@Severity(SeverityLevel.BLOCKER)
	
	public void createadmission(String sname, String sdob, String sdoj, String sadmissiondate, String sdate, String sstation, String pfirstname, String plastname, String saddress1, String saddress2, String scity, String szipcode, String pmobile, String pemail)
	{
		loginPage=loginPage.selectdb();
		loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		studentlifecyclepage.studentlifecyclepageclick();
		admissionpage.createadmission(sname,sdob,sdoj,sadmissiondate,sdate,sstation,pfirstname,plastname,saddress1,saddress2,scity,szipcode,pmobile,pemail);
		
	}
	

	
	

}
