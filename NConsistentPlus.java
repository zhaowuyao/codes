package test;

import java.math.BigInteger;
import java.util.Scanner;

public class NConsistentPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num==0){
			System.out.println(1);
			return;
		}
		BigInteger result=new BigInteger(String.valueOf(num));
		for(int i=2;i<num;i++){
			result=result.multiply(new BigInteger(String.valueOf(i)));
		}
		System.out.println(result);
	}

}
