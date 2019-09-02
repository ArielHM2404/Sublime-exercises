//7.4: InitArray3.java
//Calculating the values to be placed into the elements of an array

public class InitArray3
{
	public static void main(String[] args) 
	{
		final int ARRAY_LENGHT = 10; //declare constant
		int[] array = new int[ARRAY_LENGHT]; //create array

		//Calculate value for each array element
		for (int counter = 0; counter < array.length; counter++)
			array[counter] = 2 + 2 * counter;

		System.out.printf("%s%8s%n", "Index", "Value");

		//Output each array element's value
		for(int counter = 0; counter < array.length; counter++)
			System.out.printf("%5d%8d%n", counter, array[counter]);

	}
	
}