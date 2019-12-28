package flowCtrlEx;

import java.util.Arrays;
import java.util.Scanner;

public class LotoList2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("How many loto lists show I create? - ");
		int listNum = scan.nextInt();
		

		int[][] arr = new int[listNum][6];

		
		int counter = 0; // I just wanted to know how many times it hits a duplicate. Was not requested in the question.
		for (int i = 0; i < arr.length; i++) {
			int index = 0;
			while (index < arr[i].length) {
				int num = (int) (Math.random() * 38 + 1);
				int j;
				for (j = 0; j < index; j++) { // unique checker
					if (arr[i][j] == num) {
						counter++; // Counting duplicates for myself.
						break; // num already in the array.
					}
				}
				if (j == index) { // num is unique.
					arr[i][index] = num;
					index++;
				} // end of unique checker.
			}
			System.out.println(Arrays.toString(arr[i])); // One array at a time.
		}

		System.out.println(Arrays.deepToString(arr)); // The whole matrix
		System.out.println("Number of retries due to duplications: " + counter);

		scan.close();
	}

}
