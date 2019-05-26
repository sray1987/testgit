package com.mercury.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.tools.DocumentationTool.Location;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

import com.google.common.io.Files;


public class MR {

	WebDriver driver;

	// ===============================================================================
	
	public void browserAppLaunch() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://newtours.demoaut.com/");
		//driver.get("https://opensource-demo.orangehrmlive.com");
		driver.get("https://acs63-us.ats.adobe.com");
	}

	public void login() throws IOException, InterruptedException, AWTException {
		/*WebElement uName = driver.findElement(By.xpath("//input[@name='userName']"));
		uName.sendKeys("dasd");

		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("dasd");
		WebElement signIn = driver.findElement(By.xpath("//input[@name='login']"));
		signIn.click();
        WebElement signOFF = driver.findElement(By.xpath("//a[@href='mercurysignoff.php']"));
        signOFF.click();*/
	
        
        
     /*WebElement conTinue = driver.findElement(By.xpath("//input[@name='findFlights']"));
    conTinue.click();
    WebElement DEPART = driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']"));
    DEPART.click();
    WebElement RETURN = driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']"));
    RETURN.click();
    WebElement Reserve = driver.findElement(By.xpath("//input[@name='reserveFlights']"));
    Reserve.click();
    WebElement firstName = driver.findElement(By.xpath("//input[@name='passFirst0']"));
    firstName.sendKeys("Tony");
    WebElement lastName = driver.findElement(By.xpath("//input[@name='passLast0']"));
    lastName.sendKeys("Stark");
   WebElement numBer = driver.findElement(By.xpath("//input[@name='creditnumber']"));
   numBer.sendKeys("1234567887654321");
   WebElement securePurchase = driver.findElement(By.xpath("//input[@name='buyFlights']"));
   securePurchase.click(); 
   Thread.sleep(5000);*/
   //WebElement backToflights = driver.findElement(By.xpath("//img[@src='/images/forms/backtoflights.gif']"));
  // backToflights.click();
   //WebElement backTohome = driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']"));
  // backTohome.click();
  //WebElement logOUT = driver.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']"));
  //logOUT.click();
		
   
   
	/*WebElement oneWay = driver.findElement(By.xpath(".//input[@value='oneway']"));
	oneWay.click();
	WebElement conTinue = driver.findElement(By.xpath(".//input[@name='findFlights']"));
	conTinue.click();
	WebElement dePart = driver.findElement(By.xpath(".//input[@value='Pangea Airlines$362$274$9:17']"));
	dePart.click();
	WebElement reServe = driver.findElement(By.xpath(".//input[@name='reserveFlights']"));
	reServe.click();
	WebElement securePurchase1 = driver.findElement(By.xpath(".//input[@name='buyFlights']"));*/
	//securePurchase1.click();

   
  // File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  // Files.copy(src, new File("./screenshots/test1.png"));
   
   
 //File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//com.google.common.io.Files.copy(src, new File("./screenshots/snap14.jpg"));
	//Files.copy(src, new File("./screenshots/snap5.jpg")); 
		
		/*WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
		login.click();
       WebElement uname = driver.findElement(By.name("userName"));
		uname.sendKeys("dasd");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("dasd");
		WebElement login = driver.findElement(By.name("login"));
		login.click();*/
		
		
		
		
//////////////////////////////////////// WEB DRIVER ORANGE TEST //////////////////////////////////////////////////
		
		    /*WebElement uname = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		   	uname.sendKeys("Admin");
		     WebElement pwd = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		     pwd.sendKeys("admin123");
		     WebElement login = driver.findElement(By.xpath("//input[@name='Submit']"));
				login.click();*/
			//WebElement admin = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
			//admin.click();
			//WebElement btnAdd = driver.findElement(By.xpath("//input[@name='btnAdd']"));
			//btnAdd.click();
			
			
		//	WebElement welcome = driver.findElement(By.xpath("//a[@id='welcome']"));
			//welcome.click();
			
			//WebElement about = driver.findElement(By.xpath("//a[@id='aboutDisplayLink']"));
			//about.click();
			
		//	Thread.sleep(3000);
				
			//WebElement loGout = driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']"));
			//loGout.click();
			/*Select user = new Select(driver.findElement(By.xpath("//select[@name='systemUser[userType]']")));
	        user.selectByVisibleText("ESS");
			
	        Thread.sleep(3000);
	        
			WebElement empName = driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']"));
			empName.sendKeys("TESTESSUSER");
			WebElement userName = driver.findElement(By.xpath("//input[@id='systemUser_userName']"));
			userName.sendKeys("essuser001");
			
			Select Status = new Select(driver.findElement(By.xpath("//select[@id='systemUser_status']")));
			Status.selectByVisibleText("Disabled");*/
			
			//Thread.sleep(3000);
			
			/*WebElement pWord = driver.findElement(By.xpath("//input[@id='systemUser_password']"));
			pWord.sendKeys("Strong@321");
			WebElement cpWord = driver.findElement(By.xpath("//input[@id='systemUser_confirmPassword']"));
			cpWord.sendKeys("Strong@321");*/
			
			//WebElement save = driver.findElement(By.xpath("//input[@name='btnSave']"));
			//save.click();
		   // WebElement cancel = driver.findElement(By.xpath("//input[@id='btnCancel']"));
		   // cancel.click();
			
			//Delete scenario
		/*	WebElement delete = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_6']"));
			delete.click();
			WebElement delete1 = driver.findElement(By.xpath("//input[@id='btnDelete']"));
			delete1.click();
			Thread.sleep(3000);
			WebElement cancel1 = driver.findElement(By.xpath("//input[@class='btn reset']"));
			cancel1.click();*/
			
			//// Job title scenario
			
			/*WebElement Job = driver.findElement(By.xpath("//a[@id='menu_admin_Job']"));
			Job.click();
			WebElement jobTitle = driver.findElement(By.xpath("//a[@id='menu_admin_viewJobTitleList']"));
			jobTitle.click();*/
			
			//Job title add scenario
			
		/*	WebElement Job = driver.findElement(By.xpath("//a[@id='menu_admin_Job']"));
			Job.click();
			WebElement jobTitle = driver.findElement(By.xpath("//a[@id='menu_admin_viewJobTitleList']"));
			jobTitle.click();
		    WebElement jobadd = driver.findElement(By.xpath("//input[@name='btnAdd']"));
		    jobadd.click();
		    WebElement title = driver.findElement(By.xpath("//input[@id='jobTitle_jobTitle']"));
		    title.sendKeys("testTitle");
		    Thread.sleep(3000);
		    WebElement titlesave = driver.findElement(By.xpath("//input[@id='btnSave']"));
		    titlesave.click();*/
		    
		    //Job title delete sccenario
		   /* WebElement Job = driver.findElement(By.xpath("//a[@id='menu_admin_Job']"));
			Job.click();
			WebElement jobTitle = driver.findElement(By.xpath("//a[@id='menu_admin_viewJobTitleList']"));
			jobTitle.click();
			Thread.sleep(3000);
			WebElement titleselect = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_14']"));
			titleselect.click();
			WebElement titletodelete = driver.findElement(By.xpath("//input[@id='btnDelete']"));
			titletodelete.click();
			Thread.sleep(3000);
			WebElement titlefinaldelete = driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']"));
			titlefinaldelete.click();
			//WebElement titlecancel = driver.findElement(By.xpath("//input[@class='btn reset']"));
			//titlecancel.click();*/
			
			///Employement status launch
			
			  /*WebElement Job = driver.findElement(By.xpath("//a[@id='menu_admin_Job']"));
				Job.click();
				
				Thread.sleep(3000);
			
			WebElement empstatus = driver.findElement(By.xpath("//a[@id='menu_admin_employmentStatus']"));
			empstatus.click();*/
		    
			/// Employment status add 
			
		/*	WebElement Job = driver.findElement(By.xpath("//a[@id='menu_admin_Job']"));
			Job.click();
			
			Thread.sleep(3000);
		WebElement empstatus = driver.findElement(By.xpath("//a[@id='menu_admin_employmentStatus']"));
		empstatus.click();
		WebElement empstatusadd = driver.findElement(By.xpath("//input[@name='btnAdd']"));
		empstatusadd.click();
		Thread.sleep(3000);
		WebElement empstatusnew = driver.findElement(By.xpath("//input[@id='empStatus_name']"));
		empstatusnew.sendKeys("newtestempstatus");
		WebElement empstatussave = driver.findElement(By.xpath("//input[@id='btnSave']"));
		empstatussave.click();
		//WebElement empstatuscancel = driver.findElement(By.xpath("//input[@id='btnCancel']"));
		//empstatuscancel.click();*/
	
		///Employment status delete
		
		/*WebElement Job = driver.findElement(By.xpath("//a[@id='menu_admin_Job']"));
		Job.click();
		
		Thread.sleep(3000);
	WebElement empstatus = driver.findElement(By.xpath("//a[@id='menu_admin_employmentStatus']"));
	empstatus.click();
	WebElement empstatusselect = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_7']"));
	empstatusselect.click();
	WebElement empstatusdelete = driver.findElement(By.xpath("//input[@id='btnDelete']"));
	empstatusdelete.click();
	Thread.sleep(3000);
	WebElement empstatusdeletefinal = driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']"));
	empstatusdeletefinal.click();
	//WebElement empstatuscancel = driver.findElement(By.xpath("//input[@class='btn reset']"));
	//empstatuscancel.click();*/
	 
	//// Qualifications launch + skill add and delete
	
	/*WebElement qualification = driver.findElement(By.xpath("//a[@id='menu_admin_Qualifications']"));
	qualification.click();
	WebElement skillscheck = driver.findElement(By.xpath("//a[@id='menu_admin_viewSkills']"));
	skillscheck.click();*/
	//Thread.sleep(3000);
	/*WebElement skillsadd = driver.findElement(By.xpath("//input[@id='btnAdd']"));
	skillsadd.click();
	WebElement skillname = driver.findElement(By.xpath("//input[@id='skill_name']"));
	skillname.sendKeys("testskill");
	WebElement skillsave = driver.findElement(By.xpath("//input[@id='btnSave']"));
	skillsave.click();*/
    //WebElement skillcancel = driver.findElement(By.xpath("//input[@id='btnCancel']"));
	//skillcancel.click();
	
	
	/*WebElement skillselect = driver.findElement(By.xpath("//input[@class='checkboxAtch']"));
	skillselect.click();
	WebElement skilldelete = driver.findElement(By.xpath("//input[@id='btnDel']"));
	skilldelete.click();*/
	
	//Thread.sleep(3000);
	
	/////Employee list module launch + add and delete
	
	
	/*WebElement pim = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
	pim.click();
	WebElement emplist = driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']"));
	emplist.click();
	WebElement emplistadd = driver.findElement(By.xpath("//input[@name='btnAdd']"));
	emplistadd.click();
	WebElement empfirstname = driver.findElement(By.xpath("//input[@id='firstName']"));
	empfirstname.sendKeys("test");
	WebElement empmiddlename = driver.findElement(By.xpath("//input[@id='middleName']"));
	empmiddlename.sendKeys("emp");
	WebElement emplastname = driver.findElement(By.xpath("//input[@id='lastName']"));
	emplastname.sendKeys("list001");
	WebElement empid = driver.findElement(By.xpath("//input[@id='employeeId']"));
	empid.sendKeys("408245");
	Thread.sleep(3000);*/
	
	/*WebElement choosefile = driver.findElement(By.xpath("//input[@id='photofile']"));
	choosefile.click();
	Thread.sleep(10000);*/
	//WebElement savefile = driver.findElement(By.xpath("//input[@id='btnSave']"));
	//savefile.click();
	//WebElement deletefile = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_40']"));
	//deletefile.click();
	//WebElement deleteconfirm = driver.findElement(By.xpath("//input[@id='btnDelete']"));
	//deleteconfirm.click();
	//WebElement deletefinal = driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']"));
	//deletefinal.click();
	
	/*String str="C:\\Users\\sutirtha\\Desktop\\pic.jpg";
	StringSelection upload = new StringSelection(str);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(upload,null);*/
	
	
	/*Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(3000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyPress(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_COLON);
	robot.keyRelease(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_SLASH);*/
	
	
   /* WebElement save = driver.findElement(By.xpath("//input[@type='button']"));
    save.click();*/
	
	
	
//	choosefile.sendKeys("C:/Users/Sutirtha/Desktop/pic.JPG");
	
	
	//////////////report module launch+add +delete
				
 /*WebElement pim = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
	pim.click();
	WebElement report = driver.findElement(By.xpath("//a[@id='menu_core_viewDefinedPredefinedReports']"));
	report.click();
	WebElement reportadd = driver.findElement(By.xpath("//input[@id='btnAdd']"));
	reportadd.click();
	WebElement reportaddname = driver.findElement(By.xpath("//input[@id='report_report_name']"));
	reportaddname.sendKeys("testreport");
	Select criteria1 = new Select(driver.findElement(By.xpath("//select[@id='report_criteria_list]")));
	criteria1.selectByVisibleText("Pay Grade");
	Thread.sleep(3000);
	for(int sutirtha=0; sutirtha<4;sutirtha++)
		WebElement add = driver.findElement(By.xpath("//a[@id='btnAddConstraint']"));
		add.click();*/
	//	for (int i=0; i<2;i++);
		/*Thread.sleep(3000);
	 include = driver.findElement(By.xpath("//select[@id='report_include_comparision']"));
	include.click();
	WebElement value = driver.findElement(By.xpath("//option[@value='3']"));
	value.click();
		WebElement name01 = driver.findElement(By.xpath("//input[@id='employee_name_empName']"));
		name01.sendKeys("Linda Anderson");
	WebElement employee= driver.findElement(By.xpath("//a[@id='btnAddDisplayField']"));
	employee.click();
	WebElement checkbox = driver.findElement(By.xpath("//input[@id='display_group_1']"));
	checkbox.click();
	
	WebElement save = driver.findElement(By.xpath("//input[@id='btnSave']"));
	save.click();*/
	
		    	
	////////////////////////////// CANDIDATE MODULE LAUNCH+ADD+DELETE ////////////////////////
				
	/*WebElement recruitment = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
	recruitment.click();
	WebElement candidate = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewCandidates']"));
	candidate.click();
	Thread.sleep(3000);
	WebElement add = driver.findElement(By.xpath("//input[@name='btnAdd']"));
	add.click();
	WebElement fname = driver.findElement(By.xpath("//input[@id='addCandidate_firstName']"));
	fname.sendKeys("test fname");
	WebElement lname = driver.findElement(By.xpath("//input[@id='addCandidate_lastName']"));
	lname.sendKeys("test lname");
	WebElement email = driver.findElement(By.xpath("//input[@id='addCandidate_email']"));
	email.sendKeys("noemail1@email.com");
	WebElement sav = driver.findElement(By.xpath("//input[@id='btnSave']"));
	sav.click();
	Thread.sleep(3000);
	WebElement candidate1 = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewCandidates']"));
	candidate1.click();
	WebElement del = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_4_']"));
	del.click();
	WebElement remove = driver.findElement(By.xpath("//input[@id='btnDelete']"));
	remove.click();
	Thread.sleep(3000);
	WebElement value = driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']"));
	value.click();
	WebElement logoff = driver.findElement(By.xpath("//a[@id='welcome']"));	
	logoff.click();
	Thread.sleep(3000);
	WebElement logout1 = driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']"));
	logout1.click();*/
	
	
				//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				//com.google.common.io.Files.copy(src, new File("./screenshots/snap14.jpg"));s
				//Files.copy(src, new File("./screenshots/orangetestTC19.1.jpg"));
				
				
				/*Screen screen = new Screen();
			    Pattern btnLogin = new Pattern("./sikulifiles/btnLogin.png");
			    screen.click(btnLogin);*/
						
				//Robot r1 = new Robot();
				/*r1.keyPress(KeyEvent.VK_TAB);
				r1.keyPress(KeyEvent.VK_TAB);
				r1.keyPress(KeyEvent.VK_TAB);
				r1.keyPress(KeyEvent.VK_SHIFT);
				r1.keyPress(KeyEvent.VK_A);
				r1.keyRelease(KeyEvent.VK_SHIFT);
				r1.keyPress(KeyEvent.VK_D);
				r1.keyPress(KeyEvent.VK_M);
				r1.keyPress(KeyEvent.VK_I);
				r1.keyPress(KeyEvent.VK_N);
				r1.keyPress(KeyEvent.VK_TAB);
				r1.keyPress(KeyEvent.VK_A);
				r1.keyPress(KeyEvent.VK_D);
				r1.keyPress(KeyEvent.VK_M);
				r1.keyPress(KeyEvent.VK_I);
				r1.keyPress(KeyEvent.VK_N);
				r1.keyPress(KeyEvent.VK_1);
				r1.keyPress(KeyEvent.VK_2);
				r1.keyPress(KeyEvent.VK_3);
			    r1.keyPress(KeyEvent.VK_TAB);
			    r1.keyPress(KeyEvent.VK_TAB);
			    r1.keyPress(KeyEvent.VK_ENTER);*/
				
				/*Webelement uname = driver.findElement(By.xpath)
				WebElement signon = driver.findElement(By.xpath("//a[contains(text(),'SIGN-ON')]"));
				signon.click();
				WebElement click = driver.findElement(By.xpath("//a[@id='menu_Performance']"));*/
				
			
				//Thread.sleep(3000);
				
				//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				//com.google.common.io.Files.copy(src, new File("./screenshots/snap14.jpg"));
				//Files.copy(src, new File("./screenshots/snap5.jpg"));
				
				
		
			
		//Thread.sleep(3000);

//////////////////////////ADOBE CAMPAIGN STANDARD////////////////////////////
		
//login+logout//

 // WebElement username = driver.findElement(By.xpath("//input[@id='adobeid_username']"));
//  username.sendKeys("hote073@adobe.com");
 // Thread.sleep(10000);
  WebElement passWord = driver.findElement(By.xpath("//input[@id='adobeid_password']"));
  passWord.click();
  passWord.sendKeys("Kb8#RbBpcmyj@2019");
  WebElement username = driver.findElement(By.xpath("//input[@id='adobeid_username']"));
  username.sendKeys("hote073@adobe.com");
  WebElement checkbox = driver.findElement	(By.xpath("//span[@class='checkbox-mark needsclick']"));
  checkbox.click();
  Thread.sleep(3000);
  WebElement signin = driver.findElement(By.xpath("//button[@id='sign_in']"));
  signin.click();
  Thread.sleep(10000);
 WebElement cbox = driver.findElement(By.xpath("//input[@id='seq1']"));
  cbox.click();
  WebElement close = driver.findElement(By.xpath("//span[@class='so-Button__label']"));
  close.click();
  WebElement user = driver.findElement(By.xpath("//button[@is='coral-button']"));
  user.click();
  Thread.sleep(3000);
  WebElement logout = driver.findElement(By.xpath("//a[@href='/view/home?disconnect=true&__securitytoken=DMyD1PKcd9iureFdL47hYdidkEKnrjGFd9z1VGVSYb0rZbmgDctYmzY1Ip5fehwnLjvKHJ5WIJJTz_nR4GR_ybfq0-o3xKbrWOuLE3Rg18gEhk09KWyBi8jtBdfa2LY6M07TU6VGcfHYL_gRHeEbdk2BzRQ=']"));
  logout.click();

	}
	
	//@SuppressWarnings("unused")
	
	
	//////////////////////////ADOBE CAMPAIGN STANDARD////////////////////////////
	
  //login+logout//
	
	
	
	
	
	
	
	
	
	
	
	////////////////////////////////////////  SIKULI ///////////////////////////////////////////////////////////
	
	public void sikluliPractice() throws FindFailed, AWTException, IOException, InterruptedException {
	WebElement uname = driver.findElement(By.xpath("//input[@name='txtUsername']"));
	uname.sendKeys("Admin");
	WebElement pwd = driver.findElement(By.xpath("//input[@name='txtPassword']"));
	pwd.sendKeys("admin123");
		
	/*Screen screen = new Screen();
	Pattern uName = new Pattern("./sikulifiles/uName.png");
	screen.click(uName);
	Robot r2 = new Robot();
	r2.keyPress(KeyEvent.VK_SHIFT);
	r2.keyPress(KeyEvent.VK_A);
	r2.keyRelease(KeyEvent.VK_SHIFT);
	r2.keyPress(KeyEvent.VK_D);
	r2.keyPress(KeyEvent.VK_M);
	r2.keyPress(KeyEvent.VK_I);
	r2.keyPress(KeyEvent.VK_N);
	Pattern passWord = new Pattern("./sikulifiles/passWord.png");
	screen.click(passWord);
    r2.keyPress(KeyEvent.VK_A);
	r2.keyPress(KeyEvent.VK_D);
	r2.keyPress(KeyEvent.VK_M);
	r2.keyPress(KeyEvent.VK_I);
	r2.keyPress(KeyEvent.VK_N);
	r2.keyPress(KeyEvent.VK_1);
	r2.keyPress(KeyEvent.VK_2);
	r2.keyPress(KeyEvent.VK_3);*/
	
	/*Screen screen = new Screen();
	Pattern uName2 = new Pattern("./sikulifiles/uName2.png");
	screen.click(uName2);
	
	screen.paste("dasd");
	
	Pattern passWord2 = new Pattern("./sikulifiles/passWord2.png");
	screen.click(passWord2);
	
	screen.paste("dasd");
	
	Pattern signIn = new Pattern("./sikulifiles/signIn.png");
	screen.click(signIn);
	
	Thread.sleep(15000);
	
	Pattern signoff2 = new Pattern(".//sikulifiles/signoff2.PNG");
	screen.click(signoff2);*/
	
	
	
	
	/*Pattern roundTrip = new Pattern(".//sikulifiles/roundTrip.png");
	screen.click(roundTrip);
	Pattern conT = new Pattern(".//sikulifiles/conT.png");
	screen.click(conT);
	Thread.sleep(15000);
	Pattern depArt = new Pattern(".//sikulifiles/depArt.png");
	screen.click(depArt);
	Pattern cont1 = new Pattern(".//sikulifiles/cont1.png");
	screen.click(cont1);*/
	
	
    //Pattern signOff3 = new Pattern("./sikulifiles/signOff3.png");
    //screen.mouseMove(signOff2);
    
  //screen.click(signOff3);
    
    //screen.mouseUp();
    
   // Pattern performance = new Pattern("./sikulifiles/peformance.png");
   // screen.mouseMove(performance);
    
    
    
   
    //File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  //Files.copy(src, new File("./screenshots/snap15.jpg"));
  
  /*Actions actions = new Actions(driver);
  WebElement welcome = driver.findElement(By.xpath(".//a[@id='welcome']"));
  actions.moveToElement(welcome);*/
  
  
  
 /* WebElement logout = driver.findElement(By.xpath("//input[@name='txtPassword']"));
	pwd.sendKeys("admin123");*/
	
	
    //Pattern aDmin = new Pattern("./sikulifiles.aDmin.png");
    
    //screen.click(aDmin);
	//Pattern btnLogout = new Pattern("./sikulifiles/btnLogout.png");
	//screen.click(btnLogout);
    
	
	/*Pattern passWord = new Pattern("./sikulifiles/passWord.png");
	screen.click(passWord);
	r2.keyPress(KeyEvent.VK_A);
    Pattern btnLogin = new Pattern("./sikulifiles/btnLogin.png");
    screen.click(btnLogin);*/
	}
	
//////////////////////////////////////////////// AUTO IT ///////////////////////////////////////////////////////////
	
	public void autoitPractice() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://imgbb.com/");
		
		WebElement btnStartUpload = driver.findElement(By.xpath("//a[@class='btn btn-big blue']"));
		btnStartUpload.click();
		
	
		Runtime.getRuntime().exec("./autoitexe/rayscript04212019.exe");
	
		Thread.sleep(10000);
	WebElement upload = driver.findElement(By.xpath("//button[@class='btn btn-big green']"));
	upload.click();
	
	
	
	
	}	

	
}
////////////////////////////////////verify login//////////////////////
/*public void verifylogin()
{
	String expTitle = "Find a Flight: Mercury Tours:";
	String actTitle = driver.getTitle();
	System.out.println("System returns the page title: "+actTitle);
	if(actTitle.equals(expTitle))
	{
		System.out.println("Test case passed");
	}
	else
	{
		System.out.println("Test case failed");
	}
	}




//////////////////////////////////////////browser close
public void browserClose()
{
	driver.close();
}
}	*/

///////////////////////////////////////////browser static close

//public void browserCloseStatic()
//{
// driver.close();


//////////////////////////////////////////////////////////////////
/* Verify Login */

/*public void verifyLogin()
{
	String expTitle = "Find a Flight: Mercury Tours:";
	String actTitle = driver.getTitle();
	
	System.out.println("System returns the page title: "+ actTitle);
	
	if(actTitle.equals(expTitle))
	{
		System.out.println("Test case passed");
	}
	else
	{
		System.out.println("Test case failed");
	}
	
}*/


////////////////////////////////////////////////////////////////////////////////////

/* Verify Login with boolean return type*/
		
		/*public boolean verifyLoginWithReturn()
		{
			String actTitle = "Find a Flight: Mercury Tours:";
			String expTitle = driver.getTitle();
			
			System.out.println("System returns the page title: "+ expTitle);
			
			if(actTitle.equals(expTitle))
			{
				return true;
				//System.out.println("Test case passed");
			}
			else
			{
				//System.out.println("Test case failed");
				return false;
			}
			
		}*/

//////////////////////////////////////////////////////////////////////////////////////////
/*
 * Simple login process with parameter
 /*public void loginMercuryWithParameter(String uname, String password) throws IOException, InterruptedException {
	
	WebElement uName = driver.findElement(By.xpath("//input[@name='userName']"));
	
	//WebElement uName = driver.findElement(By.name("userName"));
	uName.sendKeys(uname);
	
	WebElement pwd = driver.findElement(By.name("password"));	
	//WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
	pwd.sendKeys(password);

	WebElement login = driver.findElement(By.name("login"));
	//WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
	login.click();

	Thread.sleep(3000);
}


public static void browserCloseStatic()
{
	driver.close();
}
*/
//////////////////////////////////////////////////////////////////////////////////////////////
// Iframe Handling

/*public void frameHandling() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 	driver = new ChromeDriver();
	 	driver.manage().window().fullscreen();
   	driver.get("http://demo.guru99.com/test/guru99home/");
   	Thread.sleep(6000); 
   	
   	JavascriptExecutor js = (JavascriptExecutor) driver;
   	js.executeScript("window.scrollBy(0,2300)");
   	Thread.sleep(6000);  
   	
   	driver.switchTo().frame("a077aa5e");
   	Thread.sleep(4000); 
   	
   	WebElement linkbtn = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
   	linkbtn.click();
   	
   	driver.switchTo().defaultContent();
   	
   	/* Iframe Identification */
   	
   /*	int size = driver.findElements(By.tagName("iframe")).size();
   	System.out.println(size);
   	
   	List<WebElement> ele = driver.findElements(By.tagName("iframe"));
       System.out.println("Number of frames in a page :" + ele.size());
       for(WebElement el : ele){
           System.out.println("Frame Id :" + el.getAttribute("id"));
           System.out.println("Frame name :" + el.getAttribute("name"));
       }
}
*/