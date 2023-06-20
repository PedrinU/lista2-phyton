import java.util.Scanner;

public class Exercicio28 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, o tipo da carne comprada: ");
    String tipoDaCarne = scanner.nextLine();

    System.out.println("Informe, por gentileza, a quantidade de carne comprada (Em KG): ");
    double quantidadeCarneComprada = scanner.nextDouble();

    if (tipoDaCarne.equals("File Duplo")) {
      double valorFile;

      if (quantidadeCarneComprada <= 5) {
        valorFile = quantidadeCarneComprada * 4.9;
        System.out.println("======= HIPERMERCADO TABAJARA =======");
        System.out.println("O tipo da carne comprado é: " + tipoDaCarne);
        System.out.println("A quantidade de carne comprada foi: " + quantidadeCarneComprada + " KG(S).");
        System.out.println("O preço total é: R$" + valorFile);
        System.out.println("Aceitamos Dinheiro, Crédito, Débito e PIX.");
        System.out.println("Você pagou: R$4.90 no quilo.");
      } else {
        valorFile = quantidadeCarneComprada * 5.8;
        System.out.println("======= HIPERMERCADO TABAJARA =======");
        System.out.println("O tipo da carne comprado é: " + tipoDaCarne);
        System.out.println("A quantidade de carne comprada foi: " + quantidadeCarneComprada + " KG(S).");
        System.out.println("O preço total é: R$" + valorFile);
        System.out.println("Aceitamos Dinheiro, Crédito, Débito e PIX.");
        System.out.println("Você pagou: R$5.80 no quilo.");
      }

      double desconto = valorFile * 0.05;
      double valorAPagar = valorFile - desconto;

      System.out.println("Valor do desconto: R$" + desconto);
      System.out.println("Valor a pagar: R$" + valorAPagar);
      System.out.println("======= ///////////////////// =======");
    } else if (tipoDaCarne.equals("Alcatra")) {
      double valorAlcatra;

      if (quantidadeCarneComprada <= 5) {
        valorAlcatra = quantidadeCarneComprada * 5.9;
        System.out.println("======= HIPERMERCADO TABAJARA =======");
        System.out.println("O tipo da carne comprado é: " + tipoDaCarne);
        System.out.println("A quantidade de carne comprada foi: " + quantidadeCarneComprada + " KG(S).");
        System.out.println("O preço total é: R$" + valorAlcatra);
        System.out.println("Aceitamos Dinheiro, Crédito, Débito e PIX.");
        System.out.println("Você pagou: R$5.90 no quilo.");
      } else {
        valorAlcatra = quantidadeCarneComprada * 6.8;
        System.out.println("======= HIPERMERCADO TABAJARA =======");
        System.out.println("O tipo da carne comprado é: " + tipoDaCarne);
        System.out.println("A quantidade de carne comprada foi: " + quantidadeCarneComprada + " KG(S).");
        System.out.println("O preço total é: R$" + valorAlcatra);
        System.out.println("Aceitamos Dinheiro, Crédito, Débito e PIX.");
        System.out.println("Você pagou: R$6.80 no quilo.");
      }

      double desconto = valorAlcatra * 0.05;
      double valorAPagar = valorAlcatra - desconto;

      System.out.println("Valor do desconto: R$" + desconto);
      System.out.println("Valor a pagar: R$" + valorAPagar);
      System.out.println("======= ///////////////////// =======");
    } else if (tipoDaCarne.equals("Picanha")) {
      double valorPicanha;

      if (quantidadeCarneComprada <= 5) {
        valorPicanha = quantidadeCarneComprada * 6.9;
        System.out.println("======= HIPERMERCADO TABAJARA =======");
        System.out.println("O tipo da carne comprado é: " + tipoDaCarne);
        System.out.println("A quantidade de carne comprada foi: " + quantidadeCarneComprada + " KG(S).");
        System.out.println("O preço total é: R$" + valorPicanha);
        System.out.println("Aceitamos Dinheiro, Crédito, Débito e PIX.");
        System.out.println("Você pagou: R$6.90 no quilo.");
      } else {
        valorPicanha = quantidadeCarneComprada * 7.8;
        System.out.println("======= HIPERMERCADO TABAJARA =======");
        System.out.println("O tipo da carne comprado é: " + tipoDaCarne);
        System.out.println("A quantidade de carne comprada foi: " + quantidadeCarneComprada + " KG(S).");
        System.out.println("O preço total é: R$" + valorPicanha);
        System.out.println("Aceitamos Dinheiro, Crédito, Débito e PIX.");
        System.out.println("Você pagou: R$7.80 no quilo.");
      }

      double desconto = valorPicanha * 0.05;
      double valorAPagar = valorPicanha - desconto;

      System.out.println("Valor do desconto: R$" + desconto);
      System.out.println("Valor a pagar: R$" + valorAPagar);
      System.out.println("======= ///////////////////// =======");
    } else {
      System.out.println("Tipo de carne inválido.");
    }

    scanner.close();
  }

}