
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

/*
 * Write a java program to ask User if he/she wants to add Item
 * in shopping cart
 * item: prodcut Title and Price
 * show the total Product Name in ascending order
 * total Amount of all Products.
 * 
 * add More ? y
 * then they add the item and the price is added
 *add More? y repeating the same procedure
 * add More? N
 * Total Bill: 
 * Product List(ascending order)
 */

 class Product{
    private String title;
    private double price;

    public Product(String title, double price){
        this.title = title;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }
 }
public class Test2 {

    ArrayList<Product> pr = new ArrayList<Product>();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Test2 t1 = new Test2();
        t1.shopping();
    }
    
    public void shopping(){
        char choice;
        do{
            addProduct();
            System.out.println("Add More? (y/n): ");
            choice = sc.next().charAt(0);
        } while(choice == 'y' || choice =='Y');

        showProductList();
        showTotalBill();
    }

    public void addProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String title = sc.nextLine();
        System.out.println("Enter price: ");
        double price = sc.nextDouble();
        pr.add(new Product(title, price));
    }

    public void showProductList(){
        Collections.sort(pr, Comparator.comparing(Product::getTitle));
        System.out.println("Product List: ");
        for(Product p : pr){
            System.out.println(p.getTitle()+" : Rs."+ p.getPrice());

        }
    }
    public void showTotalBill(){
        double total = 0.0;
        for(Product p : pr){
            total = total + p.getPrice();
        }

        System.out.println("Total Bill: Rs."+total);

    }
}
