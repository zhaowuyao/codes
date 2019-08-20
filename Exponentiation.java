package test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Exponentiation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			BigDecimal result=sc.nextBigDecimal();
			int b=sc.nextInt();
			String res=result.pow(b).stripTrailingZeros().toPlainString();
			if(res.startsWith("0")){
				System.out.println(res.substring(1));
			}else{
				System.out.println(res);
			}
		}
	}

}
