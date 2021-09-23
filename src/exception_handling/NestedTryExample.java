package exception_handling;
/*When a try catch block is present in another try block then it is called the nested try catch block. Each time a try block does not have a catch handler for a particular exception, then the catch blocks of parent try block are inspected for that exception, if match is found that that catch block executes.

 */
public class NestedTryExample {
    public static void main(String[] args) {
        //Parent try block
        try{

            //Child try block1
            try{
                System.out.println("Inside block1");
                int b =45/0;
                System.out.println(b);
            }
            catch(ArithmeticException e1){
                System.out.println("Arithmetic Exception: e1");
            }
            //Child try block2
            try{
                System.out.println("Inside block2");
                int arr[] = new int[4];
                arr[5] = 9;
                System.out.println(arr[5]);
            }
            catch(ArrayIndexOutOfBoundsException e2){
                System.out.println("ArrayIndexOutOfBounds Exception: e2");
            }
            System.out.println("Just other statement");
        }
        catch(ArithmeticException e3){
            System.out.println("Arithmetic Exception");
            System.out.println("Inside parent try catch block");
        }
        catch(ArrayIndexOutOfBoundsException e4){
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println("Inside parent try catch block");
        }
        catch(Exception e5){
            System.out.println("Exception");
            System.out.println("Inside parent try catch block");
        }
        System.out.println("Next statement..");
    }
}
