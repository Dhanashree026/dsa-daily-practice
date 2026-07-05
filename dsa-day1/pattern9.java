public class pattern9 {
    public void printpattern91( int n ){

        for( int i = 0; i < n; i++ ) {
            for( int j = 0; j < n-i-1; j++ ) {
                System.out.print(" ");
            }
            for ( int j = 0; j < 2*i+1; j++ ){
                System.out.print("*");
            }
            for( int j = 0; j < n-i-1; j++ ) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void printpattern92( int n ){

        for( int i = 0; i < n; i++ ) {
            for( int j = 0; j < i; j++ ) {
                System.out.print(" ");
            }
            for ( int j = 0; j < 2*n-(2*i+1); j++ ){
                System.out.print("*");
            }
            for( int j = 0; j < i; j++ ) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern9 sol = new pattern9();
        int n = 5;

        sol.printpattern91(n);
        sol.printpattern92(n);
    }
}