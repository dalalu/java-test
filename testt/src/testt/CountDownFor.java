package testt;

import java.util.Scanner;

public class CountDownFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		int x;
		do {
		    System.out.print("양의 정숫값:");
		    x = stdIn.nextInt();
		} while (x <= 0);
		
		
		  while (x >=0)
			  System.out.println(x--);
		      System.out.println("x의 값이" + x + "이 됐습니다.");
		
		//for(; x >=0; x--)
		//	System.out.println(x);

	}

}
