
//Create a class name as Addition. Create three mthods of the same
//name as sum. First method will accept two argumetns, the second
//method will accept 3 arguments and the third method will accept '
//two arguments of different data types. Perform method overloading 
//and try to access the respective method using objects

class Addition{
    void sum(int a, int b){
        System.out.println("Sum for first method= "+a+b);
    }

    void sum(int a, int b, int c){
        System.out.println("Sum for second method= "+a+b+c);
    }

    void sum(float a, int b){
        System.out.println("Sum for third method= "+a+b);
    }
}

public class Task {
    public static void main(String[] args) {
        Addition ad = new Addition();
        ad.sum(30, 40);
        ad.sum(2.5f, 3);
        ad.sum(10, 11, 9);  
    }
}
