import java.util.Scanner;
public class Pattern_10_Half_Diamond_Star_Pattern {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        /*for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                IO.print(" ");
            }
            for(int j =0;j<=i;j++){
                IO.print("*");
            }
            IO.println("");
        }
*/
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                IO.print("*");
            }
            IO.println("");
        }
        for(int i=0;i<=n;i++){
            for(int j=n;j>=i;j--){
                IO.print("*");
            }
            IO.println("");

        }
    }
}
