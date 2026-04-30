public class Pattern_apha {
    void main(){
        int n=4;
        int count=1;
        for(int i =0;i<n;i++){
            for(int j=0;j<(i*2)+1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
