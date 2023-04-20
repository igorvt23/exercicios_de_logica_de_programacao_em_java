//importei o scanner
import java.util.Scanner;
public class PopulatinGrowthCalculator {
  //comecei a função main
  public static void main(String[] args) {
    //mostrei que vou utilizar o scanner
    Scanner exercicios = new Scanner (System.in);
    float popmun = 7800000;
    int ano;
    double populacao;
    System.out.println("Em que ano queres saber?");
    ano = exercicios.nextInt();
    populacao = (popmun*ano*1000)*0.012;
    System.out.printf("Haverá %f pessoas no mundo\n", populacao);
    
    
  }
}
/*(Calculadora de crescimento demográfico mundial) Utilize a internet para descobrir a população mundial atual e a taxa de crescimento demográfico mundial anual. Escreva um aplicativo (chamado PopulationGrowthCalculator.java) que introduza esses valores e, então, que exiba a população mundial estimada depois de um, dois, três, quatro e cinco anos.*/