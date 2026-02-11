import java.util.*;
public class List_Right_Rotation {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int k1=k;
        k=k%n;

        for(int i =n-k;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n-k;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i =k;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
