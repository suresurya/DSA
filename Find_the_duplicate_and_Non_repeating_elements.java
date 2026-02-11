import java.util.*;
public class Find_the_duplicate_and_Non_repeating_elements {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Stack<Integer> Duplicate=new Stack<>();
        Stack<Integer> Non_Duplicate=new Stack<>();
        int [] c=a.clone();
        Arrays.sort(c);
        for(int i =1;i<n;i++){
            if(c[i]==c[i-1]) {
                Duplicate.add(c[i]);
            }else{
                Non_Duplicate.add(c[i]);
            }
        }
        for(int i:Duplicate){
            System.out.print(i+" ");
        }
        for(int i : Non_Duplicate){
            System.out.print(i+" ");
        }

    }
}
