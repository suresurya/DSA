import java.util.Scanner;
public class Pattern_5_Inverted_Right_Pyramid {
    void main() {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        for(int j=n;j>i;j--){
            IO.print("*");
        }
        IO.println("");
    }
    }
}
