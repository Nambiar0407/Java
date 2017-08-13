package coreservlets;

public class CharUtils {
  public static String padChars1(int n, String orig) {
    String result = "";
    for(int i=0; i<n; i++) {
      result = result + orig;
    }
    return(result);
  }

  public static String padChars2(int n, String orig) {
    StringBuilder result = new StringBuilder("");
    for(int i=0; i<n; i++) {
      result = result.append(orig);
    }
    return(result.toString());
  }
}