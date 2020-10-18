package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName ;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 1000;
	private int defaultpasswordLength= 10;
	private String alternateEmail;
	private String companySuffix = "tcs.com";
	
	//Constructor to receive first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		// System.out.println("Email Created:  " + this.firstName + " " + this.lastName );
		//call a method asking for dept - return the dept
		this.department = setDepartment();
		// System.out.println("Department: " + this.department);
		//call a method that returns a random password
		this.password = randomPassword(defaultpasswordLength);
		System.out.println("Your Password is: " + this.password);
		//combine elements to generate an email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your Email is: " + email);
	}
	//ask for dept
	private String setDepartment() {
		System.out.print("New Employee: " + firstName + "\nDEPARTMENT CODES\n1 for IT\n2 for Sales\n3 for Accounting\n0 for none\nEnter Department Code: ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if (deptChoice == 1) { return "IT"; }
		else if (deptChoice == 2 ) { return "Sales"; }
		else if (deptChoice == 3) { return "Accounting"; }
		else { return ""; }
		
		
		 
	}
	//generate random password
		private String randomPassword(int length) {
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
			char[] password = new char[length];
			for (int i=0; i<length; i++) {
				int rand = (int) (Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(rand);
				}
			return new String(password);	
		}
	//set the mailbox capacity
		public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
		}
		
	//set alternate email
		public void setAlternateEmail(String altEmail ) {
			this.alternateEmail = altEmail;
		}
	//change password
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
				
	}
}

