import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.*;

public class DSA043_PRACTICE {
    static int fact(int n ){
        if(n==1) return 1;
        return n*fact(n-1);
    }

    static boolean isprime(int n){
        long s=(long)Math.sqrt(n);
        return s*s==n;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
//         palindrome String s=String.valueOf(n);
//        System.out.println(IntStream.range(0,s.length()/2).allMatch(i-> s.charAt(i)==s.charAt(s.length()-1-i)));
//
//        System.out.println((n%7==0 || n%10==7)?true: false); buss number
       // System.out.println(n>1 && IntStream.rangeClosed(2,(int)Math.sqrt(n)).noneMatch(i-> n%i==0));



//        perfect number
//        System.out.println(IntStream.range(1,n).filter(i-> n%i==0).sum()==n);
//

////strong num er
//        int sum=0;
//        int tn=n;
//        while(tn>0){
//            int d=tn%10;
//            sum+=fact(d);
//            tn=tn/10;
//        }
//        System.out.println((sum==n)? true: false);
//

//        armstrong number
//        int sum=0;
//        int tn=n;
//        while(tn>0){
//            int d =tn%10;
//            sum+=Math.pow(d,(int)Math.log10(n)+1);
//            tn/=10;
//        }
//
//        System.out.println((sum==n)?true : false);
//        check the fabocannici number

//        System.out.println((isprime(5*Math.pow(n,2)+4)  || isprime(5*Math.pow(n,2)-4)));










        sc.close();
    }
}
