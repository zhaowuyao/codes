package test;

import java.util.Scanner;

//��Ŀ����
//21 22����
//20 7 8 9 10
//19 6 1 2 11
//18 5 4 3 12
//17 16 15 14 13
//����������������еĹ��ɣ���1������Ϊ(0,0)��x��������Ϊ����y��������Ϊ��������7������Ϊ(-1,-1)��2������Ϊ(1,0)��3������Ϊ(1,1)��
//���ʵ��������������(x,y)�������Ӧ�����֡�
//
//���Ҫ��
//ʱ�����ƣ�1000ms, �ڴ����ƣ�64MB
//����
//�������������ԣ�ÿ�����ռһ�У�������������x,y , (-100 �� x, y �� 100), ���뵽�ļ�ĩβ������
//
//���
//�����Ӧ�����֣�ÿ�����ռһ�С�
//
//����
//�������� 1 ����
//
//0 0
//-1 -1
//������� 1
//
//1
//7

//������ô�룬����һ�����꣬��(0,0)��ʼ�ߣ��߶��ٲ������������Ǵ𰸡�
//����˵��(0,0)��ʼ�ߣ�һ���������Ĳ����ֱ���������(2i-1)��Ȼ��������(2i-1)������(2i)�� ����(2i) ��
//�����������ֵ������100�����ó���101��һ��ѭ�����ǰ�ȫ�ģ����ô�Ҳ����ν�������ҵ������������������Ƚϳ�ª����ÿһ�α��x��y��Ҫ�ж��Ƿ��������x0��y0����Ǿͷ��ء�


public class Ratation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		while(sc.hasNext()){
			int x=sc.nextInt();
			int y=sc.nextInt();
			int result=getResult(x,y);
			System.out.println(result);
			
		}
	}

	private static int getResult(int x, int y) {
		// TODO Auto-generated method stub
		int startx=0;
		int starty=0;
		int num=1;
		if(startx==x&&starty==y){
			return num;
		}
		for(int z=1;z<105;z++){
			for(int i=1;i<=2*z-1;i++){
				startx=startx+1;
				num++;
//				System.out.println(num);
				if(startx==x&&starty==y){
					return num;
				}
			}
			for(int i=1;i<=2*z-1;i++){
				starty=starty+1;
				num++;
//				System.out.println(num);
				if(startx==x&&starty==y){
					return num;
				}
			}
			for(int i=1;i<=2*z;i++){
				startx=startx-1;
				num++;
//				System.out.println(num);
				if(startx==x&&starty==y){
					return num;
				}
			}
			for(int i=1;i<=2*z;i++){
				starty=starty-1;
				num++;
//				System.out.println(num);
				if(startx==x&&starty==y){
					return num;
				}
			}
		}
		return num;
	}

}
