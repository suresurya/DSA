import java.util.*;
public class Recursion_Palindrome {
   boolean palidrome(String s,int i){
        if(i==s.length()/2){
            return true;
        }
        if(s.charAt(s.length() - i - 1) != s.charAt(i)) {
            return false;
        }
       return palidrome(s,i+1);

   }
    void main(){
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toUpperCase();
        IO.print((palidrome(s,0))?"Given is a palindrome":"Given is not a palindrome");

    }

}
