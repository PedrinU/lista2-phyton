import java.util.Scanner;

public class Exercicio24 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, um número: ");
    double primeiroNumero = scanner.nextDouble();

    System.out.println("Informe, por gentileza, outro número: ");
    double segundoNumero = scanner.nextDouble();

    System.out.println("Informe, por gentileza, a operação que você deseja fazer: ");
    System.out.println("(1) para adição: ");
    System.out.println("(2) para subtração: ");
    System.out.println("(3) para multiplicação: ");
    System.out.println("(4) para divisão");

    int operacao = scanner.nextInt();
    double resultadoDaOperacao = 0.0;

    switch (operacao) {

      case 1:
        resultadoDaOperacao = primeiroNumero + segundoNumero;
        break;

      case 2:
        resultadoDaOperacao = primeiroNumero - segundoNumero;
        break;

      case 3:
        resultadoDaOperacao = primeiroNumero * segundoNumero;
        break;

      case 4:
        resultadoDaOperacao = primeiroNumero / segundoNumero;
        break;

    }

    if (resultadoDaOperacao % 2 == 0) {

      System.out.println("O número é par.");

    } else {

      System.out.println("O número é impar.");

    }
    if (resultadoDaOperacao >= 0) {

      System.out.println("O número é positivo.");

    } else {

      System.out.println("O número é negativo.");

    }
    if (resultadoDaOperacao == Math.floor(resultadoDaOperacao)) {

      System.out.println("O número é inteiro.");

    } else {

      System.out.println("O número é decimal.");

    }

    System.out.println("O resultado da operação é: " + resultadoDaOperacao);

    scanner.close();

  }
}