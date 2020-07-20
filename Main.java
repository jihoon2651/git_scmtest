package com.edu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("몇 개의 숫자를 입력하시겠습니까?");
	    cnt = sc.nextInt();
	      
	    int[] numArr = new int[cnt];
	      
	      for (int i = 0; i < numArr.length; i++) {
	         System.out.print("숫자를 입력하세요.");
	         num = sc.nextInt();
	         numArr [i] = num;
	         
	         Calc calc = new Calc(numArr[i]);
	      }

	}

}
