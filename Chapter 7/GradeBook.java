//7.14: GradeBook.java
//GradeBook class using an array to store test grades

public class GradeBook
{
	private String courseName; //name of course this GradeBook represents
	private int[] grades; //array of student grades

	//Constructor
	public GradeBook(String courseName, int[] grades)
	{
		this.courseName = courseName;
		this.grades = grades;
	}

	//Method to set courseName
	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}

	//Method to retrieve courseName
	public String getCourseName()
	{
		return courseName;
	}

	//Perform various operations on the data
	public void processGrades() 
	{
		//Output grades array
		outputGrades();

		//Call method getAverage to calculate the average grade
		System.out.printf("%nClass average is: %.2f%n", getAverage());

		//Call method getMinimum and getMaximum
		System.out.printf("Lowest grade is: %d%nHigh grade is: %d%n", 
			getMinimum(), getMaximum());

		//Call outputBarChart to print grade distribution chart
		outputBarChart();
	}

	//Find minimum grade
	public int getMinimum()
	{
		int lowGrade = grades[0]; //assume grades[0] to be the lowest

		//Loop through array
		for (int grade : grades)
		{
			//if grade is lower than lowGradem assign it to lowGrade
			if (grade < lowGrade)
				lowGrade = grade;// newest lowest grade
		}

		return lowGrade;
	}

	//Find maximum grade
	public int getMaximum()
	{
		int highGrade = grades[0]; //assume grades[0] is the highest

		//Loop through grade array
		for (int grade : grades)
		{
			//if grade is greater than maxGrade, assign it to maxGrade
			if (grade > highGrade)
				highGrade = grade; //new highest
		}
		
		return highGrade;
	}

	//Determine average grade for test
	public double getAverage() 
	{
		int total = 0;

		//Sum grades for one student
		for (int grade : grades)
			total += grade;

		//Return average of grades
		return (double) total / grades.length;
	}

	//Output bar chart displaying grade distribution
	public void outputBarChart()
	{
		System.out.println("Grade distribution: ");

		//Stores the frequency of grades in each range of 10 grades
		int[] frequency = new int[11];

		//For each grade, increment the appropriate frequency
		for (int grade : grades)
			++frequency[grade / 10];

		//For each grade frequency, print bar in chart
		for (int count = 0; count < frequency.length; count++)
		{
			//Output bar label ("00-09:", ..., "90-99: ", "100: ")
			if (count == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ",
					count * 10, count * 10 + 9);
	
			//Print bar of asterisks(*)
			for(int star = 0; star <frequency[count]; star++)
			System.out.print("*");

		System.out.println();
		}
	}

	//Output the contents of the grades array
	public void outputGrades()
	{
		System.out.printf("The grades are: %n%n");

		//Output each student's grade
		for (int student = 0; student < grades.length; student++)
			System.out.printf("Student %2d: %3d%n",
				student + 1, grades[student]);
	}
}