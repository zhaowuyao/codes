package test;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		StringBuffer sbrow=new StringBuffer();
		StringBuffer sbcol=new StringBuffer();
		sbrow.append("+");
		sbcol.append("|");
		for(int i=0;i<m;i++){ //列的添加单元
			sbrow.append("---+");
			sbcol.append("   |");
		}
		for(int i=0;i<2*n+1;i++){
			if(i%2==0){
				System.out.println(sbrow);
			}else{
				System.out.println(sbcol);
			}
		}
	}

}
