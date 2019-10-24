package ComProg;

import java.util.Scanner; 
public class BankLoan {
   
public static void main (String [] args){

   double LoanAmount, InterestPerYear, MonthlyPay, InterestPerMonth;
   double InterestPerMonth2 = 0;
   double MonthlyPay2 = 0;
   double count = 0;
   
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("------------------------------");
    System.out.println(" |   METROBANK LOAN SYSTEM   |");
    System.out.println("------------------------------");
    System.out.println("> Loan Amount: $");
    LoanAmount = myObj.nextDouble();
    System.out.print("> Interest Per Year: ");
    InterestPerYear = myObj.nextDouble();
    System.out.print("> Monthly Payment: $");
    MonthlyPay = myObj.nextDouble();
    
    double intRate = InterestPerYear/100;
  
  
  do
  {
    InterestPerMonth = intRate / 12;
    InterestPerMonth2 = LoanAmount * InterestPerMonth;
    MonthlyPay2 = MonthlyPay - InterestPerMonth;
    
    if(MonthlyPay < InterestPerMonth2)
    {
      System.out.println("The monthly payment is less than the first month's interest payment loan amount could not be repaid.");
    }
    
    else
    {
     LoanAmount = LoanAmount - MonthlyPay2;
     count++;
     
    }
  } 
 
  
   while (LoanAmount> 0);  
  
    System.out.println();
    System.out.println("Months To Paid: " + count);
    
   }
 }
