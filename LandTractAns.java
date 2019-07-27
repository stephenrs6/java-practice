import java.util.Scanner;
public class LandTract {
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter length of first land tract:");
		int len1 = scanner.nextInt();
		System.out.print("Enter width of first land tract:");
		int wid1 = scanner.nextInt();
		
		System.out.print("Enter length of second land tract:");
		int len2 = scanner.nextInt();
		System.out.print("Enter width of second land tract:");
		int wid2 = scanner.nextInt();
		
		LandTract lt1 = new LandTract(len1, wid1);
		LandTract lt2 = new LandTract(len2, wid2);
		System.out.println(lt1.toString());
		System.out.println(lt2.toString());
		
		if(lt1.equals(lt2)){
			System.out.println("The two tracts have the same size.");
		}else{
			System.out.println("The two tracts do not have the same size.");
		}
		
	}
	private int length;
	private int width;
	
	public LandTract(int l, int w){
		this.length = l;
		this.width = w;
	}
	
	public int area() {
		return this.length*this.width;
	}
	
	public String toString() {
		return "LandTract with length " + this.length + ", width " + this.width
				+ ", and area " + this.area();
	}
	
	public boolean equals(LandTract other){
		return(this.length == other.length && this.width == other.width || this.length == other.width && other.length == this.width);
	}
}