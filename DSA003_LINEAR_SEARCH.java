import java.util.*;

public class DSA003_LINEAR_SEARCH {
    static boolean linearsearch(int[]a,int target){
        for(int i =0;i<a.length;i++){
            if(a[i]==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input1=sc.nextLine().trim();
        String[] s1=input1.split("\\s+");
        int[] a1=new int[s1.length];
        for(int i =0;i<a1.length;i++){
            a1[i]=Integer.parseInt(s1[i]);
        }
        String input2=sc.nextLine().trim();
        String[] s2=input2.split("\\s+");
        int[] a2=new int[s2.length];
        for(int i=0;i<a2.length;i++){
            a2[i]=Integer.parseInt(s2[i]);
        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        for(int i =0;i<a2.length;i++){
            if(linearsearch(a1,a2[i])){
                System.out.println("Found !");
            }else {
                System.out.println("Not Found !");
            }
        }
        sc.close();
    }
}
