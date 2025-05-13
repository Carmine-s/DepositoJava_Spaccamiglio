// PROVA SCANNER
import java.util.Scanner; // Import the Scanner class

class EsempioScanner {
  public static void main(String[] args) {
  Scanner myObj = new Scanner(System.in); // Create a Scanner object
  System.out.println("Enter username");
  String userName = myObj.nextLine(); // Read user input
  System.out.println("Username is: " + userName);
  System.out.println("Password");
  String Password = myObj.nextLine(); // Read user input
  System.out.println("Password is: " + Password);
  }




}  // Output user input