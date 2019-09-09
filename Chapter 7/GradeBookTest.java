//7.15: GradeBookTest.java
//GradeBookTest creates a GradeBook object using an array of grades,
//then invokes method processGrades to analyze them.
public class GradeBookTest
{
	//main method begins progran execution
	public static void main(String[] args)
	{
		//Array of student grades
		int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

		GradeBook myGradeBook = new GradeBook(
			"CS101 Introduction to java Programming", gradesArray);
		System.out.printf("Welcome to the grade book for%n%s%n%n",
			myGradeBook.getCourseName());
		myGradeBook.processGrades();
	}				
}//End of class GradeBookTest