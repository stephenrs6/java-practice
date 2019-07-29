import java.util.Scanner;
public class PasswordVerifierAns {
	
	public static boolean isValid(String pw){
		//At least six characters long
		if(pw.length() < 6){
			return false;
		}
		
		//one upper case and one lowercase letter and one digit
		boolean hasLowerCase = false;
		boolean hasUpperCase = false;
		boolean hasDigit = false;
		for(int i=0; i<pw.length(); i++){
			char c = pw.charAt(i);
			if(Character.isLowerCase(c)){
				hasLowerCase = true;
			}else if(Character.isUpperCase(c)){
				hasUpperCase = true;
			}else if(Character.isDigit(c)){
				hasDigit = true;
			}
			
			if(hasLowerCase && hasUpperCase && hasDigit){
				break;
			}
		}
		
		if(!(hasLowerCase && hasUpperCase && hasDigit)){
			return false;
		}
	
		return true;
	}
	
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter password to be verified:");
		String password = scanner.nextLine();
		
		if(isValid(password)){
			System.out.println("Valid password");
		}else{
			System.out.println("Invalid password");
		}
	}
}