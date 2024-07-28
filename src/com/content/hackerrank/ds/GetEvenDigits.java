package com.content.hackerrank.ds;

public class GetEvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr= {12, 345, 34, 567, 98, 43432};
		System.out.println(findNumberofEvenElementsNumbers(arr));
	}
	
	public static int findNumberofEvenElementsNumbers(int [] arr) {
		
		    int totaleven=0;
		
            for(int number: arr) {
			
			String num=String.valueOf(number);
			char []c=num.toCharArray();
			
			if(c.length % 2==0) {
				totaleven++;
				
			}
			
		}
            
            return totaleven;
	}

}
