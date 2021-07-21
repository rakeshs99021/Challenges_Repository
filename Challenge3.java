package com.technoelevate.challenges;

public class Challenge3 {
	public void isEqual(int a,int b,int c) {
		if((a==b&&a==c)&&(b==a&&b==c)&&(c==a&&c==b)) {
			System.out.println("All numbers are equal");
		}
		else if((a!=b&&a!=c)&&(b!=a&&b!=c)&&(c!=a&&c!=b)) {
			System.out.println("All numbers are not equal");
		}
		else
			System.out.println("Neither all are equal or different");
	}
}
