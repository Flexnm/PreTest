package flowCtrlEx;

import java.util.Arrays;
import java.util.Scanner;

public class LotoList { // Unfinished - needs to make sure that in each lotto list there are unique numbers.
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many loto lists show I create? - ");
		int listNum = scan.nextInt();
		
		for (int i = 0; i < listNum; i++) {
			int[] arr = new int[6];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = (int)(Math.random()*38 + 1);
			}
			System.out.println(Arrays.toString(arr));
		}
		
		scan.close();
		
		
	}

}
