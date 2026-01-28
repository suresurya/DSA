import java.util.*;
public class Subarrays_Maximum_sum_subarray_of_size_K {
    void main(){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        input=input.substring(1,input.length()-1);
        String[]parts=input.split(",");
        int[]a =new int[parts.length];
        for(int i =0;i< parts.length;i++){
            a[i]=Integer.parseInt(parts[i].trim());
        }
        int n=sc.nextInt();
        int imax=0;
        for(int i =0;i<n;i++){
            imax+=a[i];
        }
        int max=imax;
                for(int i=n;i<a.length;i++){
                    imax=imax-a[i-n]+a[i];
                    max=Math.max(max,imax);
                }
        System.out.println("Max : "+max);
    }
}
