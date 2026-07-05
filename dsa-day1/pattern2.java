public class pattern2 {
    public void printpattern2( int n ){

        for( int i = 0; i < n; i++ ){
            for( int j = 0; j <= i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        pattern2 sol = new pattern2();
        int n = 5;
        sol.printpattern2(n);
    }
}
