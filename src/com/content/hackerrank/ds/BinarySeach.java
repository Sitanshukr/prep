package com.content.hackerrank.ds;

public class BinarySeach {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {3, 14, 20, 25, 29, 34, 38, 41, 45, 48, 64, 76, 82, 93, 98};
      int target=82;
      System.out.println("Element "+ Search(arr,target,0,arr.length-1));
      
	}

	    
		private static int findMid(int[] arr, int start, int end){
			
			int mid= (start+end)/2;
			return mid;
		}
		
		private static boolean Search(int [] arr, int target,int start, int end) {
			
		  int mid=findMid(arr,start,end);
		  
		  if (target > arr[mid]){
			  start=mid+1;
			  Search(arr,target ,start, end);
		  }else if (target<arr[mid]){
			  end=mid-1;
			  Search(arr, target,start, end);
			  
		  }else if(arr[mid]==target) {
			  System.out.println("Element found at Index " + mid + " target " + arr[mid]);
			   return true;
		  }
		  return false;
		}
}
