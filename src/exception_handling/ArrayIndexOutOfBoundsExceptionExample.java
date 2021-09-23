package exception_handling;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int array[] = new int[5];
        try
        {
            array[0] = 5;
            array[1] = 8;
            array[2] = 4;
            array[3] = 6;
            array[4] = 9;

            // Array has only 5 elements but when you insert 6th element you will ArrayIndexOutOfBoundsException

            array[5] = 10;

        }catch (ArrayIndexOutOfBoundsException aioException){
            System.out.println("ArrayIndexOutOfBoundsException");
        }


    }
}
