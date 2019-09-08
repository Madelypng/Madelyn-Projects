import java.io.*;
import java.util.*;
import java.text.*;

public class Employees
{
static Scanner keyboard = new
Scanner(System.in);

public static void main (String[] args) throws FileNotFoundException
{
//Input Varibles 
int counter = 0;
int number;
String firstname;     
String lastname;
String city;
String state;
int zip;
String title;
int salary;

PrintWriter outFile = new PrintWriter("Employee.txt");

//Input
   while (counter < 9) 
      {
        System.out.print("Employee Number: ");
        number = keyboard.nextInt();
        
        System.out.print("Employee First Name: ");
        firstname = keyboard.next();
        firstname = firstname.substring(0, 1).toUpperCase() + firstname.substring(1);
       
        System.out.print("Employee Last Name: ");
        lastname = keyboard.next();
        lastname = lastname.substring(0, 1).toUpperCase() + lastname.substring(1);
         
        System.out.print("Employee City: ");
        city = keyboard.next();
        city = city.substring(0, 1).toUpperCase() + city.substring(1);
    
        System.out.print("Employee State: ");
        state = keyboard.next();
        state = state.toUpperCase();
         
        System.out.print("Employee Zip Code: ");
        zip = keyboard.nextInt();
  
        System.out.print("Employee Job Title: ");
        title = keyboard.next();
        title = title.substring(0, 1).toUpperCase() + title.substring(1);
         
        System.out.print("Employee Salary: ");
        salary = keyboard.nextInt();
        
        System.out.println();
        System.out.println("thank you, next");
        System.out.println();
        
        if (salary > 200000)
        {
         System.out.println("Salary is over the maximum allowed, please re-enter:");
         System.out.print("Enter employee's salary: ");
         salary = keyboard.nextInt();
         
      }   
      
//Output
outFile.print(number + ",");
outFile.print(firstname + ",");
outFile.print(lastname + ",");
outFile.print(city + ",");
outFile.print(state + ",");
outFile.print(zip + ",");
outFile.print(title + ",");
outFile.print(salary + ",");
outFile.println();

counter = counter + 1;
}
outFile.close();
}
}
