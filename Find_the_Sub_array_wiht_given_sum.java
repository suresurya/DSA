import java.util.*;
public class Find_the_Sub_array_wiht_given_sum {
    void main(){
        Scanner sc=new Scanner(System.in);
        String[] input= sc.nextLine().trim().split(" ");
        int[] a=new int[input.length];
        for(int i =0;i<input.length;i++){
            a[i]=Integer.parseInt(input[i]);
        }
        int k=sc.nextInt();
        int firstindex = 0,lastindex=0;

        for(int i =0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int count=0;
                for(int l=j;l<a.length;l++){
                    count+=a[l];
                    if(count==k){
                        firstindex=j;
                        lastindex=l;
                    }
                }
            }
        }
        System.out.print(firstindex+" "+lastindex);
    }
}
