import java.util.*;
import java.text.*;
import java.io.*;

public class OrderConversion
{
static Scanner console = new Scanner(System.in);
static final double Package = 6;
static final double Case = 24;
static final double Each = 1;

static Scanner keyboard = new
Scanner(System.in);

public static void main (String[] args) throws FileNotFoundException
{
//VARIABLES
int amountorder;
double costpercase;
char unit; 

int numPackage;
int numCase;
int numEach;

double InventoryValue;  

double InventoryAdd;

double conversion; 


DecimalFormat twodecimalsFormat = new
DecimalFormat("0.00");

DecimalFormat zerodecimalsFormat = new
DecimalFormat("0");
System.out.println("LOAN CONVERSION PROGRAM");

//INPUT
// loop for max inventory value
do
{
System.out.print("Enter the amount ordered: ");
amountorder = keyboard.nextInt();
System.out.println();



System.out.print("Enter the cost per case: ");
costpercase = keyboard.nextDouble();
System.out.println();


//LOOP for wrong letter
do
{
System.out.println("Enter the unit of measure");
System.out.print("C for Case, P for Package, and E for Each:  ");
unit = console.next().charAt(0);

      if (unit == 'C'){
      conversion = 24;
     }
      else
      if (unit == 'P'){
      conversion = 6;
     }
      else 
      if (unit == 'E'){
      conversion = 1;
     }
      else 
      if (unit != 'C'){
      if (unit != 'P'){
      if (unit != 'E'){
      
System.out.println("=========================================");
System.out.println("INVALID UNIT OF MEASURE, PLEASE RE-ENTER!");
System.out.println("=========================================");
System.out.println("  ");
unit = 'X';
}
}
}
}
while (unit == 'X');
//goes back up to do
if (amountorder >= 10000){
   System.out.println("=========================================");
   System.out.println("AMOUNT ORDER IS TOO HIGH! PLEASE RE-ENTER");
   System.out.println("=========================================");
   System.out.println("  ");
   amountorder = 0;
}
}
while (amountorder == 0); 


//UNIT CASES
System.out.println();
switch (unit)
{
case 'C':                                      //CASE
   System.out.println();
   InventoryAdd = amountorder * Case;
   InventoryValue = ((costpercase * Case)/24) * amountorder; 

   System.out.println("Amount Ordered...................."+ amountorder);
   System.out.printf("Unit of Measure...................Case %n");
   System.out.println("Cost per Case.....................$" + twodecimalsFormat.format(costpercase));
   System.out.println("Inventory Value...................$"+twodecimalsFormat.format(InventoryValue));
   System.out.println("Amount added to Inventory........."+zerodecimalsFormat.format(InventoryAdd));
break;

case 'P':                                      //PACKAGE
   System.out.println();
   InventoryAdd = amountorder * Package;
   InventoryValue = ((costpercase * Package)/24) * amountorder;

   System.out.println("Amount Ordered........................." + amountorder);
   System.out.printf("Unit of Measure........................Package %n");
   System.out.println("Cost per Case..........................$" +twodecimalsFormat.format(costpercase));
   System.out.println("Inventory Value........................$" +twodecimalsFormat.format(InventoryValue));
   System.out.println("Amount added to Inventory.............."  +zerodecimalsFormat.format(InventoryAdd));
break;

case 'E':                                      //EACH
   System.out.println();
   InventoryAdd = amountorder * Each;
   InventoryValue = ((costpercase * Each) / 24) * amountorder;

   System.out.println("Amount Ordered..................... " + amountorder);
   System.out.printf("Unit of Measure....................Each %n");
   System.out.println("Cost per Case......................$"+twodecimalsFormat.format(costpercase));
   System.out.println("Inventory Value....................$"+twodecimalsFormat.format(InventoryValue));
   System.out.println("Amount added to Inventory.........."+zerodecimalsFormat.format(InventoryAdd));
break;




}
}
}