package com.content.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new ArrayList<String>();
		names.add("box");
		names.add("bat");
		names.add("ball");
		names.add("box");
		names.add("box");
		names.add("bat");
			
		int [] price = {1,2,3,1,1};
		int [] weight = {1,2,3,1,1};
		
		System.out.println(findNumberOfDuplicates(names,price,weight));
	}
	
    private static int findNumberOfDuplicates(List<String> names, int []price, int [] weight) {
	
    	
    	Map<String , Integer> duplicatesMap=new HashMap<String, Integer>();
	    for(int i =0; i<5; i++) {
	    	int duplicates=0;
		   for(int j=i+1;j<5; j++) {
			   
			   if(names.get(i).equals(names.get(j))) {
				   
				   if(duplicatesMap.get(names.get(j))==null) {
					   duplicates=duplicates +1;
				   duplicatesMap.put(names.get(i), duplicates);
				   }
				   
			
				   
			   }
		   }
		   
	   }
	    System.out.println(duplicatesMap.get("box"));
	    System.out.println(duplicatesMap.get("bat"));
	    
	   return 0;
	
}

}
