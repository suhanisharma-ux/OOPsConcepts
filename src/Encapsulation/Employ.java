package Encapsulation;

public class Employ {
	    private String name;
	    private String password;
	    private String userID;
	    private int age;
	    private double salary;


	    Employ(){

	    }
	    Employ(String name, String password, String userID, int age, double salary){
	        this.name=name;
	        this.password=password;
	        this.userID=userID;
	        this.age=age;
	        this.salary=salary;
	    }
	    
	    // ------PASSWORD VALIDATION------
	    public void setPassword(String password){
	        if (password.length()<8 || password.length()>15|| password.isBlank()){
	            System.out.println("Invalid Password");
	            return;
	        }
	        int uppercase=0,lowercase=0,digit=0,specialChrt=0;
	        for(int i=0;i<password.length();i++){
	            char ch=password.charAt(i);
	            if(ch>='a'&& ch<'z'){
	                lowercase++;
	            }else if(ch>='A' && ch<'Z'){
	                uppercase++;
	            }else if (ch<='0' && ch<='9'){
	                digit++;
	            }else{
	                specialChrt++;
	            }
	        }
	        if(uppercase>0 && lowercase>0 && digit>0 && specialChrt>0){
	             this.password=password;
	        }else{
	            System.out.println("Invalid Password");
	            return;
	        }
	        
	    }
	    // -----GETTER FOR PASSWORD----
	    public String getPassword(){
	        return this.password;
	    }

	    // ---- NAME VALIDATION----
	    public void setName(String name){
	       if (name.matches("[a-zA-Z\s]+")){
	        this.name=name;
	       }else{
	        System.out.println("Invalid name");
	        return;
	       }
	    }
	    // ------GETTER FOR NAME------
	    public String getName(){
	        return name;
	    }

	     //  -----SETTER FOR USERID-----
	    public void setUserID(String userID){
	        if(userID.length()<6 || userID.length()>14|| userID.isBlank()){
	            System.out.println("Invalid userID");
	            return;
	        }
	        if(userID.matches("[\\w.-@]")){
	            this.userID=userID;
	        }else{
	            System.out.println("Invalid userID");
	            return;
	        }
	    }
	    // -----GETTER FOR USERID-----
	    public String getUserID(){
	        return this.userID;
	    }

	    // --------SETTER FOR AGE------
	    public void setAge(int age){
	        if(age<18 ||age>60){
	            System.out.println("Invalid age");
	            return;
	        }else{
	            this.age=age;
	        }
	    }

	    // --------GETTER FOR AGE------
	    public int getAge(){
	        return this.age;
	    }

	    // -------SETTER FOR SALARY------
	    public void setSalary(double salary){
	        if(salary<10000){
	            System.out.println("Invalid salary");
	            return;
	        }
	        this.salary=salary;
	    }

	    // -------GETTER FOR SALARY------
	     public double getSalary(){
	        return this.salary;
	     }
	   

	

}
