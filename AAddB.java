package test;

import java.math.BigInteger;
import java.util.Scanner;

public class AAddB {

	public static void mainAdd(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			BigInteger a=sc.nextBigInteger();
			BigInteger b=sc.nextBigInteger();
			System.out.println("Case "+(i+1)+":");
			System.out.println(a.toString()+" + "+b.toString()+" = "+a.add(b));
			System.out.println();
		}
		
	}
	public static void mainMulti(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			BigInteger a=sc.nextBigInteger();
			BigInteger b=sc.nextBigInteger();
			System.out.println("Case "+(i+1)+":");
			System.out.println(a.toString()+" - "+b+" = "+a.subtract(b));
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			BigInteger a=sc.nextBigInteger();
			BigInteger b=sc.nextBigInteger();
			
			System.out.println(a.toString()+" x "+b.toString()+" = "+a.multiply(b));
			
			
		}
	}

}
