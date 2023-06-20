import java.util.Scanner;

public class Exercicio26 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o tipo de combustível: (A) para Álcool e (G) para Gasolina");
    String tipoDeCombustivel = scanner.nextLine();

    if (tipoDeCombustivel.equalsIgnoreCase("G")) {
      double precoLitroGasolina = 2.5;

      System.out.println("Informe a quantidade de litros abastecidos com Gasolina: ");
      double litrosAbastecidosGasolina = scanner.nextDouble();

      double valorTotalGasolina = precoLitroGasolina * litrosAbastecidosGasolina;

      if (litrosAbastecidosGasolina <= 20) {
        double descontoGasolinaAteVinteLitros = valorTotalGasolina * 4 / 100;
        double valorPagoGasolina = valorTotalGasolina - descontoGasolinaAteVinteLitros;
        System.out.println("O valor a ser pago por abastecer com Gasolina é: " + valorPagoGasolina);

      } else {

        double descontoGasolinaMaisVinteLitros = valorTotalGasolina * 6 / 100;
        double valorPagoGasolina = valorTotalGasolina - descontoGasolinaMaisVinteLitros;
        System.out.println("Desconto - O valor a ser pago por abastecer com Gasolina é: "
            + valorPagoGasolina);
      }
    } else if (tipoDeCombustivel.equalsIgnoreCase("A")) {
      double precoLitroAlcool = 1.9;

      System.out.println("Informe a quantidade de litros abastecidos com Álcool: ");
      double litrosAbastecidosAlcool = scanner.nextDouble();

      double valorTotalAlcool = precoLitroAlcool * litrosAbastecidosAlcool;

      if (litrosAbastecidosAlcool <= 20) {
        double descontoAlcoolAteVinteLitros = valorTotalAlcool * 3 / 100;
        double valorPagoAlcool = valorTotalAlcool - descontoAlcoolAteVinteLitros;
        System.out.println("O valor a ser pago por abastecer com Álcool é: " + valorPagoAlcool);

      } else {
        double descontoAlcoolMaisVinteLitros = valorTotalAlcool * 5 / 100;
        double valorPagoAlcool = valorTotalAlcool - descontoAlcoolMaisVinteLitros;
        System.out.println("Desconto - O valor a ser pago por abastecer com Álcool é: "
            + valorPagoAlcool);
      }
    }

    scanner.close();
  }
}