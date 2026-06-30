import java.util.*;

public class DSA041_COUNT_FREQUENCY_OF_EACH_ELEMENT_IN_THE_ARRAY {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input=sc.next();
        input=input.replace("[","").replace("]","").replace(" ","");
        String[] s=input.split(",");
        int[] a=new int[s.length];
        for(int i=0; i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        System.out.println(Arrays.toString(a));
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i =0;i<s.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        System.out.println(map);

        sc.close();
    }
}
