import java.util.*;
public class Recursion_Factorial_of_N_numbers {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int c=factorial(n);
        IO.print(c);
    }
    int factorial(int n ){
        if(n==1) return 1;
        return n*factorial(n-1);
    }
}
