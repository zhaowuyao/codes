package test;

import java.util.Scanner;

public class NJinZhi2 {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    while (scanner.hasNextDouble()) {
	        double m = scanner.nextDouble();
	        int n = scanner.nextInt();
	        if(isLegal(m,n)){
	        	transform(m,n);
	        }
	    }
	}
	private static void transform(double m, int n) {
		// TODO Auto-generated method stub
		int[] result=new int[10];
		for(int i=0;i<result.length;i++){
			m*=n;
			result[i]=(int) (Math.floor(m));
			if(m>1.0){
				m-=result[i];
			}
		}
		print(result);
		
	}
	private static void print(int[] result) {
		// TODO Auto-generated method stub
		System.out.print("0.");
		for(int i=0;i<result.length;i++){
			System.out.printf("%d",result[i]);
		}
		System.out.println();
		
	}
	private static boolean isLegal(double m, int n) {
		// TODO Auto-generated method stub
		return (n<10&&n>1&&m>0.0000009&&m<1);
	}
}
