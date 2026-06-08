import java.util.*;

public class DSA010_QUEUE_OPERATIONS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        Queue<Integer> q= new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        System.out.println(q.toString());
        Integer[] a= q.toArray(new Integer[0]);

        System.out.println(Arrays.toString(a));
        q.remove();
        System.out.println(q.toString());
        q.element();
        System.out.println(q.element());
        PriorityQueue<Integer,String> pq=new PriorityQueue<>();
        pq.add(4,"Surya");




        sc.close();
    }
}
