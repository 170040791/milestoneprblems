package com.wipro.numberprblms;





public class NormalEx1 {



	int m1(int a) {



		int i,sum=0;



      for(i=1;i<=a;i++) {



    	  sum=sum+i;



      }return sum;



	}



	int m2(int a) {



		int p;



		p=a*(a+1)/2;



		return p;



	}



	public static void main(String args[]) {



		NormalEx1 n=new NormalEx1();



		int f=n.m1(Integer.parseInt(args[0]));



		int f1=n.m2(Integer.parseInt(args[0]));



		System.out.println(f);



		System.out.println(f1);











	}







}