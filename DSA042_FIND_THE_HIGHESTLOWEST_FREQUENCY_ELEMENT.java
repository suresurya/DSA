import java.util.*;

public class DSA042_FIND_THE_HIGHESTLOWEST_FREQUENCY_ELEMENT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input=sc.next();
        input.replace("[","")
                        .replace("]","")
                                .replace(" ","");
        String[] s=input.split(",");
        int[] a=new int[s.length];
        for(int i =0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);

        }
        System.out.println(Arrays.toString(a));
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i : a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);

        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println(list.get(0).getKey());
        System.out.println(list.get(list.size()-1).getKey());



        sc.close();
    }
}
