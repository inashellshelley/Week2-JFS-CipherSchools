//Polymorphism
//an ability of an object to take many forms
//static/dynamic
//static: overloading(function)
//dynamic: overriding(function)

public class Poly{

    //function overloading: defining multiple functions with the same name with different parameters
    //add is existing in multiple forms (using parameters)

    void add(int num1, int num2){
        System.out.println(num1+num2);
    }

    void add(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }

    void add(float num1, float num2){
        System.out.println(num1+num2);
    }
    void add(int num1, float num2){
        System.out.println(num1+num2);
    }
    void add(float num1, int num2){
        System.out.println(num1+num2);
    }

    public static void main(String args[]){

        Poly p = new Poly();
        p.add(40, 60);
        p.add(12.2f, 12);
    }
}