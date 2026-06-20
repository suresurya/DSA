import java.util.*;
import java.util.stream.*;

public class DSA017_PRINT_ALL_DIVISORS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        System.out.println(IntStream.rangeClosed(1,n).filter(i-> n%i==0).boxed().toList());
        List<Integer> res=new ArrayList<>();

        for(int i =1;i*i<=n;i++){
            if(n%i==0){
                res.add(i);
                if(i!=n/i){
                    res.add(n/i);
                }
            }
        }
        System.out.println((res).stream().sorted().toList());
        sc.close();
    }
}
