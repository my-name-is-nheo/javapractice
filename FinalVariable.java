/* 
Final Variables
You can add the final keyword if you don't want others to overwrite existing values. 
*/

public class FinalVariable{
  public static void main(String[] args){
    final int myNum = 15;
    myNum = 20;
    System.out.println(myNum);
  }
}
// running this code will give you an error: cannot assign a value to final variable 