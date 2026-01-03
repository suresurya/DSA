import java.util.*;
public class Pattern_20_Symmetric_Butterfly_Pattern {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                IO.print("*");
            }
            for(int j=0;j<n-i;j++){
                IO.print("  ");
            }
            for(int j=0;j<i;j++){
                IO.print("*");
            }
            IO.println("");
        }
        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                IO.print("*");
            }
            for(int j=0;j<i;j++){
                IO.print("  ");
            }
            for(int j=n-i;j>0;j--){
                IO.print("*");
            }
            IO.println("");
        }
        sc.close();

    }
}
