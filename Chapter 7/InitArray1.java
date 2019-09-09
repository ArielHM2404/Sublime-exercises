//7.17: InitArray.java
//Initializing two-dimensional array

public class InitArray1
{
	public static void main(String[] args)
	{
		int[][] array1 = {{1,2,3}, {4,5,6}};
		int[][] array2 = {{1,2}, {3}, {4,5,6}};

		System.out.println("Values in array1 by row are:");
		outputArray(array1); //display array1 by row

		System.out.printf("%nValues in array2 by row are%n");
		outputArray(array2); //display array2 by row
	}

	//Output roes and columns of a two-dimensional array
	public static void outputArray(int[][] array)
	{
		//Loop through array's row
		for( int row = 0; row < array.length; row++)
		{
			//Loop through columns of current row
			for(int column = 0; column < array[row].length; column++)
				System.out.printf("%d ", array[row][column]);

			System.out.println();

		}
	}
}