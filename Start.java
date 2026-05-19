import java.util.Scanner;

public class Start{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("BANKMANAGEMENTSYSTEM \n\nWhat do you want to do \n");

    boolean validNumber = false;

    do{
      System.out.print("1) Add a new entry \n2) View an existing entry \n3) Close application");
      System.out.println();

      int selection = sc.nextInt();
      switch(selection){
        case 1:
          System.out.println("Add a new entry");
          validNumber = true; 
          break;
        case 2:
          System.out.println("View an existing entry");
          validNumber = true; 
          break;
        case 3:
          System.out.println("BYE");
          validNumber = true; 
          break;
        default:
          System.out.println("Please enter a valid number");
          System.exit(0);
      }
    }while(!validNumber);
  }
}
