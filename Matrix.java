package test;

import java.util.Scanner;

//题目描述
//现在你面对一个n×m的矩阵，矩阵中的每一个元素都是一个整数，现在你需要计算从矩阵的左上角走到右下角所走过的所有元素相加的最大和。
//注意：只能向右或者向下走，不能走出边界。
//
//解答要求
//时间限制：1000ms, 内存限制：64MB
//输入
//输入第一行包含两个用空格分开的整数n (1≤ n ≤ 100)和m (1≤ m ≤ 100)，表示n行m列的矩阵；接下来是n行每行包含m个用空格分开的非负的整数A (0 ≤ A ≤ 100)。
//
//输出
//输出从矩阵的左上角走到右下角所走过的所有元素相加的最大和。
//
//样例
//输入样例 1 复制
//
//2 3
//1 2 3
//1 0 2
//输出样例 1
//
//8
//
//输入样例 2 复制
//
//5 3
//14 14 4
//76 5 76
//78 23 23
//45 75 53
//52 43 71
//输出样例 2
//
//412
//
//提示
//Sample test1中最大和为1+2+3+2=8。

//Sample test2最大和为14+76+78+45+75+53+71=412

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		sc.nextLine();
		int[][] array=new int[n][m];
		int[][] dp=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				array[i][j]=sc.nextInt();
			}
			sc.nextLine();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(i>0&&j>0){
					int max=Math.max(dp[i-1][j],dp[i][j-1]);
					dp[i][j]=max+array[i][j];
				}else if(i==0&&j>0){
					dp[i][j]=dp[i][j-1]+array[i][j];
				}else if(i>0&&j==0){
					dp[i][j]=dp[i-1][j]+array[i][j];
				}else if(i==0&&j==0){
					dp[i][j]=array[i][j];
				}
			}
		}
		System.out.println(dp[n-1][m-1]);
	}

}
