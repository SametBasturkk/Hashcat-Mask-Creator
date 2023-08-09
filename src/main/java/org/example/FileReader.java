package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

  static ArrayList<String> readPasswords(String fileName) {
    ArrayList<String> passwords = new ArrayList<>();
    File file = new File(fileName);
    try (Scanner scanner = new Scanner(file)) {
      while (scanner.hasNextLine()) {
        passwords.add(scanner.nextLine());
      }
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    }
    return passwords;
  }

}
