import java.util.*;
public class Pattern_6_Inverted_Numbered_Right_Pyramid {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int np=n+1;
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                IO.print((np-j));
            }
            IO.println("");
        }
    }
}
