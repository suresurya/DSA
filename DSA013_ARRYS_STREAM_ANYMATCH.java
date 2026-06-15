import java.util.*;
import java.util.stream.*;
public class DSA013_ARRYS_STREAM_ANYMATCH {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. CHECK If any number is divisible by 11 and 13
        // 1. check if array contains an even  number
        int[] arr = {1, 3, 5, 8, 9};
        boolean ans=Arrays.stream(arr).anyMatch(x-> x%2==0);
        System.out.println(ans);

        //2. Check if array contains a negative number
        int[] arr1 = {5, 10, 15, -2, 20};
        boolean answ=Arrays.stream(arr1).anyMatch(x-> x<0);
        System.out.println(answ);

        //3. Check if array contains a number grater than 100
        int[] arr2 = {12, 25, 48, 76, 99};
         boolean ans3=Arrays.stream(arr2).anyMatch(x-> x>100);
        System.out.println(ans3);

        //4 . chekc if arry contains zero
        int[] arr3 = {5, 8, 2, 7, 0};
        boolean ans4=Arrays.stream(arr3).anyMatch(x-> x==0);
        System.out.println(ans4);

        //5. Check if array contains a multiple of 7
        int[] arr5 = {10, 15, 20, 28, 30};
        boolean ans5=Arrays.stream(arr5).anyMatch(x-> x%7==0);
        System.out.println(ans5);

        //6. Check if amy elememtn is divisibl by bot the 3 and 5
        int[] arr6 = {7, 11, 13, 15, 19};
        boolean ans6=Arrays.stream(arr6).anyMatch(x-> x%3==0 && x%5==0);
        System.out.println(ans6);

        //7. Check if any elemtn ends with digit 5
        int[] arr7 = {12, 24, 35, 47, 58};
        boolean ans7=Arrays.stream(arr7).anyMatch(x-> x%10==5);
        System.out.println(ans7);

        //8. Chekc if any number is a prefect square
        int[] arr8 = {3, 111, 21, 22, 31};
        boolean ans8=Arrays.stream(arr8).anyMatch(x-> x==(Math.sqrt(x)*Math.sqrt(x)));
        System.out.println(ans8);

        //9. Check if any element lies between 50 and 100
        int[] arr9 = {12, 48, 67, 120};
        boolean ans9= Arrays.stream(arr9).anyMatch(x-> x<100 && x>50 );
        System.out.println(ans9);

        //10 . chekc if anay lenent is tow digit number
        int[] arr10={5,8,100,150,12};
        boolean ans10=Arrays.stream(arr10).anyMatch(x-> (Math.log10(x)+1)==2);
        System.out.println(ans10);

        //11 . Chekc if any name starts wiht 'a'
        String[] names1 = {"Ram", "Arya", "John", "Kiran"};
        boolean ans11=Arrays.stream(names1).anyMatch(s-> s.startsWith("A"));
        System.out.println(ans11);

        //12. Chekc if any name ends wiht 'n'
        String[] names2 = {"Ram", "Mohan", "Kiran", "Sai"};
        boolean ans12=Arrays.stream(names2).anyMatch(s-> s.endsWith("n"));
        System.out.println(ans12);

        //13. Check if any string length is grater than 8
        String[] names3 = {"Ram", "Alexander", "Sai"};
        boolean ans13=Arrays.stream(names3).anyMatch(s-> s.length()>8);
        System.out.println(ans13);

        //14. Chekc if any strings contains "java "
        String[] words = {"python", "c++", "java", "javascript"};
        boolean ans14=Arrays.stream(words).anyMatch(s-> s.equals("java"));
        System.out.println(ans14);

        //15. Chekc if any string is empty
        String[] words2 = {"hello", "", "world"};
        boolean ans15=Arrays.stream(words2).anyMatch(s-> s.isEmpty());
        System.out.println(ans15);

        //16.Check if any element is prime
        int[] arr16 = {4, 8, 12, 17, 20};
        boolean ans16=Arrays.stream(arr16).anyMatch(x-> IntStream.rangeClosed(2,(int)Math.sqrt(x)).noneMatch(i-> x%i==0));
        System.out.println("Ans 16 "+ans16 );

        int n=17;
        boolean ans177=false;
        if(n>1){
            ans177=IntStream.rangeClosed(2,(int)Math.sqrt(n)).noneMatch(i-> n%i==0);
        }
        System.out.println("ans 17 bitchhhhhhhhhh : "+ ((ans177)?"Prime Bittttch  ":"Not A prime NumberBtich 😂😂😂😂😂😂😂😂😂"));

        //17 . Check any duplicate values exists
        int[] arr17= {1, 2, 3, 4, 2, 5};
       // boolean ans17=Arrays.stream(arr17).anyMatch(x-> x==Arrays.stream(arr17).iterator(y-> x==y));
       // System.out.println(ans17);

















        sc.close();
    }
}
