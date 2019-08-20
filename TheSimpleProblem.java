package test;

import java.util.Scanner;

public class TheSimpleProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int k=sc.nextInt();
		int n=sc.nextInt();
		int result=(n+1)*a+(1+n)*n/2*k;
		System.out.println(result);

	}

}
