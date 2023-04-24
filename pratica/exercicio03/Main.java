import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    // 01
    int verificarPositivoNegativo;

    System.out.println("Digite um número inteiro: ");
    verificarPositivoNegativo = sc.nextInt();

    if (verificarPositivoNegativo < 0) {
      System.out.printf("O número %d é negativo", verificarPositivoNegativo);
    } else if (verificarPositivoNegativo > 0) {
      System.out.printf("O número %d é postivo", verificarPositivoNegativo);
    } else {
      System.out.println("Seu número é 0 neutro");
    }

    // 02
    int verificarNumero;

    System.out.println("Digite um número:");
    verificarNumero = sc.nextInt();

    if (verificarNumero % 2 == 0 && verificarNumero != 0) {
      System.out.printf("O número %d é positivo", verificarNumero);

    } else if (verificarNumero % 2 != 0) {
      System.out.printf("O número %d é Negativo", verificarNumero);
    } else {
      System.out.printf("%d número neutro", verificarNumero);
    }

    // 03

    int numInteiroA, numInteiroB;

    System.out.println("Digite um número inteiro A: ");
    numInteiroA = sc.nextInt();

    System.out.println("Digite um número inteiro B: ");
    numInteiroB = sc.nextInt();

    if ((numInteiroA % numInteiroB == 0) || (numInteiroB % numInteiroA == 0)) {
      System.out.printf("Os números A: %d e B: %d são múltiplos", numInteiroA, numInteiroB);
    } else {
      System.out.println("Seus números não são múltiplos");
    }

    // 04
    double horaInicial, horaFinal, horaResultado;

    System.out.println("Digite a hora inicial:");
    horaInicial = sc.nextDouble();
    System.out.println("Digite a hora final: ");
    horaFinal = sc.nextDouble();

    if ((horaInicial >= 1.0 || horaInicial <= 24.0) && (horaFinal >= 1 || horaFinal <= 24)) {
      if (horaInicial < horaFinal) {
        horaResultado = horaFinal - horaInicial;
        System.out.printf("O jogo durou %.2fh", horaResultado);
      } else {
        horaResultado = 24 - horaInicial + horaFinal;
        System.out.printf("O jogo durou %.2fh", horaResultado);
      }
    } else {
      System.out.println("Horário inválido de declaração");
    }

    // 05
    int codigoIntem, quantidadeItem;
    double preco = 0, valorCompra;

    System.out.println("Digite o código do item que deseja escolher: ");
    codigoIntem = sc.nextInt();
    System.out.println("1 - Cachorro Quente");
    System.out.println("2 - X-Salada");
    System.out.println("3 - X-Bacon");
    System.out.println("4 - Torrada Simples");
    System.out.println("5 - Refrigerante");
    System.out.println("Digite a quantidade que deseja comprar: ");
    quantidadeItem = sc.nextInt();

    if (codigoIntem == 1) {
      preco = 4.00;
    } else if (codigoIntem == 2) {
      preco = 4.50;
    } else if (codigoIntem == 3) {
      preco = 5.00;
    } else if (codigoIntem == 4) {
      preco = 2.00;
    } else if (codigoIntem == 5) {
      preco = 1.50;
    } else {
      System.out.println("Código inválido");
    }
    valorCompra = preco * quantidadeItem;

    System.out.printf("O valor da compra foi R$%.2f", valorCompra);

    // 06
    double valorIntervalo;

    System.out.println("Digite um número: ");
    valorIntervalo = sc.nextDouble();

    if (valorIntervalo >= 0.0 && valorIntervalo <= 25.0) {
      System.out.println("Intervalor (0,25)");
    } else if (valorIntervalo > 25.0 && valorIntervalo <= 50.0) {
      System.out.println("Intervalor (25,50)");
    } else if (valorIntervalo > 50.0 && valorIntervalo <= 75.0) {
      System.out.println("Intervalo (50,75)");
    } else if (valorIntervalo > 75.0 && valorIntervalo <= 100.0) {
      System.out.println("Intervalo (75,100)");
    } else {
      System.out.println("Fora dos intervalos válidos");
    }

    // 07
    double eixoX, eixoY;

    System.out.println("Digite o valor do eixo X:");
    eixoX = sc.nextDouble();
    System.out.println("Digite o valor do eixo Y");
    eixoY = sc.nextDouble();

    if (eixoX > 0 && eixoY > 0) {
      System.out.println("Q1");
    } else if (eixoX < 0 && eixoY > 0) {
      System.out.println("Q2");
    } else if (eixoX > 0 && eixoY < 0) {
      System.out.println("Q4");
    } else if (eixoX < 0 && eixoY < 0) {
      System.out.println("Q3");
    } else {
      System.out.println("Origem");
    }

    // 08
    double salario = 0, imposto;

    System.out.println("Digite um salário para verificar o imposto:");
    salario = sc.nextDouble();

    if (salario >= 0.0 && salario <= 2000.0) {
      imposto = 0.0;
    } else if (salario <= 3000.0) {
      imposto = (salario - 2000.0) * 0.08;
    } else if (salario <= 4500) {
      imposto = (salario - 3000.0) * 0.18 + 1000 * 0.08;
    } else {
      imposto = (salario - 4500.0) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
    }
    if (imposto == 0.0) {
      System.out.println("Isento");
    } else {
      System.out.printf("R$ %.2f", imposto);
    }

    sc.close();
  }

}