package com.acc.lkm.day4;

public class Showstackoverflowerror { 
	    static int i = 0; 
 
	    public static int printNumber(int x) 
	    { 
	        i = i + 2; 
	        System.out.println(i); 
	        return i + printNumber(i + 2); 
	    } 
	  
	    public static void main(String[] args) 
	    {
	        Showstackoverflowerror.printNumber(i); 
	    } 
	}

