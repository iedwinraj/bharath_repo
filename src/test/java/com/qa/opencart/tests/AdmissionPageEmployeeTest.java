package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class AdmissionPageEmployeeTest extends BaseTest {
	
	@BeforeClass
	public void test() {
		SheetName="AdmissionNewParent";
		SheetNo="Sheet2";
		
	}
	
	@Test(invocationCount = 1  ,dataProvider="getdata"  )
	@Description("Select administration Organization menu  ...")
	@Severity(SeverityLevel.BLOCKER)	
	
	public void employeechildadmission(String sname,String ayear, String grade, String gender, 	String enquirysource, String dob, String doj, String hostler, String sadmissiondate, String sdate, String sstation, String empname, String srelationship) throws InterruptedException
	{
		loginPage=loginPage.selectdb();
		loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		studentlifecyclepage.studentlifecyclepageclick();
		admissionpage.createadmission_employee(sname,ayear,grade,gender,enquirysource,dob,doj,hostler,sadmissiondate,sdate,sstation,empname, srelationship);
	}

}
