package OfficeHours.Practice_05_06_2020;


public class Tester {
	
		//Declare the instance fields!
		public String firstName;
		public String lastName;
		public String jobTitle;
		public double salary;
		public long employeeId;
		
		
		Tester(String firstName, String lastName, String jobTitle, double salary, long employeeId) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.jobTitle = jobTitle;
			this.salary = salary;
			this.employeeId = employeeId;
		}
		
		public String fullName() {
			return this.firstName + " " + this.lastName;
		}
		
		public void smokeTesting() {
			System.out.println("My name is " + this.fullName() + " I'm doing smoke testing.");
		}
		
		public void creatingTicket() {
			System.out.println("My name is " + this.fullName() + " I'm creating ticket on Jira.");
		}
		
		public void printData() {
			System.out.println("My name is " + this.fullName());
			System.out.println("My job title is :" + this.jobTitle);
			System.out.println("My salary is is :" + this.salary);
			System.out.println("My employee ID is : " + this.employeeId);
			
		}
	}

