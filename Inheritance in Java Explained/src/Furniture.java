//Inheritance
//1.1 Memory Usage Optimization
//1.2 Code Reusability
//increases productivity and efficiency

public class Furniture {
    int width;
    int height;

    void display(String item){
        System.out.println(item+" Widht "+width+" Height "+height);
    }

    public static void main(String[] args) {
        Chair neelkamal = new Chair();
        neelkamal.foo();
    }

}

class Chair extends Furniture {

    void foo(){
        width=10; height=50; display("Chair");
    }
}

class Table extends Furniture{

    void foo(){
        width=30; height=50; display("Table");
    }

}

class Almira extends Furniture{

    void foo(){
        width=100; height=200; display("Almira");
    }

}
