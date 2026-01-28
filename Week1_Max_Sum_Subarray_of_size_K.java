import java.util.*;
public class Week1_Max_Sum_Subarray_of_size_K {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] a=new int[n];
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int initialsum=0;
        for(int i =0;i<k;i++){
            initialsum+=a[i];
        }
        int max=initialsum;
        for(int i=k;i<n;i++){
            initialsum=initialsum-a[i-k]+a[i];
            max=Math.max(max,initialsum);
        }
        System.out.println(max);
    }
}
