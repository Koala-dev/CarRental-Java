package carRentalSystem;

public class PickupCar extends Car {
	int num1;
	double num2;
	
	public PickupCar(String newName, double newRent, int newNum1, double newNum2) {
		
		super.name = newName;
		super.rent =  newRent;
		num1 = newNum1;
		num2 = newNum2;
	}
	
	public void print(){
		
		super.carType = "货客同载型：";
		super.print();
		System.out.println("\t载客：" + num1 + "人," + "载货：" + num2 + "吨。");
	}
}
