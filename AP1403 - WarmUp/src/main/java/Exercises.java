//here we go
public class Exercises {


    public boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i*i <= n; i++) {
            if (n % i == 0 ) return false;
        }
        return true;
    }


    public long fibonacciIndex(long n) {
        if (n < 0) return -1;
        long a = 0, b = 1;
        int index = 0;

        while (a <= n) {
            if ( a == n) return index;
            long temp = a + b;
            a = b;
            b = temp;
            index++;
        }
        return -1;
    }


    public char[][] generateTriangle(int rows) {
        char[][] arr = new char[rows][];

        for (int i = 0; i < rows; i++) {
            arr[i] = new char[i + 1];

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == rows - 1) {
                    arr[i][j] = '*';
                } else {
                    arr[i][j] = ' ';
                }
            }
        }
        return arr;
   }

    public static void main(String[] args) {

    }
}
