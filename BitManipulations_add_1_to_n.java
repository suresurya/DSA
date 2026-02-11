import java.util.Scanner;

public class BitManipulations_add_1_to_n {
    static void main(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(-(~n));
    }
}
