package coreservlets;

import java.util.*;

public class NumberMapTest {
  public static void main(String[] args) {
    NumberMap mapper = new NumberMap();
    System.out.println("English names, one at a time:");
    printNumbers(mapper, 22);
    System.out.println("English names, as group:");
    printNumbers(mapper);
    String[] spanishNums =
      {"cero", "uno", "dos", "tres", "cuatro", "cinco",
       "seis", "siete", "ocho", "nueve", "diez", "once",
       "doce", "trece", "catorce"};
    mapper = new NumberMap(spanishNums);
    System.out.println("Spanish names, one at a time:");
    printNumbers(mapper, 17);
    System.out.println("Spanish names, as group:");
    printNumbers(mapper);
  }

  private static void printNumbers(NumberMap mapper, int n) {
    for(int i=0; i<n; i++) {
      System.out.printf("The value of %s is %s.%n",
                        i, mapper.wordForNumber(i));
    }
  }
  
  private static void printNumbers(NumberMap mapper) {
    String[] results = mapper.wordsForNumbers(2, 12, 22);
    System.out.println("Names for [2, 12, 22] are " + Arrays.asList(results));
  }
}