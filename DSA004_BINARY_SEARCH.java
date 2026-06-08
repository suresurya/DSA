import java.util.*;

public class DSA004_BINARY_SEARCH {
    static boolean binarysearch(int[]a,int target ){
        int left=0;
        int right=a.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(a[mid]==target){ return true;}

            else if(a[mid]>target) {right=mid-1;}
            else{left=mid+1;}
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
        for(int i =0;i<a2.length;i++){
            if(binarysearch(a1,a2[i])){
                System.out.println("Found ");
            }else{
                System.out.println("Not Found ? ");
            }
        }
        sc.close();
    }
}
