package com.wipro.patterns;

public class Pt29 {



	public static void main(String args[]) {



		int i,j,k=1;



		int n=Integer.parseInt(args[0]);



		for(i=1;i<=n;i++)



		{



			for(j=1;j<2*i-1;j++)



			{



				System.out.print(" ");







			}



			for(j=1;j<=n-i+1;j++)



			{



				System.out.print(k+" ");



				k++;











			}











			System.out.println("");



		}



	}



}
