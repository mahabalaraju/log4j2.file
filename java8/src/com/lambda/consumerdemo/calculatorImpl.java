package com.lambda.consumerdemo;



public class calculatorImpl {
	private static int sum=0;

	public static void main(String[] args) {
//		calculator calculator=()->System.out.println("switch on");
//		calculator.switchon();
//calculator sss=(int i)->{
//	System.out.println(sum+i);
//	return i;
//};
//sss.sum(23);

	calculator cal=(i,j)->{
		if(i<j) {
			return i-j;
		}
		else {
			throw new RuntimeException("message");
		}
	};
	System.out.println(cal.sum(1,2));
	
	}

}
