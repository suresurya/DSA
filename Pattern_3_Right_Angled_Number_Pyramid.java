import java.util.*;

public class Pattern_3_Right_Angled_Number_Pyramid {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j=0;j<i+1;j++){
                IO.print(j+1);
            }
            IO.println("");
        }
    }
}
