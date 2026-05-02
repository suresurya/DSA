import java.util.*;
public class Pattern_13 {
    void main()
    {
        Scanner sc=new Scanner(System.in);
        IO.print(" Enter the Number : ");
        int n=sc.nextInt();
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                IO.print(count+" ");
                count++;
            }
            IO.println("");
        }
    }
}
