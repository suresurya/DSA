import java.util.*;

public class Pattern_14_Increasing_Letter_Triangle_Pattern {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<=n;i++){
            char a='A';
            for(int j =0;j<i;j++){
                IO.print(a);
                a++;
            }
            IO.println("");
        }
    }
}
