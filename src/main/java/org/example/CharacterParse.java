package org.example;


import java.util.ArrayList;


public class CharacterParse {


  static ArrayList<ArrayList<String>> parse(ArrayList input) {

    ArrayList<String> upperCase = new ArrayList<>();
    ArrayList<String> lowerCase = new ArrayList<>();
    ArrayList<String> numbers = new ArrayList<>();
    ArrayList<String> specialCharacters = new ArrayList<>();
    ArrayList<String> orderUnit = new ArrayList<>();
    ArrayList<ArrayList<String>> mask = new ArrayList<>();

    for (int i = 0; i < input.size(); i++) {
      orderUnit = new ArrayList<>();
      String[] splittedWord = input.get(i).toString().split("");

      for (int j = 0; j < splittedWord.length; j++) {
        if (splittedWord[j].matches("[A-Z]")) {
          orderUnit.add("C");
          if (!upperCase.contains(splittedWord[j])) {
            upperCase.add(splittedWord[j]);
          }
        } else if (splittedWord[j].matches("[0-9]")) {
          orderUnit.add("n");
          if (!numbers.contains(splittedWord[j])) {
            numbers.add(splittedWord[j]);
          }
        } else if (splittedWord[j].matches("[a-z]")) {
          orderUnit.add("c");
          if (!lowerCase.contains(splittedWord[j])) {
            lowerCase.add(splittedWord[j]);
          }
        } else {
          orderUnit.add("s");
          if (!specialCharacters.contains(splittedWord[j])) {
            specialCharacters.add(splittedWord[j]);
          }
        }
      }
      if (!mask.contains(orderUnit)) {
        mask.add(orderUnit);
      }
    }

    mask.add(upperCase);
    mask.add(lowerCase);
    mask.add(numbers);
    mask.add(specialCharacters);

    return mask;

  }


}
