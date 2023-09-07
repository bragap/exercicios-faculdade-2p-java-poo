package exercicios;

import java.util.Scanner;

public class exercicio3 {
   public static Scanner ler = new Scanner(System.in);

   public static void main(String[] args) {

      System.out.println("Quantos retangulos vc deseja?");
      int cont = ler.nextInt();
      System.out.println("Iniciando impressao dos retangulos:");
      for (int i = 0; i < cont; i++) {
         System.out.println("XXXXX");
         System.out.print("X");
         System.out.println("   X");
         System.out.print("X");
         System.out.println("   X");
         System.out.print("X");
         System.out.println("   X");
         System.out.println("XXXXX");
         System.out.println("");
      }

   }

}
