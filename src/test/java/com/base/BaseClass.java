package com.base;

import java.util.Collection;
import java.util.Collections;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class BaseClass {
    public static WebDriver driver;
    
	public void launchBrowser(String browserType) {
		switch (browserType) {
		case "chrome":
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		case "Internet Explorer":
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			break;
		case "edge":
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;
		default:
			System.out.println("Browser is not initiated");
			break;

		}
	}
	
	public static String RGBColorExamples(String rgbColor) {
                
                
                String valuesString = rgbColor.substring(rgbColor.indexOf("(") + 1, rgbColor.indexOf(")"));
                System.out.println(valuesString);
                
                String[] rgbValues = valuesString.split(",");
               // System.out.println(rgbValues);
                String color = null;
                int r = Integer.parseInt(rgbValues[0].trim());
                System.out.println(r);
                int g = Integer.parseInt(rgbValues[1].trim());
                System.out.println(g);

                int b = Integer.parseInt(rgbValues[2].trim());
                System.out.println(b);


                if (r==255 & g== 255 & b==255) {
                	color ="White";
                    System.out.println(color);

                    } 
                if (r==255 & g== 0 & b==0) {
                	color ="Red";
                    System.out.println(color);

                    } 
                if (r==0 & g== 255 & b==0) {
                	color ="Green";
                    System.out.println(color);

                    } 
                if (r==0 & g== 0 & b==255) {
                	color ="Blue";
                    System.out.println(color);

                    } 
                if (r==0 & g== 0 & b==0) {
                	color ="Black";
                    System.out.println(color);

                    } 
                return color;
            }


	
	public static String getProperty(String Key) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(getPath()+"\\Config\\Config.propeties"));
		Object object = properties.get(Key);
		String value = object.toString();
	return value;	
	}
	
	public static String getPath() {
		String path = System.getProperty("user.dir");
     	return path;
		
	}
	public void Click(WebElement element) {
		 element.click();
	}

	public void getUrl(String key) throws FileNotFoundException, IOException {
		driver.get(key);
	}
public void collection() {
	Collections.sort(null);
}
	public void brokeLikn() {
//	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//	int size = allLinks.size();
//	System.out.println("Total link :"+size);
//	int brokenlink=0;
//	for(int i=0; i<allLinks.size();i++) {
//		WebElement singleLink = allLinks.get(i);
//		String urlLink = singleLink.getAttribute("href");
//		//System.out.println(urlLink);
//		try {
//		URL link = new URL(urlLink);
//		URLConnection openConnection = link.openConnection();
//		HttpURLConnection http = (HttpURLConnection)openConnection;
//		http.connect();
//		int responseCode = http.getResponseCode();
//		if(responseCode >=400) {
//			//System.out.println(urlLink);
//			//System.out.println("BrokenLink");
//			brokenlink++;
//			//System.out.println(responseCode);
//		}else
//		{
//	    //System.out.println("ValidLink");
//		System.out.println(responseCode);
//
//		}
//	}
//	catch(Exception e) {
//}}
//System.out.println("Brokenlink  :" + brokenlink);	
//}

	}

}
