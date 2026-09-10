import java.util.Scanner;  

public class InterestEarned { 

  public static void main (String [] args)
  {

  Scanner keyboard = new Scanner(System.in);  
  
    double accountPrincipal;
    double interestRate;
    int timesCompounded;
    double interestEarned;
    double totalSavings;
    double interestPercent;
 
System.out.print("What is the Principal ==> ");
accountPrincipal = keyboard.nextDouble();

System.out.print("What is the Interest Rate ==> ");
interestPercent = keyboard.nextDouble();

System.out.print("How many times was the interest compounded ==> ");
timesCompounded = keyboard.nextInt();

interestRate = (interestPercent/100);  
totalSavings = accountPrincipal * Math.pow(1 + (interestRate/timesCompounded), timesCompounded);
interestEarned = totalSavings - accountPrincipal;

System.out.println("Interest Rate: " + interestPercent + " %");
System.out.println("Times Compounded: " + timesCompounded);
System.out.printf("Principal: $%.2f\n", accountPrincipal);
System.out.printf("Interest: $%.2f\n", interestEarned);
System.out.printf("Amount in Savings: $%.2f\n", totalSavings);

keyboard.close();
   
   }
}
