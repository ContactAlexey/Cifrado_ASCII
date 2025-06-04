package Libre;

import java.util.HashMap; // Import HashMap to store character-ASCII value pairs
import java.util.Scanner; // Import Scanner to read user input
import java.util.ArrayList; // Import ArrayList to store ASCII values
import java.util.List; // Import List interface
import java.util.Random; // Import Random to generate random numbers

public class ASCII {
    public static void main(String[] args) {

        HashMap<Character, Integer> dictionary = new HashMap<>(); // Dictionary to map characters to their ASCII values
        Scanner keyboard = new Scanner(System.in); // Scanner to read user input
        Random random = new Random();

        // List to store the ASCII values of an input word
        List<Integer> asciiValues = new ArrayList<>();

        // Generate a random number between 0-999
        int errorNumber = random.nextInt(999);

        // Fill the dictionary with ASCII values of common characters
        dictionary.put(' ', 32);
        dictionary.put('!', 33);
        dictionary.put('"', 34);
        dictionary.put('#', 35);
        dictionary.put('$', 36);
        dictionary.put('%', 37);
        dictionary.put('&', 38);
        dictionary.put('\'', 39);
        dictionary.put('(', 40);
        dictionary.put(')', 41);
        dictionary.put('*', 42);
        dictionary.put('+', 43);
        dictionary.put(',', 44);
        dictionary.put('-', 45);
        dictionary.put('.', 46);
        dictionary.put('/', 47);
        dictionary.put('0', 48);
        dictionary.put('1', 49);
        dictionary.put('2', 50);
        dictionary.put('3', 51);
        dictionary.put('4', 52);
        dictionary.put('5', 53);
        dictionary.put('6', 54);
        dictionary.put('7', 55);
        dictionary.put('8', 56);
        dictionary.put('9', 57);
        dictionary.put(':', 58);
        dictionary.put(';', 59);
        dictionary.put('<', 60);
        dictionary.put('=', 61);
        dictionary.put('>', 62);
        dictionary.put('?', 63);
        dictionary.put('@', 64);
        dictionary.put('A', 65);
        dictionary.put('B', 66);
        dictionary.put('C', 67);
        dictionary.put('D', 68);
        dictionary.put('E', 69);
        dictionary.put('F', 70);
        dictionary.put('G', 71);
        dictionary.put('H', 72);
        dictionary.put('I', 73);
        dictionary.put('J', 74);
        dictionary.put('K', 75);
        dictionary.put('L', 76);
        dictionary.put('M', 77);
        dictionary.put('N', 78);
        dictionary.put('O', 79);
        dictionary.put('P', 80);
        dictionary.put('Q', 81);
        dictionary.put('R', 82);
        dictionary.put('S', 83);
        dictionary.put('T', 84);
        dictionary.put('U', 85);
        dictionary.put('V', 86);
        dictionary.put('W', 87);
        dictionary.put('X', 88);
        dictionary.put('Y', 89);
        dictionary.put('Z', 90);
        dictionary.put('[', 91);
        dictionary.put('\\', 92);
        dictionary.put(']', 93);
        dictionary.put('^', 94);
        dictionary.put('_', 95);
        dictionary.put('`', 96);
        dictionary.put('a', 97);
        dictionary.put('b', 98);
        dictionary.put('c', 99);
        dictionary.put('d', 100);
        dictionary.put('e', 101);
        dictionary.put('f', 102);
        dictionary.put('g', 103);
        dictionary.put('h', 104);
        dictionary.put('i', 105);
        dictionary.put('j', 106);
        dictionary.put('k', 107);
        dictionary.put('l', 108);
        dictionary.put('m', 109);
        dictionary.put('n', 110);
        dictionary.put('o', 111);
        dictionary.put('p', 112);
        dictionary.put('q', 113);
        dictionary.put('r', 114);
        dictionary.put('s', 115);
        dictionary.put('t', 116);
        dictionary.put('u', 117);
        dictionary.put('v', 118);
        dictionary.put('w', 119);
        dictionary.put('x', 120);
        dictionary.put('y', 121);
        dictionary.put('z', 122);
        dictionary.put('{', 123);
        dictionary.put('}', 125);
        dictionary.put('~', 126);
        dictionary.put('¡', 161);
        dictionary.put('¿', 191);
        dictionary.put('Á', 193);
        dictionary.put('É', 201);
        dictionary.put('Í', 205);
        dictionary.put('Ñ', 209);
        dictionary.put('Ó', 211);
        dictionary.put('Ú', 218);
        dictionary.put('Ü', 220);
        dictionary.put('á', 225);
        dictionary.put('é', 233);
        dictionary.put('í', 237);
        dictionary.put('ñ', 241);
        dictionary.put('ó', 243);
        dictionary.put('ú', 250);
        dictionary.put('ü', 252);

        // Menu to select encrypt or decrypt
        System.out.println("Select an option:");
        System.out.println("1. Encrypt a word");
        System.out.println("2. Decrypt ASCII numbers");
        System.out.print("Option: ");
        int option = keyboard.nextInt(); // Read user's choice
        keyboard.nextLine(); // Clear buffer

        if (option == 1) {
            // ENCRYPT A WORD
            System.out.print("Enter the word to encrypt: ");
            String word = keyboard.nextLine(); // Read user input word

            // Convert each letter to its ASCII value using the dictionary
            for (char letter : word.toCharArray()) {
                if (dictionary.containsKey(letter)) { // Check if character is in dictionary
                    asciiValues.add(dictionary.get(letter)); // Add ASCII value to the list
                }
            }

            // Print ASCII values in a clean format
            System.out.println("Word encrypted to ASCII: " + asciiValues.toString().replaceAll("[\\[\\],]", ""));

        } else if (option == 2) {
            // DECRYPT ASCII NUMBERS
            System.out.print("Enter ASCII values separated by spaces: ");
            String numbersText = keyboard.nextLine(); // Read ASCII numbers line
            String[] numbersArray = numbersText.split(" "); // Split by space
            StringBuilder decryptedWord = new StringBuilder(); // To reconstruct the word

            for (String numStr : numbersArray) {
                try {
                    int num = Integer.parseInt(numStr); // Parse integer
                    decryptedWord.append((char) num); // Convert ASCII to char and append
                } catch (NumberFormatException e) {
                    // Handle error if input is not a valid number
                    System.out.println("Error: '" + numStr + "' is not a valid number.");
                    return;
                }
            }

            // Print the decrypted word
            System.out.println("Decrypted word: " + decryptedWord.toString());

        } else {
            // Error message for invalid option
            System.out.println("Invalid option error " + errorNumber + ". Please try again.");
        }

    }
}
