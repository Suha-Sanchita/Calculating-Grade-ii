package CalcGrade;

public class assignmentGrade {
	
	public double assiGrades(double assignment1, double assignment2, double assignment3, double assignment4, double assignment5) {
	
	double lowest2 = Math.min(assignment1, Math.min(assignment2, Math.min(assignment3, Math.min(assignment4, assignment5))));

	System.out.println("The lowest variable is: " + lowest2);
	
	double avgAssignmentGrade = ((((assignment1+assignment2+assignment3+assignment4+assignment5)-lowest2)/4)*0.30);
	System.out.println("Average assignment grade is: " + avgAssignmentGrade);
	
	return avgAssignmentGrade;
	}
}
