// 7.18: GradeBook.java
//GradeBook class using a two-dimensional array to store grades.

public class GradeBook1
{
	private String courseName; //name of course this grade book represents
	private int[][] grades; // two-dimensional array of student grades

	//Two-argument constructor initializes courseName and grades array
	public GradeBook1(String courseName, int[][] grades)
	{
		this.courseName = courseName;
		this.grades = grades;
	}

	//Method to set the course name
	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}

	//Method to retieve the course name
	public String getCourseName()
	{
		return courseName;
	}

	//Perform various operations on the data
	public void processGrade()
	{
		//Output grades array
		outputGrades();

		//Call methods getMinimum and getMaximum
		System.out.printf("%n%s %d%n%s %d%n%n",
			"Lowest grade in the grade book is", getMinimum(),
			"Highest grade in the grade book is", getMaximum());

		//Output grade distribution chart of all grades on all test
		outputBarChart();
	}

	//Find minimum grade
	public int getMinimum()
	{
		//Assume first element of grades array is smallest
		int lowGrade = grades[0][0];

		//Loop through rows of grades array
		for (int[] studentGrades : grades)
		{
			//loop through columns of current row
			for (int grade : studentGrades)
			{
				//If grade is less than lowestGrade assign it to lowGrade
				if (grade < lowGrade)
					lowGrade = grade;
			}
		}

		return lowGrade;
	}

	//Find maximum
	public int getMaximum()
	{
		//Assume first element of grades array is highest
		int highGrade = grades[0][0];

		//Loop through rows of grades array
		for( int[] studentGrades : grades) 
		{
			//Loop though columns
			for(int grade : studentGrades)
			{
				if (grade > highGrade)
					highGrade = grade;
			}
		}

		return highGrade;
	}

	//Determine average grade for particular set of grades
	public double getAverage(int[] setOfGrades)
	{
		int total = 0;

		//Sum grades for one student
		for(int grade : setOfGrades)
			total += grade;

		//Return average of grades
		return (double) total / setOfGrades.length;
	}

	//Output bar chart displaying overall grade distribution
	public void outputBarChart()
	{

		System.out.println("Overall grade distribution:");

		//Stores frequency of grades in each range of 10 grades
		int[] frequency = new int[11];

		//For each grade in GradeBook, increment the appropriate frequency
		for(int[] studentGrades : grades)
		{
			for(int grade : studentGrades)
				++frequency[grade / 10];
		}

		//For each grade frequency, print bar in chart
		for(int counter = 0; counter < frequency.length; counter++)
		{
			//Output bar label ("00-09: ",..., "," "100:")
			if(counter == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ",
					counter * 10, counter * 10 + 9);

			//Print bar of asterisk
			for (int star = 0; star < frequency[counter]; star++)
				System.out.print("*");

			System.out.println();
		}
	}

	//Output contents of the grade array
	public void outputGrades()
	{
		System.out.printf("The grades are:%n%n");
		System.out.print("                     "); //align colum heads

		//Create a column heading for each of the tests
		for(int test = 0; test < grades[0].length; test++)
			System.out.printf("Test %d ", test + 1);

		System.out.println("Average"); //Student average column heading

		//Create rows/columns of text representing array grades
		for (int student = 0; student < grades.length; student++)
		{
			System.out.printf("Student %2d", student + 1);

			for(int test : grades[student]) //output student's grades
			System.out.printf("%8d", test);

			//Call method getAverage to calculate student's average grade;
			//Pass row of grades as the argument to getAverage
			double average = getAverage(grades[student]);
			System.out.printf("%9.2f%n", average);

		}

	}
}