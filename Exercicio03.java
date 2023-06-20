import java.util.Scanner;

public class Exercicio03 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, uma letra: ");

    String letra = scanner.next();

    if (letra.equals("F")) {

      System.out.println("Feminino.");

    } else if (letra.equals("M")) {

      System.out.println("Masculino.");

    } else {

      System.out.println("Letra inválida.");

    }

    scanner.close();

  }
}