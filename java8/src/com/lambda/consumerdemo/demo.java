package com.lambda.consumerdemo;



public class demo extends Thread{
		
		Thread t;
		String name;
		demo(String threadname){
			name=threadname;
			t=new Thread(this,name);
			t.start();
		}
		public void run() {
			
		}
	}

