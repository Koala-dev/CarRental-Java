package carRentalSystem;

public class Truck extends Car {
	int num;
	public Truck(String newName, double newRent, int newNum) {
		super.name = newName;
		super.rent =  newRent;
		num = newNum;
	}
	public void print(){
		super.carType = "载 货 型： ";
		super.print();
		System.out.println("\t载客：" + num + "吨。");
	}
}
