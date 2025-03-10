import java.util.Scanner;

public class Book {
    String title,Author;
    int price;

    Book(String title,String Author,int price){
        this.title=title;
        this.Author=Author;
        this.price=price;
    }

    void printDetails(){
        System.out.println("Title of the Book is "+this.title);
        System.out.println("Author of the Book is "+this.Author);
        System.out.println("Price of the Book is "+this.price);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Book Details title ,Author,price ");;
        String title=sc.next();
        String Author=sc.next();
        int price=sc.nextInt();

        Book e1=new Book(title,Author,price);

        e1.printDetails();
    }

}
