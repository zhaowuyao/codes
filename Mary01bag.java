package test;


import java.util.Scanner;

//��Ŀ����
//���������˸�Ů�ڣ���Ңɽʳ������ٰ���һ������е�ŮͯЬ�����ٴ���������Լ���Ҫ����Ʒ������ʱ����ȣ�Mary����Ҫ���Լ��ı���װ����������Ʒ�϶࣬��ÿ����Ʒ�����Լ�����������Mary�ı���ֻ�ܳ��̶ܹ������������ܷ�����β���װ���Լ��İ������������ڽ���������Mary�ı���װ���ɡ�
//
//ע�⣺ÿ����Ʒֻ��ѡһ�Σ������ǰ��Ŀռ��С��
//
//���Ҫ��
//ʱ�����ƣ�1000ms, �ڴ����ƣ�64MB
//����
//�����һ�а��������ո�ֿ�������N(1�� N �� 100)��S(1�� S �� 1000)���ֳ���N����Ʒ��Mary�ı������ֻ��װSǧ�˵���Ʒ���ڶ�����N��������Wi(0 < Wi �� 100)����ʾÿ����Ʒ������(��λǧ��)��
//
//���
//���ܽ�Mary�ı���װ���������YES�������������NO����
//
//����
//�������� 1 ����
//
//7 15
//1 4 3 4 5 2 7
//������� 1
//
//YES
//
//�������� 2 ����
//
//4 38
//20 24 24 44
//������� 2
//
//NO
//
//�������� 3 ����
//
//9 81
//8 37 29 19 35 49 9 34 8
//������� 3
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
