import java.util.*;


public class Print_Name_N_times_using_Recursion {

    void main(){
    Scanner sc=new Scanner(System.in);
    IO.println("Enter Your Name :");
    String s=sc.next();
    IO.println("Enter no of times to print: ");
    int n =sc.nextInt();
    print_name(n,s);
    sc.close();
    }
    void print_name(int n,String s){
        for(int i=0;i<n;i++){
            IO.println(s+" ");
        }
    }
}