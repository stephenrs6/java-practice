/**
 * Write a class named Car that has the following fields:
 * 
 * • yearModel: The yearModel field is an int that holds the car's year model. •
 * make: The make field is a String object that holds the make of the car. •
 * speed: The speed field is an int that holds the car's current speed.
 */

public class Car {

    private int yearModel;
    private String make = "";
    private int speed;

	public Car(int yearModel, String make){
		this.yearModel = yearModel;
		this.make = make;
		this.speed = 0;
	}
	
	public int getYearModel(){
		return this.yearModel;
	}
	
	public String getMake(){
		return this.make;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	public void accelerate(){
		this.speed += 5;
	}
	
	public void brake(){
		this.speed -= 5;
	}
	public static void main (String [] str)
	{
		Car car1 = new Car(2015, "Audi");
		for (int i = 1; i <= 5; i++)
		{
			car1.accelerate();
			System.out.println(car1.getSpeed());
		}
		for (int j = 1; j <= 5; j++)
		{
			car1.brake();
			System.out.println(car1.getSpeed());
		}		
		
	}

}