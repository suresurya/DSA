//import java.util.Arrays;
//public class Arrays_Method {
//    public static void main(String[] args){
//        int[] a={1,2,3,5,6,7,8,9,0};
//        Arrays.stream(a).forEach(x -> System.out.print(x+" "));
//        int sum =Arrays.stream(a).max().orElse(0);
//        System.out.println("");
//
//        System.out.println(sum);
//        int max=Arrays.stream(a).sum();
//        System.out.println(max);
//        int b=Arrays.stream(a).min().getAsInt();
//        System.out.println(b);
//        int[] c= Arrays.stream(a).sorted().toArray();
//        System.out.println(Arrays.toString(c) );
//        double d=Arrays.stream(a).average().getAsDouble();
//        System.out.println(d);
//
//    }
//}
import java.util.*;
import java.util.stream.IntStream;

public class Arrays_Method{
    public static void main(String[] args){

        int [] a={9,8,7,6,5,3,2,1,0,4};
        int[] b= Arrays.stream(a).sorted().toArray();
        System.out.print(Arrays.toString(b));

        int max= Arrays.stream(a).max().orElse(0);
        int  min=Arrays.stream(a).min().orElse(0);
        System.out.println(" ");
        System.out.print(max+" "+min);
        int[] a1={1,2,3,4,5,6,7,8,9};
        int[] a2={1,2,3,4,5,6,7,8,9};
        System.out.println();
        System.out.println(Arrays.equals(a1,a2));
        int [][] a3={{1,2},{3,4}};
        int [][] a4={{1,2},{3,4}};

        System.out.println(Arrays.deepEquals(a3,a4));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.stream(a).count());
        Arrays.sort(a);

        System.out.println("Index : "+ Arrays.binarySearch(a,7));
        int x=7;
        boolean found=Arrays.stream(a)
                .anyMatch(y-> y==x);
        System.out.println(found);
        IntStream.range(0,a.length).forEach(i-> System.out.print("Index"+ i + "value"+ a[i]));



    }

}