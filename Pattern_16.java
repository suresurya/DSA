import java.util.*;
public class Pattern_16 {
void main(){
    Scanner sc=new Scanner (System.in);
    IO.print(" enter the number : ");
    int n=sc.nextInt();
    Character c='A';

    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            IO.print(c+" ");
        }
        c++;
        IO.println("");
    }

}
}

