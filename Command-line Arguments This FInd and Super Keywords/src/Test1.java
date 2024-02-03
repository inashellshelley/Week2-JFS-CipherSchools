
class App{
    App(){
        System.out.println("Constructor of App");
    }
    App(int num){
        System.out.println(num);
    }
}

public class Test1 extends App{
    
    Test1(){
        super(20);
        System.out.println("Constructor of Test1");
    }

    public static void main(String[] args) {
        new Test1();
    }
}
