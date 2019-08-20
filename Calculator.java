package test;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine().replaceAll(" ", "");
		StringBuffer sb=new StringBuffer();
		int sum=0;
		int num=0;
		char op='+';
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='+'||ch=='-'){
				sum+=op=='+'?num:num*(-1);
				op=ch;
				num=0;
			}else{
				num=num*10+(ch-'0');
			}
		}
		sum+=op=='+'?num:num*(-1);
		System.out.println(sum);
	}

}
