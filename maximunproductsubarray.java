import java.util.HashMap;
import java.util.Scanner;

public class maximunproductsubarray {
    void main(){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        input=input.substring(1,input.length()-1);
        String[]parts=input.split(",");
        int[]a =new int[parts.length];
        for(int i =0;i< parts.length;i++){
            a[i]=Integer.parseInt(parts[i].trim());
        }
       // int k=sc.nextInt();
      /*  int n =a.length;
        int max=a[0];
        for(int i =0;i<n;i++){
            int mul=1;
            for(int j =0;j<n;j++){
                mul*=a[j];
                max=Math.max(max,mul);
            }
        }
        System.out.println(max);

        int initialsum=0;
        for(int i =0;i<k;i++){
            initialsum+=a[i];
        }
        int maxsum=initialsum;
        for(int i=k;i<a.length;i++){
            initialsum=initialsum-a[i-k]+a[i];
            maxsum=Math.max(maxsum,initialsum);
        }
        System.out.println(maxsum);
        int count=0;
        for(int i =0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum+=a[i];
                if(sum==k){
                    count++;
                }
            }
        }
        System.out.println(count);

        int res=0;
        int prexor=0;
        HashMap<Integer,Integer> mp =new HashMap<>();
        for(int val : a){
            prexor^=val;
            res+=mp.getOrDefault(prexor^k,0);
            if(prexor==k){
                res++;
            }
            mp.put(prexor,mp.getOrDefault(prexor,0)+1);
        }
        System.out.println(res);

        int inc=1,dec=1,resutl=1;
        for(int i =1;i<a.length;i++){
            if(a[i]<a[i-1]){
                dec=inc+1;
                inc=1;
            }else if(a[i]>a[i-1]){
                inc=dec+1;
                dec=1;

            }else{
                inc=1;
                dec=1;
            }
            resutl=Math.max(resutl,Math.max(dec,inc));
        }
        System.out.println(resutl);

        int target=sc.nextInt();
        int sum=0;
        int i=0,j=0,min=Integer.MAX_VALUE;
        while(j<a.length){
            sum+=a[j++];
            while(sum>=target){
                min=Math.min(min,j-i);
                sum-=a[i++];
            }
        }
        System.out.println((min==Integer.MAX_VALUE)?0:min);*/


    }
}
