package org.example;


import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

  public static void main(String[] args) {
    ArrayList<String> generatedMasks = new ArrayList<>();

    ArrayList<String> passwords = FileReader.readPasswords("data/pass.txt");
    System.out.println(passwords.size() + " passwords loaded.");

    ArrayList data = CharacterParse.parse(passwords);
    ArrayList<String> upperCase = (ArrayList<String>) data.get(data.size() - 4);
    ArrayList<String> lowerCase = (ArrayList<String>) data.get(data.size() - 3);
    ArrayList<String> numbers = (ArrayList<String>) data.get(data.size() - 2);
    ArrayList<String> specialCharacters = (ArrayList<String>) data.get(data.size() - 1);

    System.out.println("Upper Case: " + ArrayCleaner.clean(upperCase.toString()));
    System.out.println("Lower Case: " + ArrayCleaner.clean(lowerCase.toString()));
    System.out.println("Numbers: " + ArrayCleaner.clean(numbers.toString()));
    System.out.println("Special Characters: " + ArrayCleaner.clean(specialCharacters.toString()));

    for (int i = 0; i < data.size() - 4; i++) {
      ArrayList<String> orderUnit = (ArrayList<String>) data.get(i);
      String mask = HashcatMaskGenerator.mask(ArrayCleaner.clean(upperCase.toString()),
          ArrayCleaner.clean(lowerCase.toString()), ArrayCleaner.clean(numbers.toString()),
          ArrayCleaner.clean(specialCharacters.toString()),
          ArrayCleaner.clean(orderUnit.toString()));
      generatedMasks.add(mask);
    }

    for (int i = 0; i < generatedMasks.size(); i++) {
      AppendFile.appendToFile(generatedMasks.get(i));
    }

    if (generatedMasks.size() > 0) {
      System.out.println(generatedMasks.size() + " masks generated.");
    } else {
      System.out.println("No masks generated.");
    }

  }
}