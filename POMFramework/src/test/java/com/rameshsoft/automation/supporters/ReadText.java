package com.rameshsoft.automation.supporters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class ReadText {
public static void main(String[] args) throws IOException {
	
/*File file = new File("E:\\MyWorkspace\\Frameworks7AM\\src\\com\\rameshsoft\\automation\\supporters\\AppTxt.txt");
	
	boolean fileStatus = file.createNewFile();
*/	
	/*if (fileStatus) {
		System.out.println("File is created newly");
	}
	else{
		System.out.println("File is exists!");
	}
	*/
	
    File file = new File("E:\\MyWorkspace\\Frameworks7AM\\src\\com\\rameshsoft\\automation\\supporters\\AppTxt.txt");
	boolean fileStatus = file.createNewFile();
	String val = (fileStatus)?"File is created newly":"File is exists!";
	System.out.println(val);
	
	FileReader fileReader = new FileReader(file);
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	
	bufferedReader.readLine();
	while(bufferedReader.ready())
	{
	  System.out.println(bufferedReader.readLine());	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
