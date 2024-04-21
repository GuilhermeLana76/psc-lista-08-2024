import java.util.Scanner;
public class atividade3lista8 {
    public static void main(String[] args) {
    Scanner scanner  = new Scanner(System.in);


    int[] soma = new int[3];
    for(int i = 0; i < 3; i++){
    System.out.println("Digite o " + (i + 1) + "º número: ");
    soma[i] = scanner.nextInt();
    
    }

    int resultado = somar(soma[0], soma[1], soma[2]);
    System.out.println("A soma dos números é: " + resultado);
        




    scanner.close();
    }

    public static int somar(int numeroUm, int numeroDois, int numeroTres){
        return numeroUm + numeroDois + numeroTres;

    }
    
    
}
