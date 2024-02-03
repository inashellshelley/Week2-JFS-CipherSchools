import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test0{

    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();

        states.add("California");
        states.add("Alabama");
        states.add("Alaska");
        states.add("Arkansas");

        System.out.println("ArrayList: "+states);

        //Accessing elements using get method

        String s = states.get(2);
        System.out.println("I got "+s);
/* 
        Write Loop for this
        System.out.println("ArrayList size: "+states.size());
        for (int i=0; i<states.size(); i++){
            System.out.println(states.get());
        }

        //Update Elements using .set() method

*/
        states.set(2, "Texas");
        System.out.println("After updation: "+ states);

        //Removing elements using .remove() method
        String t = states.remove(3);
        System.out.println("State removed is: "+t);
        System.out.println("ArrayList after removing t: "+states);

        //Let us sort the List using .sort() method

        states.sort(Comparator.naturalOrder());

        System.out.println("ArrayList after natural order sorting: "+states);

        //.contains() Method

        System.out.println("Is NewYork there? "+states.contains("newyork"));

        //get index of element using .index() method

        System.out.println("Texas is at: "+states.indexOf("Texas")+" index ");

        //you cac check whether the list is empty or not .isEmpty() method

        System.out.println("is list empty? "+states.isEmpty());

        states.removeAll(states);
        System.out.println("is List empty? "+states.isEmpty());

        /* 
        ArrayList cart0 = new ArrayList<>();

        List cart1 = new ArrayList<>();

        cart0.add("Apple");
        cart0.add(100);
        cart0.add('c');

        ArrayList<Integer> cart2 = new ArrayList<Integer>();

        cart2.add(100);
        cart2.add(800);
        //cart2.add("hi");

        //generic: type safe
        //avoid typecasting
        //typecasting reduces the performance of the software

        */

    }
}