import java.util.Scanner;
public class NumberSum {
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter numbers separated by commas:");
		String numString = scanner.nextLine();
	
		String[] nums = numString.split(",");
		
		int sum=0;
		for(int i=0; i<nums.length; i++){
			sum += Integer.parseInt(nums[i]);
		}
		
		System.out.print(sum);
		
	}
}