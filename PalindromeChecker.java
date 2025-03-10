import java.util.*;

public class PalindromeChecker {
    String text;
    PalindromeChecker(String s){
        text=s;
    }

    void isPalindrom(){
        int i=0,j=text.length()-1;
        while(i<j){
            if(text.charAt(i)!=text.charAt(j)){
                System.out.println(text +" is not a Palindrome String");
                return ;
            }
            i++;
            j--;
        }
        System.out.println(text+" is a Palindrome String ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Your code here
        System.out.println("Enter the String ");

        String s=sc.next();

        PalindromeChecker p=new PalindromeChecker(s);

        p.isPalindrom();
    
        sc.close();
    }
}