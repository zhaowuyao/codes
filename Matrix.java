package test;

import java.util.Scanner;

//��Ŀ����
//���������һ��n��m�ľ��󣬾����е�ÿһ��Ԫ�ض���һ����������������Ҫ����Ӿ�������Ͻ��ߵ����½����߹�������Ԫ����ӵ����͡�
//ע�⣺ֻ�����һ��������ߣ������߳��߽硣
//
//���Ҫ��
//ʱ�����ƣ�1000ms, �ڴ����ƣ�64MB
//����
//�����һ�а��������ÿո�ֿ�������n (1�� n �� 100)��m (1�� m �� 100)����ʾn��m�еľ��󣻽�������n��ÿ�а���m���ÿո�ֿ��ķǸ�������A (0 �� A �� 100)��
//
//���
//����Ӿ�������Ͻ��ߵ����½����߹�������Ԫ����ӵ����͡�
//
//����
//�������� 1 ����
//
//2 3
//1 2 3
//1 0 2
//������� 1
//
//8
//
//�������� 2 ����
//
//5 3
//14 14 4
//76 5 76
//78 23 23
//45 75 53
//52 43 71
//������� 2
//
//412
//
//��ʾ
//Sample test1������Ϊ1+2+3+2=8��

//Sample test2����Ϊ14+76+78+45+75+53+71=412

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
