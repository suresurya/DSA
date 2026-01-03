import java.util.*;
public class ARRAY_OPERATIONS {
    void main(){
        Scanner sc=new Scanner(System.in);
        int[] a={10,20,30 ,40,50};
        IO.println("HERE ARE THE ELEMETNS IN THE ARRAY ");
        for(int i=0;i<a.length;i++){IO.println(a[i]);}
        int[] new_a=new int[10];
        boolean o =true;
        while(o){
            IO.println("CHOOSE THE CORRECT Option ");
            IO.println("1.INSERT  ");
            IO.println("2.Search ");
            IO.println("3.DELETION ");
            int option=sc.nextInt();
            switch(option){
                case 1:
                    IO.println("ENTER THE NEW ELEMENT :");
                    int n_e=sc.nextInt();
                    IO.println("Enter the position : ");
                    int n_p=sc.nextInt();
                    for(int i=0;i<new_a.length;i++){
                        if(i==n_p) new_a[i]=n_e;
                        else if (n_p<i) {
                            new_a[i]=a[i-1];
                        }
                        else{
                           new_a[i]=a[i];
                        }

                    }
                    for(int i=0;i<new_a.length;i++){IO.println(new_a[i]);}
                    break;
                default:
                    break;
            }
        }
    }
}
