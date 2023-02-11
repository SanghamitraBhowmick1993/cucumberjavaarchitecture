//package com.factory;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Properties;
//
//public class ConfigFileReader {
//public static Properties prop;
//	
//	public static Properties init_prop(){
//		try{
//			prop = new Properties();
//			FileInputStream ip = new FileInputStream("C:\\Users\\sangb\\Downloads\\CucumberFramework-main\\CucumberFramework-main\\CucumberPOMDesignProjectPattern\\src\\test\\resources\\com\\config\\config.properties");
//			prop.load(ip);
//		}catch(FileNotFoundException e){
//			e.printStackTrace();
//		}catch(IOException e){
//			e.printStackTrace();
//		}
//		return prop;
//		
//	}
//	public static String getUser() {
//		return init_prop().getProperty("userNm");
//	}
//	public static String pass() {
//		return init_prop().getProperty("passwrd");
//	}
//}
