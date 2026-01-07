import java.util.*;
public class Recursion_Print_1_to_N_times {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
     print1ton(n,1);
    }
    void print1ton(int n,int i){
        if(i==n+1) return;
        IO.println(i);
        print1ton(n,i+1);
    }
}
