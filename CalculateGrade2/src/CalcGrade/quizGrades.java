package CalcGrade;

public class quizGrades {
	
	
	public double quizgrades(double quiz1, double quiz2, double quiz3, double quiz4, double quiz5) {
		
		double lowest = Math.min(quiz1, Math.min(quiz2, Math.min(quiz3, Math.min(quiz4, quiz5))));

		System.out.println("The lowest variable is: " + lowest);

		double avgQuizGrade = (((quiz1+quiz2+quiz3+quiz4+quiz5)-lowest)/4)*0.20;
		System.out.println("Average quiz grade is: " + avgQuizGrade);
		
		return avgQuizGrade;
		
		
	}

}