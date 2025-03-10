import java.util.*;

public class MovieTicket {

    String movieName,SeatNumber;
    int price;

    MovieTicket(String movieName,String SeatNumber,int price){
        this.movieName=movieName;
        this.SeatNumber=SeatNumber;
        this.price=price;
    }

    void display(){
        System.out.println("MovieName "+movieName);
        System.out.println("SeatNumber "+SeatNumber);
        System.out.println("price "+price);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        MovieTicket m=new MovieTicket("fjsljfls", "jfkdskfjlk", 890);
        m.display();
        sc.close();
    }
}