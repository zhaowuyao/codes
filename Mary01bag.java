package test;


import java.util.Scanner;

//题目描述
//昨天是三八妇女节，在尧山食堂中央举办了一个活动所有的女童鞋可以再此免费拿走自己想要的物品。由于时间紧迫，Mary决定要将自己的背包装满。由于物品较多，且每个物品都有自己的重量，而Mary的背包只能承受固定的重量，她很烦恼如何才能装满自己的包包，所以现在交给你来将Mary的背包装满吧。
//
//注意：每种物品只能选一次，不考虑包的空间大小。
//
//解答要求
//时间限制：1000ms, 内存限制：64MB
//输入
//输入第一行包含两个空格分开的整数N(1≤ N ≤ 100)和S(1≤ S ≤ 1000)，现场有N个物品和Mary的背包最多只能装S千克的物品；第二行是N个正整数Wi(0 < Wi ≤ 100)，表示每个物品的重量(单位千克)。
//
//输出
//若能将Mary的背包装满则输出“YES”，否则输出“NO”。
//
//样例
//输入样例 1 复制
//
//7 15
//1 4 3 4 5 2 7
//输出样例 1
//
//YES
//
//输入样例 2 复制
//
//4 38
//20 24 24 44
//输出样例 2
//
//NO
//
//输入样例 3 复制
//
//9 81
//8 37 29 19 35 49 9 34 8
//输出样例 3
//
//YES

public class Mary01bag {
	static boolean flag=false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int S=sc.nextInt();
		int[] dp=new int[n];
		for(int i=0;i<n;i++){
			dp[i]=sc.nextInt();
		}
		getPath(dp,0,S,0);
		if(flag==true){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

	private static void getPath(int[] dp, int weight, int s,int index) {
		// TODO Auto-generated method stub
		if(weight==s){
			flag=true;
			return;
		}
		if(weight>s){
			return;
		}
		for(int i=index;i<dp.length;i++) {
			getPath(dp,weight+dp[i],s,i+1);
			if(flag==true){
				return;
			}
		}
	}

}
