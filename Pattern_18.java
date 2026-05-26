import java.util.*;
public class Pattern_18 {
    void main(){
        Scanner sc=new Scanner(System.in);
        IO.print("Enter the Number : ");
        int n=sc.nextInt();
        Character s= (char) (n+64);
        for(int i=0;i<n;i++){
            s=(char)(n+64-i);
            for(int j=0;j<=i;j++){
                IO.print(s+" ");
                s++;
            }
            IO.println("");
        }

    }
}
