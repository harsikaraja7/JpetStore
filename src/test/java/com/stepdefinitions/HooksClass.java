package com.stepdefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException, InterruptedException{
		launchBrowser(getProperty("browser"));
		getUrl(getProperty("url"));
		getPath();
		
		 WebElement searchBar = driver.findElement(By.id("APjFqb"));

	        // Enter a search query in the search bar
	        searchBar.sendKeys("Hello");
	        Thread.sleep(7000);

	        // Press Enter to perform the search
	        

	        // Wait for the search results to load (you might need to use explicit or implicit waits)
	        // For simplicity, let's use a static sleep here. In a real scenario, prefer dynamic waits.
//	        try {
//	            Thread.sleep(5000);
//	        } catch (InterruptedException e) {
//	            e.printStackTrace();
//	        }
	        //	                printRGB("White", 255, 255, 255);
//	                printRGB("Black", 0, 0, 0);
//	                printRGB("Red", 255, 0, 0);
//	                printRGB("Green", 0, 255, 0);
//	                printRGB("Blue", 0, 0, 255);
//	                printRGB("Yellow", 255, 255, 0);
//	                String colorName, int red, int green, int blue) {
//		                System.out.println(colorName + " RGB values:");
//		                System.out.println("Red: " + red);
//		                System.out.println("Green: " + green);
//		                System.out.println("Blue: " + blue);
	           	        

	        // Retrieve a list of search results
	        List<WebElement> searchResults = driver.findElements(By.xpath("//div[@class='UUbT9 EyBRub']"));
	        System.out.println(searchResults);

	        // Print the text of each search result
	        for (WebElement result : searchResults) {
	            System.out.println(result.getAttribute("innerText"));
	            String c = result.getCssValue("background-color");
		        System.out.println("Test    :"+c);
		       
	        }
            WebElement ele= driver.findElement(By.xpath("//div[@class='RNNXgb']"));
            WebElement ele1= driver.findElement(By.xpath("//*[@alt='Google']"));
 
            String color = ele.getAttribute("background-color");
	        System.out.println("Background Color: " + color);
	        
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        String backgroundColor = (String) jsExecutor.executeScript("return getComputedStyle(arguments[0]).backgroundColor;", ele);
	        System.out.println("Background Color: " + backgroundColor);

	        String c = ele.getCssValue("background-color");
	        System.out.println("Test search:white    :"+c);
	        
	        String ca = ele1.getCssValue("background-color");
	        System.out.println("Test Google   :"+ca);
	        
	        String fontFamily = ele.getCssValue("font-style");
	        String fontSize = ele.getCssValue("font-size");
	        String fontWeight = ele.getCssValue("font-weight");

	        // Print the font-related properties to the console
	        System.out.println("Font Family: " + fontFamily);
	        System.out.println("Font Size: " + fontSize);
	        System.out.println("Font Weight: " + fontWeight);
	        
	        String textAlignment = ele1.getCssValue("font-variant");

	        // Print the text alignment property to the console
	        System.out.println("Text Alignment: " + textAlignment);

	        
	        //System.out.println(RGBCnolorExamples(backgroundColor));
	        
//	        JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
//	        String backgroundColor1 = (String) jsExecutor1.executeScript("return getComputedStyle(arguments[0]).backgroundColor;", ele);
//
//	        // Print or use the background color as needed
//	        System.out.println("Background Color: " + backgroundColor1);
//	        
//	        String colorName = (String) jsExecutor.executeScript("return NTC.name('" + backgroundColor + "').name;", ele);
//
//	        // Print or use the color name as needed
//	        System.out.println("Background Color: " + colorName);


	        // Close the browser
	        driver.quit();
	}
	@After
	public void afterScenario() {
		//driver.close();
	}

}
