import java.util.*;

public class DSA033_COUNT_FREQUENCY_OF_INTEGERS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] a ={1 ,2 ,2 ,3 ,3, 3, 4, 4 ,5};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i =0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        System.out.println(map);




        sc.close();
    }
}
