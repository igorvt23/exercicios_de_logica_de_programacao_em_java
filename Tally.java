//importei o scanner
import java.util.Scanner;
public class Tally {
  //comecei a função main
  public static void main(String[] args) {
    //mostrei que vou utilizar o scanner
    Scanner exercicios = new Scanner (System.in);
    //declarei as variáveis
    int num0;
    int num1;
    int num2;
    int num3;
    int num4;
    //pedi um num
    System.out.print("Insira o primeiro número\n ");
    num0 = exercicios.nextInt();
    System.out.print("Insira o segundo número\n ");
    num1 = exercicios.nextInt();
    System.out.print("Insira o terceiro número\n ");
    num2 = exercicios.nextInt();
    System.out.print("Insira o quarto número\n ");
    num3 = exercicios.nextInt();
    System.out.print("Insira o quinto número\n ");
    num4 = exercicios.nextInt();
//num0
    if (num0 > 0)
      System.out.println("o primeiro num é positivo");
    if (num0 < 0)
      System.out.println("o primeiro é negativo");
//num1
    if (num1 > 0)
      System.out.println("o segundo num é positivo");
    if (num1 < 0)
      System.out.println("o segundo é negativo");
//num2
    if (num2 > 0)
      System.out.println("o terceiro num é positivo");
    if (num2 < 0)
      System.out.println("o terceiro é negativo");
//num3
    if (num3 > 0)
      System.out.println("o quarto num é positivo");
    if (num3 < 0)
      System.out.println("o quarto é negativo");
//num4
    if (num4 > 0)
      System.out.println("o quinto num é positivo");
    if (num4 < 0)
      System.out.println("o quinto é negativo");*/
  }
}
/*
Escreva um programa em java (chamado Tally.java) que insira cinco números, além de determinar e imprimir quantos negativos, quantos positivos e quantos zeros foram inseridos.*/