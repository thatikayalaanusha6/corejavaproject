package com.corejava;

public class Employee1gc {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destroyed");
	}
	
	void Dell() {
		System.out.println("dell");
	}
	
	void hp() {
		System.out.println("hp");
	}
	
	void Lenovo() {
		System.out.println("lenovo");
	}
	
	public static void main(String[] args) {
		Employee1gc egc = new Employee1gc();
		egc.Dell();
		/*System.out.println(egc);
		System.out.println(egc.hashCode());*/
		
		Employee1gc egc1 = new Employee1gc();
		egc1.hp();
		/*System.out.println(egc1);
		System.out.println(egc1.hashCode());*/
		
		
		Employee1gc egc2 = new Employee1gc();
		egc2.Lenovo();
		/*System.out.println(egc2);
		System.out.println(egc2.hashCode());*/
		
		
		
		egc1 = null;
		egc2 = null;
		
		System.gc();
		System.out.println(egc1);
		System.out.println(egc2);
		
	
	}

}
