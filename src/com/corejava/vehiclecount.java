package com.corejava;

public class vehiclecount {
	 String vehicle;
static int count=0;
{
count++;

}


	public static void main(String[] args) {
		
		vehiclecount bike = new vehiclecount();
        bike.vehicle = "Bike";
        System.out.println(bike.vehicle + " Registered : " + count);
        System.out.println("************************************");

        vehiclecount car = new vehiclecount();
        car.vehicle = "Car";
        System.out.println(car.vehicle + " Registered : " + count);
        System.out.println("************************************");

        vehiclecount cycle = new vehiclecount();
        cycle.vehicle = "Cycle";
        System.out.println(cycle.vehicle + " Registered : " + count);
        System.out.println("************************************");

        System.out.println("Total Number of Vehicles : " + count);

	}

}
