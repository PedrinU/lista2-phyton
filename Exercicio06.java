import java.util.Scanner;

public class Exercicio06 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, um número: ");
    double numeroUm = scanner.nextDouble();

    System.out.println("Informe, por gentileza, outro número (Diferente do primeiro.)");
    double numeroDois = scanner.nextDouble();

    System.out.println("Informe, por gentileza, outro número (Diferente do primeiro e do segundo.)");
    double numeroTres = scanner.nextDouble();

    if (numeroUm > numeroTres && numeroUm > numeroTres) {

      System.out.println("O primeiro número é o maior.");

    } else if (numeroDois > numeroUm && numeroDois > numeroTres) {

      System.out.println("O segundo número é o maior.");

    } else {

      System.out.println("O terceiro número é o maior");

    }

    scanner.close();

  }

}