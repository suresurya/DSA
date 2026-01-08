import java.util.Scanner;
public class Arrays_Largest_element_in_an_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        int max=0;
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
            if(max<a[i]){
                max=a[i];
            }
        }
        IO.print(max);
    }
}