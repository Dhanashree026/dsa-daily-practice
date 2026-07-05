public class pattern6 {
    public void printpattern6( int n ){

        for( int i = n; i > 0; i-- ) {
            for( int j = 0; j < i; j++ ) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        pattern6 sol = new pattern6();
        int n = 5;
        sol.printpattern6(n);
    }
}