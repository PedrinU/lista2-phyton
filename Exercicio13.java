import java.util.Scanner;


public class Exercicio13 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, um número em um intervalo de 1-7: ");
    String numeroDoDiaDaSemana = scanner.nextLine();

    switch (numeroDoDiaDaSemana) {

      case "1":
        System.out.println("Domingo");
        break;

      case "2":
        System.out.println("Segunda");
        break;

      case "3":
        System.out.println("Terça");
        break;

      case "4":
        System.out.println("Quarta");
        break;

      case "5":
        System.out.println("Quinta");
        break;

      case "6":
        System.out.println("Sexta");
        break;

      case "7":
        System.out.println("Sabado");
        break;

    }

    scanner.close();

  }
}