import java.io.*;
import java.util.*;
import java.text.*;

public class Loan
{

static Scanner console = new Scanner(System.in);

public static void main(String[] args) 
{

double loanAmt = 0;      
double interestRate = 0;
double payments = 0;
double monthsToPay;
double monthlyPayments;
double monthlyInt;
double leftOnLoan;
double payPrinc;
double interest_Pay;
double countMonths = 0;

//Input 
System.out.print("Enter the Loan Amount : ");
loanAmt = console.nextDouble();

System.out.print("Enter the interestRate (Ex 5.54)  : ");
interestRate = console.nextDouble();

System.out.print("Enter the monthly payments : ");
monthlyPayments = console.nextDouble();

//calc
interestRate = interestRate / 100;
monthlyInt = interestRate / 12;
leftOnLoan = loanAmt;
   
  payPrinc = monthlyPayments - (leftOnLoan * monthlyInt);
  interest_Pay = leftOnLoan *  monthlyInt;   
   
    if(monthlyPayments < interest_Pay){
            System.out.println("");
            System.out.println("Payment amount is too low, the loan cannot be repaid with this payment amount!");
            System.out.printf("First months interest is %.2f %n" , interest_Pay);
            System.out.println("");
             }
    else      
   
          do{ 
              payPrinc = monthlyPayments - (leftOnLoan * monthlyInt);
              interest_Pay = leftOnLoan *  monthlyInt;
              leftOnLoan -= payPrinc;
              countMonths += 1;
            
              //System.out.println("Balance: " + leftOnLoan + "  Princ: " + payPrinc + "  Int: " + interest_Pay);
              System.out.printf("Balance:  $%.2f  ", leftOnLoan);
              System.out.printf("Princ:    $%.2f  ",  payPrinc);
              System.out.printf("Int:      $%.2f %n", interest_Pay);
              System.out.println("");
            
         }while (leftOnLoan > 0);
   
//This is your output.....
          if (interest_Pay < monthlyPayments) {
               System.out.println("");
               System.out.println("The Loan ammount is ...................." + loanAmt);
               System.out.println("Interest rate is........................" + interestRate * 100);
               System.out.println("Monthly payment ammount is ............." + monthlyPayments);
               System.out.println("Number of months to pay off loan........" + countMonths);
}}
}

