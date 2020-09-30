package pattern;

import java.util.Scanner;

public class fiboncci_series {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of the series ");
		int n=sc.nextInt();
		int i=0,j=1,k;
		System.out.println(i);
		System.out.println(j);
		 
		for(int a=0;a<n-2;a++)
		{
			k=i+j;
			
			i=j;
			j=k;
			System.out.println(k);
		}
		sc.close();
	}
}
