import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    // 01
    // int valorSoma01, valorSoma02, soma;
    // System.out.println("Digite o primério valor da soma: ");
    // valorSoma01 = sc.nextInt();
    // System.out.println("Digite o segundo valor da soma:");
    // valorSoma02 = sc.nextInt();
    //
    // soma = valorSoma01 + valorSoma02;
    //
    // System.out.printf("%nA soma é: %d%n", soma);
    //

    // 02

    // final double PI= 3.14159;
    // double raio, areaCirculo;
    //
    // System.out.println("Digite o valor do raio do seu círculo: ");
    // raio = sc.nextDouble();
    //
    // areaCirculo = PI * Math.pow(raio,2);
    //
    // System.out.printf("%nA área do cículo: %.4f",areaCirculo);
    // 03
    // int A, B,C,D,diferenca;
    //
    // System.out.println("Digite o valor de A:");
    // A = sc.nextInt();
    //
    // System.out.println("Digite o valor de B:");
    // B = sc.nextInt();
    //
    // System.out.println("Digite o valor de C:");
    // C = sc.nextInt();
    //
    // System.out.println("Digite o valor de D:");
    // D = sc.nextInt();
    //
    // diferenca = A*B - C*D;
    //
    // System.out.printf("A diferença: %d", diferenca);
    // 04
    // int idFuncionario;
    // double horasTrabalhadas, valorPorHora, salario;
    //
    // System.out.println("Digite o número do funcionário: ");
    // idFuncionario = sc.nextInt();
    //
    // System.out.println("Digite as horas trabalhadas pelo funcionário: ");
    // horasTrabalhadas = sc.nextDouble();
    //
    // System.out.println("Digite o valor por hora que esse funcionário recebe: ");
    // valorPorHora = sc.nextDouble();
    //
    // salario = horasTrabalhadas * valorPorHora;
    //
    // System.out.printf("%nNUMBER: %d%nSALARY: U$%.2f",idFuncionario, salario);
    // 05
    // int idPeca01, idPeca02;
    // double quantidadePeca01, quantidadePeca02, valorPecas01, valorPecas02,preco;
    //
    // System.out.println("Digite o código da primeira peça: ");
    // idPeca01 = sc.nextInt();
    //
    // System.out.println("Digite a quantidade de peças: ");
    // quantidadePeca01 = sc.nextDouble();
    //
    // System.out.println("Digite o preço das peças: ");
    // valorPecas01 = sc.nextDouble();
    // System.out.println("---------");
    // System.out.println("Digite o código da segunda peça: ");
    // idPeca02 = sc.nextInt();
    //
    // System.out.println("Digite a quantidade de peças: ");
    // quantidadePeca02 = sc.nextDouble();
    //
    // System.out.println("Digite o preço das peças: ");
    // valorPecas02 = sc.nextDouble();
    //
    // preco = (quantidadePeca01 * valorPecas01)+(quantidadePeca02 * valorPecas02);
    //
    // System.out.printf("Valor a pagar: %.2f",preco);

    // 06
    final double PI = 3.14159;
    double ladoA, ladoB, ladoC, circulo, triangulo, trapezio, quadrado, retangulo;

    System.out.println("Digite o valor de A: ");
    ladoA = sc.nextDouble();

    System.out.println("Digite o valor de B: ");
    ladoB = sc.nextDouble();

    System.out.println("Digite o valor de C: ");
    ladoC = sc.nextDouble();
    sc.close();

    triangulo = ladoA * ladoC / 2;

    circulo = PI * Math.pow(ladoC, 2);

    trapezio = (ladoA + ladoB) / 2 * ladoC;

    quadrado = ladoB * ladoB;

    retangulo = ladoA * ladoB;

    System.out.printf("%nTRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", triangulo,
        circulo, trapezio, quadrado, retangulo);
  }

}