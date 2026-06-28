import java.util.*;

public class DSA037_INTEGER_TO_ROMAN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int num=n;
//        String[] s= new String[4];
//        int i =s.length-1;
//        while(num!=0){
//            if(num> 1 && num<4 ){
//                s[i]="I";
//                i-=1;
//                num-=1;
//            }else if(num==5){
//                s[i]="V";
//                i-=1;
//                num-=5;
//            }else if(num>5 && num<9){
//                s[i]="I";
//                i-=1;
//                num-=1;
//            }else if(num==4){
//                s[i]="V";
//                s[i-1]="I";
//                i-=2;
//                num-=4;
//            }
//            else{
//                s[i]="X";
//                s[i-1]="I";
//                i-=2;
//                num-=9;
//            }
//        }
//        for(String S:s){
//            System.out.print(S);
//        }
String s="";
        while(num!=0){
            if(num>=1000){
                s+="M";
                num-=1000;
            }else if(num==900){
                s+="CM";
                num-=900;
            }else if(num>=500){
                s+="D";
                num-=500;
            }else if(num==400){
                s+="CD";
                num-=400;
            }else if(num>=100){
                s+="C";
                num-=100;
            }else if(num==90){
                s+="XC";
                num-=90;
            }else if(num>=50){
                s+="L";
                num-=50;
            }else if(num==40){
                s+="XL";
                num-=40;
            }else if(num>=10){
                s+="X";
                num-=10;
            }else if(num==9){
                s+="IX";
                num-=9;
            }else if(num==5){
                s+="V";
                num-=5;
            }else if(num==4){
                s+="IV";
                num-=4;
            }else if (num> 5 && num<9){
                s+="V";
                num-=5;
            }
             else {
                s+="I";
                num-=1;
            }
        }

        System.out.println(s);

        sc.close();
    }
}
