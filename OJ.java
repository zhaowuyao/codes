package test;

import java.util.Scanner;

public class OJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int n=sc.nextInt();
			sc.nextLine();
			int count=0;
			for(int i=2;i<n;i++){
				if(isPrim(i)&&isPrim(i+2)){
					count++;
					
				}
			}
			System.out.println(count);
		}
		
	}

	private static boolean isPrim(int num) {
		// TODO Auto-generated method stub
		for(int i=2;i<num;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}


}
