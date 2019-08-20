package test;

import java.util.Scanner;

public class NJinZhi {

	private static final int EFFECTIVE_NUMBER = 10;
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    while (scanner.hasNextDouble()) {
	        double m = scanner.nextDouble();
	        int n = scanner.nextInt();
	        if (isLegal(m, n)) {
	            getResult(m, n);
	        }
	    }
	}
	private static boolean isLegal(double m, int n) {
	    return n > 1 && n < 10 && !(m <= 0.0000009) && !(m >= 1.0);
	}
	private static void getResult(double m, int n) {
	    // 计算结果
	    int[] result = doCalculate(m, n);
	    // 打印结果
	    printResult(result);
	}
	private static int[] doCalculate(double m, int n) {
	    int[] result = new int[10];
	    int index;
	    for (index = 0; index < EFFECTIVE_NUMBER; index++) {
	        m *= n;
	        result[index] = (int)m;
	        if (m >= 1.0) {
	            m -= result[index];
	        }
	    }
	    return result;
	}
	private static void printResult(int[] result) {
	    System.out.print("0.");
	    for (int index = 0; index < EFFECTIVE_NUMBER; index++) {
	        System.out.printf("%d", result[index]);
	    }
	    System.out.println();
	}
}
