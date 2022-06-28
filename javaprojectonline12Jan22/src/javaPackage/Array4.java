package javaPackage;

public class Array4 {

	public static void main(String[] args) {
		// Defining an Multi Dimensional Array
		int a[][] = { { 1, 4, 7, 8 }, { 9, 7, 3, 8 }, { 3, 5, 6, 1 } };
		// Total Rows
		int row = a.length;
		System.out.println("Total rows:-" + row);

		// Total Column
		int column = a[0].length;
		System.out.println("Total Column:-" + column);

		// print all data from Multidimensional Array
		// Outer Loop
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(a[i][j] + "");
			}
			System.out.println();
		}

	}

}
