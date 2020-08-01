import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 100) {
            int[][] array = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = Math.abs(j - i);
                    //array[i][j] = Math.abs(1+j);
                    // array[i][j] = Math.abs(2-j);
                    // array[i][j] = Math.abs(3-j);
                    // array[i][j] = Math.abs(4-j);
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(array[i][j] + " ");

                }
                System.out.println();
            }
        }
    }
}
