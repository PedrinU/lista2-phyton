import java.util.Scanner;

public class Exercicio16 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, o valor de A: ");
    double valorDeA = scanner.nextDouble();

    System.out.println("Informe, por gentileza, o valor de B: ");
    double valorDeB = scanner.nextDouble();

    System.out.println("Informe, por gentileza, o valor de C: ");
    double valorDeC = scanner.nextDouble();

    double valorDelta = Math.pow(valorDeB, 2) - 4 * (valorDeA) * (valorDeC);
    double valorx1 = (-valorDeB) + Math.sqrt(valorDelta) / 2 * valorDeA;
    double valorx2 = (-valorDeB) - Math.sqrt(valorDelta) / 2 * valorDeA;

    if (valorDeA == 0) {

      System.out.println("A equação não é de segundo grau, portanto, o programa será encerrado.");
      scanner.close();
      return;

    }

    if (valorDelta < 0) {

      System.out.println("A equação não possui raizes reais. O programa será encerrado.");

    } else if (valorDelta == 0 && valorDelta > valorDeA) {

      System.out.println("A equação possui apenas uma raiz real.");
      System.out.println("O valor da raiz real é: " + valorx1);

    } else if (valorDelta > 0) {

      System.out.println("A equação possui duas raizes reais.");
      System.out.println("O valor do x1 é: " + valorx1);
      System.out.println("O valor do x2 é: " + valorx2);

    } else {

      System.out.println("Erro no programa. O programa será encerrado.");

    }

    scanner.close();

  }
}