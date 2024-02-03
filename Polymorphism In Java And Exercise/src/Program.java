
//Dynamic Polymorphism : overriding
import java.util.Scanner;

abstract class Doctor{
    abstract void treatPatient();
}

class Physician extends Doctor{
    @Override
    void treatPatient(){
        System.out.println("Hi! I am Physician \n I treat patients using Medicines");
    }
}

class Surgeon extends Doctor{
    @Override
    void treatPatient(){
        System.out.println("Hi! I am Surgeon \n I treat patients using surgery");
    }
}

class Dentist extends Doctor{
    @Override
    void treatPatient(){
        System.out.println("Hi! I am Dentist \n I treat patients teeth");
    }
}
public class Program {

    public static void main(String[] args) {
        
        System.out.println("Hi! I am Lucy. Receptionist at MAx Care");
        System.out.println("Who are you looking for?");
        System.out.println("Press\n1. Physician\n2. Surgeon\n3. Dentist");

        int choice = new Scanner(System.in).nextInt();

        Doctor doc = null;

        switch(choice) {
        case 1:
            doc = new Physician();
        break;

        case 2: 
            doc = new Surgeon();
        break;

        case 3:
            doc = new Dentist();
        break;

        default:
            System.out.println("invaliud Choice!");
        break;
        }

        if(choice<0 || choice>3){
            System.exit(0);
        }
        else{
            doc.treatPatient();
        }
    }
    
}
