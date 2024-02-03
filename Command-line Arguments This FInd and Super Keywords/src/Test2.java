//A class cannot be final
//final class cannot be inherited
//when we decllare a class as final, it is for preventing
//others from inheriting the class. it is for the sake of keeping it secured


class father{

    public final String lastName="Oberoi";
/*
    public final void foodHabit(){
        System.out.println("I like Salty");
    }

*/
    public void foodHabit(){
        System.out.println("I like Salty");
    }
}

class son extends father{

    public void foodHabit(){
        //lastName="Malhotra";
        System.out.println("I like sweet food");
    }
}

public class Test2 {

    public static void main(String[] args) {
        father f = new father();
        f.foodHabit();
        
    }
    
}
