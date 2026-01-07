import java.util.*;
public class Print_N_Times_Recursion {
void main(){
    Scanner sc=new Scanner(System.in);
    String s="Naruto";
    int n =5;
    printntimes(s,n);
}
void printntimes(String s,int n){
    if(n==0){
        return;
    }
    IO.println(s);
    printntimes(s,n-1);
}
}
