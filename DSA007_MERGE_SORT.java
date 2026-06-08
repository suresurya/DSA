import java.util.*;

public class DSA007_MERGE_SORT {
    static void merge_sort(int[]a ,int left,int right ){

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input=sc.nextLine();
        String [] s=input.split("\\s+");
        int[] a=new int[s.length];
        for(int i =0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        System.out.println(Arrays.toString(a));

        sc.close();
    }
}
