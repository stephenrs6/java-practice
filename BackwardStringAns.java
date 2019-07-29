import java.util.Scanner;
public class BackwardStringAns {
	
	public static String backwardString(String s){
		String s2 = "";
		
		for(int i=s.length()-1; i >= 0; i--){
			s2 += s.substring(i, i+1);
		}
		
		return s2;
	}
	
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string:");
		String s = scanner.nextLine();
		
		System.out.print(backwardString(s));
	}
}
