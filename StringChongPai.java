package test;

import java.util.Scanner;

public class StringChongPai {
    static int count=0;;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int result=getSum(str,0);
		System.out.println(result);
	}

	private static int getSum(String str, int index) {
		// TODO Auto-generated method stub
		if(index==str.length()-1){
			return count++;
		}
		for(int i=0;i<str.length();i++){
			
		}
		return 0;
	}

}
