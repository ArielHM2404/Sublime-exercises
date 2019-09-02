// 7.6: BarChart.java
// Bar chart printing program

public class BarChart 
{
	public static void main(String[] args) 
	{
		int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
		
		System.out.printf("%s%n", "Grade distribution: ");

		//for each array element, output a bar of the chart
		for (int counter = 0; counter < array.length; counter++)
		{
			//Output bar label ("00-09: ", ... "90-99: ", "100: ")
			if (counter == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ",
					counter * 10, counter * 10 + 9);

			//Print bar of asterisks
			for (int star = 0; star < array[counter]; star++)
				System.out.print("*");

			System.out.println();

		}
	}
}