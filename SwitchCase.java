import javax.swing.JOptionPane;


public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String input = JOptionPane.showInputDialog("Enter role ");
       switch (input) {
       case "student" :
    	   System.out.println("Welcome " + input);
    	   break;
       case "Administrator" :
    	   System.out.println("Welcome " + input);
    	   break;
       case "Faculty" :
    	   System.out.println("Welcome " + input);
    	   break;
       case "Staff" :
    	   System.out.println("Welcome " + input);
    	   break;
       case "Guest" :
    	   System.out.println("Welcome " + input);
    	   
       }	
      }

}
