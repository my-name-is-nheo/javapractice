// running javac SomeFile.java will compile the code. If there are no errors in the code, the command prompt will take you the next line. 
// also created a .class file 
// every line of code that runs in Java must be inside a class. A class should always start with an uppercase first letter. 
public class MyClass {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
/*
The name of the java file must match the class name. 
  public class MyClass{}
  public class MyClass{}
  public class MyClass{}
  public class MyClass{}
  public class MyClass{}
  public class MyClass{}
  public class MyClass{}
  public class MyClass{}

The main method
- require and will be seen  in every java program. 
- any code inside the main() method will be executed
- every java program has a class name which must match the filename, and that every program must contain the main() method
public class MyClass{
  public static void main(String[] args){
    System.out.println("Hello World")
  }
}
public class MyClass{
  public static void main( String[] args){
    System.out.println("Hello World")
  }
}
public class MyClass{
  public static void main(String[] args){
    System.out.println("Hellow World")
  }
}
public class MyClass(){
  public static void main(String[] args){
    System.out.println("Hello World")
  }
}
public class MyClass {
  public static void main(String[] args){
    System.out.println("Hello Word")
  }
}
public class MyClass {
  public static void main(String[] args){
    System.out.println("hello World")
  }
}

public class MyClass{
  public static void main(String[] args){
    System.out.println("Hello World")
  }
}
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
public class MyClass{
  public static void main(String[] args ){
    String name = "Nick";
    System.out.println(name);
    int number = 9;
    System.out.println(number);
  }
}