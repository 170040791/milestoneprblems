package com.wipro.numberprblms;

public class LoopBasedEx5 {







	int power(int x,int y) {



      int i,ans=1;



      for(i=1;i<=y;i++)



      {



    	  ans=ans*x;



      }return ans;



	}



	public static void main(String args[]) {



		LoopBasedEx5 l=new LoopBasedEx5();



		System.out.println(l.power(Integer.parseInt(args[0]), Integer.parseInt(args[1])));







	}



}