package com.mercury.test;
//this is me
import java.awt.AWTException;
import java.io.IOException;

import org.sikuli.script.FindFailed;





public class Driver {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException, FindFailed{
		
		
		MR mr1 = new MR();
		mr1.browserAppLaunch();
		mr1.login();
		//mr1.sikluliPractice();
		//mr1.autoitPractice();
	//	mr1.verifylogin();
		
		
    // mr1.browserClose();
			
	}

}
