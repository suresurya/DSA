public class Pattern_11 {
    void main(){
        int n=5;
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
            IO.print(count+" ");
            if(count==1){
                count--;
            }else{
                count++;
            }
            }
            IO.println("");
        }
    }
}



