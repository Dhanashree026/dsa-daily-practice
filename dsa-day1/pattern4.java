public class pattern4 {
    public void printpattern4(int n){
        
        for( int i = 0; i < n; i++ ){
            for( int j = 0; j <= i; j++ ){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        pattern4 sol = new pattern4();
        int n = 5;
        sol.printpattern4(n);
    }
}
