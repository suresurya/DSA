import java.util.*;
public class Recurstion_for_loop {
    static void print(int i, int n){
        if(i==n+1) return ;
        System.out.println(i);
        print(i+1,n);
    }
    static void printwhile(int n){
        if(n<0) return ;
        System.out.println(n);
        printwhile(n-1);

    }
    public static void main(String[] args ){
        int n =5;
        print(1,5);
        printwhile(n);
    }
}
