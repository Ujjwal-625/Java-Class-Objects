import java.util.Scanner;

public class Item {

    String ItemCode,ItemName;
    int ItemPrice;

    Item(String ItemCode,String ItemName,int ItemPrice){
        this.ItemCode=ItemCode;
        this.ItemPrice=ItemPrice;
        this.ItemName=ItemName;
    }

    void PrintPrice(int quantity){
        System.out.println("The Price of "+quantity+" Items is "+this.ItemPrice*quantity);
    }
    public static void main(String[] args) {
        Item i=new Item("Sample","test",109);
        System.out.println("Enter the quantity of the item");
        Scanner sc=new Scanner(System.in);

        int quantity=sc.nextInt();

        i.PrintPrice(quantity);
    }
}
