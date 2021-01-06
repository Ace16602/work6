package javaµÚÆß¿Î;

import java.util.Random;
import java.util.Scanner;

public class question119 {

	public static void main(String args[]) {
		System.out.print("Enter the arrat size n:");
		Scanner number=new Scanner(System.in);
		int n=number.nextInt();
		int MaxRow=0;
		int MaxColumn=0;
		int RowIndex=0;
		int ColumnIndex=0;
		int[][] array=new int[100][100];
		int[] arrayRow=new int[100];
		int[] arrayColumn=new int[100];
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				int num=(int)(2*Math.random());
				if(num==1) {
					arrayRow[i]+=1;
					arrayColumn[j]+=1;
				}
				array[i][j]=num;
			}
		}
		for(int i=0;i<=n-1;i++) {
			if(arrayRow[i]>MaxRow) {
				MaxRow=arrayRow[i];
				RowIndex=i;
			}
			if(arrayColumn[i]>MaxColumn) {
				MaxColumn=arrayColumn[i];
				ColumnIndex=i;
			}
		}
		System.out.println("The random array is");
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		System.out.println("The largest row index:"+RowIndex);
		System.out.println("The largest column index:"+ColumnIndex);
	}
}
