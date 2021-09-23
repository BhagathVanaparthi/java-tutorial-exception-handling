package exception_handling;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try{
            int num=Integer.parseInt ("VERSION") ;
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("Number format exception occurred");
        }
    }
}
