package com.qa.opencart.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class CreateAcademicYearPageTest extends BaseTest{
	
	@BeforeClass
	public void test()
	{
		SheetName ="OMAcademicyear";
		SheetNo="Sheet1";
	}
	
	@Test(invocationCount = 1, dataProvider = "getdata")
	@Description("Creating new academic year....")
	@Severity(SeverityLevel.BLOCKER)
	
	public void createacademicyear(String sschoolname,String sstartdate, String senddate,String scurrentyear,String snextyear,String ssequence,String smonday,String stuesday,String swednesday,String sthursday, String sfriday,String ssaturday,String ssunday) throws InterruptedException {
		
		loginPage=loginPage.selectdb();
		loginPage=loginPage.login("erpadmin@harishree.org","Pappaya@2020");
		dashboardPage.dashboard();
		othermasterpage.createacademicyear(sschoolname, sstartdate, senddate, scurrentyear, snextyear, ssequence, smonday, stuesday, swednesday, sthursday, sfriday, ssaturday, ssunday);
		

		
	}

}
