
import javax.swing.JOptionPane;
/*
* CSC200
* This project is for student, admin, and staff to login
* Auhor: Toan Tran
*
*/
public class StudentLogin {
	 public enum AccountType {Admin, Student, Staff}
	  public static void main (String[] args){
       String username, password, userinput, passinput;
       username = "CSC200"; //Username
       password = "utra1";  //Password
       int t = 1;
        AccountType[] choices =  { AccountType.Admin, AccountType.Student, AccountType.Staff};
        AccountType input = (AccountType) JOptionPane.showInputDialog(null, "Select your account type.", "Account Type", JOptionPane.INFORMATION_MESSAGE,null, choices, choices[0]);
          //Enter username
          do {
    	   userinput=JOptionPane.showInputDialog(null, "Enter Your Username ");
    	    if(userinput.equals(username)){
    	    //Enter password
          do{
    	    	 passinput=JOptionPane.showInputDialog(null, "Enter Your Password ");
    	    	 if(passinput.equals(password))
    	   	  
    	 {    	 
    	    	        AccountType inputa = (AccountType) JOptionPane.showInputDialog(null, "Select your account type.", "Account Type", JOptionPane.INFORMATION_MESSAGE,null, choices, choices[0]);

    	 while(!inputa.equals(input))
    	 {inputa = (AccountType) JOptionPane.showInputDialog(null, "Select your account type.", "Account Type", JOptionPane.INFORMATION_MESSAGE,null, choices, choices[0]);
}        // Account Type 
    	  switch(input) {
    	  case Admin:
    		 JOptionPane.showMessageDialog(null,"Welcome Admin! You can update and read file."); //output Welcome admin
    		 return;
    	  case Student:
     		 JOptionPane.showMessageDialog(null,"Welcome Student! You can only read file.");//output Welcome student
     		 return;
    	  case Staff:
     		 JOptionPane.showMessageDialog(null,"Welcome Staff! You can update, read, add, delete file.");//output welcome staff
     		 return;
         default:
        	 JOptionPane.showMessageDialog(null,"Wrong account type.");
    	        }	 
    	 input = (AccountType) JOptionPane.showInputDialog(null, "Select your account type.", "Account Type", JOptionPane.INFORMATION_MESSAGE,null, choices, choices[0]);
         
    	   }		 
    	    // limit 3 time, if fail your account been locked 
          else{t = t + 1;}
    	    }
    	    while(t<3);
    	    JOptionPane.showMessageDialog(null, "Wrong username or password, Please enter your account again!");
    	    }else {t = t + 1;
    	    JOptionPane.showMessageDialog(null, "Invaild username!");
    	    }
       }
       while(t<=3);
       JOptionPane.showMessageDialog(null, "Your account has been locked, Please contact admin for more information. ");// acount had been locked. 
	  
	 
    	  }
      }
       
