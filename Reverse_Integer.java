import java.util.*;
public class Reverse_Integer {
    void main(){
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int n=num;
        int sum=0;
        while(n>0) {
            int lastdigit = n % 10;
            sum = sum * 10 + lastdigit;
            n /= 10;

        }
        IO.print(sum);
    }
}
