import java.util.*;
public class GCD_of_two_numbers {
    void main(){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        while(a>0 && b>0){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        if(a==0){IO.println(b);} else if(b==0){IO.println(a);} else{IO.print("0");}
    }
}

//TIP In the above GCD program, we are using the Euclidean algorithm for computation.
// It works by repeatedly subtracting the smaller number from the larger one.
// This method works for all positive inputs (N1 and N2) and does not require N1 > N2.
// The algorithm continues until one number becomes 0, and the other number is the GCD.
// It does not return 0 for valid positive inputs unless one of the inputs is 0.
