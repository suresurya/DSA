import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class DSA044_SELECTION_SORT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i =0;i<n;i++)
            a[i]=sc.nextInt();

//


        for(int i =0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[min]>a[j]) min=j;

            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
        System.out.println(Arrays.toString(a));
        sc.close();
    }
}
