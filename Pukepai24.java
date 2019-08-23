package test;

import java.util.Scanner;


//��Ŀ����
//��Ҷ�����˿���(A,2,3��T,J,Q,K)������ʹ��T����ʾ10����Aȡֵ1��Jȡֵ11��Qȡֵ12��Kȡֵ13������������жϸ��������ƣ��ܷ�ͨ���Ӽ��˳��������㣬ʹ�����Ľ����24��
//��������ΪA��5��8��J���������ô����5+J+(A*8)=24��
//
//���Ҫ��
//ʱ�����ƣ�5000ms, �ڴ����ƣ�64MB
//����
//�����ĸ��ַ���ʾ������(A,2,3��T,J,Q,K)���ÿո���������뵽�ļ�ĩβ������
//
//���
//���ܼ����24�����"Yes�����������"No"��
//
//����
//�������� 1 ����
//
//A 5 5 5
//A A A A
//������� 1
//
//Yes
//No

//��cards��¼��ʣ��Ŀ�Ƭ��num�ǵ�ǰ����õ���ֵ��ÿ�δ�cards��ѡһ�ų������мӼ��˳���������num�õ�24����cardsȡ���������Yes��

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
