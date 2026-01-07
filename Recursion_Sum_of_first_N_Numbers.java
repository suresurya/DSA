import java.util.*;
public class Recursion_Sum_of_first_N_Numbers {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        int c =sumoffirstnnumbers(n,i);
        IO.println(c);
    }
    int sumoffirstnnumbers(int n,int i ){
        if(n==0) return i;
        i+=n;
        return sumoffirstnnumbers(n - 1, i);
    }
}

