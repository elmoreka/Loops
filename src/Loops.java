/* Java program that uses for and while loops.  The program asks the user if the summer is hot or mild.  If summer is 
 * hot, use a for loop to print out ten times that "it is a bad summer because the weather is too hot".
 * If summer is mild, use a for loop to print out ten times that "It is a great summer because the weather is mild".
 * Use a while loop to count how many days were over 80 degrees.
*   Author: Karl Elmore
*   Program: Loops.java
*/

import java.util.*;  // import all the classes from the util package
public class Loops {  // creates GuessNumLoop method. Public means that the GuessNumLoop method will be visible from classes in other packages
    
      public static void main(String[] args){  // Public means that the main method is visible and can be called from other objects of other types. 
		   // Static means that the method is associated with the class, not a specific instance (object) 
           // of that class. This means that you can call a static method without creating an object of 
           // the class. Void means that the method has no return value.

    // TODO Auto-generated method stub

    // Get the Users input on the weather this summer

    Scanner in = new Scanner(System.in);  // Reads the string input from the user

    System.out.println("Has this summer been hot or mild? ");  // Prints text to the console

    String weather = in.nextLine();  // Stores the user input in the variable weather
    String mild = "mild"; // set value of string variable mild equal to mild
    String hot = "hot";  // set value of string variable hot equal to hot
    
    int num = 9; // Sets the value of the integer variable num equal to 9

    // repeat for loop until i is equal to num (i.e. 9) 
    for (int i = 0; i <= num; i++) {
    	if (weather.equalsIgnoreCase(hot)) {  // if value of weather is hot then statement is true and execute statements below
            System.out.println("It is a bad summer because the weather is too hot. ");  // Prints text to the console
        } else if (weather.equalsIgnoreCase(mild)) {  // else if value of weather is mild then execute statements below
        	System.out.println("It is a great summer because the weather is mild. " );  // Prints text to the console
        }  // end of else if statement
    
    }  // end of for loop
    System.out.println();  // Prints blank line to the console
    Scanner in2 = new Scanner(System.in);  // Reads the string input from the user
    System.out.println("I am going to count the days over 80 degrees until the tempature is less than 80 ");  // Prints text to the console
    System.out.println("Was it over 80 degrees today: yes or no? ");  // Prints text to the console
    String yes = "yes";  // set value of string variable yes equal to yes
    String no = "no";   // set value of string variable no equal to no
    int count = 0;  // Sets the value of the integer variable count equal to 0
    String over80 = in2.nextLine();  // Stores the user input in the string variable over80
    while (over80.equalsIgnoreCase(yes)) {  // Repeat while loop when over80 is equal to yes or true.  End loop when statement is false, over80 is equal to no
    	count++;  // increment integer variable count by 1
    	System.out.println("We have had " + count + " day(s) over 80 degrees in a row. ");  // Prints text and value of count to the console
    	
    	Scanner input = new Scanner(System.in);  // Reads the string input from the user
    	System.out.println("Was it over 80 degrees again today? ");  // Prints text to the console
        over80 = input.nextLine();  // Stores the user input in the variable over80

    }  // end of while loop
    count++;  // increment integer variable count by 1
    System.out.println("We finally had a break in the weather on day " + count);  // Prints text and value of count to the console
    }  // end of public static void statement
    }  // end of public class
