package GenericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * This class consists of logic to read data from property file
 * @author vinay
 *
 */
public class PropertiesUtils {

	public String readdatafromPropertyFile(String Key) throws Throwable{
		
		FileInputStream fis = new FileInputStream(Constants.CommonData);
		Properties pObj=new Properties();
		pObj.load(fis);
		String value = pObj.getProperty(Key);
		return value;
	}
}
