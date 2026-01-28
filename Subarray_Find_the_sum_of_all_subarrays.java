import java.util.*;
public class Subarray_Find_the_sum_of_all_subarrays {
    void main(){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        input=input.substring(1,input.length()-1);
        String[]parts=input.split(",");
        int[]a =new int[parts.length];
        for(int i =0;i< parts.length;i++){
            a[i]=Integer.parseInt(parts[i].trim());
        }
        int sum=0;
        for(int i =0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    sum+=a[k];
                }
            }
        }
        System.out.println("Sum :"+sum);
    }
}
