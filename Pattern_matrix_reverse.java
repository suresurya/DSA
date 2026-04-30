public class Pattern_matrix_reverse {
    void main(){
        int n=5;
        for(int i=0;i<n;i++){

            for(int j=0;j<i;j++){
                IO.print(" ");
            }for(int j=0;j<n*2-1-(i*2);j++){
                IO.print("*");
            }
            IO.println("");
            //IO.println("");
        }
    }
}

