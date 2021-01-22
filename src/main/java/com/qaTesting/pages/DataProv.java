package com.qaTesting.pages;

public class DataProv {
	
	
	public String DataProviderExercise(String actual) {
		String result = "";
		for (int i = actual.length() -1; i >= 0; i--) {
			result = result + actual.charAt(i);
		}
		
		return result;

	}
	
}
