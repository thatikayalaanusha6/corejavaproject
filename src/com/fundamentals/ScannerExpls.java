package com.fundamentals;
import java.util.Scanner;

public class ScannerExpls {
	
	
	void getName(String name) {
		System.out.println("Student Name : "+name);
	}
	
	void getAge(int age) {
		System.out.println("Enter the age : "+age);
	}

	void getSalary(double salary) {
		System.out.println("Salary : "+salary);
	}
	
	void getHeight(float height) {
		System.out.println("Height : "+height);
	}
	
	void getWeight(double weight) {
		System.out.println("Weight : "+weight);
	}
	
	void getCity(String city) {
		System.out.println("City is : "+city);
	}
	
	void getState(String state) {
		System.out.println("State is : "+state);
	}
	
	
	void getCountry(String country) {
		System.out.println("Country is : "+country);
	}
	
	
	void getEmail(String email) {
		System.out.println("Email adress : "+email);
	}
	
	
	void getPhone(long phoneNumber) {
		System.out.println("Phone number : "+phoneNumber);
	}
	
	void getDepartment(String dep) {
		System.out.println("Department is : "+dep);
	}
	
	void getDesignation(String ds) {
		System.out.println("Designation is : "+ds);
	}
	
	
    void getExperience(int exp) {
    	System.out.println("Experience : " + exp + "years");
    }
    
    void getGender(String gender) {
    	System.out.println(" Gender is  : "+gender);
    }
    
    void getBloodGroup(String bloodgroup) {
    	System.out.println(" Blood Group is : "+bloodgroup);
    }
    
    void getNationality(String nation) {
    	System.out.println("Nationality is : "+nation);
    }
    
    void getPincode(int pincode) {
    	System.out.println("Pincode is : "+pincode);
    }
    
    
    void getId(int id) {
    	System.out.println("ID number is : "+id);
    }
    
    void getBonus(double bonus) {
    	System.out.println("Bonus is : "+bonus);
    }
    
    void getProject(String pjt) {
    	System.out.println("Project is : "+pjt);
    }
    
    
    void getManager(String mngr) {
    	System.out.println("Manager name is : "+mngr);
    }
    
    void getCompany(String cmpny) {
    	System.out.println("company name is : "+cmpny);
    }
    
    
    void getJoiningYear(int year) {
    	System.out.println("Year of joining : "+year);
    }
    
    
    void getSkill(String skill) {
    	System.out.println("Skill : "+skill);
    }
    
    
    void getQualification(String qualification) {
    	System.out.println("Qualification is : "+qualification);
    }
    
    void getPercentage(float percentage) {
    	System.out.println("Percentage is : "+percentage);
    }
    
    void getAddress(String address) {
    	System.out.println("Address : "+address);
    }
    
	 void main(String[] args) {
		 
		 
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name : "); 
		String name = sc.nextLine();
		
		System.out.println("Enter your Age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter your salary : ");
		double salary = sc.nextDouble();
		
		
		System.out.println("Enter your Height : ");
		float height = sc.nextFloat();
		
		System.out.println("Enter your Weight : ");
		double weight = sc.nextDouble();
		
		
		System.out.println("Enter your City : ");
		sc.nextLine();
		String city = sc.nextLine();
		
		System.out.println("Enter your State : ");
		String state = sc.nextLine();
		
		System.out.println("Enter your Country : ");
		
		String country = sc.nextLine();
		
		System.out.println("Enter Email : ");
		
		String email = sc.nextLine();
		
		System.out.println("Enter your Phone Number : ");
		long phoneNumber =sc.nextLong();
		
		System.out.println("Enter your Department : ");
		sc.nextLine();
		String dep = sc.nextLine();
		
		System.out.println("Enter your Designation : ");
	
		String ds = sc.nextLine();
		
		System.out.println("Enter your years of experience : ");
		int exp = sc.nextInt();
		
		System.out.println("Enter your gender : ");
	
		String gender = sc.nextLine();
		
		System.out.println("Enter your Blood Group : ");
		
		String bloodgroup =  sc.nextLine();
		
		System.out.println("Enter your Nation : ");
	
		String nation = sc.nextLine();
		
		System.out.println("Enter your Pincode : ");
		int pincode = sc.nextInt();
		
		System.out.println("Enter your id : ");
		int id=sc.nextInt();
		
		System.out.println("Enter your bonus amount : ");
		double bonus = sc.nextDouble();
		
		
		System.out.println("Enter your project : ");
	
		String pjt=sc.nextLine();
		
		
		System.out.println("manager : ");
	
		String mngr = sc.nextLine();
		
		System.out.println("Enter name of the company : ");
		sc.nextLine();
		String cmpny = sc.nextLine();
		
		System.out.println("Enter your year of joining : ");
		int year = sc.nextInt();
		
		System.out.println("Enter your Skills : ");
		sc.nextLine();
		String skill = sc.nextLine();
		
		System.out.println("Enter your Qualification : ");
		
		String qualification = sc.nextLine();
		
		System.out.println("Enter your Percentage : ");
	    float percentage = sc.nextFloat();
	    
	    System.out.println("Enter your Address : ");
	    sc.nextLine();
	    String address = sc.nextLine();
	    
	    
	    
	    getName(name);
	     getAge( age) ;

		getSalary( salary); 
		
	getHeight( height) ;
		 getWeight( weight) ;
		
	 getCity( city); 
		
		 getState( state); 
		
		getCountry( country); 
		
		
		getEmail( email); 
		
		 getPhone( phoneNumber); 
		 getDepartment( dep); 
		getDesignation( ds) ;
		
		
	    getExperience( exp) ;
	    
	  getGender( gender); 
	    
	     getBloodGroup( bloodgroup); 
	    
	     getNationality( nation); 
	     getPincode( pincode); 
	    
	    
	    getId( id) ;
	    
	     getBonus( bonus); 
	    
	     getProject( pjt) ;
	    
	    
	    getManager( mngr) ;
	    
	     getCompany( cmpny); 
	    
	    
	     getJoiningYear( year); 
	    
	    
	     getSkill( skill) ;
	    
	     getQualification( qualification); 
	     getPercentage( percentage) ;
	     getAddress( address) ;
	    
	    
		System.out.println("main method ended");
	}

}
