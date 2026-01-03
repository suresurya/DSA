import java.util.*;

public class Count_Digits_in_Number {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        IO.print((int)(Math.log10(n)+1));
    }
}
