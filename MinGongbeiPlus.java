package test;

import java.math.BigInteger;
import java.util.Scanner;

public class MinGongbeiPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int[] num=new int[n+1];
			for(int i=1;i<=n;i++){
				num[i]=i;
			}
			for(int i=2;i<n;i++){
				for(int j=i+1;j<=n;j++){
					if(num[j]%num[i]==0){
						num[j]=num[j]/num[i];
					}
				}
//			for(int c:num){
//				System.out.print(c+" ");
//			}
//			System.out.println();
			}
			BigInteger m=BigInteger.ONE;
			for(int i=2;i<=n;i++){
				m=m.multiply(BigInteger.valueOf(num[i]));
			}
			System.out.println(m);
		}
	}

}
