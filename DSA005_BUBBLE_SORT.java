import java.util.*;

public class DSA005_BUBBLE_SORT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input=sc.nextLine();
        String [] s=input.split("\\s+");
        int[] a=new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        for(int i =0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        sc.close();
    }
}
