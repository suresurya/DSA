import java.util.Scanner;
public class Pattern_8_Inverted_Star_Pyramid {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i =0;i<=n;i++) {
            for(int j=0;j<i;j++) IO.print(" ");
            for(int j=(n*2)-1;j>(2*i);j--) IO.print("*");
            IO.println("");
        }
    }
}
