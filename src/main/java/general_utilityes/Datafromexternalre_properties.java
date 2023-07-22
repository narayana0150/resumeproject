package general_utilityes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Datafromexternalre_properties {
	
	public String getdatafromproperties(String key) throws Throwable {
		
		FileInputStream fls=new FileInputStream("src\\test\\resources\\flipkartfile.properties");
		Properties po=new Properties();
		po.load(fls);
		String data = po.getProperty(key);
		return data;
	}
	
	public void datafromscriptto_properfile(String key,String value) throws Throwable {
		
		Properties po=new Properties();
		po.setProperty(key,value );
		FileOutputStream fos=new FileOutputStream("src\\test\\resources\\impnotesduringexcution.properties");
		po.store(fos, "imp data");
		fos.close();
	}

}
