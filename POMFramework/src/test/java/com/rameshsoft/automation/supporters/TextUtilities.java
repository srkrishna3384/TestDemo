package com.rameshsoft.automation.supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class TextUtilities {

	private String filePath;
	private File file;
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	
	public TextUtilities(String filePath) throws IOException{
		file = new File(filePath);
		String status = (file.createNewFile())?"file is creadted":"return exists";
		System.out.println(status);
		fileWriter = new FileWriter(file);
		bufferedWriter = new BufferedWriter(fileWriter);
		fileReader = new FileReader(file);
		bufferedReader = new BufferedReader(fileReader);
	}
	
	public void writeData(String data) throws IOException {
		Optional<BufferedWriter> optional = Optional.ofNullable(bufferedWriter);
		if (optional.isPresent()) {
			bufferedWriter.write(data);
		}
		else{
			System.out.println("BW IS POINTING TO NULL");
		}
	}
	
    public void writeData(int data) throws IOException {
    	Optional<BufferedWriter> optional = Optional.ofNullable(bufferedWriter);
		if (optional.isPresent()) {
			bufferedWriter.write(data);
			bufferedWriter.flush();
		}
		else{
			System.out.println("BW IS POINTING TO NULL");
		}
	}
    public void writeData(char[] data) throws IOException {
    	Optional<BufferedWriter> optional = Optional.ofNullable(bufferedWriter);
		if (optional.isPresent()) {
			bufferedWriter.write(data);
			bufferedWriter.flush();
		}
		else{
			System.out.println("BW IS POINTING TO NULL");
		}
	}
	
   public void writeData(String[] data) throws IOException {
	   Optional<BufferedWriter> optional = Optional.ofNullable(bufferedWriter);
		if (optional.isPresent()) {
			for(String str : data){
			bufferedWriter.write(str);
			bufferedWriter.flush();
			}
		}
		else{
			System.out.println("BW IS POINTING TO NULL");
		}
	}
	
   public void writeData(List data) throws IOException {
	   Optional<BufferedWriter> optional = Optional.ofNullable(bufferedWriter);
		if (optional.isPresent()) {
			for(Object obj : data){
				String str = (String) obj;
				bufferedWriter.write(str);
				bufferedWriter.flush();
			}
		}
		else{
			System.out.println("BW IS POINTING TO NULL");
		}
	}
	public String getFileData() throws IOException {
		String data = bufferedReader.readLine();
		return data;
	}
	
	public List getTotalFileData() throws IOException {
		List fileData = new ArrayList();
		
		while(bufferedReader.ready()){
			fileData.add(bufferedReader.readLine());
		}
		return fileData;
	}
	
	public Set getTotalFileUniqueData() throws IOException {
		List data = getTotalFileData();
		Set data1 = new LinkedHashSet();
		data1.addAll(data);
		return data1;
	}
	
	public Map<Integer,String> getTotalFileDataMap() throws IOException {
		Map<Integer,String>  mapData = new LinkedHashMap<Integer, String>();
		int count = 1;
		while(bufferedReader.ready()){
			mapData.put(count, bufferedReader.readLine());
			
			count++;
		}
		return mapData;
	}	
}




