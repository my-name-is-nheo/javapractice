/*
In Java, a variable must be specified data type. Data type are divided in two two groups
- Primitive data types - includes byte, short, int, long, float, double, boolean and char
- Non-primitive data types - such as String, Arrays, and Classes


Primitive data types specifies the size and type of variable values, and it has no additional methods.
There are 8 primite data types in java
1. byte	    1 byte	Stores whole numbers from -128 to 127
2. short	2 bytes	Stores whole numbers from -32,768 to 32,767
3. int	    4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
4. long	    8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
5. float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
6. double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
7. boolean	1 bit	Stores true or false values
8. char	    2 bytes	Stores a single character/letter or ASCII values


Primitive number types are divided into two groups: 

Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. 
Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.

Floating point types represents numbers with a fractional part, containing one or more decimals. 
There are two types: float and double.

*/


public class MyDataType{
    public static void main(String[] args){
        byte myNum = 127;
        System.out.println(myNum);
        short myNum = 5000;
        System.out.println(myNum);
        int myNum = 10000;
        System.out.println(myNum);
        long myNum = 1000000000000L;
        System.out.println(myNum);


        Floating point types
        float myNum = 5.75f;
        System.out.println(myNum);
        double myNum = 19.99d;
        System.out.println(myNum);
        float f1= 35e3f;
        System.out.println(f1); //35000.0
        double d1 = 12.E4d;
        System.out.println(d1); //120000.0
    }
}