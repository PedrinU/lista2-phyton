import java.util.Scanner;

public class Exercicio12 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe, por gentileza, o valor da sua hora: ");
    double valorHora = scanner.nextDouble();

    System.out.println("Informe, por gentileza, a quantidade de horas que você trabalhou no mês: ");
    double quantidadeHorasTrabalhadasMes = scanner.nextDouble();

    double salarioMes = valorHora * quantidadeHorasTrabalhadasMes;
    double descontoSindicato = salarioMes * 0.03;
    double descontoFGTS = salarioMes * 0.11;
    double salarioLiquido = salarioMes - (descontoSindicato + descontoFGTS);

    if (salarioMes <= 900) {

      double totalDeDescontos = descontoFGTS + descontoSindicato;

      System.out.println("O seu salário bruto é: " + salarioMes);
      System.out.println("Você está isento do desconto do imposto de renda.");
      System.out.println("O desconto do FGTS é: " + descontoFGTS);
      System.out.println("O desconto do Sindicato é: " + descontoSindicato);
      System.out.println("O total de descontos é: " + totalDeDescontos);
      System.out.println("O seu salário líquido é: " + salarioLiquido);

    } else if (salarioMes > 900 && salarioMes <= 1500) {

      double impostoDeRendaCincoPorCento = salarioMes * 0.05;
      double totalDeDescontosCincoPorCento = descontoFGTS + descontoSindicato + impostoDeRendaCincoPorCento;

      System.out.println("O seu salário bruto é: " + salarioMes);
      System.out.println("Você deverá pagar: " + impostoDeRendaCincoPorCento + " de imposto de renda.");
      System.out.println("O desconto do FGTS é: " + descontoFGTS);
      System.out.println("O desconto do Sindicato é: " + descontoSindicato);
      System.out.println("O total de descontos é: " + totalDeDescontosCincoPorCento);
      System.out.println("O seu salário líquido é: " + salarioLiquido);

    } else if (salarioMes > 1500 && salarioMes <= 2500) {

      double impostoDeRendaDezPorCento = salarioMes * 0.1;
      double totalDeDescontosDezPorCento = descontoFGTS + descontoSindicato + impostoDeRendaDezPorCento;

      System.out.println("O seu salário bruto é: " + salarioMes);
      System.out.println("Você deverá pagar: " + impostoDeRendaDezPorCento + "de imposto de renda.");
      System.out.println("O desconto do FGTS é: " + descontoFGTS);
      System.out.println("O desconto do Sindicato é: " + descontoSindicato);
      System.out.println("O total de descontos é: " + totalDeDescontosDezPorCento);
      System.out.println("O seu salário líquido é: " + salarioLiquido);

    } else if (salarioMes > 2500) {

      double impostoDeRendaVintePorCento = salarioMes * 0.2;
      double totalDeDescontosVintePorCento = descontoFGTS + descontoSindicato + impostoDeRendaVintePorCento;

      System.out.println("O seu salário bruto é: " + salarioMes);
      System.out.println("Você deverá pagar: " + impostoDeRendaVintePorCento + " de imposto de renda.");
      System.out.println("O desconto do FGTS é: " + descontoFGTS);
      System.out.println("O desconto do Sindicato é: " + descontoSindicato);
      System.out.println("O total de descontos é: " + totalDeDescontosVintePorCento);
      System.out.println("O seu salário líquido é: " + salarioLiquido);

    } else {

      System.out.println("Erro ao calcular o imposto de renda à ser pago.");

    }

    scanner.close();

  }
}