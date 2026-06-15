import java.util.*;

public class DSA011_HASHING_LINEAR_PROBING {
    static int insert(int key){
        return key%10;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hashtable<Integer,String > ht=new Hashtable<>();
        int[] Hashtable=new int[20];
        int[] a={1,2,3,41,42,75,64,76};
        ht.put(1,"surya");
        ht.put(2,"naruto ");
        ht.put(3,"boruto");
        ht.put(5,"minato");
        ht.put(4,"sasuke");
        int index;
        for(int i =0;i<a.length;i++){
            index=insert(a[i]);
            Hashtable[index]=a[i];
        }
        System.out.println(ht);
        System.out.println(Arrays.toString(Hashtable));
        sc.close();
    }
}
