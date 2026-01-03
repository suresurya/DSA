import java.util.*;

public class Pattern_7_Star_Pyramid {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i =0;i<=n;i++) {
            for(int j=0;j<=n-i;j++) IO.print(" ");
            for(int j=0;j<(2*i-1);j++) IO.print("*");

            IO.println("");
        }

    }
}
