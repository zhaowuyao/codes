package test;

import java.util.Scanner;

public class Candy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=0;
		int sum=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			int candy=sc.nextInt();
			res^=candy;
			sum+=candy;
			min=Math.min(candy, min);
		}
		if(res==0){
			System.out.println(sum-min);
		}else{
			System.out.println("NO");
		}
	}

}
