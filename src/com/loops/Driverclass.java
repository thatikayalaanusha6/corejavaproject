package com.loops;

public class Driverclass {

	public static void main(String[] args) {
		Encapsulation ep = new Encapsulation();
		ep.setId(101);
		ep.setName("Anusha");
		ep.setSalary(100000.0);
        ep.setPassword(123456789);
        
        
        System.out.println(ep.getId());
        System.out.println(ep.getName());
        System.out.println(ep.getSalary());
        System.out.println(ep.getPassword());
        
	}

}
