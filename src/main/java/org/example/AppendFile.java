package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
  public static void appendToFile(String content) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("generatedMask.hcmask", true))) {
      writer.write(content);
      writer.newLine(); // Add a new line after appending content
    } catch (IOException e) {
      System.err.println("An error occurred while appending to the file: " + e.getMessage());
    }
  }
}
