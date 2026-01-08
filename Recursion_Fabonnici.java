import java.util.*;

public class Recursion_Fabonnici {
void main(){
    Scanner sc=new Scanner(System.in);
    IO.print("Enter the number to pring up to :: ");
    int n=sc.nextInt();
    for(int i =0;i<n;i++){
        IO.print(fib(i)+" ");
    }
}
int fib(int n){

    if(n==0) return 0;
    if(n==1) return 1;

    return fib(n-1)+fib(n-2);
}

}
