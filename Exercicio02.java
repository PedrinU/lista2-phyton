import java.util.Scanner;

public class Exercicio02 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, um valor: ");
    double valor = scanner.nextDouble();

    if (valor > 0) {

      System.out.println("O valor é positivo.");

    } else {

      System.out.println("O valor é negativo.");

    }

    scanner.close();

  }

}