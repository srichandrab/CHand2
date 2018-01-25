package com.icicibank.loans.carloans;

import org.openqa.selenium.chrome.ChromeDriver;

public class ABCDriver 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		ChromeDriver driver1=new ChromeDriver();
		//driver.get("http:/www.amazon.in");
		driver1.navigate().to ("http:/www.amazon.in");
		
		
		driver1.manage().window().maximize();
		
		driver1.manage().deleteAllCookies();
		String driver1.GetTitle;
		System.out.println("title");
		
		String url = driver1.getCurrentUrl();
		System.out.println(url);
		
		driver1.navigate().back();
		
		Thread.sleep(4000);
		driver1.navigate().forward();
		
		Thread.sleep(4000);
		driver1.navigate().refresh();
			
			driver1.close();
	//driver.quit();
		
		
		
		
		
		//System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"\\Drivers\\firefox.exe");
		//FirefoxDriver driver1=new FirefoxDriver();
		//could not run on FirefoxDriver 

		//driver1.get("http:/www.amazon.in");
		
		
		
				
	
		
	}
}
