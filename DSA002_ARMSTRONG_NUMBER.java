import java.util.*;

public class DSA002_ARMSTRONG_NUMBER {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int anum=0;
        int len=(int)Math.log10(n)+1;
        int temp=n;
        while(n>0){
            int ld=n%10;
            anum=anum+(int)Math.pow(ld,len);
            n=n/10;
        }
        System.out.println((temp==anum)?"ArmStrong Number >>>>>>>>":"Not a arm strong  nunber bitch>>>>>>>>>>>.................................");
        sc.close();
    }
}
