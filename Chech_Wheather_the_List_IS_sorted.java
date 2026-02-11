import java.util.*;
public class Chech_Wheather_the_List_IS_sorted {
void main(){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i =0;i<n;i++){
        arr[i]=sc.nextInt();

    }
    int[] copy=arr.clone();
    Arrays.sort(copy);
    System.out.println((Arrays.equals(copy,arr)?"Sorted ":"Not Sorted Bithc "));
}
}
