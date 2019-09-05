//7.13: PassArray.java
//Passing Arrays and individual array elements to methods.

public class PassArray
{
	//Main creates array and calls modifyArray and modifyElement
	public static void main(String[] args) 
	{
		int[] array = {1, 2, 3, 4, 5};

		System.out.printf(
			"Effect of passing reference to entire array:%n" + 
			"The values of the original array are:%n");

		//Output original array values
		for (int value : array)
			System.out.printf("   %d", value);

		modifyArray(array); //pass array reference
		System.out.printf("%n%nThe values of the modified array are:%n");

		//Output modified array element
		for(int values : array)
			System.out.printf("   %d", values);

		System.out.printf(
			"%n%nEffects of passing array element value:%n" +
			"array[3] before modifyElement: %d%n", array[3]);

		modifyElement(array[3]); //Attemp to modify array[3]
		System.out.printf(
			"array[3] after modifyelement: %d%n", array[3]);
	}

	//Multiply each element of an array by 2
	public static void modifyArray(int[] array2)
	{
		for (int counter = 0; counter < array2.length; counter++)
			array2[counter] *= 2;
	}

	//Multiply argument by2
	public static void modifyElement(int element)
	{
		element *= 2;
		System.out.printf(
			"Value of element in modifyElement: %d%n", element);
	}

}