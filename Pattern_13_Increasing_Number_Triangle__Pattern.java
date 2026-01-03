
import java.util.*;
public class Pattern_13_Increasing_Number_Triangle__Pattern {
    void main (){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                IO.print(c+" ");
                c++;
            }
            IO.println("");
        }
    }
}
