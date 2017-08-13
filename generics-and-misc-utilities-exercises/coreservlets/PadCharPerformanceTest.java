package coreservlets;

public class PadCharPerformanceTest {
  public static void main(String[] args) {
    int size = 10_000;
    for(int i=0; i<5; i++) {
      timeAccess(size);
      size = size * 2;
    }
  }
  
  public static void timeAccess(int size) {
    String temp = null;
    System.out.printf("Size = %,d.%n", size);
    long startTime = System.nanoTime();
    temp = CharUtils.padChars1(size, "x");
    long endTime = System.nanoTime();
    double elapsedTime = ((double)(endTime - startTime))/1_000_000_000;
    System.out.printf("  padChar1 (String)       : %.3f seconds.%n",
                      elapsedTime);
    startTime = System.nanoTime();
    temp = CharUtils.padChars2(size, "x");
    endTime = System.nanoTime();
    elapsedTime = ((double)(endTime - startTime))/1_000_000_000;
    System.out.printf("  padChar2 (StringBuilder): %.3f seconds.%n",
                      elapsedTime);
    if (temp == null) { // Will never happen if size is nonzero
      System.out.println("variable is null");
    }
  }
}