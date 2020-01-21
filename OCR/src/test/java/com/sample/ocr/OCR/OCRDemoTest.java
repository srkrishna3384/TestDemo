package com.sample.ocr.OCR;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class OCRDemoTest {
	public static void main(String[] args) {
		Tesseract tesseract = new Tesseract(); 
        try { 
  
            tesseract.setDatapath("D:/Moneycontrol_Web2/OCR/Tessdata"); 
  
            // the path of your tess data folder 
            // inside the extracted file 
            String text 
                = tesseract.doOCR(new File("D:/Moneycontrol_Web2/OCR/Tessdata/Capture2.PNG")); 
  
            // path of your image file 
            System.out.print(text); 
        } 
        catch (TesseractException e) { 
            e.printStackTrace(); 
        } 
	}

}
