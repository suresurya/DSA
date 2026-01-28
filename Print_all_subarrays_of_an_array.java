import java.util.*;
public class Print_all_subarrays_of_an_array {
        void main(){
            Scanner sc=new Scanner(System.in);
            String input=sc.nextLine();
            input=input.substring(1,input.length()-1);
            String[] parts=input.split(",");

            int[] a=new int[parts.length];
            for(int i=0;i<parts.length;i++){
                a[i]=Integer.parseInt(parts[i].trim());
            }
            System.out.println(Arrays.toString(a));
            for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.println(a[k]+" ");
                }
                System.out.println("");
            }
                System.out.println("");
            }

        }
}
