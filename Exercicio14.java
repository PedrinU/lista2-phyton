import java.util.Scanner;

public class Exercicio14 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, uma nota parcial do aluno: ");
    double primeiraNotaParcial = scanner.nextDouble();

    System.out.println("Informe, por gentileza, outra nota parcial do aluno: ");
    double segundaNotaParcial = scanner.nextDouble();

    double mediaParcialAluno = (primeiraNotaParcial + segundaNotaParcial) / 2;

    if (mediaParcialAluno == 0 || mediaParcialAluno < 4.0) {

      System.out.println("Média de Aproveitamento: " + mediaParcialAluno);
      System.out.println("Conceito: E");

    } else if (mediaParcialAluno > 4.0 && mediaParcialAluno < 6.0) {

      System.out.println("Média de Aproveitamento: " + mediaParcialAluno);
      System.out.println("Conceito: D");

    } else if (mediaParcialAluno > 6.0 && mediaParcialAluno < 7.5) {

      System.out.println("Média de Aproveitamento: " + mediaParcialAluno);
      System.out.println("Conceito: C");

    } else if (mediaParcialAluno > 7.5 && mediaParcialAluno < 9.0) {

      System.out.println("Média de Aproveitamento: " + mediaParcialAluno);
      System.out.println("Conceito: B");

    } else if (mediaParcialAluno > 9.0 && mediaParcialAluno < 10.0) {

      System.out.println("Média de Aproveitamento: " + mediaParcialAluno);
      System.out.println("Conceito: A");

    } else {

      System.out.println("Erro ao calcular a média parcial e o conceito da nota de tal aluno.");

    }

    scanner.close();

  }
}