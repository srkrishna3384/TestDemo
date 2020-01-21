package com.rameshsoft.automation.utilities;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.rameshsoft.automation.supporters.ExcelReader;
import com.rameshsoft.automation.supporters.PropertiesUtilities;

public class POJOSupporters {

	static private PropertiesUtilities prOr;
	static private PropertiesUtilities prConf;
	static private ExcelReader excelReader;
	
	static public PropertiesUtilities getORObj() throws IOException {
		prOr = new PropertiesUtilities(FilePaths.orPath);
		return prOr;
	}
	
	static public PropertiesUtilities getConfObj() throws IOException {
		prConf = new PropertiesUtilities(FilePaths.confPath);
		return prConf;
	}
	
	static public ExcelReader getExcelObj() throws EncryptedDocumentException, InvalidFormatException, IOException{
		excelReader = new ExcelReader(FilePaths.excelPath);
		return excelReader;
	}
	
}









