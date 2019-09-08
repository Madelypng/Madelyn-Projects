import java.util.*;
public class CableBilling
{
   static Scanner console = new Scanner(System.in);

   static final double R_BILL_PROC_FEE =4.50;
   static final double R_BASIC_SERV_COST = 20.50;
   static final double R_COST_PREM_CHANNEL = 7.50;
   
   static final double B_BILL_PROC_FEE =15.00;
   static final double B_BASIC_SERV_COST = 75.00;
   static final double B_BASIC_CONN_COST = 5.00;
   static final double B_COST_PREM_CHANNEL = 50.00;
    
public static void main(String[] args)
{
    
    int accountNumber;
    char customerType;
    int noOfPremiumChannels;
    int noOfBasicServConn;
    double amountDue = 0.00;
       
    
System.out.println("This program computes a cable bill.");

System.out.print("Enter the account number: ");
accountNumber = console.nextInt();
System.out.println();

System.out.print("Enter the customer type, R for Residential or B for Business: ");
customerType = console.next().charAt(0);

System.out.println();

switch (customerType)
{

case 'R':
System.out.print("Enter the number of premium channels: ");
noOfPremiumChannels = console.nextInt();
System.out.println();

amountDue = R_BILL_PROC_FEE + R_BASIC_SERV_COST + (noOfPremiumChannels * R_COST_PREM_CHANNEL);

System.out.println("Account number = " + accountNumber);
System.out.printf("Amount Due = $%.2f %n", amountDue);

break;

case 'B':
System.out.print("Enter the number of basic service connections: ");
noOfBasicServConn = console.nextInt();
System.out.println();

System.out.print("Enter the number of premium channels: ");
noOfPremiumChannels = console.nextInt();
System.out.println();

if (noOfBasicServConn <= 10)
   amountDue = B_BILL_PROC_FEE + B_BASIC_SERV_COST + (noOfPremiumChannels * B_COST_PREM_CHANNEL); 
   
   else
   amountDue = B_BILL_PROC_FEE + B_BASIC_SERV_COST + (noOfBasicServConn - 10) * B_BASIC_CONN_COST + noOfPremiumChannels * B_COST_PREM_CHANNEL;

System.out.println("Account number = " + accountNumber);
System.out.printf("Amount Due = $%.2f %n", amountDue);

break;

default:
 
System.out.println("Invalid customer type.");
} 
}
}

