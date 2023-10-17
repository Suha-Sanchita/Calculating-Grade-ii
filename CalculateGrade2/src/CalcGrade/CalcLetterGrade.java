package CalcGrade;
import java.util.Scanner;
import java.lang.Math;

public class CalcLetterGrade {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		//quizzes
		System.out.println("Enter your quiz grades: ");
		double quiz1 = scanner.nextDouble();
		System.out.println("Quiz 1: " + quiz1);
		double quiz2 = scanner.nextDouble();
		System.out.println("Quiz 2: " + quiz2);
		double quiz3 = scanner.nextDouble();
		System.out.println("Quiz 3: " + quiz3);
		double quiz4 = scanner.nextDouble();
		System.out.println("Quiz 4: " + quiz4);
		double quiz5 = scanner.nextDouble();
		System.out.println("Quiz 5: " + quiz5);
		System.out.println(" ");
		
		quizGrades myQuizGrades = new quizGrades();
		double qAverage = myQuizGrades.quizgrades(quiz1, quiz2, quiz3, quiz4, quiz5);
		System.out.println(" ");

				
		//assignments
		System.out.println("Enter your assignment grades: ");
		double  assignment1 = scanner.nextDouble();
		System.out.println("assignment 1: " + assignment1);
		double  assignment2 = scanner.nextDouble();
		System.out.println("assignment 2: " + assignment2);
		double  assignment3 = scanner.nextDouble();
		System.out.println("assignment 3: " + assignment3);
		double  assignment4 = scanner.nextDouble();
		System.out.println("assignment 4: " + assignment4);
		double  assignment5 = scanner.nextDouble();
		System.out.println("assignment 5: " + assignment5);
		System.out.println(" ");
		
		assignmentGrade myAssignmentGrades = new assignmentGrade();
		double aAverage = myAssignmentGrades.assiGrades(assignment1, assignment2, assignment3, assignment4, assignment5);
		System.out.println(" ");
		
		//Midterm
		System.out.println("Enter your midterm grades: ");
		double midterm1 = scanner.nextDouble();
		System.out.println("First midterm grade is: "+ midterm1);
		double midterm2 = scanner.nextDouble();
		System.out.println("Second midterm grade is: "+ midterm2);
		System.out.println(" ");
		
		midtermGrade myMidtermGrades = new midtermGrade();
		double midAverage = myMidtermGrades.midtermGrades(midterm1, midterm2);
		System.out.println(" ");
		
		//Final Exam
		System.out.println("Enter your final's grade: ");
		double finalExam = scanner.nextDouble();
		System.out.println("Final exam grade is: "+ finalExam);
		System.out.println(" ");
		
		finalGrade myFinalGrade = new finalGrade();
		double fAverage = myFinalGrade.finalGrades(finalExam);
		System.out.println(" ");
		
		
		System.out.println("*******************************");
		
		double totalScore = (qAverage + aAverage + midAverage + fAverage);
		System.out.println("Final Grade is :" + totalScore);
		
		if (totalScore>=93){
			System.out.println("Final letter grade is A.");
		}else if (totalScore>=90 && totalScore<93) {
			System.out.println("Final letter grade is A-.");
		}else if (totalScore>=87 && totalScore<90) {
			System.out.println("Final letter grade is B+.");
		}else if (totalScore>=83 && totalScore<87) {
			System.out.println("Final letter grade is B.");
		}else if (totalScore>=80 && totalScore<83) {
			System.out.println("Final letter grade is B-.");
		}else if (totalScore>=77 && totalScore<80) {
			System.out.println("Final letter grade is C+.");
		}else if (totalScore>=73 && totalScore<77) {
			System.out.println("Final letter grade is C.");
		}else if (totalScore>=70 && totalScore<73) {
			System.out.println("Final letter grade is C-.");
		}else if (totalScore>=67 && totalScore<70) {
			System.out.println("Final letter grade is D+.");
		}else if (totalScore>=60 && totalScore<67) {
			System.out.println("Final letter grade is D.");
		}else {
			System.out.println("Final letter grade is F.");
		}
		
		
		//Switch Case
		
		System.out.println(" ");
		System.out.print("Letter grade using switch statement in Java: ");

		
		int totalScore1 = (int)totalScore;
		char letterGrade;

		if (totalScore1 >= 93) {
		    letterGrade = 'A';
		} else if (totalScore1 >= 90) {
		    letterGrade = 'A';
		} else if (totalScore1 >= 87) {
		    letterGrade = 'B';
		} else if (totalScore1 >= 83) {
		    letterGrade = 'B';
		} else if (totalScore1 >= 80) {
		    letterGrade = 'B';
		} else if (totalScore1 >= 77) {
		    letterGrade = 'C';
		} else if (totalScore1 >= 73) {
		    letterGrade = 'C';
		} else if (totalScore1 >= 70) {
		    letterGrade = 'C';
		} else if (totalScore1 >= 67) {
		    letterGrade = 'D';
		} else if (totalScore1 >= 60) {
		    letterGrade = 'D';
		} else {
		    letterGrade = 'F';
		}

		switch (letterGrade) {
		    case 'A':
		        System.out.println("Final letter grade is A.");
		        break;
		    case 'B':
		        System.out.println("Final letter grade is B.");
		        break;
		    case 'C':
		        System.out.println("Final letter grade is C.");
		        break;
		    case 'D':
		        System.out.println("Final letter grade is D.");
		        break;
		    case 'F':
		        System.out.println("Final letter grade is F.");
		        break;
		    default:
		        System.out.println("Invalid grade");
		}

		
		
		
		}
	
		
		
	}


	

