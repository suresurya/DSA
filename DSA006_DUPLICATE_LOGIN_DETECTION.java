import java.util.*;

public class DSA006_DUPLICATE_LOGIN_DETECTION {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        String[] s=input.split("\\s+");
        int[] a=new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        for(int i =0;i<a.length;i++){int count=0;
            for(int j=i;j<a.length;j++){
                if(a[j]==a[i]){
                    count++;
                }
            }
            if(count>=2){
                System.out.println(a[i]+" Repeated "+count+" times!");
            }
        }
        

        sc.close();
    }
}
