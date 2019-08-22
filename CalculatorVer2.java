package test;

import java.util.Scanner;

public class CalculatorVer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(getPath(str.toCharArray())){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

	private static boolean getPath(char[] charArray) {
		// TODO Auto-generated method stub
		int left=0;
		for(int i=0;i<charArray.length;i++){
			if(charArray[i]=='('){
				left++;
			}
			if(charArray[i]==')'){
				left--;
			}
			if(left<0){
				return false;
			}
		}
		if(left==0){
			return true;
		}
		return false;
	}

}
