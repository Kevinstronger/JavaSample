package com.ifeng.browser;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.HashMap;

public class BrowserProperties {
	private HashMap<String, String> map;
	
	public BrowserProperties(){
		map = new HashMap<String, String>();
		loadFile();
	}

	public static BrowserProperties getInstance() {
		return new BrowserProperties();
	}

	public String getString(BrowserType bt) {
		return bt.toString();
	}

	private void loadFile(){
		String filePath = System.getProperty("user.dir")+"/conf/browser.properties";
		BufferedInputStream bin = null;
		InputStreamReader ir = null;
		LineNumberReader input = null;
		
		try{
			bin = new BufferedInputStream(new FileInputStream(filePath));
			ir = new InputStreamReader(bin);
			input = new LineNumberReader(ir);
			String line;
			line = input.readLine();
			while(line != null){
				splitLine(line);
			line = input.readLine();
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				if(ir != null){
					ir.close();
				}
				if(input != null){
					input.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}

	private void splitLine(String line) {
		String str = line;
		String temp = str.trim();
		if(temp.startsWith("#")||temp.isEmpty()){
			return;
		}
		String[] value = temp.split("=",2);
		this.map.put(value[0], value[1]);
	}
	
	public String getBrowserType(String key){
		return this.map.get(key);
	}
	
	public String getURL(String key){
		return this.map.get(key);
	}

}
