import java.util.*;
public class Subarrays_Maximum_element_in_every_subarray_of_size_K {
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
        ArrayList<Integer> result=new ArrayList<>();
        for(int i =0;i<a.length-n;i++){
            int max=0;
            for(int j=i;j<a.length-n;j++){
                for(int k=i;k<=j;k++){
                    max=Math.max(a[k],max);
                }
            }
            result.add(max);
        }
        System.out.print("[");
        for(int i =0;i<result.size();i++) {
            System.out.print(result.get(i)+" ");
        }
        System.out.print("]");
    }
}
