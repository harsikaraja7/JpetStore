package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.reports.Reporting;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(tags ="@1",dryRun = false,plugin= {"pretty", "json:target\\output.json"}, features = "src\\test\\resources", glue = "com.stepdefinitions")
public class Runner extends BaseClass{
@AfterClass
public static void afterClass() throws FileNotFoundException, IOException {

	Reporting.genarateJvmReport(getPath()+getProperty("jsonpath"));
	System.out.println("done");}

}
