package arraylist;

import java.util.*;

public class PropertiesEx1 {
// Properties의 기본적인 메서드 사용
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		//키,밸류 저장
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		// Enumeration으로 출력
		Enumeration e = prop.propertyNames();
		
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			System.out.println(element + "=" + prop.getProperty(element));
		}
		
		System.out.println();
		prop.setProperty("size", "20");
		System.out.println("size=" + prop.getProperty("size"));
		System.out.println("capacity=" + prop.getProperty("capacity", "20"));
		System.out.println("loadfactor=" + prop.getProperty("loadfactor", "0.75"));
		System.out.println(prop);
		prop.list(System.out);
	}
}
