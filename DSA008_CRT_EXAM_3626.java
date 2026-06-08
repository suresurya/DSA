import java.util.*;

public class DSA008_CRT_EXAM_3626 {
    static boolean canProduce(long[] machines, long target, long time) {
        long items = 0;

        for (long machine : machines) {
            items += time / machine;

            if (items >= target) {
                return true;
            }
        }

        return false;
    }
    static void partition(int[] s, int cutoff) {
        int i = 0;
        for (int j = 0; j < s.length; j++) {
            if (s[j] < cutoff) {
                int temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i++;
            }
        }
    }
    static long minimumTime(long[] machines, long target) {

        long low = 1;
        long high = Arrays.stream(machines).min().getAsLong() * target;
        long answer = high;

        while (low <= high) {

            long mid = low + (high - low) / 2;

            if (canProduce(machines, target, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Longest Sales Streak:
        int[] a={100,120,140,150,170,110,150,170,125};
        int max_streak=0;
        int current_streak=0;
        int k=190;
        for(int i=0;i<a.length-1;i++){
            if(a[i]<a[i+1]&& a[i]<k){
                current_streak++;
            }else{
                current_streak=0;
            }
            max_streak=Math.max(max_streak,current_streak);
        }
        System.out.println("Longest Streak : "+max_streak+" ");

        int[] speed={20,50,30,45,50,60,70,41,23,65};
        int items=20;

//        2. Factory Production Rate
//
//        Machines produce items at different speeds. Find the minimum time required to produce N items.
//
//        3. Exam Score Partitioning
//
//        Partition student scores around a cutoff mark without fully sorting the list

                int m = sc.nextInt();
                long target = sc.nextLong();
                long[] machines = new long[m];
                for (int i = 0; i < m; i++) {
                    machines[i] = sc.nextLong();
                }
                System.out.println(minimumTime(machines, target));

                int n = sc.nextInt();
                int[] s = new int[n];
                for (int i = 0; i < n; i++) {
                    s[i] = sc.nextInt();
                }

                int cutoff = sc.nextInt();

                partition(s, cutoff);

                for (int score : s) {
                    System.out.print(score + " ");
                }

        sc.close();
    }
}
