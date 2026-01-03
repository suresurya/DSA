import java.util.*;
public class Palindrome_Check_if_a_number_is_Palindrome_or_Not {
void main(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int rev=0;
    int x=n;
    while(x!=0){
        int lastdigit=x%10;
        rev=rev*10+lastdigit;
        x=x/10;
    }
    if(rev==n){
        IO.println("Yes it is a Palindrome;");
    }else {
        IO.println("No it is not a palindrome" +
                "he he he he he he he 💻");
    }
}
}
