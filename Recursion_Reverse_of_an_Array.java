import java.util.*;
public class Recursion_Reverse_of_an_Array {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n[]={1,2,3,4,5};
        reverseofanarray(n,n.length-1);

    }
    void reverseofanarray(int n[],int i){
        if(i<0) return;
        IO.print(n[i]+" ");
     reverseofanarray(n,i-1);
    }
}
