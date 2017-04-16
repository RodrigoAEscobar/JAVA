/*
* File: SudokuSubsquare.java
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

/**
 * @author Rodrigo Escobar
 *
 */
public class SudokuSubSquare {

	/**
	 * 
	 * @param subSquare- the subSquare to check
	 */
	public SudokuSubSquare(int[][] subSquare){
		this.matrix = subSquare;
	}
	private final int x = 3, y = 3;
	public int[][] matrix = new int[x][y];
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {


	}
	
	/**
	 * @param row - the row number to check
	 * @return true if row follows Sudoku rules
	 */
	public boolean checkRow(final int row){
		
		return matrix[row][0] != matrix[row][1] &&
				matrix[row][1] != matrix[row][2];
	}
	
	/**
	 * @param column - the column number to check
	 * @return true if column follows Sudoku rules
	 */
	public boolean checkColumn(final int column){
		
		return matrix[0][column] != matrix[1][column] &&
				matrix[1][column] != matrix[2][column];
	}
	
	public boolean isCorrect(){
		return true;

	}

}
