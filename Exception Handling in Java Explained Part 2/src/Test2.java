
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {

    int n1, n2, result;
    Scanner sc = new Scanner(System.in);

    void calculate(){
        try{
            System.out.println("Enter first number: ");
            n1= sc.nextInt();

            System.out.println("Enter second number: ");
            n2= sc.nextInt();

            if(n2==0){
                //testing perspective
                throw new ArithmeticException();
            }

           result= n1/n2;
        }
        catch(InputMismatchException ine){
            System.out.println("Input mismatch exception");
        }
        catch(ArithmeticException ae){
            System.out.println("Aritmetic exception");
        }
        catch(Exception e){
            System.out.println("Ouch! Exception Detected! "+e.getMessage());
            e.printStackTrace();
        }
        finally{
        System.out.println("The division is: "+result);
        //will execute with or without error
        //but it was displayed earlier also in both cases
        //so to understand finally we need a different program
    }
    }
     public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.calculate();
    }
}

/*
 * Keywords to hanc=dle Exception:-
 * 
 * try: represents/contains code that we think has probability to generate/throw error at Runtime(exceptiopn)
 * catch: executes only if any error/exception occurs in Try block
 //understanding the purpose of multiple catch
 * finally: finally block executes irrespective of if any exception is occuring in try block or not.
 * throw: it is used to raise exceptions manually
 * throws: temporary fix exception and need to add try catch block
 */
