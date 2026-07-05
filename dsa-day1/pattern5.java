public class pattern5 {
    public void printpattern5(int n){

        for( int i = 0; i < n; i++ ){
            for( int j = i; j < n; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        pattern5 sol = new pattern5();
        int n = 5;
        sol.printpattern5(n);
    }
}
