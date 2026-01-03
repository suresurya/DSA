import java.util.*;
public class Pattern_11_Binary_Number_Triangle_Pattern {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=1;
        for(int i =0;i<=n;i++){
            int val =(i%2==1)? 1 : 0;
            for(int j =0;j<i;j++){
                IO.print(val);
                val=(val==1)?0:1;
            }
            IO.println("");
        }
    }
}
