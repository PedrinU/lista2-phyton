import java.util.Scanner;

public class Exercicio20 {

  public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, uma nota parcial do aluno: ");
    double notaUm = scanner.nextDouble();

    System.out.println("Informe, por gentileza, outra nota parcial do aluno: ");
    double notaDois = scanner.nextDouble();

    System.out.println("Informe, por gentileza, outra nota parcial do aluno: ");
    double notaTres = scanner.nextDouble();

    double notaMediaAluno = (notaUm + notaDois + notaTres) / 3;

    if (notaMediaAluno == 10) {

      System.out.println("Aprovado com Distição");

    } else if (notaMediaAluno >= 7) {

      System.out.println("Aprovado");

    } else {

      System.out.println("Reprovado");

    }

    scanner.close();

  }

}
