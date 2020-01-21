package com.rameshsoft.automation.customisedexceptions;

import java.io.FileNotFoundException;

public class FrameworkException extends Exception {
	
	 public FrameworkException()
	 {
		// super();
	 }
	 public FrameworkException(String exceptionInfo)
	 {
		 super(exceptionInfo);
	 }
}
