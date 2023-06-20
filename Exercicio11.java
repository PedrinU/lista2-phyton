import java.util.Scanner;

public class Exercicio11 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    System.out.println("Informe, por gentileza, o salário de um colaborador: ");
    double salario = scanner.nextDouble();

    if (salario <= 280) {

      double salarioVintePorCento = salario + (salario * 0.2);
      double aumentoDoSalarioVintePorCento = salario * 0.2;

      System.out.println("O salário antes do reajuste: " + salario);
      System.out.println("O salário, após o reajuste, ficou: " + salarioVintePorCento);
      System.out.println("O percentual aumentado foi de 20%");
      System.out.println("O valor do aumento foi de: " + aumentoDoSalarioVintePorCento);

    } else if (salario > 280 && salario < 780) {

      double salarioQuinzePorCento = salario + (salario * 0.15);
      double aumentoDoSalarioQuinzePorCento = salario * 0.15;

      System.out.println("O salário antes do reajuste: " + salario);
      System.out.println("O salário, após o reajuste, ficou: " + salarioQuinzePorCento);
      System.out.println("O percentual aumentado foi de 15%");
      System.out.println("O valor do aumento foi de: " + aumentoDoSalarioQuinzePorCento);

    } else if (salario > 780 && salario < 1500) {

      double salarioDezPorCento = salario + (salario * 0.1);
      double aumentoDoSalarioDezPorCento = salario * 0.1;

      System.out.println("O salário antes do reajuste: " + salario);
      System.out.println("O salário, após o reajuste, ficou: " + salarioDezPorCento);
      System.out.println("O percentual aumentado foi de 10%");
      System.out.println("O valor do aumento foi de: " + aumentoDoSalarioDezPorCento);

    } else if (salario > 1500) {

      double salarioCincoPorCento = salario + (salario * 0.05);
      double aumentoDoSalarioCincoPorCento = salario * 0.05;

      System.out.println("O salário antes do reajuste: " + salario);
      System.out.println("O salário, após o reajuste, ficou: " + salarioCincoPorCento);
      System.out.println("O percentual aumentado foi de 5%");
      System.out.println("O valor do aumento foi de: " + aumentoDoSalarioCincoPorCento);

    } else {

      System.out.println("Valor Inválido. Por favor, insira apenas o salário sem o (R$)");

    }

    scanner.close();

  }
}