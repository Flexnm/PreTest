package flowCtrlEx;

import java.util.Arrays;

public class LettersArr {
	public static void main(String[] args) {
		
		String[] arr = {"O", "F", "I", "R", " ", "A", "R", "I", "E", "L", "I"};
		
		String[] arrRand = new String[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			int a = (int)(Math.random()*arr.length);
			if(arr[i] != null && arrRand[a] == null) {
			arrRand[a] = arr[i];
			arr[i] = null;
			} else {
				i--;
			}
		}
		System.out.println(Arrays.toString(arrRand));
	}

}
