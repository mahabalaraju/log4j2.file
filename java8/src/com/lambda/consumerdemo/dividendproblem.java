package com.lambda.consumerdemo;

import java.util.Arrays;
import java.util.Iterator;

public class dividendproblem {
	public static void main(String[] args) {
		String[] name = { "chethan", "manjesh", "sangamesh" };
		int sum = 0, total = 0, person;
		int avg[] = new int[3];
		int z[]=new int[3];
		int[][] expenses = { { 69, 76, 98 }, { 62, 56, 98 }, { 57, 26, 98 } };

		for (person = 0; person <= name.length - 1; person++) {
			System.out.println("\n" + name[person]);
			for (int money = 0; money <= expenses.length - 1; money++) {
				System.out.println(expenses[person][money]);
				total += expenses[person][money];
			}
			avg[person] = total;
			System.out.println("\n sum=" + total);

			total = 0;
		}
		for (int x : avg) {
			sum += x;
		}
		System.out.println("\n  total expenditure of all persons  " + sum);
		int dividend = sum / 3;
		System.out.println("each person share " + sum / 3);

		for (person = 0; person < 3; person++) {
			z[person]=avg[person] - dividend;
			System.out.println(name[person]+"'s dividend" + "\n" + (avg[person] - dividend));
		}
		int max = Arrays.stream(z).max().getAsInt();
        System.out.println("Largest in given array is " +max);
   
	}
}
