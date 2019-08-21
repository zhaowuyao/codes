package test;

import java.util.Scanner;
import java.util.HashMap;
public class StringChongPai {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		String str=sc.nextLine();
		int length=str.length();
		char[] chs=str.toCharArray();
		int sum=1;
		int index=1;
		for(int i=0;i<chs.length;i++){
			Integer count=map.get(chs[i]);
			if(count==null){
				map.put(chs[i], 1);
			}else{
				count++;
				index*=count;
				map.put(chs[i],count);
			}
			sum*=(i+1);
		}
		System.out.println(sum/index);
		
	}
	
	
	
	
	
	//超出时间了，不应每个情况都保存list进行输出，而是有计算公式，如上面的方法
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		ArrayList<String> list=new ArrayList<String>();
//		getPath(str.toCharArray(),0,list);
//		System.out.println(list.size());
//	}
//
//	private static void getPath(char[] cs, int index, ArrayList<String> list) {
//		// TODO Auto-generated method stub
//		if(index==cs.length-1){
//			if(!list.contains(String.valueOf(cs))){
//				list.add(String.valueOf(cs));
//			}
//		}
//		
//		for(int i=index;i<cs.length;i++){
//			swap(cs,index,i);
//			getPath(cs,index+1,list);
//			swap(cs,index,i);
//		}
//	}
//
//	private static void swap(char[] cs, int index, int i) {
//		// TODO Auto-generated method stub
//		char temp=cs[index];
//		cs[index]=cs[i];
//		cs[i]=temp;
//	}

}
