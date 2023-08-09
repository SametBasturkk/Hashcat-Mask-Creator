package org.example;

public class ArrayCleaner {

  static String clean(String input) {
    String cleaned = input.toString().replaceAll("[ \\[\\]]", "").replaceAll(",", "");
    return cleaned;
  }

}
