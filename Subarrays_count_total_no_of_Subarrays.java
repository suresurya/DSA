import java.util.*;
public class Subarrays_count_total_no_of_Subarrays {
    void main(){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        input=input.substring(1,input.length()-1);
        String[] parts=input.split(",");
        int[]a= new int[parts.length];
        for(int i=0;i<parts.length;i++){
            a[i]=Integer.parseInt(parts[i].trim());
        }
        int n=a.length;
        System.out.println(n*(n+1)/2);
    }
}

