package proprty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Reprop {
	
	public static void main(String[] args) throws IOException {
		Properties prob= new Properties();
		
		FileInputStream ip= new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Testnewproject\\src\\main\\resources\\config.properties");
		
		prob.load(ip);
		
		System.out.println(prob.getProperty("Browser"));
		System.out.println(prob.getProperty("usernmae"));
	}

}
