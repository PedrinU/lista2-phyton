import java.util.Scanner;

public class Exercicio27 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    System.out.println("Informe a quantidade (em Kg) de morangos adquirida pelo cliente: ");
    double quantidadeMorango = scanner.nextDouble();

    System.out.println("Informe a quantidade (em Kg) de maçãs adquirida pelo cliente: ");
    double quantidadeMaca = scanner.nextDouble();

    double totalDeFrutas = quantidadeMaca + quantidadeMorango;

    double valorMorango;
    if (quantidadeMorango <= 5) {

      valorMorango = quantidadeMorango * 2.5;
    } else {

      valorMorango = quantidadeMorango * 2.2;
    }

    double valorMaca;

    if (quantidadeMaca <= 5) {

      valorMaca = quantidadeMaca * 1.8;

    } else {

      valorMaca = quantidadeMaca * 1.5;

    }

    double valorTotal = valorMorango + valorMaca;

    if (totalDeFrutas > 8 || valorTotal > 25) {

      valorTotal -= valorTotal * 0.1;

    }

    System.out.println("O valor a ser pago pelo cliente é: " + valorTotal);

    scanner.close();
  }

}