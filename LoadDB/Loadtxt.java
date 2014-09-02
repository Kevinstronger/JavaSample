package LoadDB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Loadtxt {
	final static String FILEPATH = "./data/param.txt";
	static HashMap<String, String> map;
	private static Loadtxt loadtxt = null;
	
	private Loadtxt() {
		map = new HashMap<String, String>();
		readTXT();
	}
	
	public static Loadtxt getInstance() {
		if(loadtxt == null) {
			loadtxt = new Loadtxt();
		}
		return loadtxt;
	}
	//读取txt文件
	private void readTXT(){
		BufferedReader bufr = null;
		String buffer = null;
		try{
			bufr = new BufferedReader(new FileReader(FILEPATH));
			while((buffer = bufr.readLine())!= null) {
				divide(buffer);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{
				if(bufr != null) {
					bufr.close();
				}
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}
	//判断读取到的行内容是否为空或者注释行，如果不是以=为分隔符分割成数组。
	private void divide(String buffer) {
		buffer = buffer.toLowerCase().trim();
		if(buffer.startsWith("#") || buffer.isEmpty()) {
			return;
		}else {
			String[] value = buffer.split("=", 2);
			map.put(value[0], value[1]);
		}
	}
		
	
	public String getValueByKey(String key) {
		return map.get(key);
	}
	
	public static void main(String[] args) {
		String value = getInstance().getValueByKey("color");
		System.out.println(value);
	}
}
