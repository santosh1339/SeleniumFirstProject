package com.mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserRediffbrowser1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        //create an object of the chrome driver class
        WebDriver driver = new ChromeDriver();
        System.out.println("Chrome Driver object got created....");

        //open the client url
        String url = "https://www.rediff.com";
        driver.get(url);
        System.out.println("open the client url in chrome browser...");


        //maximize the browser window.
        driver.manage().window().maximize();
        System.out.println("Chrome browser window got maximized...");


        System.out.println("********** before clicking Signin link ******");

        //get the title of the new page
        String myTitle = driver.getTitle();
        System.out.println("title of login page : ----> "+ myTitle);

        //get the current url of the page
        String myCurrUrl = driver.getCurrentUrl();
        System.out.println("My current URl is :" + myCurrUrl );

        System.out.println("********** AFTER clicking SIGN IN link ******");

        //sign in link - xpath
        driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
        System.out.println("clicked on the Signin link....");

        //get the title of the new page
        String myTitle2 = driver.getTitle();
        System.out.println("title of login page : ----> "+ myTitle2);

        //get the current url of the page
        String myCurrUrl2 = driver.getCurrentUrl();
        System.out.println("myCurrUrl2 : ---> "+ myCurrUrl2);


       //identify the userid and pwd textboxes
        driver.findElement(By.id("login1")).sendKeys("santosh");
        System.out.println("login textbox is entered some values....");


        driver.findElement(By.id("password")).sendKeys("test santosh password");
        System.out.println("password textbox is entered some values....");

        //sign in button
        driver.findElement(By.name("proceed")).click();
        System.out.println("Sign in Submit button is clicked.......");


        System.out.println("getCurrentUrl of new page is ----> :"+ driver.getCurrentUrl());
        System.out.println("getTitle of new page is ----> :"+ driver.getTitle());   

        //move back
        driver.navigate().back();
        System.out.println("getCurrentUrl of new page is ----> :"+ driver.getCurrentUrl());
        System.out.println("getTitle of new page is ----> :"+ driver.getTitle());   

        driver.navigate().forward();
        System.out.println("we are now going forward in automation...");   

        //driver.navigate().refresh();

        //quit the browser.
        driver.quit();

	}

}
