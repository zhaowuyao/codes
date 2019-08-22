package test;

import java.util.Scanner;

public class Reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] string=str.split(" ");
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<string.length;i++){
			char[] chs=string[i].toCharArray();
			String ss=swap(chs);
			sb.append(ss).append(" ");
		}
		System.out.println(sb.toString());
	}

	private static String swap(char[] chs) {
		// TODO Auto-generated method stub
		for(int i=0;i<chs.length/2;i++){
			char temp=chs[i];
			chs[i]=chs[chs.length-1-i];
			chs[chs.length-1-i]=temp;
		}
		return String.valueOf(chs);
	}

}
