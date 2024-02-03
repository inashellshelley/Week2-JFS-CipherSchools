
/*
 * Create Class A, B and C. 
 * B should be a child for class A 
 * and C should be a child of class B
 */

class A{

    void display(){
        System.out.println("I am parent of B");
    }

}

class B extends A{
    void display(){
        System.out.println("I am child of A and parent of C");
    }

}

class C extends B{
    void display(){
        System.out.println("I am child of B and grandchild of A");
    }
}
public class Test3 {
    public static void main(String[] args) {
        C c = new C();
        c.display();
    }
}

