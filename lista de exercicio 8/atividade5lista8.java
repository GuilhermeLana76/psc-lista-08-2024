import java.util.Scanner;
public class atividade5lista8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a taxa de imposto (em %): ");
        double taxaImposto = scanner.nextDouble();

        System.out.print("Digite o custo do item antes do imposto: ");
        double custo = scanner.nextDouble();

        double custoComImposto = somaImposto(taxaImposto, custo);

        System.out.printf("O custo do item com imposto é: R$ %.2f%n", custoComImposto);

        scanner.close();
    }

 
    public static double somaImposto(double taxaImposto, double custo) {
 
        double imposto = custo * (taxaImposto / 100);

        double custoComImposto = custo + imposto;

        return custoComImposto;
    }
}