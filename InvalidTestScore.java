import java.util.Scanner;
class InvalidTestScore extends Exception{
	
	public InvalidTestScore(){
		super();
	}
}
class TestScores {
	private int[] scores;
	
	public TestScores(int[] scores){
		this.scores = scores;
	}
	
	public double average() throws InvalidTestScore{
		double sum = 0;
		
		for(int i=0; i<scores.length; i++){
			if(scores[i] > 100 || scores[i] < 0){
				throw new InvalidTestScore();
			}else{
				sum += scores[i];
			}
		}
		
		return sum/scores.length;
	}
}
class Driver {
	
	public static void main(String args[]) throws InvalidTestScore{
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of test scores:");
		int length = scanner.nextInt();
	
		int[] scores = new int[length];
		
		for(int i=0; i<length; i++){
			System.out.print("Enter test score " + (i+1) + ":");
			scores[i] = scanner.nextInt();
		}
		
		TestScores test = new TestScores(scores);
		
		try{
			System.out.print(test.average());
		}catch (InvalidTestScore i){
			System.out.print("Invalid test score.");
		}
	}
}