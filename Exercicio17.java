import java.util.Scanner;

public class Exercicio17 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, um número correspondente a um determinado ano: ");
    int anoBissextoChecker = scanner.nextInt();

    if (anoBissextoChecker % 400 == 0 || (anoBissextoChecker % 4 == 0 && anoBissextoChecker % 100 != 0)) {

      System.out.println(anoBissextoChecker + " é um ano bissexto.");

    } else {

      System.out.println(anoBissextoChecker + " não é um ano bissexto.");

    }

    scanner.close();
  }

}
