package org.example;

public class HashcatMaskGenerator {
  //abcdef,0123,ABC,789,?3?3?3?1?1?1?1?2?2?4?4?4?4
  // [[Upper Case], [Lower Case], [Numbers], [Special Characters], [Order Unit]]

  static String mask(String upperCase, String lowerCase, String numbers, String specialCharacters,
      String orderUnit) {
    String mask = "";

    mask += upperCase + ",";
    mask += lowerCase + ",";
    mask += numbers + ",";
    mask += specialCharacters + ",";

    for (int i = 0; i < orderUnit.length(); i++) {
      if (orderUnit.charAt(i) == 'C') {
        mask += "?1";
      } else if (orderUnit.charAt(i) == 'c') {
        mask += "?2";
      } else if (orderUnit.charAt(i) == 'n') {
        mask += "?3";
      } else if (orderUnit.charAt(i) == 's') {
        mask += "?4";
      }
    }

    return mask;
  }

}
