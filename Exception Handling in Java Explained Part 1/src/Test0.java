
import java.util.Scanner;

public class Test0{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey Buddy! How old are you?");

        int age= sc.nextInt();
        //What if my input is in letters?
        //then it will be input mismatch exception
        //it is checked at runtime
        System.out.println("Woah! You have really grown up! You are "+age+" years old.");
    }
}