package exception_handling;

public class ArithmeticExceptionExample {

    public static void main(String[] args) {

        try {
            int num1 = 20;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println("The result is : " + result);
        }
        catch (ArithmeticException exp){
            System.out.println("You Shouldn't divide a number by zero");
        }


    }


}
