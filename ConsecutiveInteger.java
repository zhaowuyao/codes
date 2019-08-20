package test;

import java.util.Scanner;

public class ConsecutiveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if((n&(n-1))!=0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

}
