import java.util.Scanner;

public class Exercicio15 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    System.out.println("Informe, por gentileza, o valor do primeiro lado do triângulo: ");
    double ladoUm = scanner.nextDouble();

    System.out.println("Informe, por gentileza, o valor do segundo lado do triângulo: ");
    double ladoDois = scanner.nextDouble();

    System.out.println("Informe, por gentileza, o valor do terceiro lado do triângulo: ");
    double ladoTres = scanner.nextDouble();

    double somaDosLadosDoTriangulo = ladoUm + ladoDois;

    if (somaDosLadosDoTriangulo > ladoTres) {

      System.out.println("Os três lados informados não formam um triângulo.");

    } else if (ladoUm == ladoDois && ladoDois == ladoTres) {

      System.out.println("O triângulo é classificado como: Equilátero.");

    } else if (ladoUm == ladoDois || ladoDois == ladoTres || ladoUm == ladoTres) {

      System.out.println("O triângulo é classificado como: Isósceles");

    } else if (ladoUm != ladoDois && ladoUm != ladoTres && ladoDois != ladoTres) {

      System.out.println("O triângulo é classificado como: Escaleno.");

    } else {

      System.out.println("Não é possível calcular.");

    }

    scanner.close();

  }
}