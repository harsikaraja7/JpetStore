package com.reports;

import com.base.BaseClass;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class Reporting extends BaseClass{
	public static void genarateJvmReport(String jsonFilepath) {
		File file = new File(getPath() + "\\target");
		Configuration configuration = new Configuration(file, "JPet Store Automation");
		configuration.addClassifications("browser", "chrome");
		configuration.addClassifications("browserversion", "109");
		configuration.addClassifications("OS", "Windows11");
		List<String> jsonfiles = new ArrayList<String>();
		jsonfiles.add(jsonFilepath);
		ReportBuilder builder = new ReportBuilder(jsonfiles, configuration);
		builder.generateReports();

	}
}
