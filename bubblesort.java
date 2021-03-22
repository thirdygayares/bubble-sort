package casestudy;

import java.util.*;
public class BubbleSort {
  public static void main(String[] args) {
    int Numbers[] = new int[10];
    Scanner
    var = new Scanner(System.in);
    for (int y = 0; y < 10; y++) {

      System.out.print(y + 1 + ". Enter number: ");
      Numbers[y] =
        var.nextInt();
    }
    int tempo;
    for (int i = 0; i < Numbers.length; i++) {
      for (int a = 0; a < Numbers.length - 1; a++) {
        if (Numbers[a] > Numbers[a + 1]) {
          tempo = Numbers[a];
          Numbers[a] = Numbers[a + 1];
          Numbers[a + 1] = tempo;
        }
      }
    }
    System.out.println("Sorted Numbers in ascending order: ");
    for (int b = 0; b < Numbers.length; b++) {
      System.out.print(Numbers[b] + " ");
    }
    for (int c = 0; c < Numbers.length; c++) {
      for (int d = 0; d < Numbers.length - 1; d++) {
        if (Numbers[d] < Numbers[d + 1]) {
          tempo = Numbers[d]; //tempo=4
          Numbers[d] = Numbers[d + 1]; //Numbers[a]= 3
          Numbers[d + 1] = tempo; //Numbers[a+1]= 4 }
        }
      }
    }
    System.out.println();
    System.out.println("Sorted Numbers in descending order: ");
    for (int x = 0; x < Numbers.length; x++) {
      System.out.print(Numbers[x] + " ");
    }
  }
}
