import java.util.*;
public class Pattern_22_The_Number_Pattern {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i =0;i<(n*2)-1;i++){
            for(int j=0;j<(n*2)-1;j++){
            int top =i;
            int bottom=(2*n-2)-i;
            int left=j;
            int right=(2*n-2)-j;
            int mindist=Math.min(Math.min(top,bottom),Math.min(left,right));
            IO.print((n-mindist)+" ");
            }
            IO.println("");
        }
    }

}
