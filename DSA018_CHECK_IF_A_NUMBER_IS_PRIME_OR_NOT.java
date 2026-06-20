import java.util.*;
import java.util.stream.*;
public class DSA018_CHECK_IF_A_NUMBER_IS_PRIME_OR_NOT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean result=n>1 && IntStream.rangeClosed(2,(int)Math.sqrt(n)).noneMatch(i-> n%i==0);
        System.out.println("Boolean Values of the result : "+result);
        

        sc.close();
    }
}
