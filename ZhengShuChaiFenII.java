package test;

import java.util.Arrays;
import java.util.Scanner;

//题目描述
//The problem is, given an positive integer N, we define an equation like this:
//
//N=a[1]+a[2]+a[3]+…+a[m];
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
//解答要求
//时间限制：1000ms, 内存限制：64MB
//输入
//The input contains several test cases. Each test case contains a positive integer N(1<=N<=20) which is mentioned above. The input is terminated by the end of file.
//
//输出
//For each test case, you have to output several lines indicate the different equations you have found.
//
//样例
//输入样例 1 复制
//
//3
//4
//输出样例 1
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
//提示
//The first case,you can't print 3=2+1(it's not lexicographical order),and you must print 3=1+1+1 before 3=1+2 .



//解题思路
//建模：
//设f(n,m)为用大于等于m且小于等于n的数划分n
//则题目求解的问题就是f（n, 1）
//问题边界：
//n = 0时，没有需要划分的数，输出结果，直接返回
//n < m时，不够划分，直接返回
//n > m时，依次用大于等于m，小于等于 n 的数 i 划分n后继续求解f(n-i, i)，因为输出的要从左到右划分的数越大，所以用i划分后，后续必须使用大于等于i的数继续划分
//注意点：在实现的时候，因为需要输出表达式，需要注意表达式的拼接，特别是用n划分n的时候

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
