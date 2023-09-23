package com.lambda.consumerdemo;

class myRunnable implements Runnable{
public void run() {	
	System.out.println("child thread");
}

}
public class threadDemo {
public static void main(String[] args) {
myRunnable r=new myRunnable();
Thread t=new Thread();
Thread t1=new Thread(r);
	t.run();
	t1.start();
	for(int i=0;i<3;i++) {
		System.out.println("main thread");
	}
}

}
