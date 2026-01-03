import java.util.*;
public class A_CODE_TRANNING {
    void main(){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        chec(n);
       // Character grade=(n>90)?'A':(n>80)?'B':(n>70)?'C':'D';
        //IO.print(grade);
    }
    void chec(int a){
        if(a>0) IO.print("Postive");
        else if (a<0) IO.print("Negative");
        else IO.print("Zero");
    }
    void e_or_o(int a){

    }
}
