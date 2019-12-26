package flowCtrlEx;

import java.util.Scanner;

public class StarSquare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Input square size: ");
		int starNum = scan.nextInt();
		
		for (int i = 0; i < starNum; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		collum(starNum);

		for (int i = 0; i < starNum; i++) {
			System.out.print("*");
		}

		scan.close();
	}

	public static void collum(int num) {
		for (int i = 0; i < num - 2; i++) {
			System.out.print("*");
			for (int j = 0; j < num - 2; j++) {
				System.out.print(" ");	
			}
			System.out.println("*");	
		}
		return;
	}

}
