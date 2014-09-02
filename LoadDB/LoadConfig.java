package LoadDB;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class LoadConfig {
	final static String FILEPATH = "./data/param.properties";
//	private static LoadConfig loadConfig = null;
//	private LoadConfig(){}
//	public static LoadConfig getInstance() {
//		if(loadConfig == null) {
//			loadConfig = new LoadConfig();
//		}
//		return loadConfig;
//	}
	
	public static String getValueByKey(String key) {
		try {
			Properties prop = new Properties();
			prop.load(new InputStreamReader(new FileInputStream(FILEPATH), "utf-8"));
			//要做一次强转，将value转为String类型。
			String value = (String)prop.getProperty(key);
			return value.trim();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
