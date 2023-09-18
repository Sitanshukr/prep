package com.dynamicconnectivity.algo;


/*This Algorithm is a QuickUnionFind Algorithm whose time complexity is O(N), whicch is 
 * significant decrease in terms of expensiveness.
 * 
 * Approach: Make it a tree structure as part of Union Operation, by just changing only 
 * one entry in an array, unlike changing all the entries of element in Quick Find O(N2)
 * 
 * Find Root of each element traversing to its connected element until element ==id[element]
 * Two Nodes will always be connected if there root is same.
 */

public class QuickUnionFind {

	public int [] id;
	
	public QuickUnionFind(int N) {
		id = new int[N] ;
		for (int i =0 ;i<N;i++) {
			id[i]=i;
		}
	}
	
	public int root(int element) {
		
		while (element != id[element]) {
			element = id [element];
		}
		return element;
	}
	
	public void union (int p, int q) {
		
		int pRoot= root(p);
		int qRoot = root(q);
		
		id[pRoot]= qRoot;
	}
	
	public boolean connected(int p , int q) {
		
		return root(p)== root(q);
		
	}
	
	public static void main(String[] args) {

		QuickUnionFind qF= new QuickUnionFind(10);
		qF.union(4, 3);
		qF.union(3, 8);
		qF.union(6, 5);
		qF.union(9, 4);
		qF.union(2, 1);
		System.out.println(qF.connected(8, 9));
		qF.union(5, 4);
		qF.union(5, 0);
		qF.union(7, 2);
		qF.union(6, 1);
		qF.union(7, 3);
		
		
	}

}
