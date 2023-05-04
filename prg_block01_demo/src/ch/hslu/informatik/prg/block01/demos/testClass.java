package ch.hslu.informatik.prg.block01.demos;

import java.util.Arrays;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 16;
        int columns = 16;
 
        int[][] array = new int[rows][columns];
 
        int value = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = value;
                value++;
            }
        }
 
        System.out.println("The 2D array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
	}

}
