import java.util.*;
public class RIGHT_ANGLED_TRIANGLED_TRIANGLE_PATTERN {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                IO.print("*");
            }
            IO.println("");
        }
    }
}
