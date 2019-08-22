package test;

import java.util.Scanner;

//题目描述
//21 22……
//20 7 8 9 10
//19 6 1 2 11
//18 5 4 3 12
//17 16 15 14 13
//看清楚以上数字排列的规律，设1点坐标为(0,0)，x方向向右为正，y方向向下为正。例如7的坐标为(-1,-1)，2的坐标为(1,0)，3的坐标为(1,1)。
//编程实现输入任意坐标(x,y)，输出对应的数字。
//
//解答要求
//时间限制：1000ms, 内存限制：64MB
//输入
//输入包含多组测试，每组测试占一行，包含两个整数x,y , (-100 ≤ x, y ≤ 100), 输入到文件末尾结束。
//
//输出
//输出对应的数字，每组测试占一行。
//
//样例
//输入样例 1 复制
//
//0 0
//-1 -1
//输出样例 1
//
//1
//7

//可以这么想，给定一个坐标，从(0,0)开始走，走多少步到这个坐标就是答案。
//等于说从(0,0)开始走，一个周期走四步，分别是向右走(2i-1)，然后向下走(2i-1)，向左(2i)， 向上(2i) 。
//由于坐标绝对值不超过100，设置超过101的一个循环就是安全的，设置大也无所谓，反正找到这个坐标就跳出来。比较丑陋的是每一次变更x，y都要判断是否与输入的x0，y0相等是就返回。


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
