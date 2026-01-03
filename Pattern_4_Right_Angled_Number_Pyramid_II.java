import java.util.*;
public class Pattern_4_Right_Angled_Number_Pyramid_II {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++) {
                IO.print(i+1);
            }
            IO.println("");
        }
    }
}
