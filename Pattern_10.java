public class Pattern_10 {
    void main(){
        int n=5;
        for(int i=0;i<n;i++) {
                for (int j = 0; j <= i; j++) {
                    IO.print("*");
                }
                IO.println("");

        }
        n=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                IO.print("*");
            }
            IO.println("");
        }
    }
}
