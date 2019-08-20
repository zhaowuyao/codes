package test;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] ss=str.split(" ");
		int lenwords=ss.length;
		int count=0;
		for(int i=0;i<ss.length;i++){
			count+=ss[i].length();
		}
		float result=(float) count/lenwords;
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(result));
		
	}

}
