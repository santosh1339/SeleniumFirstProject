package com.mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// System.setProperty - to set the path of the chromedriver.exe in your machine..
        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");

        //create an object of the chrome driver class
        WebDriver driver = new ChromeDriver();
        System.out.println("Chrome Driver object got created....");

        //open the client url
        String url = "https://www.google.com/";
        driver.get(url);
        System.out.println("open the client url in chrome browser...");


        //maximize the browser window.
        driver.manage().window().maximize();
        System.out.println("Chrome browser window got maximized...");

        // make your selenium script to sleep for 3 seconds, to allow all the controls on the page to get loaded...
        Thread.sleep(4000);
        System.out.println("make your selenium script to wait for 3 seconds, for all the controls to get loaded...");

        
	
        System.out.println("********************************************************************************");
        
        
        //Launch the ToolsQA WebSite

        driver.get(url);

       

        // Storing Title name in the String variable

        String title = driver.getTitle();

       

        // Storing Title length in the Int variable

        int titleLength = driver.getTitle().length();

       

        // Printing Title & Title length in the Console window

        System.out.println("Title of the page is : " + title);

        System.out.println("Length of the title is : "+ titleLength);
        
        driver.navigate().back();
        System.out.println("We are navigating back ......");

        //navigate forward
        driver.navigate().forward();
        System.out.println("forward movement happened....");
        
      //minimize the browser.
        driver.manage().window().minimize();
        System.out.println("now the chrome browser window is MINIMIZED...");
        
        Thread.sleep(3000);
        System.out.println("Message stating that sleep for 3 seconds before closing ");
        //close the browser
       driver.close();
       System.out.println("Chrome browser will get closed here....");
		
        
	}
	
	

}
