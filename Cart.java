import java.util.*;

public class Cart {
    class CartItem{
        String ItemName;
        int itemPrice,quantity;

        CartItem(String ItemName,int itemPrice,int quantity){
        this.ItemName= ItemName;
        this.itemPrice=itemPrice;
        this.quantity=quantity;
        }
    }
    
    static int index=0;
    CartItem arr[];
    Cart(){
        arr=new CartItem[100];
    }

    void AddToCart(){
        CartItem c=new CartItem("item", 80, 89);
        arr[index++]=c;
    }

    void removeFromCart(){
        index--;
    }

    void display(){
        for(int j=0;j<arr.length;j++){
            CartItem i=arr[j];
            System.out.println(i.ItemName+" "+i.itemPrice+" "+i.quantity);
        }
    }

    public static void main(String[] args) {
        Cart c=new Cart();
        c.AddToCart();
        c.AddToCart();
        c.AddToCart();
        c.AddToCart();
        c.AddToCart();
        c.display();
        c.removeFromCart();
        c.removeFromCart();
        c.removeFromCart();
        c.removeFromCart();
        c.display();
        
    }
}