import java.util.*;

public class Pattern_16_Alpha_Ramp_Pattern {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        char a='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                IO.print(a);


            }a++;
            IO.println("");
        }
    }
}
