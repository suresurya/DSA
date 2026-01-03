import java.util.*;
public class Armstrong_Number {
    void main(){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int k=((int) (Math.log10(num))+1);
        int sum=0;
        int n=num;
        while(n>0){
            int lastdigit=n%10;
            sum+=Math.pow(lastdigit,k);
            n/=10;
        }
        if(sum==num){
            IO.println("YES the given is a armstrong number !!!!!!!!!!!!!!");
        }else{
            IO.println("No it's not a armstrong number !!!!!!!!!!!!!!@@@@@@@@@@@@");
        }

    }
}
