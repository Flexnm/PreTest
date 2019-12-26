package flowCtrlEx;

import java.util.Scanner;

public class NumTriPrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int num2 = num;
		while (num2 >= 2) {

			for (int i = 1; i <= num2; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			num2 = num2 - 1;
		}
		while (num2 <= num) {

			for (int i = 1; i <= num2; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			num2 = num2 + 1;
		}
		scan.close();

	}

}
