import java.util.Scanner;
public class atividade2lista8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ensira o número N ");
        int n = scanner.nextInt();

        for(int i = 0; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        

        scanner.close();
    }
}
