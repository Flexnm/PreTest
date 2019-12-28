package flowCtrlEx;

import java.util.Arrays;

public class LettersArr {
	public static void main(String[] args) {
		
		String[] arr = {"B", "R", "U", "C", "E", " ", "W", "I", "L", "L", "I", "S"}; // Original array with a name.
		
		String[] arrRand = new String[arr.length]; // The new array with a random order of letters.
		
		for (int i = 0; i < arr.length; i++) { // Running on the array arr.
			int a = (int)(Math.random()*arr.length); // Randomizing a random index.
			if(arr[i] != null && arrRand[a] == null) { // If there is a letter in the original array and free room in the new array.
			arrRand[a] = arr[i]; // Put that letter in the new array in a random index.
			arr[i] = null; // Delete that letter from the original array.
			} else { // if the index in arr is empty or the random index of arrRand is full.
				i--; // Randomize a new index for arrRand.
			}
		}
		System.out.println(Arrays.toString(arrRand));
	}

}
