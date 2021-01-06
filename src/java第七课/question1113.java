package javaµÚÆß¿Î;

import java.util.ArrayList;
import java.util.Scanner;
public class question1113 {
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		Scanner number=new Scanner(System.in);
		for(int i=0;i<=10;i++) {
			int num=number.nextInt();
			list1.add(num);
		}
		removeDuplicate(list1);
	}
	public static void removeDuplicate(ArrayList<Integer> list) {
		int n=10;
		for(int i=0;i<=n;i++) {
			while(list.contains(list.get(i))&&i!=list.lastIndexOf(list.get(i))) {
				list.remove(list.lastIndexOf(list.get(i)));
				n-=1;
			}
		}
		for(int i=0;i<=n;i++) {
			System.out.print(list.get(i));
			System.out.print(" ");
		}
	}
}
