import java.util.Scanner;

public class Exercicio25 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("====== PERGUNTAS SOBRE O CRIME ======");
    System.out.println("Responda 'sim' ou 'nao' para as perguntas abaixo.");

    System.out.println("Telefonou para a vítima? ");
    String respostaUm = scanner.nextLine().toLowerCase();

    System.out.println("Esteve no local do crime? ");
    String respostaDois = scanner.nextLine().toLowerCase();

    System.out.println("Mora perto da vítima? ");
    String respostaTres = scanner.nextLine().toLowerCase();

    System.out.println("Devia para a vítima? ");
    String respostaQuatro = scanner.nextLine().toLowerCase();

    System.out.println("Já trabalhou com a vítima? ");
    String respostaCinco = scanner.nextLine().toLowerCase();

    int contador = 0;

    if (respostaUm.equals("sim")) {

      contador++;

    }
    if (respostaDois.equals("sim")) {

      contador++;

    }
    if (respostaTres.equals("sim")) {

      contador++;

    }
    if (respostaQuatro.equals("sim")) {

      contador++;

    }
    if (respostaCinco.equals("sim")) {

      contador++;

    }

    if (contador == 2) {

      System.out.println("A pessoa é classificada como: Suspeita.");

    } else if (contador >= 3) {

      System.out.println("A pessoa é classificada como: Cúmplice.");

    } else if (contador == 5) {

      System.out.println("A pessoa é classificada como: Assassino.");

    } else {

      System.out.println("A pessoa não possui classificações quanto a este crime.");

    }

    scanner.close();

  }

}