package carRentalSystem;

import java.util.*;

public class CarRental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**************欢迎来到答答租车系统****************");
		System.out.println("请问您是否需要租车（1-是， 0-否）， 请输入您的选择： ");
		Scanner input = new Scanner(System.in);
		int cho = input.nextInt();
		
		while(cho != 0 && cho != 1) {
			System.out.println("您的输入有误， 请重新输入：");
			cho = input.nextInt();
		}
		if(cho == 0){
			System.out.println("欢迎再次光临答答租车系统！");
		}
		else if(cho == 1){
			System.out.println("您可以选择的车型及其租金和货量分别为：");
			System.out.println("     类型          序号 车名\t\t租金\t\t容量");
			System.out.println("-----------------------------------------------");
			
			Car []a = {
					new PassengerCar("1.奥迪", 150, 5), 
					new PassengerCar("2.本田", 100, 5), 
					new PassengerCar("3.宇通", 1200, 40),
					new Truck("5.东风", 1500, 20),
					new Truck("5.东风", 1500, 20), 
					new PickupCar("6.福特", 200, 4, 1.5)
			};
			for(int i = 0; i < a.length; i++){
				a[i].print();
			}
			System.out.println("请根据您的需要，选择您要租的车的数量:");
			int[] num = new int[6];
			int sum = 0;
			for (int i = 0; i<num.length; i++){
				System.out.println("您要租的" + (i+1) + "号车的数量为：");
				num[i] = input.nextInt();
				sum = sum + num[i];
			}
			System.out.print("请输入租车的天数：");
			int day = input.nextInt();
			System.out.println("*******************您的租车账单如下********************");
			System.out.println("您一共租车" + sum + "辆，其中");
			System.out.println("您的载客车共有" + (num[0] + num[1] + num[2]) + "辆:" + "奥迪：" + num[0]
					+ "辆       本田：" + num[1] + "辆         宇通：" + num[2] + "辆") ;
			System.out.println("您租的载货车共有"+(num[3]+num[4])+"辆:" + "江铃："+num[3]+"辆 东风: "+num[4]+"辆");
			System.out.println("您租的皮卡车共有"+num[5]+"辆:" + "福特："+num[5]+"辆 ");
			double money=(num[0]*150+num[1]*100+num[2]*1200+num[3]*600+num[4]*1500+num[5]*200)*day; 
			int person=num[0]*5+num[1]*5+num[2]*40+num[5]*4;
			double carrying=num[3]*5+num[4]*20+num[5]*1.5; 
			System.out.println("您的租车总额为："+money+"元 , 载客总人数为："+person+"人 ，载货总量为："+carrying+"吨."); 
			
			
		}
	}
}
