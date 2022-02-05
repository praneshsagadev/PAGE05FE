package commonUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyInitializer {
	
	static Properties prop;

	public static void initializeProperty() {

		File file = new File("C:\\Users\\PraneshK\\eclipse-workspace\\PageObject1\\src\\test\\resources\\data.properties");

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		 prop = new Properties();

		try {
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static String getProperty(String key) {
		
	return	prop.getProperty(key);

	}

}
