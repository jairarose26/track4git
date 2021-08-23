package org.ssglobal.training.codes;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Level;

public class FunList {

	private BufferedReader bufferedReader;	
	
	// STEP 1A:	Create Logger
	private static Logger logger = Logger.getLogger(FunList.class.getName());
	
	{
		// STEP 2:	Creating Handler
		logger.setLevel(Level.ALL);
		
		try {
			FileHandler fileHandler = new FileHandler("./src/log/funlist.log", true);
			fileHandler.setEncoding("UTF-8");
			fileHandler.setLevel(Level.INFO);
			
			SimpleFormatter formatter = new SimpleFormatter();
			fileHandler.setFormatter(formatter);
			
			logger.addHandler(fileHandler);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public FunList() {
		// STEP 1B: Set the Logging level
		// logger.setLevel(Level.INFO);
	}
	
	public FunList(String filename) {
		// STEP 1B: Set the Logging level
		// logger.setLevel(Level.INFO);		
		
		Path path = Paths.get(filename);		
		
		try { 
			this.bufferedReader = Files.newBufferedReader(path);
		} catch (IOException e) {
			logger.severe("Error Message:" + e.getMessage());
			e.printStackTrace();
		}		
	}
	
	public long countWords() {
		return this.bufferedReader.lines().map( (str) -> {
			return str.split(" ");
		}).count();
	}
	
	@SuppressWarnings({ "deprecation", "unused" })
	public boolean enableDisplay() {
		logger.info("Executing enableDisplay() method");
		
		logger.warning("Custom Date is deprecated");
		Date dates = new Date(121, 11, 25);
		
		try {
			if ( this.bufferedReader.lines().toArray() != null) {
				showLines();
				logger.info("Exit enableDisplay() without errors");
				return true;
			}
		} catch (Exception e) {
			logger.severe("Error Message - " + e.getMessage());
		}
		
		logger.info("Exit enableDisplay() with errors");
		return false;		
	}
	
	
	void showLines() {
		logger.info("Executing showLines() method");
		
		try {
			this.bufferedReader.lines().forEach( (line) -> {
				System.out.println(line);
			});
			logger.info("Exit showLines() method without errors");
		} catch (Exception e) {
			logger.severe("Error Message - " + e.getMessage());
			logger.info("Exit showLines() method with errors");
		}
	}
	
	public List<String> getContentList() {
		return this.bufferedReader.lines().collect(Collectors.toList());
	}
	
	public String[] getContentArray() {
		//return (String[]) this.bufferedReader.lines().toArray(String[]::new);
		return (String[]) this.bufferedReader.lines().toArray();
	}
	
	public String[] getContentArrayFixed() {
		return (String[]) this.bufferedReader.lines().toArray(String[]::new);
	}
	
	public String processStr (String str1, String str2) {
		return String.join(" ", str1, str2);
		
	}
}
