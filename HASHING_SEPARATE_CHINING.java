import java.util.*;
public class HASHING_SEPARATE_CHINING {
    private int bucketcount;
    private List<List<Integer>> table;
    public HASHING_SEPARATE_CHINING(int bucket) {
        bucketcount = bucket;
        table = new ArrayList<>();
        for (int i = 0; i < bucketcount; i++) {
            table.add(new ArrayList<>());
        }
    }
    public void insert(int value){
        int index=gethashindex(value);
        table.get(index).add(value);
    }
    public void remove(int value){
        int index=gethashindex(value);
        table.get(index).remove(Integer.valueOf(value));
    }
    void search(int value){
        int index=gethashindex(value);
        IO.print((table.get(index).contains(value)?"Found the value at "+index+" Element "+ table.get(index):"Value is not founded in the hash map SEPESRATE CHAINING ::::::::"));
    }
    public int gethashindex(int key){
        return Math.abs(key)%bucketcount;
    }

    public void display(){
        for(int i =0;i<bucketcount;i++){
            IO.print(table.get(i)+" ");
        }
        IO.println(" ");
    }
    static void main(){
        Scanner sc=new Scanner(System.in);
        IO.println("Enter the Size of the bucket :: ");
        int n =sc.nextInt();
        HASHING_SEPARATE_CHINING h=new HASHING_SEPARATE_CHINING(n);
        int o=-1;
        while(o!=5){
            IO.println("\n\n\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            IO.println("1. Insert ");
            IO.println("2. Search ");
            IO.println("3. Remove/ Delete ");
            IO.println("4. Display ");
            IO.println("5. Exit ");
            IO.print("Enter your Option : ");
            o=sc.nextInt();
            IO.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            switch (o){
                case 1:
                    IO.println(" Enter the value : ");
                    int value=sc.nextInt();
                    h.insert(value);
                    IO.println("Values is been entered>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                    break;
                case 2:
                    IO.println("Enter the value to Search in the Hash List : ");
                    int valu =sc.nextInt();
                    h.search(valu);
                    break;
                case 3:
                    IO.println("Enter the Value to delete/Remove : ");
                    int val=sc.nextInt();
                    h.remove(val);
                    break;
                case 4:
                    IO.println("Displaying of Elemetns::::::::::");
                    h.display();
                    break;
                case 5:
                    o=5;
                    break;
                default:
                    IO.println("Enter the correct option you ugly btich hhhahhhahahhahah 😂🅱️ℹ️🦖©️😂");
                    continue;
            }
        }

        sc.close();
    }
}