import java.util.Scanner;

public class Exercicio10 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out
        .println("Informe, por gentileza, o turno que você estuda (M - Matutino / V - Vespertino e N - Noturno): ");
    String turno = scanner.nextLine();

    switch (turno) {

      case "M":
        System.out.println("Bom Dia!");
        break;

      case "V":
        System.out.println("Boa Tarde!");
        break;

      case "N":
        System.out.println("Boa Noite!");
        break;

      default:
        System.out.println("Valor Inválido");

    }

    scanner.close();
  }
}