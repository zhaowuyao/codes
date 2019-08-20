package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
class Country{
	String name;
	int one;
	int two;
	int three;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOne() {
		return one;
	}
	public void setOne(int one) {
		this.one = one;
	}
	public int getTwo() {
		return two;
	}
	public void setTwo(int two) {
		this.two = two;
	}
	public int getThree() {
		return three;
	}
	public void setThree(int three) {
		this.three = three;
	}
	
	
}

public class OlympicGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		ArrayList<Country> list=new ArrayList<Country>();
		for(int i=0;i<n;i++){
			Country cty=new Country();
			cty.setName(sc.next());
			cty.setOne(sc.nextInt());
			cty.setTwo(sc.nextInt());
			cty.setThree(sc.nextInt());
			list.add(cty);
		}
		
		PriorityQueue<Country> queue=new PriorityQueue<>(11,new Comparator<Country>() {

			@Override
			public int compare(Country o1, Country o2) {
				// TODO Auto-generated method stub
				if(o2.getOne()!=o1.getOne()){
				return o2.getOne()-o1.getOne();
				}else if(o2.getTwo()!=o1.getTwo()){
					return o2.getTwo()-o1.getTwo();
				}else if(o2.getThree()!=o1.getThree()){
					return o2.getThree()-o1.getThree();
				}else{
					return o1.getName().compareTo(o2.getName());
				}
			}
		});
		for(Country c:list){
			queue.add(c);
		}
		while(!queue.isEmpty()){
			System.out.println(queue.poll().getName());
		}
		
	}

}
