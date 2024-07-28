package com.content.hackerrank.ds;

public class MaxWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arr= {{2, 5, 7},{1,2,3},{5,2,1}};
		
		
		
	}

	
	
	/*static int findgreatestsum(int ) {
		
		
		
	}*/
	
     static int sum(int [][] arr) {
		
        int [] sumArr= new int[3];
		
		
		for(int i=0;i<arr.length;i++) {
			int element=0;
			for(int j=0;j<arr[i].length;j++) {
				element=element + arr[i][j];
			}
			
			sumArr[i]=element;
		}
		
		
		return 0;
	}
	
}
