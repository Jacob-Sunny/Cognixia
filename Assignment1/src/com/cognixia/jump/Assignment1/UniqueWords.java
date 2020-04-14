package com.cognixia.jump.Assignment1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class UniqueWords {

	public static void main(String[] args) {
		String word = "Hello hi World WoRld";
		
	uniqueWords(word);
		
	}

	private static void uniqueWords(String word) {
		int count =0;
	
	      String[] strArray = word.split("\\s+");
	      Map<String, String> hMap = new LinkedHashMap<String, String>();
	      for(int i = 0; i < strArray.length ; i++ ) {
	         if(!hMap.containsKey(strArray[i])) {
	            hMap.put(strArray[i],"Unique");
	         }   
	        
	      }
	      System.out.println(hMap);
	}
	
}
