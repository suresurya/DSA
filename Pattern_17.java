import java.util.*;
public class Pattern_17 {
    void main(){
        Scanner sc=new Scanner(System.in);
        IO.print("Enter the Nunber : ");
        int n=sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                IO.print("  ");
            }
            Character s='A';

            for(int j=0;j<i*2+1;j++){
                IO.print(s+" ");
                if(j<(i*2+1)/2){
                    s++;
                }else{
                    s--;
                }
            }
            IO.println("");
        }
    }
}
