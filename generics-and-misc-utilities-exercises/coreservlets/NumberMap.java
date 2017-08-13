package coreservlets;

import java.util.*;

public class NumberMap {
  private Map<Integer,String> numberTable;
  private static String[] defaultWords =
    {"zero", "one", "two", "three", "four",
     "five", "six", "seven", "eight", "nine",
     "ten", "eleven", "twelve", "thirteen",
     "fourteen", "fifteen", "sixteen",
     "seventeen", "eighteen", "nineteen"};

  public NumberMap() {
    this(defaultWords);
  }

  public NumberMap(String[] words) {
    numberTable = new HashMap<>();
    for(int i=0; i<words.length; i++) {
      numberTable.put(i, words[i]);
    }
  }

  public String wordForNumber(int num) {
    String word = numberTable.get(num);
    if (word == null) {
      word = "[Unknown]";
    }
    return(word);
  }
  
  public String[] wordsForNumbers(int... nums) {
    String[] results = new String[nums.length];
    for(int i=0; i<nums.length; i++) {
      results[i] = wordForNumber(nums[i]);
    }
    return(results);
  }

  public int getSize() {
    return(numberTable.size());
  }
}