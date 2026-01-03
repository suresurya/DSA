import java.util.*;
public class Palindrome_or_Not {
    void main(){
        Scanner sc=new Scanner(System.in);
        IO.print("ENTE THE NUMBER : ");
        int num=sc.nextInt();
        //IO.println(num);
        int n=num;
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum=sum*10+ld;
            n=n/10;
        }
        if(sum==num){IO.print("Palindrome");}else{IO.println(" Not a palindromje");}
    }
}
