import java.util.Scanner;

public class DoWhile02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean nota = false;

        do {
            System.out.println("Entre com a nota do Aluno");
            double p1 = scan.nextDouble();
            if (p1 >= 0 && p1 <= 10) {
                System.out.println("Você digitou a nota " + p1);

            } else {
                System.out.println("Nota invalida dgite novamente");

            }

        } while (!nota);
        scan.close();
    }

}
