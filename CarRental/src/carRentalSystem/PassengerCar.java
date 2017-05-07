package carRentalSystem;

public class PassengerCar extends Car {
	int num;
	public PassengerCar(String newName, double newRent, int newNum) {
		super.name = newName;
		super.rent =  newRent;
		num = newNum;
	}
	public void print(){
		super.carType = "载 客 型： ";
		super.print();
		System.out.println("\t载客：" + num + "人。");
	}
}


