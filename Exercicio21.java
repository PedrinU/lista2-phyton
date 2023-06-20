import java.util.Scanner;

public class Exercicio21 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor do saque (entre 10 e 600 reais): ");
    int valorSaque = scanner.nextInt();

    if (valorSaque < 10 || valorSaque > 600) {
      System.out.println("Valor inválido. O valor mínimo é 10 e o máximo é 600 reais.");
    } else {
      int nota100 = valorSaque / 100;
      int valorRestante = valorSaque % 100;

      int nota50 = valorRestante / 50;
      valorRestante %= 50;

      int nota10 = valorRestante / 10;
      valorRestante %= 10;

      int nota5 = valorRestante / 5;
      valorRestante %= 5;

      int nota1 = valorRestante;

      System.out.println("Notas fornecidas:");
      if (nota100 > 0) {
        System.out.println(nota100 + " nota(s) de 100 reais");
      }
      if (nota50 > 0) {
        System.out.println(nota50 + " nota(s) de 50 reais");
      }
      if (nota10 > 0) {
        System.out.println(nota10 + " nota(s) de 10 reais");
      }
      if (nota5 > 0) {
        System.out.println(nota5 + " nota(s) de 5 reais");
      }
      if (nota1 > 0) {
        System.out.println(nota1 + " nota(s) de 1 real");
      }
    }

    scanner.close();

  }
}
