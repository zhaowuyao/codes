package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Standings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		ArrayList<Integer> list=new ArrayList<Integer>();
		StringBuffer sb=new StringBuffer();
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
//				list.add(i);
				count++;
				sb.append(i).append(" ");
			}
		}
		System.out.print(count+" ");
		System.out.print(sb);
		
//		System.out.print(list.size()+" ");
//		for(int num:list){
//			System.out.print(num+" ");
//		}
		
	}

}
