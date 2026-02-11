import java.lang.reflect.Array;
import java.util.*;
public class Rearrange_Postives_and_Negative_In_a_List {
    static void main(){
        Scanner sc=new Scanner(System.in);
        String [] input=sc.nextLine().trim().split(" ");
        int[] a=new int[input.length];
        for(int i=0;i< input.length;i++){
            a[i]=Integer.parseInt(input[i]);
        }
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                pos.add(a[i]);
            }else{
                neg.add(a[i]);
            }
        }
        pos.addAll(neg);
        System.out.println(pos);

    }
}
