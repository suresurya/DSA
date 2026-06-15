import java.util.*;

public class DSA012_ACTIVITY_SELECTION_PROBLEM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [][] a={{1,4},{3,5},{0,6},{5,7},{8,9}};
        Arrays.sort(a,(c,b)-> Integer.compare(c[0],b[0]));
        System.out.println(Arrays.deepToString(a));

        sc.close();

    }
}
