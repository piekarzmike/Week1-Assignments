
public class GradAvg {	
/*Exercise 2 Make a Java program called GradeAvg that:
 
1. Creates 7 double variables named the following way: 
quizScore1, quizScore2, quizScore3, testScore1, testScore2, quizScoreAvg, and testScoreAvg

2. Initializes those variables to % scores (make up some numbers between 0 and 100).

3. Initializes each to the corresponding average by using an appropriate expression.

4. Prints out the values of the variables containing the averages. Make sure to label each value.*/

	public static void main(String[] args) {
		
		double quizScore1 = 87.3d;
		double quizScore2 = 92.4d;
		double quizScore3 = 89.8d;
		double testScore1 = 94.5d;
		double testScore2 = 97.3d;
		double quizScoreAvg = (quizScore1 + quizScore2 + quizScore3)/3d;
		double testScoreAvg = (testScore1 + testScore2)/2d;
	
		System.out.println("Average Quiz Score is: " + quizScoreAvg);
		System.out.println("Average Test Score is: " + testScoreAvg);
				
	}

}
