package general.xyz;

import java.util.Scanner;

public class isprime {
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		    System.out.println("enter any number:");
		    int num=sc.nextInt();
		    isprime prime = new isprime();
		    prime.gettheresult(num);
	}

	private void gettheresult(int num) {
		checkgivenNn(num);
		int total=0;
		for(int i=2;i<=num;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0)
					count++;
			}
			if(count==0) {
				total++;
				System.out.println(" "+i);
			}
		}
		System.out.println(total);
		
	}

	private void checkgivenNn(int num) {
	
		if(num>1) {
			int count=0;
			for(int i=2;i<=num;i++) {
				if(num%i==0) 
					count++;
				}
			if(count==2) {
				System.out.println("prime number");
			}
			else
				System.out.println("non prime or composite");
		}
		else
			System.out.println("non prime or composite");
	
	}
 }
