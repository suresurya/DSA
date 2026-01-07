import java.util.*;
public class Recursion_N_to_1 {
    void main(){
        Scanner sc=new Scanner(System.in );
        int n =sc.nextInt();
        printnto1(n);
    }
    void printnto1(int n){
        if(n==0) return;
        IO.println(n);
        printnto1(n-1);
    }
}
