package Practice;
import java.util.Scanner;

public class PascalTriangle1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val, n_fact, nr_fact, r_fact;
        int spaces = n-1;
        Factorial obj = new Factorial();

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                n_fact = obj.fact(i);
                nr_fact = obj.fact(i - j);
                r_fact = obj.fact(j);

                val = n_fact / (nr_fact * r_fact);
                System.out.print(val + " ");
            }
            System.out.println();
            spaces--;
        }
    }
}