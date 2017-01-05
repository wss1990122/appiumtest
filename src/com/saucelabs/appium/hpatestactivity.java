package com.saucelabs.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

import org.apache.bcel.verifier.exc.VerifierConstraintViolatedException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.io.*;
import java.text.*;
import java.util.*;

import android.os.RemoteException; 
import com.android.uiautomator.core.UiDevice;  
import com.android.uiautomator.core.UiObject;  
import com.android.uiautomator.core.UiObjectNotFoundException;  
import com.android.uiautomator.core.UiSelector;  
import com.android.uiautomator.testrunner.UiAutomatorTestCase;  
import android.webkit.WebSettings;
import android.webkit.WebView;

public class hpatestactivity {
	private AppiumDriver driver;
	
	@Before
    public void setUp() throws Exception {
        // set up appium
        File classpathRoot = new File(System.getProperty("user.dir"));
//        File appDir = new File(classpathRoot, "/apps");
//        File app = new File(appDir, "ContactManager.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("deviceName","192.168.129.101:5555");
        capabilities.setCapability("deviceName","NFGQNRBEGMEQZTQW");
        capabilities.setCapability("platformVersion", "5.1");
//        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.ytmallapp");
        capabilities.setCapability("appActivity", ".home.SplashActivity");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        
    }
	
	
	@Test
	public void activity(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
 	    //用户登录
//    List<AndroidElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
//    textFieldsList.get(0).sendKeys("wss1");
//    textFieldsList.get(1).sendKeys("111111");
//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	        
//    driver.findElementByName("点击登录").click();
//    	//关闭弹出框
//    driver.findElementByXPath("//android.widget.TextView[contains(@index,0)]").click();
		
	    //活动页点击
//	  driver.findElementByXPath("//android.view.View[contains(@index,0)]").click();
	  driver.findElementByClassName("android.support.v4.view.ViewPager").click();

		
		
		
	}
	
	
}
