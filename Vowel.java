package test;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
				sb.append(Character.toUpperCase(str.charAt(i)));
			}else if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
				sb.append(str.charAt(i));
			}else if((str.charAt(i)>='A'&&str.charAt(i)<='Z')){
				sb.append(Character.toLowerCase(str.charAt(i)));
				
			}else{
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb);
	}

}
