package test;

import java.util.ArrayList;
import java.util.Collections;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		Permutation(str);
		
	}

	public static ArrayList<String> Permutation(String str) {
		ArrayList<String> list = new ArrayList<String>();
		getPath(str.toCharArray(), list, 0);
		// for(String s:list){
		// System.out.println(s+" ");
		// }
		Collections.sort(list);
		return list;
	}

	private static void getPath(char[] str, ArrayList<String> list, int index) {
		// TODO Auto-generated method stub
		if (index == str.length - 1) {
			if (!list.contains(String.valueOf(str))) {
				list.add(String.valueOf(str));
				
			}
		}
		for (int i = index; i < str.length; i++) {
			swap(str, index, i);
			getPath(str, list, index + 1);
			swap(str, index, i);
		}
	}

	private static void swap(char[] str, int i, int j) {
		// TODO Auto-generated method stub
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}

}
