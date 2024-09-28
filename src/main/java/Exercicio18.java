// IMPORTS

import java.util.Scanner;

public class Exercicio18 {

   public static void main(String[] args) {
      // INSTANTIATE
      Scanner sc = new Scanner(System.in);

      // DECLARATE
      String n;
      double v;
      int option;

      // MENU
      System.out.print("Nanme: ");
      n = sc.next();
      System.out.print("Value: ");
      v = sc.nextDouble();

      System.out.println();
      System.out.println("======================================");
      System.out.println("CATEGORY");
      System.out.println("======================================");
      System.out.println("1 - A");
      System.out.println("2 - B");
      System.out.println("3 - C");
      System.out.println("4 - D");
      System.out.println("5 - E");
      System.out.print("Your option: ");
      option = sc.nextInt();

      // OUTPUT
      switch (option) {
         case 1:
            System.out.println("Discount 10%");
            System.out.println("Value to pay: " + v * 0.9);
            break;

         case 2:
            System.out.println("Discount 15%");
            System.out.println("Value to pay: " + v * 0.85);
            break;

         case 3:
            System.out.println("Discount 20%");
            System.out.println("Value to pay: " + v * 0.8);
            break;

         case 4:
            System.out.println("Discount 25%");
            System.out.println("Value to pay: " + v * 0.75);
            break;

         case 5:
            System.out.println("Discount 50%");
            System.out.println("Value to pay: " + v * 0.5);
            break;

         default:
            System.out.println("Tibúrcio é DESEMPREGADO");
      }

   }
}
