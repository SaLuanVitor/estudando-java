import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    // 01
    int senha = 0;

    while (senha != 2002) {
      senha = sc.nextInt();
      System.out.println("Senha invalida");
    }
    System.out.println("Acesso permitido");

    // 02

    Double eixoX, eixoY;
    eixoX = sc.nextDouble();
    eixoY = sc.nextDouble();
    while ((eixoX != 0.0 && eixoY != 0.0)) {
      if (eixoX > 0 && eixoY > 0) {
        System.out.println("Primeiro");
      } else if (eixoX < 0 && eixoY > 0) {
        System.out.println("Segundo");
      } else if (eixoX < 0 && eixoY < 0) {
        System.out.println("Terceiro");
      } else {
        System.out.println("Quarto");
      }
      eixoX = sc.nextDouble();
      eixoY = sc.nextDouble();
    }

    // 03
    int opcao = 0, contagemGasolina = 0, contagemAlcool = 0, contagemDiesel = 0;
    while (opcao != 4) {
      System.out.println("Escolha uma opção:");
      System.out.println("1 - Alcool");
      System.out.println("2 - Gasolina");
      System.out.println("3 - Diesel");
      System.out.println("4 - Fim");
      opcao = sc.nextInt();

      switch (opcao) {
        case 1:
          contagemAlcool++;
          break;
        case 2:
          contagemGasolina++;
          break;
        case 3:
          contagemDiesel++;
          break;
        case 4:
          System.out.println("Muito Obrigado");
          System.out.printf("Alcool: %d%n", contagemAlcool);
          System.out.printf("Gasolina: %d%n", contagemGasolina);
          System.out.printf("Diesel: %d%n", contagemDiesel);
        default:
          break;
      }
    }
    sc.close();
  }
}