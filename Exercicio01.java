import java.util.Scanner;

public class Exercicio01 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, o primeiro número: ");
    double numeroUm = scanner.nextDouble();

    System.out.println("Informe, por gentileza, o segundo número: ");
    double numeroDois = scanner.nextDouble();

    if (numeroUm > numeroDois) {

      System.out.println("O número " + numeroUm + "é o maior.");

    } else {

      System.out.println("O número " + numeroDois + " é o maior.");

    }

    scanner.close();

  }

}
