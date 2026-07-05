public class pattern3{
    public void printpattern3(int n){

        for( int i = 0; i < n; i++ ){
            for( int j = 0; j <= i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        pattern3 sol = new pattern3();
        int n = 4;
        sol.printpattern3(n);
    }
}