import java.util.*;

public class DSA046_BUBBLE_SORT {


    public static void bubblesort(int[] a){
        for(int i =0;i<a.length-1;i++){
            int flag=0;
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                flag=1;
                }
            }
            if(flag==0) break;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        bubblesort(a);
        System.out.println(Arrays.toString(a));
        sc.close();
    }
}
