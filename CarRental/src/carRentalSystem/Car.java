package carRentalSystem;

public class Car {
	String carType;
	String name;
	double rent;
	public void print(){
		System.out.print(carType + name + "/t/t" + rent + "元／天");
	}
}
