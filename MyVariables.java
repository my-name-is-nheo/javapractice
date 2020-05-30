/*
JAVA VARIABLES
String - stores text, surrounded by double quotes
int - stores integers (whole numbers)
float - stores floating point numbers, with decimals, such as 19.99 or -19.99 
char - stores single characters, such 'a' or 'A', surrounded by single quotes
boolean - stores values with two states: true or false

Declaring variables
to creat a variable, you must specify the type and assign it a value. 
type variable = value; 

String name = "Nick";
int number = 9;
char character = 'V';
*/
public class MyVariables{
  public static void main(String[] args ){
    String name = "Nick";
    System.out.println(name);
    int number = 9;
    System.out.println(number);
    int myNum = 5;
    System.out.println(myNum);
    float myFloatNum = 5.99f;
    System.out.println(myFloatNum);
    char myLetter = 'D';
    System.out.println(myLetter);
    boolean myBool = true;
    System.out.println(myBool);
    String myText = "Hello";
    System.out.println(myText);
  }
}
/*
println() is often used to display variables, you can use "+" to combine both text and a variable.

to declare more than one variable fo the same type, use a comma-seperated list
int x=5,t=6,z=50;
System.out.println(z+t+x);


*/