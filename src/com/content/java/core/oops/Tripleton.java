package com.content.java.core.oops;

class Tripleton {

	private static int count = 0;
    private Tripleton(){}
    
    private static Tripleton firstInstance=getInstance();
    private static Tripleton secondInstance=getInstance();
    private static Tripleton thirdInstance=getInstance();
    
    public static Tripleton getInstance(){
        count = count+1;
        if(count%3==1){
        	if(firstInstance==null) {
        		firstInstance=new Tripleton();
        		return firstInstance;
        	}else {
            return firstInstance;
        	}
        }
        if(count%3==2){
            
        	if(secondInstance==null) {
        		secondInstance=new Tripleton();
        		return secondInstance;
        	}else {
            return secondInstance;
        	}
           
        }
        if(count%3==0){
        	if(thirdInstance==null) {
        		thirdInstance=new Tripleton();
        		return thirdInstance;
        	}else {
            return thirdInstance;
        	}
        }
        return null;
        
   }
}