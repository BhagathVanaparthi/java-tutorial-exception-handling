package exception_handling;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String str = null;
            int lengthOfString = str.length();
            System.out.println("Length of the String ia :" + lengthOfString);
        }catch (NullPointerException exception){
            System.out.println("NullPointerException!");
        }

    }
}
