import java.util.*;

public class Pattern_18_Alpha_Triangle_Pattern {
    void main (){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        char aa = (char) ('A' + n-1);
        for(int i =0;i<n;i++){
            char a=(char)(aa-i);
            for(int j=0;j<=i;j++){
                IO.print(a);
                a++;
            }
            IO.println("");

        }
    }
}
