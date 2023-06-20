import java.util.Scanner;
   
public class Exercicio08 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, o preço de um produto: ");
    double produtoUm = scanner.nextDouble();

    System.out.println("Informe, por gentileza, o preço de um produto: ");
    double produtoDois = scanner.nextDouble();

    System.out.println("Informe, por gentileza, o preço de um produto: ");
    double produtoTres = scanner.nextDouble();

    if (produtoUm < produtoDois && produtoUm < produtoTres) {

      System.out.println("O primeiro produto é o mais barato.");

    } else if (produtoDois < produtoUm && produtoDois < produtoTres) {

      System.out.println("O segundo produto é o mais barato.");

    } else {

      System.out.println("O terceiro produto é o mais barato");

    }

    scanner.close();

  }
}