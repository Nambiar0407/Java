package coreservlets;

import java.util.*;

public class ListPerformanceTest {
  private static int numLookups = 1000;
  private static int numTests = 5;

  public static void main(String[] args) {
    int listSize = 100_000;
    for(int i=0; i<numTests; i++) {
      List<String> linkedList = new LinkedList<>();
      List<String> arrayList = new ArrayList<>();
      for(int j=0; j<listSize; j++) {
        String value = "Entry " + j;
        linkedList.add(value);
        arrayList.add(value);
      }
      System.out.printf("Size = %,d.%n", listSize);
      timeAccess("Linked list", linkedList);
      timeAccess("Array  list", arrayList);
      listSize = listSize * 2;
    }
  }

  public static void timeAccess(String label,
                                List<String> list) {
    String entry = null;
    int index = list.size()/2;
    long startTime = System.nanoTime();
    for(int i=0; i<numLookups; i++) {
      entry = list.get(index);
    }
    long endTime = System.nanoTime();
    double elapsedTime = ((double)(endTime - startTime))/1_000_000_000;
    if (entry == null) { // Will not happen unless list is empty
      System.out.println("Null entry");
    }
    System.out.printf("  %s access time: %.3f seconds.%n",
                      label, elapsedTime);

  }
}