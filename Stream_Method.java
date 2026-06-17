import java.util.stream.*;
import  java.util.*;
public class Stream_Method {
    static void main() {

//        IntStream.range(0,100).forEach(x-> System.out.print(x+" "));
//        IntStream.rangeClosed(0,200).forEachOrdered(x-> System.out.print(x+" "));
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Check wheather it is a palindrome or not exaclty : ");
//        System.out.println("Enter the Number : ");
//        int n=sc.nextInt();
//        String s=String.valueOf(n);
//        boolean r=IntStream.range(0,s.length()/2).allMatch(i-> s.charAt(i)==s.charAt(s.length()-1-i));
//        System.out.println("Result : "+r);
//        int []a= {121,
//                1331,
//                1221};
//        boolean r=Arrays.stream(a).anyMatch(x-> {
//           String s=String.valueOf(x);
//           return IntStream.range(0,s.length()/2).allMatch(i->s.charAt(i)==s.charAt(s.length()-1-i));
//        });
//        System.out.println(r);
//
//        int [] a={1,5,2,86,2,8,5,6,3,9,6,2,2,5,8,77,4,7,5,8655,45,56,456,65,498,16,2,123,6,84,89};
//        double avg=Arrays.stream(a).average().orElse(0);
//        boolean r=Arrays.stream(a).anyMatch(x-> x>avg);
//        System.out.println("Result : "+r);
//
//

        int[] arr1 = {22, 39, 55, 91, 143, 200};
        boolean ans1=Arrays.stream(arr1).anyMatch(x-> x%11==0 && x%13==0 );
        System.out.println(ans1);

        //2 . Check if any string contains more than 3 vowels
        String[] arr2 = {
                "computer",
                "education",
                "sky",
                "rhythm",
                "beautiful"
        };

//        boolean ans2=Arrays.stream(arr2).anyMatch(x->{
////return IntStream.range(0,x.length()).noneMatch(i-> x.charAt(i)=='a' || x.charAt(i)=='e' || x.charAt(i)=='i' || x.charAt(i)=='o' || x.charAt(i)=='u')>3;
//        });

        //3. Chekc if any nunver is a power of 2
        int[] arr3 = {3, 5, 7, 8, 12, 20};
        boolean ans3=Arrays.stream(arr3).anyMatch(x-> {
            return x>0 && (x&(x-1))==0;
        });
        System.out.println(ans3);

//4. check if  any element appears exactly 3 times
        int[] arr4 = {
                1, 2, 2, 2,
                3, 4, 4,
                5
        };
boolean ans4=Arrays.stream(arr4).anyMatch(x-> IntStream.range(0,arr4.length).filter(i-> arr4[i]==x).count()==3);
        System.out.println(ans4);

        //5. Chekc if any string is a palindrome
        String[] arr5 = {
                "java",
                "madam",
                "hello",
                "stream"
        };
        boolean ans5=Arrays.stream(arr5).anyMatch(x-> IntStream.range(0,x.length()).allMatch(i-> x.charAt(i)==x.charAt(x.length()-1-i)));
        System.out.println(ans5);

        //6 . Chekc if any number has more than 4 digits
        int[] arr6 = {
                123,
                4567,
                10000,
                99
        };
        boolean ans6=Arrays.stream(arr6).anyMatch(x-> (int)Math.log10(x)+1>4);
        System.out.println(ans6);

        //7. Check if any number is both prime and palindrome
        int[] arr7 = {
                11,
                121,
                131,
                200,
                303
        };

        boolean ans7=Arrays.stream(arr7).anyMatch(x->{
            String s=String.valueOf(x);
            return (x>1 && IntStream.rangeClosed(2,(int)Math.sqrt(x)).noneMatch(i-> x%i==0) &&
                    IntStream.range(0,s.length()/2).allMatch(i-> s.charAt(i)==s.charAt(s.length()-1-i)));
        });
        System.out.println(ans7);

        //8.Check if any String starts and ends with same character
        String[] arr8 = {
                "java",
                "level",
                "stream",
                "radar"
        };
        boolean ans8=Arrays.stream(arr8).anyMatch(s-> s.charAt(0)==s.charAt(s.length()-1));
        System.out.println(ans8);

        //9.Check if any number digit sum equals to 10

        int[] arr9 = {
                19,
                25,
                44,
                123,
                100
        };
        boolean ans9=Arrays.stream(arr9).anyMatch(x-> (1+(x-1)%9)==10);
        System.out.println(ans9);

        //10. Check if any element is present in the another array
        int[] arr10a = {
                10, 20, 30, 40
        };

        int[] arr10b = {
                5, 15, 20, 35
        };
        boolean ans10=Arrays.stream(arr10a).anyMatch(x-> Arrays.stream(arr10b).filter(y-> x==y).isParallel());
        System.out.println(ans10);



    }
}
