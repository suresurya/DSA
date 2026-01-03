import java.util.*;

public class Pattern_17_Alpha_Hill_Pattern {
void main(){
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    for(int i=0;i<n;i++){
        char a='A';

        for(int j =0;j<n-i;j++){
            IO.print(" ");
        }
        for(int j=0;j<=i;j++){
            IO.print(a);
            a++;
        }
        a-=1;
        for(int j=i-1;j>=0;j--){
            a--;
            IO.print(a);
        }
        IO.println("");
    }
}
}
