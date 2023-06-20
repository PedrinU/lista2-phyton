import java.util.Scanner;

public class Exercicio04 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, uma letra: ");
    String letra = scanner.nextLine();

    if (letra.equals("A")) {

      System.out.println("A letra escolhida é vogal.");

    } else if (letra.equals("E")) {

      System.out.println("A letra escolhida é vogal.");

    } else if (letra.equals("I")) {

      System.out.println("A letra escolhida é vogal.");

    } else if (letra.equals("O")) {

      System.out.println("A letra escolhida é vogal.");

    } else if (letra.equals("U")) {

      System.out.println("A letra escolhida é vogal.");

    } else {

      System.out.println("A letra escolhida é consoante. ");

    }

    scanner.close();

  }
}
