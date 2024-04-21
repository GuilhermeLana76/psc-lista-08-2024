import java.util.Scanner;
public class atividade6lista8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char resposta;

        do {
            System.out.print("Digite a hora (0-23): ");
            int hora = scanner.nextInt();
            System.out.print("Digite os minutos (0-59): ");
            int minutos = scanner.nextInt();

            String periodo = converterPara12Horas(hora, minutos);
            System.out.println("Horário convertido: " + periodo);

            System.out.print("Deseja converter outro horário? (S/N): ");
            resposta = scanner.next().charAt(0);
        } while (resposta == 'S' || resposta == 's');

        System.out.println("Obrigado por usar o conversor de horário!");

        scanner.close();
    }

    public static String converterPara12Horas(int hora, int minutos) {
        String periodo;
        if (hora >= 0 && hora < 24 && minutos >= 0 && minutos < 60) {
            if (hora == 0) {
                hora = 12;
                periodo = "A.M.";
            } else if (hora < 12) {
                periodo = "A.M.";
            } else {
                hora -= 12;
                periodo = "P.M.";
            }
            return hora + ":" + minutos + " " + periodo;
        } else {
            return "Horário inválido. Digite valores válidos para hora (0-23) e minutos (0-59).";
        }
    }
}
    

