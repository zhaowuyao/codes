package test;

import java.util.Scanner;

public class RedAndGreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int[] rgrid=new int[str.length()];
		int[] ggrid=new int[str.length()];
		if(str.charAt(0)=='R'){
			ggrid[0]=1;
		}else{
			rgrid[0]=1;
		}
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)=='G'){
				ggrid[i]=Math.min(rgrid[i-1], ggrid[i-1]);
				rgrid[i]=rgrid[i-1]+1;
			}else{
				ggrid[i]=Math.min(rgrid[i-1], ggrid[i-1])+1;
				rgrid[i]=rgrid[i-1];
			}
		}
		System.out.println(Math.min(rgrid[str.length()-1], ggrid[str.length()-1]));
	}

}
