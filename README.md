# HashcatMaskGenerator
 Hashcat Mask Generator via given data

## Description
Welcome to the **Password Mask Generator** project! This Java project aims to generate password masks from a list of passwords. It parses characters from passwords, categorizes them into upper case, lower case, numbers, and special characters, and generates masks using hashcat format. The generated masks are then saved to a file.

## Classes and Functionality
The project consists of several Java classes:

1. **AppendFile**: Provides a utility to append content to a file. Used to save generated masks to a file.

2. **CharacterParse**: Parses characters from input passwords and categorizes them into upper case, lower case, numbers, and special characters. Creates order units for each password and builds a mask structure.

3. **FileReader**: Reads passwords from a file and returns them as a list.

4. **HashcatMaskGenerator**: Generates hashcat masks using the categorized character sets and order units.

5. **Main**: The main entry point of the program. Reads passwords, parses characters, generates masks, and saves them to a file.

## Usage
1. Create a file named `pass.txt` in the `data` directory and populate it with passwords (one password per line).
2. Run the `Main` class to generate masks based on the passwords in the `pass.txt` file.
3. The generated masks will be saved to the `generatedMask.hcmask` file in the project directory.
