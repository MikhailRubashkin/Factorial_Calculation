import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        int z = 1;
        for (int i = 1; i <= n; i++) {
            z *= i;



        }System.out.println("Factorial for = " + z);

        int v = 1;
        System.out.println();
        int i = 1;
        while (i<n){
            i++;
            v*=i;


        } System.out.println("Factorial while = " +v);




    }
}
