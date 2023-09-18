package com.dynamicconnectivity.algo;

public class QuickFind {
	
	/* This program implements Quick find algorithum (Eager approach) to solve dynamic connectivity problem
	 * Time Complexity O(n2) 
	 * Drawbacks: Expensive in nature, doesn't not improves with improvement in technology and too slow with High data sets
	 */

	public int[] id;
	
	public QuickFind (int N) {
		id = new int[N];
		for (int i =0 ;i<N ;i++) {
			id[i]=i;
		}
	}
	
	public boolean connected(int p , int q) {
		if(id[p]==id[q]) {
			return true;
		}else return false;
		
	}
	
	public void union(int p , int q) {
		int pid= id[p];
		int qid = id[q];
		
		for(int i = 0 ; i<id.length;i++) {
			if(id[i]==pid) {
				id[i]=qid;
			}
		
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QuickFind qfb = new QuickFind(10);
		qfb.union(4, 3);
		System.out.println(qfb.connected(4, 3));
		qfb.union(3, 8);
		qfb.union(6, 5);
		qfb.union(9, 4);
		qfb.union(2, 1);
		System.out.println(qfb.connected(8, 9));
		System.out.println(qfb.connected(5, 0));
		qfb.union(5, 0);
		qfb.union(7, 2);
		qfb.union(6, 1);
		System.out.println(qfb.connected(2, 3));
		
	}

}
