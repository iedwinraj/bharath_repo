package com.qa.opencart.pages;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.JavaScriptUtil;

public class OtherMastersPage {
	
	private static final Logger LOGGER = Logger.getLogger(String.valueOf(OrganizationPage.class));
	private WebDriver driver;
	private ElementUtil elementUtil;
	private Properties prop;
	private WebDriverWait wait;
	private JavaScriptUtil jutil;
		
	public OtherMastersPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);
		jutil= new JavaScriptUtil(this.driver);
		
	}
	
	private By create = By.xpath("(//button[@type='button'])[5]");
	private By scrollbar = By.xpath("//div[@class='slimScrollBar']");
	
	//Create Academic year
	private By  schoolname= By.xpath("//label[normalize-space()='School Name']//following::input");
	private By  startdate= By.xpath("//label[normalize-space()='Start Date']//following::input");
	private By  enddate= By.xpath("//label[normalize-space()='End Date']//following::input");
	private By  currentyear= By.xpath("//label[normalize-space()='Enable the Current/Next Academic Year']//following::input");
	private By  nextyear= By.xpath("//label[normalize-space()='Application for next Academic year']//following::input");
	private By  sequence= By.xpath("//label[normalize-space()='Sequence']//following::input");
	private By  monday= By.xpath("//label[normalize-space()='Monday']//following::input");
	private By  tuesday= By.xpath("//label[normalize-space()='Tuesday']//following::input");
	private By  wednesday= By.xpath("//label[normalize-space()='Wednesday']//following::input");
	private By  thursday= By.xpath("//label[normalize-space()='Thursday']//following::input");
	private By  friday= By.xpath("//label[normalize-space()='Friday']//following::input");
	private By  saturday= By.xpath("//label[normalize-space()='Saturday']//following::input");
	private By  sunday= By.xpath("//label[normalize-space()='Sunday']//following::input");
	private By  save= By.xpath("//button[text()='Save']");
	
	public OtherMastersPage createacademicyear(String sschoolname,String sstartdate, String senddate,String scurrentyear,String snextyear,String ssequence,String smonday,String stuesday,String swednesday,String sthursday, String sfriday,String ssaturday,String ssunday) throws InterruptedException {
		
		elementUtil.clicktext("Other Masters");
		elementUtil.clicktext("Academic Year");
		elementUtil.clickWhenReady(create, 30);
		Thread.sleep(3000);
		elementUtil.clickWhenReady(schoolname, 30);
		elementUtil.doSendKeys(schoolname, sschoolname.substring(0, 2));
		elementUtil.clicktext(sschoolname);
		elementUtil.doSendKeys(startdate, sstartdate);
		elementUtil.doSendKeys(enddate, senddate);
		if(scurrentyear.contains("no"))
			elementUtil.clickWhenReady(currentyear, 30);
		if(snextyear.contains("yes"))
			elementUtil.clickWhenReady(nextyear, 30);
		elementUtil.doSendKeys(sequence, ssequence);
		if(scurrentyear.contains("yes")) {
			
			if(smonday.contains("no"))
				elementUtil.clickWhenReady(monday, 30);
			if(stuesday.contains("no"))
				elementUtil.clickWhenReady(tuesday, 30);
			if(swednesday.contains("no"))
				elementUtil.clickWhenReady(wednesday, 30);
			if(sthursday.contains("no"))
				elementUtil.clickWhenReady(thursday, 30);
			if(sfriday.contains("no"))
				elementUtil.clickWhenReady(friday, 30);
			if(ssaturday.contains("yes"))
				elementUtil.clickWhenReady(saturday, 30);
			if(ssunday.contains("yes"))
				elementUtil.clickWhenReady(sunday, 30);
		}
		elementUtil.clickWhenReady(save, 30);
				
		return this;
	}
	
	
	//Create Shift
	
	private By shiftname = By.xpath("//label[normalize-space()='Shift Name']//following::input");
	private By shiftid = By.xpath("//label[normalize-space()='Shift ID']//following::input");
	
	public OtherMastersPage createshift(String sshiftname, String sshiftid) throws InterruptedException {
		
		elementUtil.clicktext("Other Masters");
		elementUtil.clicktext("Shift");
		elementUtil.clickWhenReady(create, 30);
		Thread.sleep(3000);	
		elementUtil.doSendKeys(shiftname, sshiftname);
		elementUtil.doSendKeys(shiftid, sshiftid);
		elementUtil.clickWhenReady(save, 30);
		return this;
	}
	
	private By streamname = By.xpath("//label[normalize-space()='Stream Name']//following::input");
	private By streamid = By.xpath("//label[normalize-space()='Stream ID']//following::input");
	
	public OtherMastersPage createstream(String sstreamname, String sstreamid) throws InterruptedException {
		
		elementUtil.clicktext("Other Masters");
		elementUtil.clicktext("Stream");
		elementUtil.clickWhenReady(create, 30);
		Thread.sleep(3000);	
		elementUtil.doSendKeys(streamname, sstreamname);
		elementUtil.doSendKeys(streamid, sstreamid);
		elementUtil.clickWhenReady(save, 30);
		return this;
	}
	
	//Create Board
	private By name = By.xpath("//label[normalize-space()='Name']//following::input");
	private By code = By.xpath("//label[normalize-space()='Code']//following::input");
	
	public OtherMastersPage createboard(String sschoolname, String sname, String scode) throws InterruptedException {
		
		elementUtil.clicktext("Other Masters");
		elementUtil.clicktext("Board");
		elementUtil.clickWhenReady(create, 30);
		Thread.sleep(3000);	
		elementUtil.doSendKeys(schoolname, sschoolname.substring(0, 2));
		elementUtil.clicktext(sschoolname);
		elementUtil.doSendKeys(name, sname);
		elementUtil.doSendKeys(code, scode);
		elementUtil.clickWhenReady(save, 30);
		return this;
	}
	
	//Create State
	
	private By statename = By.xpath("//label[normalize-space()='State Name']//following::input");
	private By country = By.xpath("//label[normalize-space()='Country']//following::select");
	private By statecode = By.xpath("//label[normalize-space()='State Code']//following::input");
	private By statecallingcode = By.xpath("//label[normalize-space()='State Calling Code']//following::input");
	
	public OtherMastersPage createstate(String sstatename, String scountry, String sstatecode, String sstatecallingcode) throws InterruptedException {
		
		elementUtil.clicktext("Other Masters");
		elementUtil.clicktext("State");
		elementUtil.clickWhenReady(create, 30);
		Thread.sleep(3000);	
		elementUtil.doSendKeys(statename, sstatename);
		elementUtil.doDropDownSelectByVisibleText(country, scountry);
		elementUtil.doSendKeys(statecode, sstatecode);
		elementUtil.doSendKeys(statecallingcode, sstatecallingcode);
		
		elementUtil.clickWhenReady(save, 30);
		return this;
	}
	
	//Create District
	private By districtname = By.xpath("//label[normalize-space()='District Name']//following::input");
	private By districtcode = By.xpath("//label[normalize-space()='District Code']//following::input");
	private By districtstate = By.xpath("//label[normalize-space()='State']//following::input");
	private By districtcountry = By.xpath("//label[normalize-space()='Country']//following::input");
	
	public OtherMastersPage createdistrict(String sdistrictname, String sdisctrictcode, String sdistrictstate, String scountry) throws InterruptedException {
		
		elementUtil.clicktext("Other Masters");
		elementUtil.clicktext("District");
		elementUtil.clickWhenReady(create, 30);
		Thread.sleep(3000);	
			
		elementUtil.doSendKeys(districtname, sdistrictname);
		elementUtil.doSendKeys(districtcode, sdisctrictcode);
		elementUtil.doSendKeys(districtstate, sdistrictstate.substring(0, 3));
		elementUtil.clicktext(sdistrictstate);
		elementUtil.doSendKeys(districtcountry, scountry.substring(0, 3));
		elementUtil.clicktext(scountry);
		elementUtil.clickWhenReady(save, 30);
		return this;
	}
		
	//Create Religion
	
	private By religionname = By.xpath("//label[normalize-space()='Religion Name']//following::input");
	private By religioncode = By.xpath("//label[normalize-space()='Religion Code']//following::input");
	
	public OtherMastersPage createreligion(String sreligionname, String sreligioncode) throws InterruptedException {
		
		elementUtil.clicktext("Other Masters");
		elementUtil.clicktext("Religion");
		elementUtil.clickWhenReady(create, 30);
		Thread.sleep(3000);	
		elementUtil.doSendKeys(religionname, sreligionname);
		elementUtil.doSendKeys(religioncode, sreligioncode);
		elementUtil.clickWhenReady(save, 30);
		return this;
		
	}
	
	//Create community
	
	private By communityname = By.xpath("//label[normalize-space()='Community Name']//following::input");
	private By communitycode = By.xpath("//label[normalize-space()='Community Code']//following::input");
	private By community = By.linkText("Community");
	
	public OtherMastersPage createcommunity(String scommunityname, String scommunitycode) throws InterruptedException {
		
		elementUtil.clicktext("Other Masters");
		
		while (elementUtil.checkWebElementNotPresent(community)) {
			elementUtil.doActionsClickAndScroll(scrollbar);
		}
		elementUtil.clicktext("Community");
		elementUtil.clickWhenReady(create, 30);
		Thread.sleep(3000);	
		elementUtil.doSendKeys(communityname, scommunityname);
		elementUtil.doSendKeys(communitycode, scommunitycode);
		elementUtil.clickWhenReady(save, 30);
		return this;
		
	}

	//Create nationality
	
	private By nationalityname = By.xpath("//label[normalize-space()='Name']//following::input");
	private By nationalitycode = By.xpath("//label[normalize-space()='Code']//following::input");
	private By nationality = By.linkText("Nationality");
	
	public OtherMastersPage createnationality(String snationalityname, String snationalitycode) throws InterruptedException {
		
		elementUtil.clicktext("Other Masters");
		
		while (elementUtil.checkWebElementNotPresent(nationality)) {
			elementUtil.doActionsClickAndScroll(scrollbar);
		}
		elementUtil.clicktext("Nationality");
		elementUtil.clickWhenReady(create, 30);
		Thread.sleep(3000);	
		elementUtil.doSendKeys(nationalityname, snationalityname);
		elementUtil.doSendKeys(nationalitycode, snationalitycode);
		elementUtil.clickWhenReady(save, 30);
		return this;
		
	}
	
	//Create BloodGroup
	
	private By bloodgroupname = By.xpath("//label[normalize-space()='Name']//following::input");
	private By bloodgroup = By.linkText("Blood Group");
	public OtherMastersPage createbloodgroup(String sbloodgroupname) throws InterruptedException {
		
		elementUtil.clicktext("Other Masters");
		while (elementUtil.checkWebElementNotPresent(bloodgroup)) {
			elementUtil.doActionsClickAndScroll(scrollbar);
		}
		elementUtil.clicktext("Blood Group");
		elementUtil.clickWhenReady(create, 30);
		Thread.sleep(3000);	
		elementUtil.doSendKeys(bloodgroupname, sbloodgroupname);		
		elementUtil.clickWhenReady(save, 30);
		return this;
		
	}
	
	//Create Enquiry Source
	
	private By enquirysourcepname = By.xpath("//label[normalize-space()='Enquiry Category Name']//following::input");
	private By enquirysource = By.linkText("Enquiry Source");
	
	public OtherMastersPage createenquirysource(String senquirysourcename) throws InterruptedException {
		
		elementUtil.clicktext("Other Masters"); 
		Thread.sleep(1000);
		while (elementUtil.checkWebElementNotPresent(enquirysource)) {
			elementUtil.doActionsClickAndScroll(scrollbar);
		}
		elementUtil.clicktext("Enquiry Source");
		elementUtil.clickWhenReady(create, 30);
		Thread.sleep(3000);	
		elementUtil.doSendKeys(enquirysourcepname, senquirysourcename);		
		elementUtil.clickWhenReady(save, 30);
		return this;
		
	}
	
	//Create Enquiry Follow-up status	
	private By enquirystatusname = By.xpath("//label[normalize-space()='Current Status']//following::input");
	private By enquiryfollowup = By.linkText("Enquiry Follow-up Status");
	
	public OtherMastersPage createeenquirystatus(String senquirystatusname) throws InterruptedException {
		
		elementUtil.clicktext("Other Masters"); 
		Thread.sleep(1000);
		while (elementUtil.checkWebElementNotPresent(enquiryfollowup)) {
			elementUtil.doActionsClickAndScroll(scrollbar);
		}
		elementUtil.clicktext("Enquiry Follow-up Status");
		elementUtil.clickWhenReady(create, 30);
		Thread.sleep(3000);	
		elementUtil.doSendKeys(enquirystatusname, senquirystatusname);		
		elementUtil.clickWhenReady(save, 30);
		return this;
		
	}
	
	//Create Enquiry Follow-up mode	
	private By enquirymodename = By.xpath("//label[normalize-space()='Mode']//following::input");
	private By enquiryfollowupmode = By.linkText("Enquiry Follow-up Mode");
	
	public OtherMastersPage createeenquirymode(String senquirymodename) throws InterruptedException {
		
		elementUtil.clicktext("Other Masters"); 
		Thread.sleep(1000);
		while (elementUtil.checkWebElementNotPresent(enquiryfollowup)) {
			elementUtil.doActionsClickAndScroll(scrollbar);
		}
		elementUtil.clicktext("Enquiry Follow-up Mode");
		elementUtil.clickWhenReady(create, 30);
		Thread.sleep(3000);	
		elementUtil.doSendKeys(enquirymodename, senquirymodename);		
		elementUtil.clickWhenReady(save, 30);
		return this;
		
	}
	
	//Create Admission Grade
		private By gradeschoolname = By.xpath("//input[@placeholder='School']");
		private By admissiongrademenu = By.linkText("Admission Grade Conf");
		private By ayear = By.xpath("//label[normalize-space()='Academic Year']//following::input");
		private By grade = By.xpath("//label[normalize-space()='Grade']//following::input");
		private By fromdate = By.xpath("//label[normalize-space()='From Date']//following::input");
		private By todate = By.xpath("//label[normalize-space()='To Date']//following::input");
		
		public OtherMastersPage createadmissiongrade(String sgradeschoolname,String sayear,String sgrade,String sfromdate,String stodate) throws InterruptedException {
			
			elementUtil.clicktext("Other Masters"); 
			Thread.sleep(1000);
			while (elementUtil.checkWebElementNotPresent(admissiongrademenu)) {
				elementUtil.doActionsClickAndScroll(scrollbar);
			}
			elementUtil.clicktext("Admission Grade Conf");
			elementUtil.clickWhenReady(create, 30);
			Thread.sleep(3000);	
			elementUtil.clickWhenReady(gradeschoolname, 30);
			elementUtil.doSendKeys(gradeschoolname, sgradeschoolname.substring(0, 2));
			elementUtil.clicktext(sgradeschoolname);			
			elementUtil.doSendKeys(ayear, sayear.substring(0, 2));
			elementUtil.clicktext(sayear);			
			elementUtil.doSendKeys(grade, sgrade);
			elementUtil.clicktext(sgrade);			
			elementUtil.doSendKeys(fromdate, sfromdate);
			elementUtil.doSendKeys(todate, stodate);			
			elementUtil.clickWhenReady(save, 30);
			return this;
			
		}
		
		//Create Cut-off Time
		
		private By cutoffschoolname = By.xpath("//label[normalize-space()='School Name']//following::input");
		private By cutofftime = By.xpath("//label[normalize-space()='Cut-Off Time']//following::input");
		private By cutoffmaster = By.linkText("Cut-Off Master");
		
		public OtherMastersPage createcutoff(String scutoffschoolname, String scutofftime) throws InterruptedException {
			
			elementUtil.clicktext("Other Masters"); 
			Thread.sleep(1000);
			while (elementUtil.checkWebElementNotPresent(cutoffmaster)) {
				elementUtil.doActionsClickAndScroll(scrollbar);
			}
			elementUtil.clicktext("Cut-Off Master");
			elementUtil.clickWhenReady(create, 30);
			Thread.sleep(3000);	
			elementUtil.doSendKeys(cutoffschoolname, scutoffschoolname.substring(0, 2));	
			elementUtil.clicktext(scutoffschoolname);
			elementUtil.doSendKeys(cutofftime, scutofftime);	
			elementUtil.clickWhenReady(save, 30);
			return this;
			
		}
	
}

	