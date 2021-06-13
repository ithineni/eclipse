package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	public static void main(String args[]) throws IOException {
        System.out.println("BROWSER: "+ readPropertiesFile(System.getProperty("user.dir")+"\\src\\main\\resources\\config\\Test.properties","BROWSER"));
        System.out.println("BROWSER1: "+ readPropertiesFile(System.getProperty("user.dir")+"\\src\\main\\resources\\config\\Test.properties","BROWSER1"));          
        System.out.println("My Directory :" +System.getProperty("user.dir"));
}

public static String readPropertiesFile(String fileName,String key) throws IOException {
  FileInputStream fis = null;
  Properties prop = null;
  String sValue=null;
  try {
     fis = new FileInputStream(fileName);
     prop = new Properties();
     prop.load(fis);
     sValue=prop.getProperty(key);
  } catch(FileNotFoundException fnfe) {
     fnfe.printStackTrace();
  } catch(IOException ioe) {
     ioe.printStackTrace();
  } finally {
     fis.close();
  }
  return sValue;
}
}
