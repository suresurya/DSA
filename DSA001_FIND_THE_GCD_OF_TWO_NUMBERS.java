import java.util.*;

public class DSA001_FIND_THE_GCD_OF_TWO_NUMBERS {
    public static int gcd(int a,int b){
        while(a>0 && b>0){
            if(a>b){a=a%b;}else{b=b%a;}
        }
        return (a==0)?b:a;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int a =sc.nextInt();
        int b=sc.nextInt();
        System.out.println("GCD of two Numbers : "+gcd(a,b));
        sc.close();
    }
}
