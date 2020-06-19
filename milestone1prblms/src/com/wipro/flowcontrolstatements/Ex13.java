package com.wipro.flowcontrolstatements;

public class Ex13 {


public static void main(String args[])


{



int flag=0;



for(int j=10;j<=99;j++) {



	flag=0;



	for(int i=2;i<j/2;i++)



	for(int i1=2;i1<=j/2;i1++)



	{



		if(j%i1==0) {



			flag=1;


			break;


		}


	}


	


if(flag==0)


{


	System.out.println(j);


}





}


}}


