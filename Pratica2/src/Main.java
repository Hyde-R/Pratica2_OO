import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float investimentoInicial;
        double taxaRendimento;
        int numParcela;

        System.out.println("Digite o valor inicial a ser investido: ");
        investimentoInicial = sc.nextFloat();
        System.out.println("Digite a taxa de rendimento: ");
        taxaRendimento = sc.nextDouble();
        System.out.println("Digite a quantidade de parcelas: ");
        numParcela = sc.nextInt();

        Rendimento rendimento = new Rendimento(investimentoInicial, taxaRendimento, numParcela);
        rendimento.rendimentoCalculo();

        sc.close();
    }
}