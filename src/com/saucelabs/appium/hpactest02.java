package com.saucelabs.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

import org.apache.bcel.verifier.exc.VerifierConstraintViolatedException;
import org.apache.commons.exec.OS;
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

public class hpactest02 {
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
        
        Runtime.getRuntime().exec("cmd /k start E:\\py\\startAppiumServer.bat");
        TimeUnit.SECONDS.sleep(10);
        
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
                	
    }
	
//	@After
//    public void tearDown() throws Exception {
////        driver.quit();
//        Runtime.getRuntime().exec("cmd /k start E:\\py\\stopAppiumServer.bat");
//        
//    }
    
	@Test
 	public void login(){		 
	 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	 	    //用户登录
//        List<AndroidElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
//        textFieldsList.get(0).sendKeys("wss1");
//        textFieldsList.get(1).sendKeys("111111");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	        
//        driver.findElementByName("点击登录").click();
//        	//关闭弹出框
//        driver.findElementByXPath("//android.widget.TextView[contains(@index,0)]").click();
	 	
        	//大贸下单，根据热门关键词,惠氏,搜索
        driver.findElementByName("每日必抢").click();
        driver.findElementByName("惠氏").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.findElementByXPath("//android.widget.TextView[contains(@text,'惠氏启赋3段900g')]").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	        
        	                
        driver.findElementByName("立即抢购").click();
        	//商品下单，用默认地址,第一个生产日期，规格，1件下单，默认第一个地址收货	        
//        driver.findElementByName("2016年2月").click();
//        driver.findElementByName("1罐装").click();
//        driver.findElementByXPath("//android.view.View[@index='45']/android.view.View[@index='0']").click();
      
//        int width=driver.manage().window().getSize().width;
//        int height=driver.manage().window().getSize().height;  
//        driver.swipe(width/2,height*3/4, width/2,height/4, 1000);
        
        driver.findElementByName("2016年4月").click();
        driver.findElementByName("2罐装").click();               
        driver.findElementByName("快递").click();
        
        driver.findElementByName("确定").click();        
        driver.findElementByName("提交订单").click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        	//返回到首页，进入我的，订单详情，支付
        for(int i=0;i<4;i++){
        driver.navigate().back();        
        }        
        driver.findElementByName("我的").click();
        
        driver.findElementByName("待付款").click();
        driver.findElementByName("惠氏启赋3段900g").click();
        
        driver.findElementByName("支付").click();
              
      
 }

    
}
