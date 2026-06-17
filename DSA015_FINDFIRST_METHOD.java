import java.util.*;
import java.util.stream.*;
public class DSA015_FINDFIRST_METHOD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int[] arr = {3, 5, 8};
//        long index=Arrays.stream(arr).filter(
//          x-> {
//              int root=(int)Math.sqrt(x);
//              return root*root==x;
//          }
//        ).count();
//        System.out.println("Index : "+(long)index);
//
//        int[] a1={1,2,3,4,5,6,7,8,9,10};
//        System.out.println(Arrays.stream(a1).filter(x-> x%2==0).count());
//        System.out.println(Arrays.stream(a1).filter(x-> x%2!=0).count());
//        System.out.println(Arrays.stream(a1).filter(x-> x>0).count());
//        System.out.println(Arrays.stream(a1).filter(x-> x<0).count());
        //count occurances of an element
        int[] a2 = {5,1,5,2,5,7};//
        int indexx=0;
        Arrays.stream(a2).distinct().forEach(x-> {
            long c=Arrays.stream(a2).filter(y-> y==x).count();
            System.out.println(x+" -> "+c);
        });
// Count distinct elements
        int[] a = {1,1,2,2,3,3,4};
        long c= Arrays.stream(a).distinct().count();
        System.out.println(c);


        //Count Strings Starts with "A"

        List<String> names =
                List.of("Apple", "Ant", "Ball", "Arjun");
        long counts=names.stream().filter(s-> s.startsWith("A")).count();
        System.out.println(counts);







        sc.close();
    }
}
