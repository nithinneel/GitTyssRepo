package com.Example.Test;

import org.testng.annotations.Test;

public class ExReadDataFromCmd {
	@Test
	public void readData() {
		System.out.println("to read data from cmd");
		String NAME = System.getProperty("name");
		String PLACE = System.getProperty("place");
		System.out.println("Name: "+NAME);
		System.out.println("Place: "+PLACE);
		System.out.println("hi");
		
	}

}
