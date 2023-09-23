package com.lambda.consumerdemo;

public class asdfsdafsd {
	public static void main(String[] args) {
	Thread obj1=new Thread("one");
    Thread obj2=new Thread("two");
    
   try {
	   obj1.wait();
	   System.out.println(obj1.isAlive());
   }
   catch(Exception e) {
	   System.out.println("interrupted");
   }
	}
}
