package exception_handling;

/*As we know that there are two types of exception checked and unchecked. Checked exception (compile time) force you to handle them, if you don’t handle them then the program will not compile.
On the other hand unchecked exception (Runtime) doesn’t get checked during compilation. Throws keyword is used for handling checked exceptions . By using throws we can declare multiple exceptions in one go.*/

import java.io.IOException;

public class ThrowsExample {

        static void myMethod(int num)throws IOException, ClassNotFoundException{
            if(num==1)
                throw new IOException("IOException Occurred");
            else
                throw new ClassNotFoundException("ClassNotFoundException");
        }
        public static void main(String args[]){
            try{
                ThrowExample obj=new ThrowExample();
                myMethod(8);
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
    }

