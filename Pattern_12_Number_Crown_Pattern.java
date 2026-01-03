import java.util.*;

public class Pattern_12_Number_Crown_Pattern {
    void main (){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<=i;j++){
                IO.print(j+1);
            }
            for(int j =0;j<(n-2)-i;j++){
                IO.print("  ");
            }
            for(int j=i;j>=0;j--){
                IO.print(j+1);
            }
            IO.println("");
        }
        sc.close();
    }
}
