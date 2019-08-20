package test;

import java.util.Scanner;

public class MaxGongyuePlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(getTwo(2*n));
	}

	private static int getTwo(int n) {
		// TODO Auto-generated method stub
		return n-(n&(n-1));
	}

}
