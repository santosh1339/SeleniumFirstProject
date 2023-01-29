package com.mypackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNavigateToRediffCreateAcc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      driver.get("https://www.rediff.com");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	    // Get the title of the page 
	      driver.getTitle();
	      System.out.println(" Title of the page .... ");
	      
	      // Get the current url 
	      String my_curr_url = driver.getCurrentUrl();
	      System.out.println("Current url for the page is :"+ my_curr_url);
	      
	    // Get the current window handle 
	      
	      String my_win_handle = driver.getWindowHandle();
	      System.out.println("Window handle for the current browser is :"+ my_win_handle);
	      
	      // click on 'Sign in' link in Rediff.com
	        driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
	        System.out.println("clicked successfully on Sign in link....");

	        Thread.sleep(2000);
	        System.out.println("sleep for 2 seconds to allow it to got to next page...");

	        //get the current url of the sign in page...
	        System.out.println("sign in page current url is :"+driver.getCurrentUrl() );

	        //get the current page title
	        System.out.println("get the Sign in page title :"+ driver.getTitle());

	        // navigate back
	        driver.navigate().back();
	        System.out.println("We are navigating back ......");

	        //navigate forward
	        driver.navigate().forward();
	        System.out.println("forward movement happened....");

	        //minimize and close the window
	        driver.manage().window().minimize();
	        System.out.println("minimize and close the window.....thanks...");
	        driver.quit();
	     
		
	}

}
