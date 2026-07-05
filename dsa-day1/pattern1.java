class pattern1 {
    public void printpattern(int n){

        for (int i = 0; i <= n-1; i++){
            for(int j = 0; j <= n-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args){

        pattern1 sol = new pattern1();
        int n = 5;
        sol.printpattern(n);

    }
}