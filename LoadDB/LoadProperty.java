package LoadDB;

import java.io.IOException;
import java.util.Properties;

public class LoadProperty {
	final static String FILEPATH = "resources/param.properties";
//	private static LoadProperty loadProperty = new LoadProperty();
//	private LoadProperty(){}
//	public static LoadProperty getInstance() {
//		return loadProperty;
//	}
	public static String getValueByKey(String key) {
		try {
			Properties prop = new Properties();
			prop.load(LoadProperty.class.getClassLoader().getResourceAsStream(FILEPATH));
			if(prop.containsKey(key)){
				String value = prop.getProperty(key);
				return value;
			}
	
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
