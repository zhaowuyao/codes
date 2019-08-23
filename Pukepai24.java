package test;

import java.util.Scanner;


//题目描述
//大家都玩过扑克牌(A,2,3…T,J,Q,K)，我们使用T来表示10，且A取值1，J取值11，Q取值12，K取值13，你的任务是判断给定四张牌，能否通过加减乘除四种运算，使得最后的结果是24。
//若四张牌为A、5、8、J，则可以这么计算5+J+(A*8)=24。
//
//解答要求
//时间限制：5000ms, 内存限制：64MB
//输入
//输入四个字符表示四张牌(A,2,3…T,J,Q,K)，用空格隔开。输入到文件末尾结束。
//
//输出
//若能计算出24，输出"Yes”，否则输出"No"。
//
//样例
//输入样例 1 复制
//
//A 5 5 5
//A A A A
//输出样例 1
//
//Yes
//No

//用cards记录了剩余的卡片，num是当前计算得到的值，每次从cards中选一张出来进行加减乘除，如果最后num得到24并且cards取完了则输出Yes。

public class Pukepai24 {
	 private static boolean isSuccess;
	    private static final int LIMIT = 24;
	    private static void playGame(int[] cards, double num) {
	        if ((int)num == LIMIT && cards.length == 0) isSuccess = true;
	        for (int i = 0; i < cards.length; i++) {
	            int[] newCards = new int[cards.length - 1];
	            int cnt = 0;
	            for (int j = 0; j < cards.length; j++) {
	                if (i == j) continue;
	                newCards[cnt++] = cards[j];
	            }
	            playGame(newCards, num + cards[i]);
	            playGame(newCards, num - cards[i]);
	            playGame(newCards, num * cards[i]);
	            if (cards[i] != 0) playGame(newCards, 1.0 * num / cards[i]);
	        }
	    }
	    public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        while (in.hasNextLine()) {
	            String cardsStr[] = in.nextLine().split(" ");
	            int cards[] = new int[cardsStr.length];
	            for (int i = 0; i < cards.length; i++) {
	                if (cardsStr[i].equals("A")) cards[i] = 1;
	                else if (cardsStr[i].equals("J")) cards[i] = 11;
	                else if (cardsStr[i].equals("Q")) cards[i] = 12;
	                else if (cardsStr[i].equals("K")) cards[i] = 13;
	                else {
	                    cards[i] = Integer.parseInt(cardsStr[i]);
	                }
	            }
	            isSuccess = false;
	            playGame(cards, 0);
	            if (isSuccess) System.out.println("Yes");
	            else System.out.println("No");
	        }
	    }

}
