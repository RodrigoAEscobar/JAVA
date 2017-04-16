/*
* File: Sudoku.java
* Project: CSIS 3100 EscobarAsgn8
* Company: Nova Southeastern University
* Supervisor: Professor Paul Kenison
* Author: Rodrigo Escobar
* History: Created March 13 2013
* Assisted by: None
* References: Book: Big Java, 4th edition; Horstmann
* 					Oracle Website: 
* 					http://docs.oracle.com/javase/tutorial/java/data/index.html
* (c) Copyright Rodrigo Escobar 2013 All rights reserved.
*/

package Sudoku;

import java.util.ArrayList;

/**
 * @author Rodrigo Escobar
 *
 */
public class Sudoku {
	
	
	/*
	 * Write a program read in a 9 by 9 array of integers. 
	 * Next have the program check and see of the array of integers is a correct solution to a sudoku puzzle. 
	 * I sudoku puzzle is a 9 by 9 array of integers. 
	 * Each integers is restricited to being a value from 1 to 9. 
	 * Each row must have all 9 integers 1 thru 9. 
	 * So must each column and each 3 by 3 subsquare. 
	 * You might have methods such as:
	 * 								  - checkRow(int) // called 9 times
	 * 								  - checkColumn(int) // called 9 times
	 * 								  - checkSubSquare(int, int) // called 9 timesKEY 
	 * 									- checkSubSquare(int)
	 * 
	 * You might have a boolean array of 9 values ( maybe even 10)
	 * Assign all to false and then go through all values stored in the row (or column, or small sub-square)
	 * and change what is store to true for all 9 store values.
	 * Finally check and see if any of the 9 values is still false
	 * (if so then it is not a legal row (or column or small sub-square)
	 *  
	 * KEY NOTES:	 
	 * Sudoku is a square of 3 by 3 with 3 by 3 sub-squares
	 * Each row should have the numbers from 1 to 9 without repetitions
	 * Each column should have the numbers from 1 to 9 without repetitions
	 * Each sub-square should have the numbers from 1 to 9 without repetitions
	 * The sum of the digits is 45
	 * A solved sudoku could be:
	 * 								2 9 5 | 7 4 3 | 8 6 1
	 * 								4 3 1 | 8 6 5 | 9 2 7
	 * 								8 7 6 | 1 9 2 | 5 4 3
	 * 								---------------------
	 * 								3 8 7 | 4 5 9 | 2 1 6
	 * 								6 1 2 | 3 8 7 | 4 9 5 
	 * 								5 4 9 | 2 1 6 | 7 3 8
	 *  							---------------------
	 * 								7 6 3 | 5 2 4 | 1 8 9 
	 * 								9 2 8 | 6 7 1 | 3 5 4 
	 * 								1 5 4 | 9 3 8 | 6 7 2
	 */



	private SudokuSubSquare[][] subSquares = new SudokuSubSquare[3][3];	// Table and subsquares
	private final int x = 9, y=9;				 // Table size values
	private int[][] solution = new int[x][y];
	ArrayList<SudokuSubSquare> subSquareList = 
			new ArrayList<SudokuSubSquare>();
	int[][] subSquareArr = new int[3][3];
	
	public Sudoku(int [][] solution){
		this.solution = solution;
	}
	
	public static void main(String[] args){
		test();
	}
		
	public static void test(){				// Solution array to be tested.

		int [][] aSolution ={{2, 9, 5, 7, 4, 3, 8, 6, 1},
							{4, 3, 1, 8, 6, 5, 9, 2, 7},
							{8, 7, 6, 1, 9, 2, 5, 4, 3},
							{3, 8, 7, 4, 5, 9, 2, 1, 6},
							{6, 1, 2, 3, 8, 7, 4, 9, 5}, 
							{5, 4, 9, 2, 1, 6, 7, 3, 8},
							{7, 6, 3, 5, 2, 4, 1, 8, 9}, 
							{9, 2, 8, 6, 7, 1, 3, 5, 4}, 
							{1, 5, 4, 9, 3, 8, 6, 7, 2}};
		
		Sudoku aSudoku = new Sudoku(aSolution);
		System.out.println(aSudoku.isValidInput());
		
		ArrayList<SudokuSubSquare> aList = 
				aSudoku.makeSubSquares();
		
		aList.get(8).toString();
		
	}
	
	/**
	 * Checks to see if the solution entered
	 * follows the rules that each entry must be a 
	 * unique number between 1 and 9 (inclusive) of
	 * every row and every column
	 * @return
	 */
	public boolean isValidInput(){
		int sum1 = 45*9;
		int sum2 = 0;
		
		for(int i = 0; i < solution.length; i++){
			for(int j = 0; j < solution.length; j++)
			sum2 += solution[i][j];
		}
		
		return sum1 == sum2;
	}
	/**
	 * @return: Subsquares
	 */
	public ArrayList<SudokuSubSquare> makeSubSquares(){
		int[][] subSquareArr1 = new int[3][3];
		int[][] subSquareArr2 = new int[3][3];
		int[][] subSquareArr3 = new int[3][3];
		int[][] subSquareArr4 = new int[3][3];
		int[][] subSquareArr5 = new int[3][3];
		int[][] subSquareArr6 = new int[3][3];
		int[][] subSquareArr7 = new int[3][3];
		int[][] subSquareArr8 = new int[3][3];
		int[][] subSquareArr9 = new int[3][3];
		
		
		for (int i = 0; i < solution.length; i++){
			for(int j = 0; j < 3; j++)
				subSquareArr1[i%3][j] = solution[i][j];
			for(int j = 3; j < 6; j++)
				subSquareArr2[i%3][j%3] = solution[i][j];
			for(int j = 6; j < 9; j++)
				subSquareArr3[i%3][j%3] = solution[i][j];
			if(i%3==2){
				subSquareList.add(new SudokuSubSquare(subSquareArr1));
				subSquareList.add(new SudokuSubSquare(subSquareArr2));
				subSquareList.add(new SudokuSubSquare(subSquareArr3));
				subSquareArr1 = new int[3][3];
				subSquareArr2 = new int[3][3];
				subSquareArr3 = new int[3][3];
			}
		}
		
		return subSquareList;
	}
}
		 

		
	


