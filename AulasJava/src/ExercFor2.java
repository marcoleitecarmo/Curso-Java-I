import java.util.Scanner;

public class ExercFor2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Entre com a idade das pessoa" + (i + 1));
            idades[i] = scan.nextInt();
        }

        int qtd = 0;
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] >= 35) {
            qtd++;    
            }

        }
        System.out.print("Vetor idades = ");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.println("");
        System.out.print("Quantidade de pessoas com 35 anos ou mais = " + qtd +"\n");
        scan.close();
    }
}
