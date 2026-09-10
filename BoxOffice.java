import java.util.Scanner;

public class BoxOffice {

  public static void main(String[] args) {

  Scanner keyboard = new Scanner(System.in);

  //Variable Initialization & Declaration 
  String movieName;
  int adultTickets;
  int childTickets;
  final double adultPrice = 10.00;
  final double childPrice = 6.00;
  double grossProfit;
  final double distributorRate = 0.80;
  double distributorAmount;
  double netProfit;

//User Prompts
System.out.println("What is the name of the movie ==> ");
movieName = keyboard.nextLine();

System.out.println("How many adult tickets were sold ==> ");
adultTickets = keyboard.nextInt();
    
System.out.println("How many child tickets were sold ==> ");
childTickets = keyboard.nextInt();


//Calculations
grossProfit = (adultTickets * adultPrice) + (childTickets * childPrice);
distributorAmount = (grossProfit * distributorRate);
netProfit = (grossProfit - distributorAmount);

//Output Statements
System.out.println("Movie Name: " + movieName);
System.out.println("Adult Tickets Sold: " + adultTickets);
System.out.println("Child Tickets Sold: " + childTickets);
System.out.printf("Gross Box Office Profit: $%.2f\n ", grossProfit);
System.out.printf("Net Box Office Profit:  $%.2f\n ", netProfit);
System.out.printf("Amount Paid to Distributor:  $%.2f\n  " , distributorAmount);

keyboard.close();

   }
}