
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

           result= n1/n2;
        }
        catch(Exception e){

        }
        System.out.println("The division is: "+result);
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
 * finally
 * throw
 * throws
 */
