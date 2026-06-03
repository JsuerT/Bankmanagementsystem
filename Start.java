import java.util.Scanner;
import Service.Service;

public class Start{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("BANKMANAGEMENTSYSTEM \n\nWhat do you want to do \n");


    while(true){
      System.out.print("1) Add a new entry \n2) View an existing entry \n3) Close application");
      System.out.println();

      int selection = sc.nextInt();
      switch(selection){
        case 1:
          System.out.println("Add a new entry");
          break;
        case 2:
          System.out.println("View current balance");
          viewBalance();
          break;
        case 3:
          System.out.println("BYE");
          System.exit(0);
          break;
        default:
          System.out.println("Please enter a valid number \n");
      }
    }
  }
}
