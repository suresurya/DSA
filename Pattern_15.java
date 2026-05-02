import java.util.*;
public class Pattern_15 {
    void main(){
        Scanner sc=new Scanner(System.in);
        IO.print("Enter the number : ");
        int n=sc.nextInt();
        Character s='A';
        for(int i=0;i<n;i++){
            s='A';
            for(int j=0;j<n-i;j++){
                IO.print(s+" ");
                s++;
            }
            IO.println("");
        }
    }
}
