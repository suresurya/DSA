import java.util.*;
public class Remove_the_Duplicates_from_a_array {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int [] c=a.clone();
        Arrays.sort(c);
        int temp=0;
        System.out.print(c[0]+" ");
        for(int i =1;i<n;i++){
            temp=c[i-1];
            if(temp!=c[i]){
                System.out.print(c[i]+" ");
            }
        }

    }
}
