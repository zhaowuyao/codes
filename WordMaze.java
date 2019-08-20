package test;

import java.util.Scanner;

public class WordMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		sc.nextLine();
		String string=sc.nextLine();
		char[][] matrix=new char[m][n];
		boolean[][] flag=new boolean[m][n];
		for(int i=0;i<m;i++){
			String str=sc.nextLine();
			matrix[i]=str.toCharArray();
		}
//		for(int i=0;i<m;i++){
//			for(int j=0;j<n;j++){
//				System.out.print(matrix[i][j]);
//			}
//			System.out.println();
//		}
		int index=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(getPath(matrix,string,i,j,index,flag)){
					System.out.println("YES");
					return;
				}
			}
		}
		System.out.println("NO");
		

}

	private static boolean getPath(char[][] matrix, String str,int i, int j, int index ,boolean[][] flag) {
		// TODO Auto-generated method stub
		if(i<0||j<0||matrix.length<=i||matrix[0].length<=j||flag[i][j]==true||matrix[i][j]!=str.charAt(index)){
			return false;
		}
		flag[i][j]=true;
		if(index==str.length()-1){
			return true;
		}
		index++;
		if(getPath(matrix,str,i-1,j,index,flag)||getPath(matrix,str,i+1,j,index,flag)||
				getPath(matrix,str,i,j-1,index,flag)||getPath(matrix,str,i,j+1,index,flag)){
			return true;
		}
		flag[i][j]=false;
		return false;
	}
}