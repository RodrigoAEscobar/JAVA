package com.array.samples;
public class MultidimensionalArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// integer array 512 x 128 elements
		int twoD[][] = new int[512][128];
		// character array 8 x 16 x 24
		char[][][] threeD = new char[8][16][24];
		// String array 4 rows x 2 columns
		String[][] dogs = { { "terry", "brown", "" },
							{ "Kristin", "white" },
							{ "toby", "gray" },
							{ "fido", "black" }
						  };
		System.out.println("twoD[9][22] = " + twoD[9][22]);
		System.out.println("threeD[1][2][3] = " + threeD[1][2][3]);
		System.out.println("dogs[1][1] = " + dogs[1][1]);
		System.out.println("dogs 1st LENGTH = " + dogs.length);		
		System.out.println("dogs 2nd LENGTH = " + dogs[1].length);		

	}

}
