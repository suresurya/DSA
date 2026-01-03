import java.util.*;
public class RECTANGULAR_STAR_PATTERN {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                IO.print("*");
            }
            IO.println("");
        }
    }
}
