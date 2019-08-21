package test;

import java.util.Arrays;
import java.util.Scanner;

//��Ŀ����
//The problem is, given an positive integer N, we define an equation like this:
//
//N=a[1]+a[2]+a[3]+��+a[m];
//a[i]>0,1<=m<=N;
//
//For example, assume N is 5, we can find:
//
//5=1+1+1+1+1
//5=1+1+1+2
//5=1+1+3
//5=1+2+2
//5=1+4
//5=2+3
//5=5
//Note that "5 = 3 + 2" and "5 = 2 + 3" is the same in this problem. Now, you do it!"
//But now , you must output all the equations in lexicographical order;
//
//���Ҫ��
//ʱ�����ƣ�1000ms, �ڴ����ƣ�64MB
//����
//The input contains several test cases. Each test case contains a positive integer N(1<=N<=20) which is mentioned above. The input is terminated by the end of file.
//
//���
//For each test case, you have to output several lines indicate the different equations you have found.
//
//����
//�������� 1 ����
//
//3
//4
//������� 1
//
//3=1+1+1
//3=1+2
//3=3
//4=1+1+1+1
//4=1+1+2
//4=1+3
//4=2+2
//4=4
//
//��ʾ
//The first case,you can't print 3=2+1(it's not lexicographical order),and you must print 3=1+1+1 before 3=1+2 .



//����˼·
//��ģ��
//��f(n,m)Ϊ�ô��ڵ���m��С�ڵ���n��������n
//����Ŀ�����������f��n, 1��
//����߽磺
//n = 0ʱ��û����Ҫ���ֵ�������������ֱ�ӷ���
//n < mʱ���������֣�ֱ�ӷ���
//n > mʱ�������ô��ڵ���m��С�ڵ��� n ���� i ����n��������f(n-i, i)����Ϊ�����Ҫ�����һ��ֵ���Խ��������i���ֺ󣬺�������ʹ�ô��ڵ���i������������
//ע��㣺��ʵ�ֵ�ʱ����Ϊ��Ҫ������ʽ����Ҫע����ʽ��ƴ�ӣ��ر�����n����n��ʱ��

public class ZhengShuChaiFenII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			StringBuffer sb=new StringBuffer();
			sb.append(n).append("=");
			getPath(n,1,sb);
		}
	}

	private static void getPath(int n, int m, StringBuffer sb) {
		// TODO Auto-generated method stub
		if(n==0){
			System.out.println(new StringBuffer(sb));
			return;
		}
		if(n<m){
			return;
		}
		
		for(int i=m;i<n;i++){
			StringBuffer sbadd=new StringBuffer(sb);
			sbadd.append(i).append("+");
			getPath(n-i,i,sbadd);
			
		}
		StringBuffer sbend=new StringBuffer(sb);
		sbend.append(n);
		getPath(0,n,sbend);
	}

}
