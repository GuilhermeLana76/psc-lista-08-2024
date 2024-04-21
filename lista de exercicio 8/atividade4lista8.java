import java.util.Scanner;
public class atividade4lista8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Favor ensira a nota a ser checada: ");
        System.out.println("0 - 10");
        int i = scanner.nextInt();
        checagem(i);




        scanner.close();
    }

    static void checagem(int nota)  {
        if(nota <= 6){
            System.out.println("(N) - Reprovado!");
        }else{
            System.out.println("(P) - Aprovado!");
        }
    }

}
