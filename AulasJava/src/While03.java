import java.util.Scanner;

public class While03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = 0;

        while (a <= 10) {

            System.out.println(a);
            a++;

        }

        scan.close();
    }

}
