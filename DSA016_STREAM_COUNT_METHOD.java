import java.util.*;
import java.util.stream.*;

public class DSA016_STREAM_COUNT_METHOD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Count even numbers
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.stream(arr1).filter(x-> x%2==0).count());


        //2. Count odd numbers
        int[] arr2 = {2, 4, 5, 7, 9, 10};
        System.out.println(Arrays.stream(arr2).filter(x-> x%2!=0).count());

        //3.Count negative numbers
        int[] arr3 = {5, -2, 8, -10, 3, -1};
        System.out.println(Arrays.stream(arr3).filter(x-> x<0).count());

        //4. Count numbers greater than 50
        int[] arr4 = {10, 55, 70, 20, 90, 45};
        System.out.println(Arrays.stream(arr4).filter(x-> x>50).count());

        //5. count multiples of 7
        int[] arr5 = {7, 14, 18, 21, 28, 30};
        System.out.println(Arrays.stream(arr5).filter(x->  x%7==0).count());

        //6. Count names starting wiht "A"
        String[] arr6 = {
                "Arya",
                "Ram",
                "Anil",
                "John",
                "Akash"
        };
        System.out.println("Counts names staring wiht a "+Arrays.stream(arr6)
                .filter(x-> x.startsWith("A")).count());

        //7. Count names ending wiht 'n'

        String[] arr7 = {
                "Ram",
                "Mohan",
                "Kiran",
                "Sai",
                "Arun"
        };
        System.out.println(Arrays.stream(arr7).filter(x-> x.endsWith("n")).count());

        //8. Count Strings having length grater than 5
        String[] arr8 = {
                "Java",
                "Stream",
                "Programming",
                "Code",
                "Developer"
        };
        System.out.println(Arrays.stream(arr8).filter(x-> x.length()>5).count());

        //9. count strings Contaiing "java "
        String[] arr9 = {
                "java",
                "javascript",
                "python",
                "javafx"
        };
        System.out.println("Count strings containgin java "+ Arrays.stream(arr9).filter(x-> x.contains("java")).count());


        //10. Count empty strings
        String[] arr10 = {
                "",
                "hello",
                "",
                "world",
                ""
        };
        System.out.println(Arrays.stream(arr10).filter(x-> x.isEmpty()).count());

        //11. count prime numbers
        int[] arr11 = {
                2, 4, 5, 7, 9, 11, 12
        };
        System.out.println(Arrays.stream(arr11).distinct().filter(x-> {return (x>1 && IntStream.rangeClosed(2,(int)Math.sqrt(x)).noneMatch(i-> x%i==0));}).count());

        //12. Count palindrome Numbers
        int[] arr12 = {
                121,
                123,
                454,
                789,
                1331
        };
        System.out.println(Arrays.stream(arr12)
                .filter(x-> {
                    String s = String.valueOf(x);
                    return IntStream.range(0, s.length() / 2).allMatch(i -> s.charAt(i) == s.charAt(s.length() - 1 - i));
                }).count());

        //13 .Count Perfect Square
        int[] arr13 = {
                4,
                5,
                9,
                12,
                16,
                20
        };

        System.out.println("Count perfecct squrare : "+ Arrays.stream(arr13).distinct().filter(x-> {int root=(int)Math.sqrt(x);return root*root==x;}).count());

        // 14 counr number having exactly 3 digits
        int[] arr14 = {
                10,
                100,
                999,
                1000,
                456
        };
        System.out.println("Count numbrs aving exaclty 3 digits "+ Arrays.stream(arr14).distinct()
                .filter(x-> (int)Math.log10(x)+1==3).count());

        //Count numbers whose Digit sum is 10
        int[] arr15 = {
                19,
                55,
                123,
                91,
                100
        };
        System.out.println("Count numbers whose digit sum is 10 : "+Arrays.stream(arr15).filter(x-> (1+(x-1)%9)==10).count());

        //16. Count occurances of 5
        int[] arr16 = {
                5,
                1,
                5,
                2,
                5,
                7
        };
        System.out.println("Count the occurences of 5 in a array : "+Arrays.stream(arr16).filter(x-> x==5).count());

        //17. Count occurences of 2
        int[] arr17 = {
                2,
                4,
                2,
                6,
                2,
                8,
                2
        };
        System.out.println(Arrays.stream(arr17).filter(x-> x==2).count());

        //18 . Count distinct Elemtns

        int[] arr18 = {
                1,
                2,
                2,
                3,
                4,
                4,
                5
        };
        System.out.println(Arrays.stream(arr18).distinct().count());

        //19. Cunt the duplicate Values
        int[] arr19 = {1, 2, 2, 3, 4, 4, 5, 5};
        System.out.println(arr19.length-Arrays.stream(arr19).distinct().count());

        //20. Count elemenst  occuring more than 2 times
        int[] arr20 = {
                1,
                2,
                2,
                2,
                3,
                4,
                4,
                4,
                4
        };
        int[]
        arr20b = Arrays.copyOf(arr20,arr20.length);
        System.out.println(Arrays.stream(arr20).distinct().filter(x-> IntStream.range(0,arr20b.length).filter(i->arr20b[i]==x).count()>=2).count());

        sc.close();
    }
}
