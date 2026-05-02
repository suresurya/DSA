import java.util.*;
public class Pattern_14 {
    void main(){
        Scanner sc=new Scanner(System.in);
        IO.print("Enter the Number : ");
        int n=sc.nextInt();
        Character s='A';
        for(int i =0;i<n;i++){
            s='A';
            for(int j=0;j<=i;j++){
                IO.print(s+" ");
                s++;
            }
            IO.println("");
        }
    }
}
