package test;

import java.util.BitSet;
import java.util.Scanner;

public class PrimePlus {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<2){
			System.out.println(0);
		}
		BitSet prim=new BitSet(num+1);
		isPrim(num,prim);
		int count=0;
		for(int i=0;i<prim.size();i++){
			if(prim.get(i)==true){
				count++;
			}
		}
		System.out.println(count);
	}
	private static void isPrim(int num,BitSet prim) {
		// TODO Auto-generated method stub
		prim.set(0,num+1,true);
		prim.set(0,false);
		prim.set(1,false);
		for(int i=2;i<prim.size();i++){
			if(prim.get(i)==false){
				continue;
			}
			for(int j=2*i;j<=num;j+=i){
				prim.set(j,false);
			}
		}
	}
	
	
	
	
	
	
	
//  ³¬Ê±
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		if(n<2){
//			System.out.println(0);
//			return;
//		}
//		int count=0;
//		for(int i=2;i<n;i++){
//			if(isPrim(i)){
//				count++;
//			}
//		}
//		System.out.println(count);
//	}
//
//	private static boolean isPrim(int num) {
//		// TODO Auto-generated method stub
//		int k=(int) Math.sqrt(num);
//		for(int i=2;i<=k;i++){
//			if(num%i==0){
//				return false;
//				
//			}
//		}
//		
//		return true;
//	}

}
