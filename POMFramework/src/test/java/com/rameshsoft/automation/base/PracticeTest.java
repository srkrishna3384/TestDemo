package com.rameshsoft.automation.base;

import com.rameshsoft.automation.customisedexceptions.PracticeException;

public class PracticeTest {
public static void main(String[] args) throws PracticeException {
	
	int practiceHrs = 8;
	if (practiceHrs >=9) {
		System.out.println("U R IN COMPETITION");
	}
	else{
		PracticeException practiceException = new PracticeException("I DIDN'T PRACTICE MORE THA 6 HOURS....");
		throw practiceException;
	}
}
}
