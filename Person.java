import java.util.Scanner;
class Person{
	private String name;
	private String address;
	private String number;
	
	//Constructors
	public Person(String name, String address, String number){
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public Person(){}
	
	//Accessors
	public String getName(){
		return this.name;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	public String getNumber(){
		return this.number;
	}
	
	//Mutators
	public void setName(String n){
		this.name = n;
	}
	
	public void setAddress(String a){
		this.address = a;
	}
	
	public void setNumber(String n){
		this.number = n;
	}
}
class Customer extends Person{
	private String customerNumber;
	private boolean recieveMail;
	
	//Constructors
	public Customer(String name, String address, String number, String customerN, boolean rm) {
		super(name, address, number);
		this.customerNumber = customerN;
		this.recieveMail = rm;
	}
	
	public Customer(){}
	
	//Accessors
	public String getCustomerNumber(){
		return this.customerNumber;
	}
	
	public boolean getRecieveMail(){
		return this.recieveMail;
	}
	
	//Mutators
	public void setCustomerNumber(String c){
		this.customerNumber = c;
	}
	
	public void setRecieveMail(boolean r){
		this.recieveMail = r;
	}
}
class Driver {
	
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter name of customer:");
		String name1 = scanner.nextLine();
		System.out.print("Enter address of customer:");
		String address1 = scanner.nextLine();
		System.out.print("Enter phone number of customer:");
		String number1 = scanner.nextLine();
		System.out.print("Enter customer number:");
		String customerNumber = scanner.nextLine();
		System.out.print("Enter yes/no -- does the customer want to recieve mail?:");
		String answer = scanner.nextLine();
		boolean recieveMail = (answer.equals("yes"));
		
		Customer customer = new Customer(name1, address1, number1, customerNumber, recieveMail);
		System.out.println("\nCustomer: ");
		System.out.println("Name: "+customer.getName());
		System.out.println("Address: "+customer.getAddress());
		System.out.println("Phone Number: "+customer.getNumber());
		System.out.println("Customer Number: "+customer.getCustomerNumber());
		System.out.println("Recieve Mail?: "+customer.getRecieveMail());
		
		
	}
}