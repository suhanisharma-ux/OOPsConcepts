package Encapsulation;

public class EmployDriver {

	public static void main(String[] args) {
		
		 Employ emp1=new Employ("John Doe", "Passw0rd!", "JD123", 30, 50000.0);
	        System.out.println("Employee 1 Name: " + emp1.getName());
	        System.out.println("Employee 1 Password: " + emp1.getPassword());
	        // ------VALIDATING PASSWORD-----
	        emp1.setPassword("NewP@ssw0rd"); 
	        //----gives an error because the password is invalid

	        System.out.println("Employee 1 Updated Password: " + emp1.getPassword());
	        Employ emp2=new Employ("Jane Smith", "SecureP@ss1", "JS456", 28, 60000.0);
	        System.out.println("Employee 2 Name: " + emp2.getName());
	        System.out.println("Employee 2 Password: " + emp2.getPassword());
	        System.out.println("Employee 2 UserID " + emp2.getUserID());
	        // modifying the userID of emp2
	        emp2.setUserID("JS789");
	        System.out.println("Employee 2 Updated UserID: " + emp2.getUserID());
	       //  modifying the name of emp2
	        emp2.setName("Joy S.");
	        System.out.println("Employee 2 Updated Name: " + emp2.getName());
	}

}
