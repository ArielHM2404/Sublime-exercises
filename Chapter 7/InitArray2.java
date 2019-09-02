// 7.3: InititArray2.java
//Initializing the elements of an array with and array initializer.

public class InitArray2 
{
	public static void main(String[] args)
	{
		//Declare variable array and initialize it with an array object
		int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37}; //Create the array object

		System.out.printf("%s%8s%n", "Index", "Value"); //Columns heading

		//Output each array element's value
		for(int counter = 0; counter < array.length; counter++) 
		{
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
	}
}