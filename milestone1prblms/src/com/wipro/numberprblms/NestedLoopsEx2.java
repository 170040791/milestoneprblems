package com.wipro.numberprblms;

public class NestedLoopsEx2 {



	void prime(int x,int y) {



		int flag=0;



		if(x>y) {



			System.out.println("please check your numbers");



		}



		for(int j=x;j<=y;j++) {



			flag=0;



			for(int i=2;i<=j/2;i++)



			{



				if(j%i==0) {



					flag=1;



					break;



				}



			}







		if(flag==0)



		{



			System.out.println(j);



		}







		}



	}



	public static void main(String args[]) {



		NestedLoopsEx2 n=new NestedLoopsEx2();



		n.prime(Integer.parseInt(args[0]),Integer.parseInt(args[1]));







	}







}