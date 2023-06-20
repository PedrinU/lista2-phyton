import java.util.Scanner;

public class Exercicio22 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, um número inteiro: ");
    int numeroInteiro = scanner.nextInt();

    if (numeroInteiro % 2 == 0) {

      System.out.println("O número inteiro escolhido é par.");

    } else {

      System.out.println("O número inteiro escolhido é impar.");

    }

    scanner.close();
  }
}