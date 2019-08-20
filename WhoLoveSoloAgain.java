package test;

import java.util.Scanner;

public class WhoLoveSoloAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] chs = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		boolean head = true;
		boolean space = false;
		for (int i = 0; i < chs.length; i++) {
			if (Character.isLowerCase(chs[i]) || Character.isUpperCase(chs[i])) {
				if (space) {
					sb.append(" ");
					space=false;
				}
				if (head) {
					sb.append(Character.toUpperCase(chs[i]));
					head = false;
				} else {
					sb.append(chs[i]);
				}

			} else {
				head = true;
				space=true;
			}

		}
		sb.append('.');
		String string=sb.toString();
		if(string.charAt(0)==' '){
			sb.deleteCharAt(0);
		}
		System.out.println(sb.toString());

	}

}
