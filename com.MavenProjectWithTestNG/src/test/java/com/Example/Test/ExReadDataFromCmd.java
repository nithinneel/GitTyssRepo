package com.Example.Test;

import org.testng.annotations.Test;

public class ExReadDataFromCmd {
	@Test
	public void readData() {
		System.out.println("to read data from cmd");
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println("browser: "+BROWSER);
		System.out.println("url: "+ URL);
		
	}

}
