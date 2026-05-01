public class Cone_Pattern {
    void main(){
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                IO.print(" ");
            }
            for(int j=0;j<i*2+1;j++){
                IO.print("*");
            }
            IO.println("");
        }
        n=n-1;
        for(int i=0;i<n;i++){

            for(int j=0;j<=i;j++){
                IO.print(" ");
            }for(int j=0;j<n*2-1-(i*2);j++){
                IO.print("*");
            }
            IO.println("");
        }
    }
}
